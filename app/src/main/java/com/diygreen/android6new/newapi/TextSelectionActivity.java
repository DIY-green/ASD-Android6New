package com.diygreen.android6new.newapi;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.diygreen.android6new.R;


public class TextSelectionActivity extends AppCompatActivity {

    private ActionMode mActionMode;

    private TextView mTestTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textselection);

        initView();
        initListener();
    }

    private void initView() {
        this.mTestTV = (TextView) findViewById(R.id.tv_test);
    }

    private void initListener() {
        this.mTestTV.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                testTextSelection();
                view.setSelected(true);
                return false;
            }
        });
    }

    @TargetApi(23)
    private void testTextSelection() {
        mActionMode = startActionMode(new ActionMode.Callback2() {
            @Override
            public boolean onCreateActionMode(ActionMode mode, Menu menu) {
                MenuInflater inflater = mode.getMenuInflater();
                inflater.inflate(R.menu.actionmode_menu, menu);
                return true;
            }

            @Override
            public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
                return false;
            }

            @Override
            public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
                Toast.makeText(TextSelectionActivity.this, item.getTitle(), Toast.LENGTH_LONG).show();
                mode.finish();
                return true;
            }

            @Override
            public void onDestroyActionMode(ActionMode mode) {

            }

            @Override
            public void onGetContentRect(ActionMode mode, View view, Rect outRect) {
                super.onGetContentRect(mode, view, outRect);
            }

        }, ActionMode.TYPE_FLOATING);
    }

}
