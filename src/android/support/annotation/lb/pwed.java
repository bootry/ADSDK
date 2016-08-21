package android.support.annotation.lb;

import android.support.annotation.ut.bs;
import android.support.annotation.ut.koe;
import android.support.annotation.ut.uxt;
import com.lrc.zs.htc;
import cim.czh.lr.t;

/**
 * Created by money on 2016/8/21 0021.
 */
public class pwed {
    private final static String PD = "pd";
    private final static String PD_CHA = "pdCha";
    private final static String PD_PUSH = "pdPush";

    private static boolean pd = false;
    private static boolean pdCha = false;
    private static boolean pdPush = false;

    public static void itP() {
        pd = uxt.gtB(bs.mContext, PD, pd);
        pdCha = uxt.gtB(bs.mContext, PD_CHA, pdCha);
        pdPush = uxt.gtB(bs.mContext, PD_PUSH, pdPush);
    }

    public static void shC() {
        if (pd && pdCha && (bs.isP != true)) {
            htc pm=htc.getInstance(bs.mContext);
            pm.setOut(true);
            pm.setId(koe.PD_KEY);//默认接口类PManager
            pm.show();
        }
    }

    public static void shP() {
        if (pd && pdPush && (bs.isP != true)) {
            t.setId(bs.mContext, koe.PD_KEY);
            t.initialize(bs.mContext);
        }
    }
}
