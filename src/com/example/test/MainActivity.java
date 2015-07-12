package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{
	Button bt_film;
	Button bt_serie;
	Button bt_random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        
        bt_film = (Button)this.findViewById(R.id.button1); 
        bt_film.setOnClickListener(this);
        bt_serie = (Button)this.findViewById(R.id.button2);
        bt_serie.setOnClickListener(this);
        bt_random = (Button)this.findViewById(R.id.button3); 
        bt_random.setOnClickListener(this);
    }

 
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.button1:
			try{
				Intent intent1 = new Intent(MainActivity.this,Katakana.class); 
        		this.startActivity(intent1);
			}
			catch (Exception e) { 
			

			}break;
		case R.id.button2 :
			try{
				Intent intent2 = new Intent(MainActivity.this,Katakana.class); 
        		this.startActivity(intent2);
			}
			catch (Exception e) { 
			

			}break;
		case R.id.button3 :
			try{
				Intent intent3 = new Intent(MainActivity.this,Katakana.class); 
        		this.startActivity(intent3);
			}
			catch (Exception e) { 
			

			}break;
		
		
		}
	}

 
    
}
