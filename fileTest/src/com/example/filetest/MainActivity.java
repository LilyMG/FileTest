package com.example.filetest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends Activity {
// some comments to be added to git
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		NotesDaoImpl daoImpl = new NotesDaoImpl(this);
	//	System.out.println("DAO impl : " + daoImpl);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		return true;

	}

}
