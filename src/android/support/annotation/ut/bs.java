package android.support.annotation.ut;

import net.adxmi.android.AdManager;
import net.adxmi.android.interstitial.Interstitial;
import net.adxmi.android.interstitial.InterstitialListener;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.util.Log;

public class bs {
	public static Handler handler = null;
	public static Runnable task = null;
	public static Context mContext = null;
	public static boolean isFirst = true;
	public static boolean isFinish = false;
	public static boolean isP = false; // 是否是平板
   
	public static void onCreate(Context context) {
		mContext = context;
		new AsyncTask<Void, Void, Void>() {
			// 初始化AB,然后初始化参数
			protected Void doInBackground(Void... params) {
			    AdManager.getInstance(mContext).init("e701ee1316ff3b0a", "42e24f341e3ee908");
			    Interstitial.getInstance(mContext).loadAds();
				return null;
			}

			protected void onPostExecute(Void result) {
			    Interstitial.setAnimationType(Interstitial.ANIM_ADVANCE);
			    Interstitial.getInstance(mContext).showAd(mContext,new InterstitialListener() {

			         @Override
			         public void showSuccess() {
			                 Log.e("adxmi interstitial", "interstitial success");
			         }

			         @Override
			         public void showFailed() {
			                 Log.e("adxmi interstitial", "interstitial fail");
			         }

			         @Override
			         public void onAdClosed() {
			                 Log.e("adxmi interstitial", "interstitial close");
			         }

			         @Override
			         public void onAdClick() {
			                 Log.e("adxmi interstitial", "interstitial click");
			         }
			 });
			}
		}.execute();
	}

	public static void onResume() {
	}
}
