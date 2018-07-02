package methodEmbedding.Cookie_Clicker_Alpha.S.LYD106;

import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.text.DecimalFormat;

class Cookie{

	public static void main(String args[]){
		try{

			File f = new File("B-small.in");
			File o = new File("B-small.out");
			PrintWriter p = new PrintWriter(o);
			Scanner s = new Scanner(new FileReader(f));
			int t = s.nextInt(), cas=1;

			while(cas<=t){
				double c = s.nextDouble(), fa = s.nextDouble(), x = s.nextDouble();
				double cookieCount = 0, time = 0, sumTime = 0, cookieIncrement = 2;
				boolean flag = false;
				
				if(x/cookieIncrement>c/cookieIncrement){
				
					//sumTime = time = c/cookieIncrement;
					while(/*x/cookieIncrement>time*/x/cookieIncrement >((x/(cookieIncrement+fa))+c/cookieIncrement)){
						//if(x/cookieIncrement <((x/(cookieIncrement+fa))+c/cookieIncrement))
						//	break;
						sumTime+=c/cookieIncrement;
						cookieIncrement+=fa;													
						//System.out.println("inc: "+cookieIncrement+" sum: "+sumTime);
						
					}
					sumTime+=x/(cookieIncrement);					
				}
				else
					sumTime+=x/cookieIncrement;
				
				
				DecimalFormat df = new DecimalFormat("#.0000000");
				p.write("Case #"+cas+": "+df.format(sumTime)+"\n");				
				cas++;
			}
			p.close();
		}
		catch(Exception e){

		}
	}
}
