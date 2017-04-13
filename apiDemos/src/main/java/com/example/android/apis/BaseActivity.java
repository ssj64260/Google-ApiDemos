package com.example.android.apis;

import android.app.Activity;
import android.os.Bundle;

import com.orhanobut.logger.Logger;

/**
 * Created by lenovo on 17/4/13.
 */

public class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Logger.i(this.getLocalClassName());
    }
}
