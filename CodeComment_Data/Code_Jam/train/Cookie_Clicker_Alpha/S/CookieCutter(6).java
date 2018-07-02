package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1401;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CookieCutter {

	public static void main(String[] args)
	{
		try {

			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Sean\\Desktop\\B-small-attempt0.in"));
			// number of cases
			int number = Integer.parseInt(reader.readLine());



			for(int b = 1; b <= number; b++)
			{

				double S = 2;
				boolean x = true;

				String[] values;


				values = reader.readLine().split(" ");


				double C = Double.parseDouble(values[0]);
				double F = Double.parseDouble(values[1]);
				double X = Double.parseDouble(values[2]);



				double test = 0;
				while (x == true)
				{

					double O = X/S;

					double T = C/S;

					double P = S + F;

					double timenew = (X/P) + T;




					if(timenew < O)
					{
						S = P;
						test = test + T;

					} else
					{
						O =test + O;
						
						double factor = 1e7; 
						double fin = Math.round(O * factor)/ factor;
						System.out.println("Case" +" " + "#" + b + ":" +" "+ fin);
						x = false;
					}
				}



			}

		} catch (IOException e) 

		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
