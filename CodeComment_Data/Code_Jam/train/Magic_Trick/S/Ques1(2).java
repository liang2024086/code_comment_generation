package methodEmbedding.Magic_Trick.S.LYD423;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Ques1 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
		int no_of_testcases= Integer.parseInt(br.readLine());
		int ans1,ans2,no_of_matches;
		int [][] cards1 = new int[4][4];
		int [][] cards2 = new int[4][4];
		
		for(int i=1;i<=no_of_testcases;i++)
		{
			no_of_matches=0;
			ans1 = Integer.parseInt(br.readLine());
			for(int j=0;j<4;j++)
			{
				int k=0;
				String line = br.readLine();
				StringTokenizer tk = new StringTokenizer(line);
				
				while(tk.hasMoreTokens())
				{
					cards1[j][k++]= Integer.parseInt(tk.nextToken());
				}
			}
			
			ans2 = Integer.parseInt(br.readLine());
			for(int j=0;j<4;j++)
			{
				int k=0;
				String line = br.readLine();
				StringTokenizer tk = new StringTokenizer(line);
				
				while(tk.hasMoreTokens())
				{
					cards2[j][k++]= Integer.parseInt(tk.nextToken());
				}
			}
			
			ans1--;
			ans2--;
			Arrays.sort(cards1[ans1]);
			Arrays.sort(cards2[ans2]);
			
			int j=0,k=0;
			int match=0;
			while((j<4)&&(k<4))
			{
				if(cards1[ans1][j] == cards2[ans2][k])
				{
					j++;
					k++;
					no_of_matches++;
					match=cards1[ans1][j-1];
				}
				
				else if(cards1[ans1][j]< cards2[ans2][k])
					j++;
				
				else
					k++;
			}
			
			if(no_of_matches==1)
			{
				bw.write("Case #"+i+": "+match);
				bw.newLine();
				//System.out.println("Case #"+i+": "+match);
			}
			else if(no_of_matches==0)
			{
				bw.write("Case #"+i+": Volunteer cheated!");
				bw.newLine();
				//System.out.println("Case #"+i+": Volunteer cheated!");
			}
			
			else
			{
				bw.write("Case #"+i+": Bad magician!");
				bw.newLine();
				//System.out.println("Case #"+i+": Bad magician!");
			}
		}
		bw.close();
	}

}
