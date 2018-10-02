package methodEmbedding.Counting_Sheep.S.LYD205;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CountingSheep {
	
public static void main(String[] args) {
	
	Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int testcase = in.nextInt(); 
    for (int i = 1; i <= testcase; ++i) {

      int sheepNumber = in.nextInt();
      int number = sheepNumber ;
      int lastnumber = 0;
 
      int inc = 2;
      int flag[] = {1,1,1,1,1,1,1,1,1,1};
      boolean sleep  = false ;
      int digit;
      if(sheepNumber == 0){
       
    	  System.out.println("Case #" + i + ": INSOMNIA");

      }else{
      while(!sleep){
    	  while(number!=0){
    		  digit = number % 10;
    		  number = number/10 ;
    		  flag[digit] = 0;   				  
    			  }
    		  
    		  
    	  
    	  
    	  for(int a = 0;a < 10;a++){
    		   if(flag[a] == 1){
    			   number = sheepNumber * inc ;
    			   lastnumber = number;

    			   inc ++;
    			   break;
    		   }else if(a == 9){
    			   
    			   sleep = true ;
    		   }
    			   
    	  }
      }
    
      System.out.println("Case #" + i + ": " + lastnumber);
      }
      
    }

}
}
