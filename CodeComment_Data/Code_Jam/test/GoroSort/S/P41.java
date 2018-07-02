package method_all.GoroSort.S.LYD44;

import java.io.*;
import java.util.Arrays;
public class P41 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("D-small-attempt0.in"));
		PrintWriter pr = new PrintWriter(new FileWriter("OUT.txt"));
		
		int t = Integer.parseInt(br.readLine());
		for(int count = 1; count <= t; count++)
		{
			br.readLine();
			String[] input = br.readLine().split(" ");
			int[] nums = new int[input.length];
			for(int j = 0; j<nums.length;j++)
			{
				nums[j] = Integer.parseInt(input[j]);
			}
			int[] numsSorted = nums.clone();
			Arrays.sort(numsSorted);
			
			int answer = nums.length;
			for(int i = 0; i<nums.length;i++)
			{
				if(nums[i] == numsSorted[i])
				{
					answer--;
				}
			}
			
			pr.println("Case #" + count + ": " + answer);
			pr.flush();
		}
	}

}
