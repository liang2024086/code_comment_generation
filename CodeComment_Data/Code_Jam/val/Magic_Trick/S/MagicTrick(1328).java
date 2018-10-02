package methodEmbedding.Magic_Trick.S.LYD1553;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class MagicTrick {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("magic_trick.in"));
		FileWriter fw = new FileWriter(new File("magic_trick.out"));
		
		int t =sc.nextInt();
		for(int i=0; i<t; i++)
		{
			int p1=sc.nextInt();
			sc.nextLine();
			int j;
			for(j=0; j<p1-1; j++)
				sc.nextLine();
			int[] num1 = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
			sc.nextLine();
			j++;
			for(; j<4; j++)
				sc.nextLine();
			int p2=sc.nextInt();
			sc.nextLine();
			for(j=0; j<p2-1; j++)
				sc.nextLine();
			int[] num2 = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
			sc.nextLine();
			j++;
			for(; j<4; j++)
				sc.nextLine();
			int[] nums = new int[8];
			for(j=0; j<4; j++)
			{
				nums[j]=num1[j];
				nums[4+j]=num2[j];
			}
			Arrays.sort(nums);
			System.out.println(Arrays.toString(nums));
			int sol=-1;
			boolean many=false;
			for(j=0; j<7; j++)
			{
				if(nums[j]==nums[j+1])//sol found
				{
					if(sol!=-1)
						many=true;
					sol=j;
				}
			}
			String ret = (many)?"Bad magician!":((sol==-1)?"Volunteer cheated!":(""+nums[sol]));
			fw.write("Case #"+(i+1)+": "+ret+"\n");
		}
		fw.flush();
		fw.close();
	}
}
