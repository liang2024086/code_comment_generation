package methodEmbedding.Standing_Ovation.S.LYD1659;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StandUpOvation {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0;i<T;i++)
		{
			int[] shyness= new int[10];
			int count=0;
				StringTokenizer st = new StringTokenizer(br.readLine()," ");
				int SMaxLevel=Integer.parseInt(st.nextToken());
				String audienceShyness =st.nextToken();
				for(int j=0;j<audienceShyness.length();j++)
				{
					shyness[j]=audienceShyness.charAt(j)-48;
				}
				int invitefriend=0;
				count=shyness[0];
				for(int k=1;k<SMaxLevel+1;k++)
				{
					if(count<k)
					{
						invitefriend+=k-count;
						count+=k-count+shyness[k];
					}
					else
					{
						count+=shyness[k];
					}
				}
				System.out.println(invitefriend);
				invitefriend=0;
				count=0;
				shyness=null;
		}
	}

}
