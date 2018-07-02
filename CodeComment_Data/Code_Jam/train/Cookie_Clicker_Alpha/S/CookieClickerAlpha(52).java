package methodEmbedding.Cookie_Clicker_Alpha.S.LYD69;

import java.util.Scanner;
import java.io.*;
public class CookieClickerAlpha {
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(new FileReader("B-small-attempt0.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("respuesta.txt"));
		
		int t = sc.nextInt();
			for(int i = 1; i <=t; i++)
			{
				double costo = sc.nextDouble();
				double mejora = sc.nextDouble();
				double meta = sc.nextDouble();
				double seconds=0f;
				double cookieSpeed = 2f;
				
				while(seconds+ (costo/cookieSpeed)+(meta/(cookieSpeed+mejora))  <seconds+(meta/cookieSpeed))
				{
					seconds+=costo/cookieSpeed;
					cookieSpeed+=mejora;
				}
				seconds+=meta/cookieSpeed;
				pw.println("Case #"+i+": "+String.format("%.7f",seconds ));				
				
			}
			sc.close();
			pw.flush();
			pw.close();
	}
}
