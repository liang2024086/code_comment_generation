package methodEmbedding.Cookie_Clicker_Alpha.S.LYD53;


import java.io.BufferedReader;
import java.io.FileReader;

public class Cookie
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new FileReader("/Users/anderson/Downloads/B-small-attempt0.in"));
		int numCases = Integer.parseInt(br.readLine());
		String answer = "";
		for (int i=1; i<=numCases; i++)
		{
			int numFarms;
			String blah = br.readLine();
			String[] blah2 = blah.split(" ");
			double c = Double.parseDouble(blah2[0]);
			double f = Double.parseDouble(blah2[1]);
			double x = Double.parseDouble(blah2[2]);
			double k = (x*f-2*c)/(c*f);
			if (k<=0)
				numFarms=0;
			else
				numFarms=(int) Math.floor(k);
			double time = 0;
			for (int j=0; j<numFarms; j++)
			{
				time += c/(2+j*f);
			}
			time += x/(2+numFarms*f);
			answer += "Case #"+i+": "+time+"\n";
		}
		System.out.println(answer);
	}
}
