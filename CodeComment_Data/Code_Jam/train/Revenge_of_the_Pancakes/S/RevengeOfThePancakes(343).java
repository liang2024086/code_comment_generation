package methodEmbedding.Revenge_of_the_Pancakes.S.LYD838;

import java.util.Scanner;

public class RevengeOfThePancakes {

	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
        int cant = sc.nextInt();
        
        for (int i = 0; i < cant; i++) {
        	int a=1,b=0,c=0,d=0;
        	int longi;
        	char temp;
        	String cadena = new String();
        	cadena = sc.next();
        	
        	longi=cadena.length();
        	
        	for(int k=longi ; k>0 ; k-- ){
        		if(cadena.charAt(k-1)=='+'){
           			d=d+1;
           		}else{
           			break;
           		}
       		}
        		
        	for(int j =0 ; j<longi-d ; j++){
           		if(cadena.charAt(j)=='+'){
           			if(j>0){
           				if(cadena.charAt(j)!=cadena.charAt(j-1)){
               				b=b+1;
               			}
           			}else{
           				b=b+1;
           			}       			
            			
            	}else{
           			if(j>0){
           				if(cadena.charAt(j)!=cadena.charAt(j-1)){
           					c=c+1;
           				}
           			}else{
           				c=c+1;
           			}
           		}
           	}    	
        	System.out.println("Case #"+(i+1)+": "+(b+c));
        }
	}
}
