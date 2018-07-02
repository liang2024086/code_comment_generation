package methodEmbedding.Standing_Ovation.S.LYD1982;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;

public class StandingOvation {
	public static void main(String args[]) throws Exception{
		//Scanner sc=new Scanner(System.in);
		//Enter the number of test cases
		Scanner sc = new Scanner(new FileReader("D:\\Prashant\\Android Project\\codejam\\src\\codejam\\A-small-attempt5.in"));
		 File outFile = new File("D:\\Prashant\\Android Project\\codejam\\src\\codejam\\Asmall.out");
		BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));
		int T=sc.nextInt();
		int smax;
		for(int i=0;i<T;i++)
		{
			//Enter smax
			smax=sc.nextInt();
			int total=0,count=0;
			//Enter the shy array
			String shy=sc.nextLine();
			shy=shy.substring(1);
			char shyness[]=shy.toCharArray();
			int shynes[]=new int[shyness.length];
			for(int j=0;j<shyness.length;j++)
			{
				shynes[j]=Character.getNumericValue(shyness[j]);
			}
			//Check number of friends to invite
			for(int k=1;k<shynes.length;k++)
			{	total=0;
				
				for(int l=0;l<k;l++)
				{
					total+=shynes[l];
					
				}total+=count;
				if(total<k&&shynes[k]!=0)
					count+=(k-total);
			}
			bw.write("Case #"+(i+1)+": "+count+"\n");
			System.out.println("Case #"+(i+1)+": "+count+"\n");
			
		}
		bw.flush();
		bw.close();
		sc.close();
}
}
