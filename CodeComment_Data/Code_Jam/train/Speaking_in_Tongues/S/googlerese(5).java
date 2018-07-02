package methodEmbedding.Speaking_in_Tongues.S.LYD1353;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;


public class googlerese {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
//		String input="ejpmysljylckdkxveddknmcrejsicpdrysirbcpcypcrtcsradkhwyfrepkymveddknkmkrkcddekrkdeoyakwaejtysrreujdrlkgcjv";
//		String output="ourlanguageisimpossibletounderstandtherearetwentysixfactorialpossibilitiessoitisokayifyouwanttojustgiveup";
//		char[] original=new char[26];
//		System.out.println(input.length());
//		System.out.println(output.length());
//		for(int i=0; i<input.length();i++)
//		{
//			char c=input.charAt(i);
//			char o=output.charAt(i);
//			if(c!=' ')
//				original[c-'a']=o;
//		}
//		char[] alpha= new char[26];
//		for(char i=0;i<26;i++)
//		{
//			alpha[i]=(char) ('a'+i);			
//		}
//		System.out.println(new String(alpha));
//		System.out.println(new String(original));
		
//		String alpha="abcdefghijklmnopqrstuvwxyz";
		String trans="yhesocvxduiglbkrztnwjpfmaq";
		char[] t=trans.toCharArray();
	
		BufferedReader br= new BufferedReader(new FileReader("C:\\codejam\\A-small-attempt0.in"));
		int cases=Integer.parseInt(br.readLine());
		FileWriter wr=new FileWriter("c:\\codejam\\output.txt");
		for(int j=1;j<=cases;j++)
		{
			String input=br.readLine();
			char[] o=new char[input.length()];
			for(int i=0;i<o.length;i++)
			{
				if(input.charAt(i)==' ')
					o[i]=' ';
				else
					o[i]=t[input.charAt(i)-'a'];
			}
			wr.write("Case #"+j+": "+new String(o)+"\n");
		}
		wr.close();
	}
	

}
