package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1365;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class main2 {

	public static void main(String[] args) throws FileNotFoundException,
			UnsupportedEncodingException {
		

		Scanner scn = new Scanner(new File("in.txt"));
		

		PrintWriter writer = new PrintWriter("out.in", "UTF-8");

		int t = scn.nextInt();
		int i = 0 ;
		while (t != 0) {
			t--;
			
			double c = scn.nextDouble() ;
			double f = scn.nextDouble() ;
			double x = scn.nextDouble() ;
			
			i++;
			
			int z = 0 ;
			
			double total  = 0.0 ;
			double done = 0.0;
			double dFarm = 0.0;
			double farm = 0.0 ;
			
			while( z >= 0 ){
				
				 done = x / (2 + z*f) ;
				 farm = c / (2 + z*f) ;
				 dFarm = (c / (2 + z*f)) + (x / (2 + ((z+1)*f))) ;
				 
				if(((total + done ) > (total + dFarm) )){
				total += farm ;
				z++ ;
				}
				else
					break ;
			}
			
			total += done;
			total = Math.floor(total * 10000000) / 10000000;
			
			if(t != 0)
			writer.println("Case #" + i + ": " + total);
			else
			writer.print("Case #" + i + ": " + total);

		}

		writer.close();

	}

}
