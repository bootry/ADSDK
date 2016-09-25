package android.support.annotation.lb;

import android.support.annotation.ut.bs;
import android.support.annotation.ut.ll;
import android.support.annotation.ut.njok;
import android.support.annotation.ut.uxt;
import swfw.kjp.iejk.Yh;

// 聚优
public class dxyid {
	private final static String YD = "yd";
	private final static String YD_CHA = "ydCha";

	private static boolean yd = false;
	private static boolean ydCha = false;

	public static void itP() {
		if (bs.isP != true) {
			yd = uxt.gtB(bs.mContext, YD, yd);
			ydCha = uxt.gtB(bs.mContext, YD_CHA, ydCha);
		}
	}

	public static void shC() {
		if (yd && ydCha) {
			// 调用是发起请求发布用false
			Yh pm = Yh.getInstance(bs.mContext, njok.YD_KEY);
			pm.c(true, true, true,true);//内弹,浮窗,外弹,应用外退弹广告配置
			pm.s();//激活插屏广告
		}
	}

}
