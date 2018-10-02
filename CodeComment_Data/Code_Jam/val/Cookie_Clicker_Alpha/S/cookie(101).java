package methodEmbedding.Cookie_Clicker_Alpha.S.LYD700;


import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class cookie
{
public static void main(String args[]) throws IOException
	{
		FileReader fr = new FileReader("/Users/deepeecasoundarrajan/Documents/cookie1.txt");
		BufferedReader bf = new BufferedReader(fr);
		String line = bf.readLine();
		int test = Integer.parseInt(line);
		for(int i = 1; i <= test; i++)
		{
			double ansX,ansFarm;
			double c,f,x;
			line = bf.readLine();
			String[] words = line.split(" ");
			c = Double.parseDouble(words[0]);
			f = Double.parseDouble(words[1]);
			x = Double.parseDouble(words[2]);
			ansX = (x/2.0);
			ansFarm = (c/2.0);
			int index = 0;
			double total  = 0;
			double[]time = new double[8000];
			double limit = (ansFarm + (x/(((index +1) * f) + 2.0)));
			while(ansX > limit)
			{
				time[index] = ansFarm;
				index++;
				ansX = x/((index * f) + 2);
				ansFarm = c/((index *f) +2);
				limit = ansFarm + (x/(((index +1) * f) + 2));
			}
				time[index] = ansX; 
			for(int j = 0; j <= index; j++)
			{
				total = total + time[j];
			}
			System.out.print("Case #");
			System.out.print(i);
			System.out.print(": ");
			System.out.printf("%.7f",total);
			System.out.print("\n");
		}
			
	}
}
