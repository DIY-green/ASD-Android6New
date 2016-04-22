package com.diygreen.android6new;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.diygreen.android6new.newwidget1.FloatingActionButtonActivity;
import com.diygreen.android6new.newwidget1.SnackBarActivity;
import com.diygreen.android6new.newwidget1.TextInputLayoutActivity;
import com.diygreen.android6new.newwidget2.NavigationViewActivity;
import com.diygreen.android6new.newwidget2.TabLayoutActivity;

public class Android6NewWidgetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android6_newwidget);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_floatingactionbutton:
                overlay(FloatingActionButtonActivity.class);
                break;
            case R.id.btn_textinputlayout:
                overlay(TextInputLayoutActivity.class);
                break;
            case R.id.btn_snackbar:
                overlay(SnackBarActivity.class);
                break;
            case R.id.btn_appbarlayout:
                overlay(SnackBarActivity.class);
                break;
            case R.id.btn_tablayout:
                overlay(TabLayoutActivity.class);
                break;
            case R.id.btn_navigationview:
                overlay(NavigationViewActivity.class);
                break;
        }
    }

    private void overlay(Class<? extends Activity> clazz) {
        Intent intent = new Intent(this, clazz);
        startActivity(intent);
    }
}
