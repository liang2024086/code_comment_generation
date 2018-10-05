package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1376;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ProblemBCookieClickerAlpha {
	
	public static void main(String args[]) throws IOException{
		double x,c,f;
		int numfarm = 0 ;
		double s = 0.0 ;
		FileWriter fout = new FileWriter("a.txt");
		PrintWriter out = new PrintWriter(fout, true);
		int numerotest = 0;
		Scanner test = new Scanner(new FileReader("input")) ;		
		numerotest = test.nextInt();
		int contatest = 0;
		int i = 0;
		double piufarm = 0.0;
		double menofarm = 0.0;
		double cookies = 0.0;
		while (contatest < numerotest){
			c = test.nextDouble();
			f = test.nextDouble();
			x = test.nextDouble();
			while(true){
				cookies = cookies + 2.0;
				if (cookies >= c)
					{
					 for (i=0;i<numfarm;i++)
					 {
						 menofarm = menofarm + c/(2+i*f);
					 }
					 menofarm = menofarm + x/(2+f*numfarm);
					 
					 numfarm++;
					 for (i=0;i<numfarm;i++)
					 {
						 piufarm = piufarm + c/(2+i*f);
					 }				
					 piufarm = piufarm + x/(2+f*numfarm);
					 
					if (piufarm < menofarm)
						{	
							s = piufarm;
							cookies = s*cookies - (numfarm*c);
						}
					else
						{
							s = menofarm;
							break;
						}
					 piufarm= 0 ;
					 menofarm = 0;
					}
			} 		
		    out.println("Case #"+(contatest+1)+": "+s);
			s= 0.0;
			numfarm = 0;
			cookies = 0;
			piufarm = 0;
			menofarm =0;
		    contatest++;	
		}
		out.flush();
		out.close();
		test.close();
		
	}

}
