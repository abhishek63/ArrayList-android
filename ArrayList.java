package com.example.multi_screen.apps;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

public class NumberActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_number);

		// create string array for storing data
		ArrayList<String> words = new ArrayList<String>();

		words.add("one");
		words.add("Two");
		words.add("Three");
		words.add("Four");
		words.add("one");
		words.add("Two");
		words.add("Three");
		words.add("Four");
		words.add("one");
		words.add("Two");
		words.add("Three");
		words.add("Four");
		words.add("one");
		words.add("Two");
		words.add("Three");
		words.add("Four");
		
		LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);
		
		
		int indexVariable = 0;
		while(indexVariable < words.size()){
			
			TextView wordView = new TextView(this);
			wordView.setText(words.get(indexVariable));
			rootView.addView(wordView);
			indexVariable++;
			
		}
		
		

		Log.v("NumberActivity", "heelo woorl" + words.get(0));
		Log.v("NumberActivity", "heelo woorl" + words.get(1));

	}
}
