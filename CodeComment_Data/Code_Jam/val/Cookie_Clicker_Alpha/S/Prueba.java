package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1351;


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Prueba {
	    public static void main(String[] args)throws FileNotFoundException {     
	           Scanner sc = new Scanner(new File ("B-small-attempt0.in"));  //crear un objeto Scanner
	           
	           //+++ leo el T
	          int T;
	          
	          T = Integer.valueOf(sc.nextLine());
	         
	         
	           
	           for (int i=0;i<T;i++){ 
	        	          	        
		 	       //leo las variables
		        	String[] buff;
		        	 
		        	buff = sc.nextLine().split(" ");
		        	double C=Double.valueOf(buff[0]);
		        	double F=Double.valueOf(buff[1]);
		        	double X=Double.valueOf(buff[2]);
		        	
		        	double time =2; 
		        	double costo1= X/2;
		        	double costo2= C/2; 
		        	
		        	
		        	while ((costo2 + X/(time+F)) < costo1){
		        		time= time+F;
		        		costo1= costo2 + X/time; 
		        		costo2= costo2 + C/time;
		        	}
		        	
		        	 System.out.print("Case #"+ (i+1) +":");
		        	 System.out.print(" " + costo1); 
		        	 System.out.println();
	           }
	     }
	}
