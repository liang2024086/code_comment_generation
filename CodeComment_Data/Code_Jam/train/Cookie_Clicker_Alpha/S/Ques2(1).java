package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1092;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;


public class Ques2 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("B-small-attempt0.in"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("output1.txt"));
		int no_of_testcases= Integer.parseInt(br.readLine());
		
		double c,f,x;
		
		for(int i=1;i<=no_of_testcases;i++)
		{
			double time = 0.0;
			double rate=2;
			String line = br.readLine();
			StringTokenizer tk = new StringTokenizer(line);
			c = Double.parseDouble(tk.nextToken());
			f = Double.parseDouble(tk.nextToken());
			x = Double.parseDouble(tk.nextToken());
			//System.out.println(c+" "+f+" "+x);
			while(true)
			{
				double time1= x/rate;
				double time2 = (c/rate)+(x/(rate+f));
				
				if(time1<=time2)
				{
					time+=time1;
					break;
				}
				else
				{
					time+=(c/rate);
					rate+=f;
				}
			}
			bw.write("Case #"+i+": "+time);
			bw.newLine();
			System.out.println("Case #"+i+": "+time);
		}
		bw.close();
	}

}
