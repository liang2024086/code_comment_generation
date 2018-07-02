package methodEmbedding.Cookie_Clicker_Alpha.S.LYD727;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Cookies{

	public static void main(String[] args) throws FileNotFoundException {
		double c, f, x, time, time1, rate, cook, time2, farms, temp;
		int t;
		
		Scanner scan = new Scanner(new File("input.txt"));
		
		t = scan.nextInt();
		for(int i=0; i<t; i++){
			c = scan.nextDouble();
			f = scan.nextDouble();
			x = scan.nextDouble();
			
			rate = 2;
			farms = 0;
			time = 0;
			
			do{
				temp = time;
				
				time1 = (x/rate) ;
				
				time2 = c/rate + x/(rate+f);	
				
				if(time1<time2){
					time = time1;
				}
				else{
					time = c/rate;
					rate+=f;
				}
				time+=temp;
				
			}while(time1>=time2 );
			
			System.out.println("Case #" + (i+1) +": " + time);
			
		}

	}

}
