package com.diygreen.android6new;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.diygreen.android6new.newapi.DirectShareActivity;
import com.diygreen.android6new.newapi.DynamicPermissionActivity;
import com.diygreen.android6new.newapi.TextSelectionActivity;

public class Android6NewApiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android6_newapi);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_dynamicpermission:
                overlay(DynamicPermissionActivity.class);
                break;
            case R.id.btn_textselection:
                overlay(TextSelectionActivity.class);
                break;
            case R.id.btn_directshare:
                overlay(DirectShareActivity.class);
                break;
        }
    }

    private void overlay(Class<? extends Activity> clazz) {
        Intent intent = new Intent(this, clazz);
        startActivity(intent);
    }
}
