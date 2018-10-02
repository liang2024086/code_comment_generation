package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1204;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class cookie {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(new File("cookie/B-small-attempt0.in"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("cookie/B-small-practice.out"));
		
		int T = sc.nextInt();
		
		for(int i = 0;i < T;++i){
			
			double C = sc.nextDouble();
		    double f = sc.nextDouble();
		    double x = sc.nextDouble();
		    
		    double cur = 0.0;
		    double rate = 2.0;
		    
		    double time = 0.0;
		    

		    while(cur != x){
		    	if((cur + C) >= x){
		    		time += (x - cur) / rate;
		    		cur = x;
		    		continue;
		    	}
		    	
		    	double temp = (x - cur) / rate;
		    	double temp2 = (x - cur) / (rate + f) + C / rate;
		    	
		    	if(temp <= temp2){
		    		time += (x - cur) / rate;
		    		cur = x;
		    	}
		    	else{
		    		
		    		time += C / rate;
		    		rate += f;
		    	}
		    }
		    
		    bw.write(String.format("Case #%d: %f\n",i + 1,time));
		}
		bw.close();
		sc.close();
		
		System.out.println("done");
			

	}
	

}
