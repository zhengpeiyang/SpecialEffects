package com.cn.zpy.main;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{

	private Button btn1,btn2;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn1 = (Button) findViewById(R.id.main_btn1);
		btn2 = (Button) findViewById(R.id.main_btn2);
		
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.main_btn1:
			new Handler().postDelayed(new Runnable() {
				
				@Override
				public void run() {
					Intent mainIntent = new Intent(MainActivity.this, TestActivity1.class);
					MainActivity.this.startActivity(mainIntent);
					MainActivity.this.finish();
					overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
				}
			}, 1000);
			v.setClickable(false);
			break;

		case R.id.main_btn2:
			
			break;
			
		default:
			break;
		}
	}

}
