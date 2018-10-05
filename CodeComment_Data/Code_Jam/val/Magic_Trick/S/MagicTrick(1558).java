package methodEmbedding.Magic_Trick.S.LYD182;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class MagicTrick {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++)
		{
			int M = Integer.parseInt(br.readLine());
			int[][] arr = new int[4][4];
			for(int j=0; j<4; j++)
			{
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int k=0; k<4; k++)
				{
					arr[j][k] = Integer.parseInt(st.nextToken());
				}
			}

			int L = Integer.parseInt(br.readLine());
			int[][] arr1 = new int[4][4];
			for(int j=0; j<4; j++)
			{
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int k=0; k<4; k++)
				{
					arr1[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			ArrayList<Integer> sol = new ArrayList<Integer>();
			int[] nums = arr[M-1];
			for(int l=0; l<4; l++)
			{
				for(int m=0; m<4; m++)
				{
					if(arr1[L-1][m] == nums[l])
						sol.add(nums[l]);
				}
			}
			if(sol.size()==0)
				System.out.println("Case #"+(i+1)+": Volunteer cheated!");
			else if(sol.size()>1)
				System.out.println("Case #"+(i+1)+": Bad magician!");
			else
				System.out.println("Case #"+(i+1)+": "+sol.get(0));
		}
	}
}
