package methodEmbedding.Magic_Trick.S.LYD1842;


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Prueba {
	    public static void main(String[] args)throws FileNotFoundException {     
	           Scanner sc = new Scanner(new File ("A-small-attempt0.in"));  //crear un objeto Scanner
	           
	           //+++ leo el n
	          int n;
	          // n = sc.nextInt(); //leer un entero
	          n = Integer.valueOf(sc.nextLine());
	         
	         
	           
	           for (int i = 0;i<n;i++){ 
	        	          	        
		        	  //leo la fila del voluntario
		 	          	int v1;
	 	          		v1 = Integer.valueOf(sc.nextLine());
		        	  
		 	          //leo y guardo la fila indicada
		        	 String[] buff1; 
		        	 
		        	 
		        	 for(int j=1; j<v1 ; j++){
		        		 sc.nextLine();
		        	 } 
		        	 
		        	 buff1 = sc.nextLine().split(" ");
		        	
		        	 for(int j=(v1+1); j<5 ; j++){
		        		 sc.nextLine();
		        	 } 
		        	 
		        	 //leo la fila del voluntario
		 	         int v2;
		 	         v2 = Integer.valueOf(sc.nextLine());
		        	  
		 	        //leo y guardo la fila indicada
		        	 String[] buff2; 
		        	 
		        	 for(int j=1; j<v2 ; j++){
		        		 sc.nextLine();
		        	 } 
		        	 buff2 = sc.nextLine().split(" ");
		        	
		        	 for(int j=(v2+1); j<5 ; j++){
		        		 sc.nextLine();
		        	 } 

		 	        
			         int canteq=0;
			         int encontre=0;
		        	 for(int k=0;k<4;k++){
		        		 for (int l=0;l<4;l++){
		        			 if ((buff1[k].compareTo(buff2[l]))== 0){
		        			 	encontre= Integer.valueOf(buff1[k]);
		        				canteq++;
		        			 }
		        		 }
		        	 }
		        	 System.out.print("Case #"+ (i+1) +":");
		        	 if (canteq==1) {
		        		 System.out.print(" " + encontre); 
		        	 }
		        	 else{
		        		 if (canteq==0){
		        			 System.out.print(" Volunteer cheated!");
		        		 }
		        		 else {
		        			 System.out.print(" Bad magician!");
		        		 }
		        	}
		        	 System.out.println();
	           }
	     }
	}
