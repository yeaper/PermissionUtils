package com.yyp.permissionutils;

import android.app.Application;

import com.yyp.permissionutils.utils.UIUtils;

/**
 * Created by yyp on 2019.09.23
 */
public class BaseApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        UIUtils.setContext(this);
    }
}
