//java.file

package com.example.multi_screen.apps;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
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
		words.add("Five");
		words.add("Six");
		words.add("Seven");
		words.add("Eight");
		words.add("Nine");
		words.add("Two");
		words.add("Three");
		words.add("Four");
		words.add("one");
		words.add("Two");
		words.add("Three");
		words.add("Four");

		// LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);

		ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, words);

		ListView listView = (ListView) findViewById(R.id.list);

		listView.setAdapter(itemsAdapter);

		

	}
}



//activity_number.xml


<?xml version="1.0" encoding="utf-8"?>
<ListView xmlns:android="http://schemas.android.com/apk/res/android"
   xmlns:tools="http://schemas.android.com/tools"
   android:id="@+id/list"
   android:orientation="vertical"
   android:layout_width="match_parent"
   android:layout_height="match_parent"
   
   tools:context="com.example.android.miwok.NumbersActivity"/>
