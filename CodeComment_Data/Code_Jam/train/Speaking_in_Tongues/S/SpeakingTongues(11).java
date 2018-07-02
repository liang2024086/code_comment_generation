package methodEmbedding.Speaking_in_Tongues.S.LYD1133;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class SpeakingTongues {

	public static void main(String[] args) throws FileNotFoundException {
		
		String s1 = "ejpmysljylckdkxveddknmcrejsicpdrysirbcpcypcrtcsradkhwyfrepkymveddknkmkrkcddekrkdeoyakwaejtysrreujdrlkgcjvyqee";
		String s2 = "ourlanguageisimpossibletounderstandtherearetwentysixfactorialpossibilitiessoitisokayifyouwanttojustgiveupazoo";
		char[] c = new char [26];
		for(int i = 0 ;i < s1.length() ; i++)
		{
		
			c[s1.charAt(i)-97] = s2.charAt(i);
		}
		c[25] = 'q';
		
		
		Scanner s = new Scanner(new File("A-small-attempt0.in"));
		
		int n = Integer.parseInt(s.nextLine());
		for(int i =0 ; i < n ; i ++)
		{
			String in = s.nextLine();
			System.out.print("Case #"+(i+1)+": ");
			int v = 0;
			for(int j  = 0 ; j < in.length() ; j++)
			{
				v = in.charAt(j)-97;
				if(v>-1&&v<26)
				{
					System.out.print(c[v]);
					
				}
				else
				{
					System.out.print(in.charAt(j));
				}
			}
			System.out.print("\n");
		}
		
		
	}

}
