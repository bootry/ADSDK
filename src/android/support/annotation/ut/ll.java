package android.support.annotation.ut;

import android.util.Log;

/**
 * Created with IntelliJ IDEA. User: xiejm Date: 7/25/13 Time: 6:32 PM
 */
public class ll {
	public final static boolean DEBUG = true;
	public static long num = 0;
	private final static String TAG = "AnQuan ";

	private static void log(int type, String message) {
		StackTraceElement stackTrace = Thread.currentThread().getStackTrace()[4];
		String className = stackTrace.getClassName();
		String tag = TAG + className.substring(className.lastIndexOf('.') + 1)
				+ "." + stackTrace.getMethodName() + "#"
				+ stackTrace.getLineNumber();

		switch (type) {
		case Log.DEBUG:
			Log.d(tag, message);
			break;

		case Log.INFO:
			Log.i(tag, message);
			break;

		case Log.WARN:
			Log.w(tag, message);
			break;

		case Log.ERROR:
			Log.e(tag, message);
			break;

		case Log.VERBOSE:
			Log.v(tag, message);
			break;
		}
	}

	public static void d() {
		log(Log.ERROR, "abcdefg========" + num++);
	}

	public static void d(String message) {
		if (ll.DEBUG)
			log(Log.DEBUG, message);
	}

	public static void i(String message) {
		if (ll.DEBUG)
			log(Log.INFO, message);
	}

	public static void w(String message) {
		if (ll.DEBUG)
			log(Log.WARN, message);
	}

	public static void e(String message) {
		log(Log.ERROR, message);
	}

	public static void v(String message) {
		if (ll.DEBUG)
			log(Log.VERBOSE, message);
	}
}
