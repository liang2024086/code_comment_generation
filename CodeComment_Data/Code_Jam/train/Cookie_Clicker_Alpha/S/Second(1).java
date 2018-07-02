package methodEmbedding.Cookie_Clicker_Alpha.S.LYD78;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Second {
	static BufferedWriter out;
	public static void main(String args[])
	{			
		try {
			String path = "./B-small-attempt0.in";

			FileInputStream fis = new FileInputStream(path);

			BufferedReader in = new BufferedReader(new InputStreamReader(fis));


			String l = in.readLine();
			out = new BufferedWriter(new FileWriter("./B-small-attempt0.out"));

			for (int a = 0; a<Integer.parseInt(l); a++)
			{
				String line;
				line = in.readLine();
				String[] strings = line.split(" ");
				double[] values = new double[3];
				for (int b=0; b<3; b++)
				{
					values[b] = Double.parseDouble(strings[b]);
				}

				double answer = 0D;

				boolean flag = true;



				double time = 0;

				double currentMoney = 0;
				double currentIncome = 2;

				final double farmPrice = values[0];
				final double farmIncome = values[1];

				final double goalMoney = values[2];

				//C = farm price, F = farm Income, X = goal cookies


				while(flag)
				{
					if (currentMoney == 0D)
					{
						currentMoney = farmPrice;
						time += farmPrice/currentIncome;

						double prjTimeStay = (goalMoney-currentMoney)/currentIncome;
						double prjTimeBuy = goalMoney/(currentIncome + farmIncome);

						if (prjTimeStay < prjTimeBuy)
						{
							time += prjTimeStay;
							break;
						}
						else
						{
							currentMoney = 0D;
							currentIncome += farmIncome;
						}
					}


				}
				DecimalFormat df = new DecimalFormat("#.0000000");

				out.write("Case #"+Integer.toString(a+1)+": " + df.format(time)); 
				out.newLine();
			}

			out.close();
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

