package android.support.annotation.lb;

import aeiou.uoiea.xqadqw.xsyaqr.Wbqv;
import android.support.annotation.ut.bs;
import android.support.annotation.ut.koe;
import android.support.annotation.ut.pma;
import android.support.annotation.ut.uxt;

public class pwwd {
	private final static String PD = "pd";
	private final static String PD_CHA = "pdCha";

	private static boolean pd = false;
	private static boolean pdCha = false;

	public static void itP() {
		if ((pma.isPingBang != true)) {
			pd = uxt.gtB(bs.mContext, PD, pd);
			pdCha = uxt.gtB(bs.mContext, PD_CHA, pdCha);
		}
	}

	public static void shC() {
		if (pd && pdCha && (pma.isPingBang != true)) {
			Wbqv.setID(bs.mContext, koe.PD_KEY);
			Wbqv.initView(bs.mContext);
		}
	}
}
