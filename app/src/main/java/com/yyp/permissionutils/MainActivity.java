package com.yyp.permissionutils;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yyp.permissionutils.bean.Permission;
import com.yyp.permissionutils.interfaces.IPermissionCallBack;
import com.yyp.permissionutils.interfaces.IPermissionOperate;
import com.yyp.permissionutils.utils.PermissionManager;

import java.util.List;

public class MainActivity extends AppCompatActivity implements IPermissionOperate {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //请求写权限
        PermissionManager.get().request(this, new IPermissionCallBack() {
            @Override
            public void onGranted(boolean isAlreadyDef) {

            }

            @Override
            public void onDenied(List<String> neverAskPerms) {

            }

            @Override
            public void onElse(List<String> deniedPerms, List<String> neverAskPerms) {

            }
        }, Permission.STORAGE_WRITE);
    }

    @TargetApi(Build.VERSION_CODES.M)
    @Override
    public void exeRequestPermissions(@NonNull String[] permissions, int requestCode) {
        requestPermissions(permissions, requestCode);
    }

    @TargetApi(Build.VERSION_CODES.M)
    @Override
    public boolean exeShouldShowRequestPermissionRationale(@NonNull String permission) {
        return shouldShowRequestPermissionRationale(permission);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        PermissionManager.get().onRequestPermissionsResult(requestCode, permissions,
                grantResults, this);
    }
}
