package methodEmbedding.Cookie_Clicker_Alpha.S.LYD190;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Scanner;

public class cookiesclicker {
	public static void main(String[] args) throws IOException {
		long r, cases;
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(new File("input.in"));
		BufferedWriter out = new BufferedWriter(new FileWriter("output.out"));
		
		cases = sc1.nextInt();

		for (int i = 1; i <= cases; i++) {
			double c1,f,x, prodrate=2 ;
			double currenttimetowin=0, totaltime=0, timetobuy=0, nexttimetowin;
			boolean p=true;
			c1=sc1.nextDouble();
			f=sc1.nextDouble();
			x=sc1.nextDouble();
			totaltime= x/prodrate;
			
			while(p){
				
				currenttimetowin=x/prodrate;
				timetobuy=(c1/prodrate)+timetobuy;
				
				
				nexttimetowin= x/(prodrate+f);
				
				if(totaltime<=nexttimetowin+timetobuy){
				
					System.out.println(totaltime);
					
					out.write("Case #"+i+": "+totaltime);
					out.newLine();
					p=false;
				
				}else{
					totaltime=nexttimetowin+timetobuy;
					prodrate=prodrate+f;
				}
			}
			
			
		
		
			
		}
		out.close();
		
	}

}
