package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1082;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Cookie 
{

	public static void main(String[] args) 
	{
		int t,i,j,count,k;
		double time1 = 0, time2=0,c,f,x;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			t = Integer.parseInt(br.readLine());
			String[] result = new String[t + 1];
			String capture;
			String[] splitted = new String[5];
			for(i = 1 ; i <= t ; i++)
			{
				result[i] = "Case #" + i + ": ";
				capture = br.readLine();
				splitted = capture.split("\\s+");
				c = Double.parseDouble(splitted[0]);
				f = Double.parseDouble(splitted[1]);
				x = Double.parseDouble(splitted[2]);
				time1 = x/2;
				count = 0;
				while(true)
				{
					count++;
					time2 = 0;
					for(k = 0 ; k < count ; k++)
					{
						time2 += c/(2 + f * k);
					}
					time2 += x/(2 + count * f);
					if(time2 > time1)
					{
						result[i] += time1;
						break;
					}
					time1 = time2;
				}
			}
			for(i = 1 ; i <= t ; i++)
			{
				System.out.println(result[i]);
			}
		}
		catch(Exception e)
		 {
			 System.out.println(e.getMessage());
		 }
	}

}
