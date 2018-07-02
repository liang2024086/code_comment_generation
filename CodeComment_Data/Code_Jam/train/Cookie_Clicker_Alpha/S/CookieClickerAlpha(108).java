package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1127;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class CookieClickerAlpha
{
	public static void main(String[] args)
	{
		InputStream fileStream;
		BufferedReader fileReader;
		String[] lineParts;
		int numEntries;
		double cookiesPerSec;
		double costPerFarm;
		double cookieFarmPerSec;
		double cookiesToWin;
		double currentTime;
		
		try
		{
			fileStream = new FileInputStream("input.in");
			fileReader = new BufferedReader(new InputStreamReader(fileStream, Charset.forName("UTF-8")));
			numEntries = Byte.parseByte(fileReader.readLine());
			
			for (byte b = 1; b <= numEntries; b++)
			{
				lineParts = fileReader.readLine().split(" ");
				costPerFarm = Double.parseDouble(lineParts[0]);
				cookieFarmPerSec = Double.parseDouble(lineParts[1]);
				cookiesToWin = Double.parseDouble(lineParts[2]);
				currentTime = 0d;
				cookiesPerSec = 2d;
				
				while (!(cookiesToWin / cookiesPerSec < (costPerFarm / cookiesPerSec)
						+ (cookiesToWin / (cookiesPerSec + cookieFarmPerSec))))
				{
					currentTime += costPerFarm / cookiesPerSec;
					cookiesPerSec += cookieFarmPerSec;
				}
				
				currentTime += cookiesToWin / cookiesPerSec;
				System.out.println(String.format("Case #%d: %.7f", b, currentTime));
			}
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
