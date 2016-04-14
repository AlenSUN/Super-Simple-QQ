package com.alensun.qq;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends Activity {
	private ScrollView scroll;
	private TextView text;
	private EditText input;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		scroll = (ScrollView) findViewById(R.id.scroll);
		text = (TextView) findViewById(R.id.text);
		input = (EditText) findViewById(R.id.input);
		
		Button send = (Button) findViewById(R.id.send);
		
		send.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				text.append("alen sun said:\n    " + input.getText().toString() + "\n");
				input.setText("");
				scroll.post(new Runnable() {            
				    @Override
				    public void run() {
				    	scroll.fullScroll(View.FOCUS_DOWN);        
				    }
				});
			}
		});
	}
}
