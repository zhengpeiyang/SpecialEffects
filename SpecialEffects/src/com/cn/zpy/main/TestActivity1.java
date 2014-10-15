package com.cn.zpy.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TestActivity1 extends Activity implements OnClickListener{
	private Button btn1,btn2;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test1);
		
		btn1 = (Button) findViewById(R.id.test1_btn1);
		btn2 = (Button) findViewById(R.id.test1_btn2);
		
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.test1_btn1:
			new Handler().postDelayed(new Runnable() {
				
				@Override
				public void run() {
					Intent mainIntent = new Intent(TestActivity1.this, TestActivity2.class);
					TestActivity1.this.startActivity(mainIntent);
					TestActivity1.this.finish();
					overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
				}
			}, 1000);
			break;

		case R.id.test1_btn2:
			
			break;
			
		default:
			break;
		}
	}

}
