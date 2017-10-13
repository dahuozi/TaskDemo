package com.dahuozi.taskdemo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by lenovo on 2017/10/14.
 * test
 */

public class OtherActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

    }
    public void click(View view){
        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:10086"));
        startActivity(intent);
    }

}
