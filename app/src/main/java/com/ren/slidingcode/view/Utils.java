package com.ren.slidingcode.view;

import android.content.Context;

/**
 * Created by asus on 2018/1/31.
 */

public class Utils {

    public static int dp2px(Context ctx, float dip) {
        float density = ctx.getResources().getDisplayMetrics().density;
        return (int) (dip * density);
    }
}
