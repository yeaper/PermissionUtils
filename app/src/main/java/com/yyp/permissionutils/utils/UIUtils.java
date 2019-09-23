package com.yyp.permissionutils.utils;

import android.content.Context;

/**
 * Created by yyp on 2019.09.23
 */
public class UIUtils {

    private static Context app;

    public static void setContext(Context context){
        app = context;
    }

    public static Context getContext(){
        return app;
    }
}
