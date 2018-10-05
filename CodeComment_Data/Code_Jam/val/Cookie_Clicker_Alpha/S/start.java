package methodEmbedding.Cookie_Clicker_Alpha.S.LYD290;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class start {

	public static void main(final String[] args) throws Exception
	{
		Scanner s=new Scanner(new File("input"));
		BufferedWriter w = new BufferedWriter( new FileWriter( new File("output.out")));
		
		int n_case = s.nextInt();
		for(int i =0;i<n_case;i++)
		{
			double c = s.nextDouble();
			double f = s.nextDouble();
			double x = s.nextDouble();
			double n=2.0;
			double ris=0.0;
			while(true)
			{
				if( (x-c)/n < x/(n+f) )
				{
					//conviene non comprare case
					ris+=x/n;
					break;
				}
				else
				{
					//conviene comprare
					ris+=c/n;
					n+=f;
				}
			}
			w.write("Case #"+(i+1)+": "+ris+"\n");
		}
		s.close();
		w.close();
	}

}
