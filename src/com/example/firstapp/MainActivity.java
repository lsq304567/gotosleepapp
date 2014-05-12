package com.example.firstapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	public final static String EXTRA_MESSAGE = "com.example.firstapp.MESSAGE";
	
	// http://developer.android.com/reference/android/os/PowerManager.html
	PowerManager pm = (PowerManager) getSystemService(Context.POWER_SERVICE);
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }
    
        
    /** Called when the user clicks the Send button */
    public void goSleep(View view) {    	
    	pm.goToSleep( SystemClock.uptimeMillis() +1);
    }
    
}
