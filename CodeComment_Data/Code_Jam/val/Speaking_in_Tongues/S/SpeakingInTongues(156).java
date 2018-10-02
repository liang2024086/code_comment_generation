package methodEmbedding.Speaking_in_Tongues.S.LYD511;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.*;
import java.util.Scanner;
public class SpeakingInTongues
{
	public static void main(String[] args)throws Exception
	{
		File f = new File("speakingintongues.txt");
		File outp = new File("speakingintongues.out");
		if(!f.exists())
			return;
		String translate = new String("yhesocvxduiglbkrztnwjpfmaq");
		Scanner sc = new Scanner(new FileReader(f));
		Writer wr = new BufferedWriter(new FileWriter(outp));
		int t = sc.nextInt();
		sc.nextLine();
		for(int i=1; i<=t; i++)
		{
			char[] g = sc.nextLine().toCharArray();
			char[] e = new char[g.length];
			for(int j=0; j<g.length; j++)
			{
				int index =  g[j] - 'a';
				e[j] = (g[j]==32)? ' ' : translate.charAt(index);
				System.out.print(e[j]);
			}
			System.out.println();
			wr.write("Case #"+i+": "+new String(e)+"\n"); //\r\n for windows
		}
		sc.close();
		wr.close();
		return;
	}
}
