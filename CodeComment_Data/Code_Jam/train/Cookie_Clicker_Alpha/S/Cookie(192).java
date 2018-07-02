package methodEmbedding.Cookie_Clicker_Alpha.S.LYD864;

import java.util.Scanner;


public class Cookie {

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		int sets = scanner.nextInt();
		for(int i = 0; i < sets; i++){
	      double C = scanner.nextDouble();
	      double F = scanner.nextDouble();
	      double X = scanner.nextDouble();
	      double time = 0;
	      double current = 2;
	      if(X <= C){
	    	  time = X / 2;
	      }
	      else{
	        while(true){
	    	  double wait = (X - C) / current;
	    	  double buy = X / (current + F);
	    	  if(wait <= buy){
	    		  time += X / current;
	    		  break;
	    	  }
	    	  else{
	    		  time += C / current;
	    		  current += F;
	    	  }
	        }
	      }
	      System.out.printf("Case #%d: %.7f\n", i + 1, time);
		}
		scanner.close();
	}
	
}
