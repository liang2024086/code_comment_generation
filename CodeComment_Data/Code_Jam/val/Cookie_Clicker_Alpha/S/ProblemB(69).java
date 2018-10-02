package methodEmbedding.Cookie_Clicker_Alpha.S.LYD265;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashSet;

public class ProblemB {

	public static void main(String[] args) {
		try {
			String input = "B-small-attempt0";
			BufferedReader inputStream = new BufferedReader(new FileReader(input+".in"));
			FileWriter f = new FileWriter(input+".out");
			String l = inputStream.readLine();
			int max = Integer.parseInt(l);
			for (int i = 1; i<=max; i++)
			{
				l = inputStream.readLine();
				String[] vars = l.split(" ");
				double C = Double.parseDouble(vars[0]);
				double F = Double.parseDouble(vars[1]);
				double X = Double.parseDouble(vars[2]);
				double rate = 2;
				double total_time= 0;
				while (X/(rate+F)<=(X-C)/rate)
				{
					total_time += C/rate;
					rate +=F ;
				}
				total_time+=X/rate;
				System.out.println("Case #"+i+": "+total_time);
				f.write("Case #"+i+": "+total_time+"\n");
			}
			f.close();
		}catch (Exception e)
		{e.printStackTrace();}

	}

}
