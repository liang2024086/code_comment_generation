package methodEmbedding.Counting_Sheep.S.LYD912;

import java.util.*;
import java.io.*;






public class Main {
  public static void main(String[] args) {
	  
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
    
    Integer [] list = new Integer[t];
    for(int k =0; k<t; k++){
    	list[k]=in.nextInt();
    }
    
    
    for (int j = 0; j < t; ++j) {	//numero de veces
     
    	int mult=1;
    	boolean cero=false;
    	boolean uno=false;
    	boolean dos=false;
    	boolean tres=false;
    	boolean cuatro=false;
    	boolean cinco=false;
    	boolean seis=false;
    	boolean siete=false;
    	boolean ocho=false;
    	boolean nueve=false;

    	do{
    	Integer multi=list[j]*mult;
    	String numero=multi.toString();
    	
    	for(int i=0; i<numero.length();i++){
    		if(numero.charAt(i)=='0'){
    			cero=true;
    		}
    		
    		else if(numero.charAt(i)=='1'){
    			uno=true;
    			
    		}
    		else if(numero.charAt(i)=='2'){
    			dos=true;
	
			    		}
    		else if(numero.charAt(i)=='3'){
    			tres=true;

			}
    		else if(numero.charAt(i)=='4'){
    			cuatro=true;

			}
    		else if(numero.charAt(i)=='5'){
    			cinco=true;

			}
    		else if(numero.charAt(i)=='6'){
    			seis=true;
	
			}
    		else if(numero.charAt(i)=='7'){
    			siete=true;
				
			}
    		else if(numero.charAt(i)=='8'){
    			ocho=true;
				
			}

    		else if(numero.charAt(i)=='9'){
    			nueve=true;
    		}
    		else{}
    	}
    	
    	
    	
        if(cero==true && uno==true && dos==true && tres==true && cuatro==true &&
        		cinco==true && seis==true && siete==true && ocho==true && nueve==true){
        	System.out.println("Case #" + (j+1) + ": " + numero );
        	mult=999;
        }
        else{
        
        	mult=mult+1;}
        	
    	}while(mult<=100);
        	if(mult!=999){
        		System.out.println("Case #" + (j+1) + ": " + "INSOMNIA" );
        	}
        	
        
        

    	/*
5
0
1
2
11
1692

Case #1: INSOMNIA
Case #2: 10
Case #3: 90
Case #4: 110
Case #5: 5076



*/
    	
    	
    	
    }
  }
}
