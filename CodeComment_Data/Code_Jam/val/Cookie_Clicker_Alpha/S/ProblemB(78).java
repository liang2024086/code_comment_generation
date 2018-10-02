package methodEmbedding.Cookie_Clicker_Alpha.S.LYD423;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ProblemB
{
	public static void main(String args[]) throws IOException
	{
		Scanner sc;
		String fileInput = "/home/ola/workspace_java/CodeJam2014/ProblemB2Input";
		FileOutputStream fos = new FileOutputStream(fileInput.replace("Input",
				"OutputGen"));
		sc = new Scanner(new FileInputStream(fileInput));

		int N = sc.nextInt();

		for (int i = 1; i <= N; ++i)
		{
			final double C = sc.nextDouble();
			final double F = sc.nextDouble();
			final double X = sc.nextDouble();
			
			double current = 2.0;
			double ellapsedTime = 0;
			
			while (true)
			{
				double tX = X / current;
				double tToF = C / current;
				double tToFX = tToF + (X / (current +F));
				if (tToFX <= tX)
				{
					ellapsedTime += tToF;
					current += F;
				}
				else
				{
					ellapsedTime += tX;
					break;
				}
			}
			
			StringBuilder sb = new StringBuilder();
			sb.append(String.format("Case #%d: %.7f\n", i, ellapsedTime));
			String output = sb.toString();
			System.out.print(output);
			fos.write(output.getBytes());
		}
		fos.close();
		sc.close();
	}
}
