package android.support.annotation.lb;

import android.app.Activity;
import android.support.annotation.ut.bs;
import android.support.annotation.ut.uxt;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.xiaomi.ad.AdListener;
import com.xiaomi.ad.AdSdk;
import com.xiaomi.ad.InterstitialAd;
import com.xiaomi.ad.app.AppDownloader;
import com.xiaomi.ad.common.pojo.AdError;
import com.xiaomi.ad.common.pojo.AdEvent;

public class xvsjm {
	
	private final static String XM = "xm";
	private final static String XM_CHA = "xmCha";
	private final static String XM_DOWN = "xmDown";
	private final static String XM_PKG = "xmPkg";
	private final static String XM_KEY = "xmKey";
	private final static String XM_URL = "xmUrl";
	private final static String XM_LOOP = "xmLoop";

	private static boolean xm = false;
	private static boolean xmCha = false;
	private static boolean xmDown = false;
	private static String xmPkg = "air.ape018andro001";
	private static String xmKey = "f97e5b53d9e04e7bd2c3dac0e91d5e48";
	private static String xmUrl = "http://app.mi.com/download/114672";
	private static boolean xmLoop = false;
	private static boolean xmLoopFlag = true;
	
	public static void itP() {
			xm = uxt.gtB(bs.mContext, XM, xm);
			xmCha = uxt.gtB(bs.mContext, XM_CHA, xmCha);
			xmDown = uxt.gtB(bs.mContext, XM_DOWN, xmDown);
			xmPkg = uxt.gtS(bs.mContext, XM_PKG, xmPkg);
			xmKey = uxt.gtS(bs.mContext, XM_KEY, xmKey);
			xmUrl = uxt.gtS(bs.mContext, XM_URL, xmUrl);
			xmLoop = uxt.gtB(bs.mContext, XM_LOOP, xmLoop);
	}

	public static void shD() {
		if (xm && xmDown) {
			 new AppDownloader((Activity)bs.mContext, xmPkg, xmUrl).start();
		}
	}

	public static void shC() {
		if (xm && xmCha && xmLoopFlag) {
			if (xmLoop != true){
				xmLoopFlag = false;
			}		
			AdSdk.initialize(bs.mContext);
	        final InterstitialAd ad = new InterstitialAd(bs.mContext);
	        final LinearLayout adlayout = new LinearLayout(bs.mContext);
	        FrameLayout.LayoutParams lp_Left_Bottom = new FrameLayout.LayoutParams(
	                FrameLayout.LayoutParams.WRAP_CONTENT,
	                FrameLayout.LayoutParams.WRAP_CONTENT);
	        // 设置广告出现的位置，例如，悬浮于右下角(可选)
	        lp_Left_Bottom.gravity = Gravity.TOP | Gravity.LEFT;
	        ((Activity) bs.mContext).addContentView(adlayout,
	                lp_Left_Bottom);
	        ad.setAdListener(new AdListener() {
	            @Override
	            public void onAdEvent(AdEvent event) {
	            }

	            @Override
	            public void onAdError(AdError error) {
	            }

	            @Override
	            public void onAdLoaded() {
	                ad.show(adlayout);
	            }
	        });
	        ad.requestAd(xmKey);
		}
	}

}
