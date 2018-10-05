package methodEmbedding.Standing_Ovation.S.LYD895;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StandingOvation {
	public static void main(String ...args) throws IOException
	{
		Scanner sc = null;
		BufferedWriter bw=null;
		try {
			sc = new Scanner(new File("C:\\Users\\Dell\\Downloads\\A-small-practice.in"));
			bw = new BufferedWriter(new FileWriter(new File("C:\\Users\\Dell\\Desktop\\output2.out")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		int t=sc.nextInt();
		for(int tst=0;tst<t;tst++)
		{
			int sh_max=sc.nextInt();
			String seq=sc.next();
			
			int standing_men = 0;
			int my_men=0;
			
			for(int i=0;i<seq.length();i++)
			{
				if(standing_men >= i)
				standing_men+=Integer.parseInt(String.valueOf(seq.charAt(i)));
				else
				{
					my_men+=i-standing_men;
					standing_men+=i-standing_men;
					standing_men+=Integer.parseInt(String.valueOf(seq.charAt(i)));
				}
			}
				
			bw.write("Case #"+(tst+1)+": "+my_men);
			if(tst<t-1)
				bw.write("\n");
		}
		bw.close();
	}
}
