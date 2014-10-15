package com.cn.zpy.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TestActivity2 extends Activity implements OnClickListener{

	private Button btn1,btn2;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test2);
		
		btn1 = (Button) findViewById(R.id.test2_btn1);
		btn2 = (Button) findViewById(R.id.test2_btn2);
		
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.test2_btn1:
			new Handler().postDelayed(new Runnable() {
				
				@Override
				public void run() {
					Intent mainIntent = new Intent(TestActivity2.this, MainActivity.class);
					TestActivity2.this.startActivity(mainIntent);
					TestActivity2.this.finish();
					overridePendingTransition(R.anim.test2, R.anim.test1);
				}
			}, 1000);
			break;

		case R.id.test2_btn2:
			
			break;
			
		default:
			break;
		}
		
	}
	
}
