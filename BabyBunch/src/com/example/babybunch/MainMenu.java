package com.example.babybunch;

import com.example.babybunch.R.color; 
import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
 
 
import android.graphics.LightingColorFilter;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
 
import android.view.View;
import android.view.View.OnClickListener;
 
 
import android.widget.Button;

public class MainMenu extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_menu);
		
		final Button piano = (Button)findViewById(R.id.button1);
		final Button art = (Button)findViewById(R.id.button2);
		final Button pick = (Button)findViewById(R.id.button3);
		final Button player = (Button)findViewById(R.id.button4);
		final Button help = (Button)findViewById(R.id.button5);
		MediaPlayer c = MediaPlayer.create(MainMenu.this,R.raw.asx);
        c.start();
        
        
        
        player.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				Intent intent = new Intent(v.getContext(),BabyPlayer.class);
				startActivityForResult(intent, 0);
				 
			}
		});
        
		piano.setOnClickListener(new OnClickListener() {
				
			public void onClick(View v) {
				Intent intent = new Intent(v.getContext(),PianoScreen.class);
				startActivityForResult(intent, 0);
				 
			}
		});
	     
		art.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				Intent intent = new Intent(v.getContext(),ChooserScreen.class);
				startActivityForResult(intent, 0);
				 
			}
		});
	     
      
	     
		pick.setOnClickListener(new OnClickListener() {
				
			public void onClick(View v) {
				
				Intent intent = new Intent(v.getContext(),ChooseColor.class);
				startActivityForResult(intent, 0);
				
			}
		});
	     

	     
		help.setOnClickListener(new OnClickListener() {
				
			public void onClick(View v) {
				Intent intent = new Intent(v.getContext(),Helper.class);
				startActivityForResult(intent, 0);
				help.getBackground().setColorFilter(new LightingColorFilter(0xFFFFFFFF, 0xFFAA0000));
			}
		});
		
		
 
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
