package com.praeses.playandroid;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.actionbarsherlock.app.SherlockActivity;

public class HelloAndroidActivity extends SherlockActivity {

    private static String TAG = "playandroid";

    /**
     * Called when the activity is first created.
     * @param savedInstanceState If the activity is being re-initialized after
     * previously being shut down then this Bundle contains the data it most
     * recently supplied in onSaveInstanceState(Bundle). <b>Note: Otherwise it is null.</b>
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate");
        setContentView(R.layout.main);
    }

}

