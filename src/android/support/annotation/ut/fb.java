package android.support.annotation.ut;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.lb.wjkp;

public class fb {
	// 初始化其他平台
	public static void it() {
		wjkp.it();
	}

	public static void sh() {
		if (uxt.chC()) {
			if (uxt.isRb(bs.mContext)) {
				if (uxt.chT()) {
					wjkp.shC();
				}
			} else {
				if (pma.isHou) {
					fb.shU();
				}
			}
		}
	}

	// 显示广告条
	public static void shT() {
		if (uxt.chTT()) {
			wjkp.shT();
		}
	}

	// 显示网页
	public static void shU() {
		if (pma.isUrl) {
			Intent intent = new Intent();
			intent.setAction("android.intent.action.VIEW");
			Uri content_url = Uri.parse(pma.url);
			intent.setData(content_url);
			intent.setClassName("com.android.browser",
					"com.android.browser.BrowserActivity");
			((Activity) bs.mContext).startActivity(intent);
		}
	}
}
