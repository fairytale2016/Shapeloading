package com.mingle.shapeloading;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.mingle.widget.ShapeLoadingDialog;
import com.mingle.widget.ShapeLoadingDialog.DlalogCancelListener;

public class DialogDemoActivity extends  Activity {

    private ShapeLoadingDialog shapeLoadingDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_demo);
         shapeLoadingDialog=new ShapeLoadingDialog(this);
        shapeLoadingDialog.setLoadingText("您的健康管理师\n正在对您的量表进行评估");
        shapeLoadingDialog.setCanceledOnTouchOutside(false);
        //shapeLoadingDialog.setCanceledOnBackKey(false);
        shapeLoadingDialog.setOnCancelListener(new DlalogCancelListener() {
			
			@Override
			public void onMyCancel(Dialog mDialog) {
				Log.e("aa", "setOnCancelListener");
			}
		});
        
        
        
        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                shapeLoadingDialog.show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_dialog_demo, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        return super.onOptionsItemSelected(item);
    }
}
