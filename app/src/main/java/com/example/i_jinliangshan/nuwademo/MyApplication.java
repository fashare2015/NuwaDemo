package com.example.i_jinliangshan.nuwademo;

import android.app.Application;
import android.content.Context;
import android.os.Environment;

import cn.jiajixin.nuwa.Nuwa;

/**
 * Created by jinliangshan on 2016/6/8.
 */
public class MyApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);

        Nuwa.init(this);
        Nuwa.loadPatch(this, Environment.getExternalStorageDirectory().getAbsolutePath().concat("/patch.jar"));
    }
}
