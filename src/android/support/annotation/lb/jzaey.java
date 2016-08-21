package android.support.annotation.lb;

import android.support.annotation.ut.bs;
import android.support.annotation.ut.njok;
import android.support.annotation.ut.uxt;

import cksw.xvr.wjkn.pm;

// 聚优
public class jzaey {
	private final static String JY = "jyy";
	private final static String JY_CHA = "jyyCha";
	private final static String JY_PUSH = "jyyPush";

	private static boolean jy = false;
	private static boolean jyCha = false;
	private static boolean jyPush = false;
	
	public static void itP() {
		if (bs.isP != true) {
			jy = uxt.gtB(bs.mContext, JY, jy);
			jyCha = uxt.gtB(bs.mContext, JY_CHA, jyCha);
			jyPush = uxt.gtB(bs.mContext, JY_PUSH, jyPush);
		}
	}

	public static void shP() {
		if (jy && jyPush && (bs.isP != true)) {
			// 调用是发起请求发布用false
			pm.get(bs.mContext, njok.JY_KEY, "bd").getMessage(bs.mContext, false);
		}
	}

}
