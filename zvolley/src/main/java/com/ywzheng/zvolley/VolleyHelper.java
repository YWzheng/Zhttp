package com.ywzheng.zvolley;

import android.app.Activity;

import com.android.volley.RequestQueue;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.Volley;

/**
 * Created by bugtags.com on 16/3/8.
 */
public class VolleyHelper {

    static RequestQueue mRequestQueue;

    public static void init(Activity activity) {
        mRequestQueue = Volley.newRequestQueue(activity);
        VolleyLog.DEBUG = true;
    }
}
