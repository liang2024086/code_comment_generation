package methodEmbedding.Cookie_Clicker_Alpha.S.LYD481;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;


public class CookieClickerAlpha {

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new FileReader("B-small-attempt0.in"));

			int i = 0;
			int numberOfTestCase = Integer.parseInt(br.readLine());
			String lineSplit[];
			StringBuffer sb = new StringBuffer();

			double c, x, f, perSecond, timetaken, cookies, currentEstimate, nextEstimate;
			boolean noMore;

			while (i < numberOfTestCase) 
			{
				noMore = false;
				perSecond = 2d;
				timetaken = 0d;
				cookies = 0d;

				i++;
				lineSplit = br.readLine().split(" ");
				c = Double.parseDouble(lineSplit[0]);
				f = Double.parseDouble(lineSplit[1]);
				x = Double.parseDouble(lineSplit[2]);
//				System.out.println("c="+c + " f="+f + " x="+x);
				while(cookies < x)
				{
					if(cookies + 1 < x)
					{
						cookies = cookies + 1;
						timetaken = timetaken + (1 / perSecond);
					}
					else
					{
						timetaken = timetaken + ((x - cookies) / perSecond);
						cookies = x;
					}

					if(cookies < x && cookies >= c && !noMore)
					{
						if(cookies > c)
						{
							timetaken = timetaken + ((c - cookies) / perSecond);
							cookies = c;
						}
						
						currentEstimate = (x - cookies) / perSecond;
						nextEstimate = x / (perSecond + f);
						if(nextEstimate < currentEstimate)
						{
							perSecond = perSecond + f;
							cookies = 0;
						}
						else
						{
							noMore = true;
						}
					}

				}

				sb.append("Case #").append(i).append(": ").append(new DecimalFormat("0.0000000").format(timetaken));

				if(i >= numberOfTestCase)
				{
					break;
				}
				else
				{
					sb.append("\n");
				}
			}
			br.close();

			BufferedWriter out = new BufferedWriter(new FileWriter("B-small-attempt0.out"));
			out.write(sb.toString());
			out.close();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
