package com.android.mdui.layout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.android.mdui.R;

public class LayoutActivity4 extends AppCompatActivity{

	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_4);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_behavior);
        toolbar.getBackground().setAlpha(0);//toolbar透明度初始化为0
	}
}
