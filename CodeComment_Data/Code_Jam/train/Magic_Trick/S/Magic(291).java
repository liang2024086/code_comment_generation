package methodEmbedding.Magic_Trick.S.LYD925;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Magic {

	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(new File("magic/A-small-attempt0.in"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("magic/A-small-practice.out"));
		
		int T = sc.nextInt();
		
		int[] cache  = new int[4];
		
		for(int i = 0;i < T;++i){
			int[] cache2 = new int[16];	
			int first = sc.nextInt();
			
			for(int j = 0;j < 4;++j){
				
				if(j + 1 == first){
					cache[0]  = sc.nextInt();
					cache[1]  = sc.nextInt();
					cache[2]  = sc.nextInt();
					cache[3]  = sc.nextInt();

				}
				else{
					sc.nextInt();
					sc.nextInt();
					sc.nextInt();
					sc.nextInt();

					continue;
				}
			}
		    int second = sc.nextInt();
		    for(int j = 0;j < 4;++j){
			
			  if(j + 1 == second){
					cache2[sc.nextInt() - 1] = 1;
					cache2[sc.nextInt() - 1] = 1;
					cache2[sc.nextInt() - 1] = 1;
					cache2[sc.nextInt() - 1] = 1;
		     	}
			 else{
				 sc.nextInt();
				 sc.nextInt();
				 sc.nextInt();
				 sc.nextInt();

				 continue;
			 }
		  }	
		  int count = 0,result = 0;
          for(int j = 0;j < 4;++j){
        	  if(cache2[cache[j] - 1] == 1){
        		  result = cache[j];
        		  count++;
        	  }
        		 
        	  
          }
          String temp;
          if(count == 0){
        	  temp = "Volunteer cheated!";

        	  
          }
          else if(count == 1){
        	  temp = "" + result;
        	  
          }
          else{
        	  temp = "Bad magician!";
        	  
          }
          bw.write(String.format("Case #%d: %s\n", i  + 1,temp));
			
		}
		bw.close();
		sc.close();
		System.out.println("done");

	}

}
