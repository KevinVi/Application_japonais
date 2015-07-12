package com.example.test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Katakana extends Activity implements OnClickListener {
	 	String a;
		Button button;
		ImageView image;
		RadioGroup ra1;
		RadioButton p1;
		RadioButton p2;
		RadioButton p3;
		RadioButton p4;
		TextView t1;
		String [] a1 = new String[400];
		String res="",u;
		int varia;
		int i=0,j,p,m=0,i1,place1=0,place2=0,place3=0,place4=0,correct=0;
		
	    int n1,n2,n3,n4,n5,k=0;
	    int imageArray []={R.drawable.katakana_a,
			       R.drawable.katakana_e,
			       R.drawable.katakana_i,
			       R.drawable.katakana_o,
			       R.drawable.katakana_u,
			       R.drawable.katakana_ka,
			       R.drawable.katakana_ke,
			       R.drawable.katakana_ki,
			       R.drawable.katakana_ko,
			       R.drawable.katakana_ku,
			       R.drawable.katakana_sa,
			       R.drawable.katakana_se,
			       R.drawable.katakana_shi,
			       R.drawable.katakana_so,
			       R.drawable.katakana_su,
			       R.drawable.katakana_ta,
			       R.drawable.katakana_te,
			       R.drawable.katakana_chi,
			       R.drawable.katakana_to,
			       R.drawable.katakana_tsu,
			       R.drawable.katakana_na,
			       R.drawable.katakana_ne,
			       R.drawable.katakana_nu,
			       R.drawable.katakana_ni,
			       R.drawable.katakana_no,
			       R.drawable.katakana_ha,
			       R.drawable.katakana_hi,
			       R.drawable.katakana_fu,
			       R.drawable.katakana_he,
			       R.drawable.katakana_ho,
			       R.drawable.katakana_ma,
			       R.drawable.katakana_mi,
			       R.drawable.katakana_mu,
			       R.drawable.katakana_me,
			       R.drawable.katakana_mo,
			       R.drawable.katakana_ya,
			       R.drawable.katakana_yu,
			       R.drawable.katakana_yo,
			       R.drawable.katakana_ra,
			       R.drawable.katakana_ri,
			       R.drawable.katakana_ru,
			       R.drawable.katakana_re,
			       R.drawable.katakana_ro,
			       R.drawable.katakana_wa,
			       R.drawable.katakana_wi,
			       R.drawable.katakana_we,
			       R.drawable.katakana_wo,
			       R.drawable.katakana_n,
			       R.drawable.katakana_ba,
			       R.drawable.katakana_bi,
			       R.drawable.katakana_bu,
			       R.drawable.katakana_be,
			       R.drawable.katakana_bo,
			       R.drawable.katakana_pa,
			       R.drawable.katakana_pi,
			       R.drawable.katakana_pu,
			       R.drawable.katakana_pe,
			       R.drawable.katakana_po,
			       R.drawable.katakana_za,
			       R.drawable.katakana_ji,
			       R.drawable.katakana_zu,
			       R.drawable.katakana_ze,
			       R.drawable.katakana_zo,
			       R.drawable.katakana_ga,
			       R.drawable.katakana_gi,
			       R.drawable.katakana_gu,
			       R.drawable.katakana_ge,
			       R.drawable.katakana_go,
			       R.drawable.katakana_da,
			       R.drawable.katakana_di,
			       R.drawable.katakana_du,
			       R.drawable.katakana_de,
			       R.drawable.katakana_do,
			       
			       
	    };
		
	
		@Override
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.katakana);
			
			
			
			try{
				InputStream ino=getResources().openRawResource(R.raw.text);
				//On créé un reader pour lire dedans
				InputStreamReader tmpp=new InputStreamReader(ino);
				BufferedReader reader = new BufferedReader(tmpp);
				p=0;
				 
				do {
					u=reader.readLine();
					if (u!=null){
						a1[p]=u;
						p++;
					
					}

					}while ((u= reader.readLine()) != null);
					
					ino.close();

					
			}catch (Exception e) { 
				

			}
			image = (ImageView) findViewById(R.id.image);
			 
			button = (Button) this.findViewById(R.id.val);
	    	button.setOnClickListener(this);
	    	p1=(RadioButton) this.findViewById(R.id.r1);
	    	p2=(RadioButton) this.findViewById(R.id.r2);
	    	p3=(RadioButton) this.findViewById(R.id.r3);
	    	p4=(RadioButton) this.findViewById(R.id.r4);
	    
	    	
	    	placement1();
	    	placement2();
	    	placement3();
	    	placement4();
			image.setImageResource(imageArray[n1]);
			
			
	 
		}
		public void reponse1(){
			if (correct==1){
				res="Bonne réponse!";
				m++;
			}else{
				res="Mauvaise réponse";
			}
		}
		public void reponse2(){
			if (correct==2){
				res="Bonne réponse!";
				m++;
			}else{
				res="Mauvaise réponse"; 
			}
		}
		public void reponse3(){
			if (correct==3){
				res="Bonne réponse!";
				m++;
			}else{
				res="Mauvaise réponse";
			}
		}
		public void reponse4(){
			if (correct==4){
				res="Bonne réponse!";
				m++;
			}else{
				res="Mauvaise réponse";
			}
		}
		public void placement1(){
			random1();
			place1 = (int)(4.0 * Math.random()) ;
			switch (place1){
			case 0: p1.setText(a1[n1]);

					correct=1;
			break;
			case 1: p2.setText(a1[n1]);
					correct=2;
			break;
			case 2: p3.setText(a1[n1]);
					correct=3;
			break;
			case 3: p4.setText(a1[n1]);
					correct=4;
			break;
			}
		}
		public void placement2(){
			random2();
			do{
	        	
				place2 = (int)(4.0 * Math.random()) ;
		        
		        
		    }while(place2==place1);
		    switch (place2){
			case 0: p1.setText(a1[n2]);
			break;
			case 1: p2.setText(a1[n2]);
			break;
			case 2: p3.setText(a1[n2]);
			break;
			case 3: p4.setText(a1[n2]);
			break;
		    }
		}
		public void placement3(){
			random3();
			do{
			    do{	
			    	place3 = (int)(4.0 * Math.random()) ;
				    
			    }while(place3==place2);
			 }while(place3==place1);	
			switch (place3){
			case 0: p1.setText(a1[n3]);
			break;
			case 1: p2.setText(a1[n3]);
			break;
			case 2: p3.setText(a1[n3]);
			break;
			case 3: p4.setText(a1[n3]);
			break;
			}
		}
		public void placement4(){
			random4();
			do{	
		    	 do{
    			    do{	
    				    place4 = (int)(4.0 * Math.random()) ;
    				    
    			    }while(place4==place1);
    			 }while(place4==place2);		
    		}while(place4==place3);
    		switch (place4){
			case 0: p1.setText(a1[n4]);
			break;
			case 1: p2.setText(a1[n4]);
			break;
			case 2: p3.setText(a1[n4]);
			break;
			case 3: p4.setText(a1[n4]);
			break;
    		}

		}
		public void random1(){
			n1 = (int)(72.0 * Math.random()) + 1;
		}
		public void random2(){
			do{
	        	
				n2 = (int)(72.0 * Math.random()) + 1;
		        
		        
		    }while(n2==n1);
		}
		public void random3(){
			do{
			    do{	
			    	n3 = (int)(72.0 * Math.random()) + 1;
				    
			    }while(n3==n2);
			 }while(n3==n1);	
		}
		public void random4(){
			do{	
		    	 do{
    			    do{	
    				    n4 = (int)(72.0 * Math.random()) + 1;
    				    
    			    }while(n4==n1);
    			 }while(n4==n2);		
    		}while(n4==n3);

		}

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			ra1 = (RadioGroup) this.findViewById(R.id.radio1);
	    	varia = ra1.getCheckedRadioButtonId();
			
	    	switch (k){	
	        
	        case 0: 	switch (varia){
	        				
	    					case R.id.r1 : reponse1();
	    										break;
	    	
	    					case R.id.r2 :  reponse2();
	    										break;
	    	
	    					case R.id.r3 :  reponse3();	
	    										break;
	    										
	    					case R.id.r4 : reponse4();
	    										break;
	    								}
	        		

	        		placement1();
	        		placement2();
	        		placement3();
	        		placement4();
	        		image.setImageResource(imageArray[n1]);
	    	    	k++;
	            	break;
	        case 1:
	        	res="";
	        	
	        			switch (varia){
	            
	        				case R.id.r1 :reponse1();
	        									break;

	        				case R.id.r2 :reponse2();
	        									break;

	        				case R.id.r3 : reponse3();	
	        									break;
	    				
	        				case R.id.r4 : reponse4();
	        									break;
	        							}

	        			placement1();
	 	        		placement2();
	 	        		placement3();
	 	        		placement4();
	 	        		image.setImageResource(imageArray[n1]);
	        	    	k++;
	    			break;
	        case 2:
	        	res="";
	        	
	        			switch (varia){
	            
	        				case R.id.r1 : reponse1();
	        									break;

	        				case R.id.r2 : reponse2();
	        									break;

	        				case R.id.r3 : reponse3();	
	        									break;
	    				
	        				case R.id.r4 : reponse4();
	        									break;
	        							}

	        			placement1();
		        		placement2();
		        		placement3();
		        		placement4();
		        		image.setImageResource(imageArray[n1]);
	        	    	k++;
	    			break;
	        case 3:
	        	res="";
	        	
	        			switch (varia){
	            
	        				case R.id.r1 : reponse1();
	        									break;

	        				case R.id.r2 : reponse2();
	        									break;

	        				case R.id.r3 :reponse3();	
	        									break;
	    				
	        				case R.id.r4 : reponse4();
	        									break;
	        							}
	        			placement1();
		        		placement2();
		        		placement3();
		        		placement4();
		        		image.setImageResource(imageArray[n1]);
	        	    	k++;
	    			break;
	        case 4:
	        	res="";
	        
	        			switch (varia){
	            
	        				case R.id.r1 : reponse1();
	        									break;

	        				case R.id.r2 :reponse2();
	        									break;

	        				case R.id.r3 : reponse3();	
	        									break;
	    				
	        				case R.id.r4 : reponse4();
	        									break;
	        						}
	        			
	        			try{
	        				Intent intent3 = new Intent(Katakana.this,Score.class); 
	        				intent3.putExtra("score",(int)m);
	                		this.startActivity(intent3);
	                		
	        			}
	        			catch (Exception e) { 
	        			

	        			}break;
	        }

	    	
	        
	    	 Toast.makeText(getApplicationContext(), res,
	                 Toast.LENGTH_SHORT).show();
	    		
	    	
	    		
	    	}


}
