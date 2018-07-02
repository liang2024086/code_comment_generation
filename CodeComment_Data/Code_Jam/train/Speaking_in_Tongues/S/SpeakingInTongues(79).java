package methodEmbedding.Speaking_in_Tongues.S.LYD1399;

import java.io.*;
public class SpeakingInTongues
{
	public static void main(String [] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new FileReader("iippuuttnn.txt"));

		String match = "abcdefghijklmnopqrstuvwxyz ";
		String pair =  "yhesocvxduiglbkrztnwjpfmaq ";
		String write = "";
		int i = Integer.parseInt(br.readLine());

		for(int j = 1; j <= i; j++)
		{
			String ra = br.readLine();
			String c = "";

			for(int k = 0; k < ra.length(); k++)
			{
				char b = '0';
				b = ra.charAt(k);

				c = c + pair.charAt(match.indexOf(b));
			}
			String newLine = "\n";
			if(j == i)
				newLine = "";
			write = write + "Case #" + j + ": " + c + newLine;
			System.out.println("Case #" + j + ": " + c);
		}

		BufferedWriter bw = new BufferedWriter(new FileWriter("ooppuuttuu.txt"));
		bw.write(write);
		bw.flush();
		bw.close();
		System.out.println(write);
	}

}
