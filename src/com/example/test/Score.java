package com.example.test;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Score  extends Activity implements OnClickListener {
	 Button bt;  
	 TextView t1;
	 String score1;
	 int score;
	
	protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        Bundle extras = getIntent().getExtras(); 
	        score=extras.getInt("score");
	        setContentView(R.layout.score);
	        bt = (Button)this.findViewById(R.id.bt1); 
	        bt.setOnClickListener(this);
	        t1 = (TextView)this.findViewById(R.id.t1);
	       
        	
			t1.setText("Votre score est :"+score+"/5");
        	
	}
	
	
	
	
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent intent = new Intent(Score.this,MainActivity.class); 
		this.startActivity(intent);
	}

}
