package methodEmbedding.Magic_Trick.S.LYD820;

import java.util.*;
import java.io.*;
public class Main {

	static int [] num = new int[17];
	public static void main(String[] args) throws IOException {
		File input = new File("A-small-attempt3.in");
		File output =new File("out");
		Scanner in = null;
		FileWriter out = null;
		in = new Scanner(new FileInputStream(input));
		out = new FileWriter(output);
		int n = in.nextInt();
		for(int k=1;k<=n;k++)
		{
			Arrays.fill(num, 0);
			int M_num=0,ans=0;
			int line1 = in.nextInt();
			for(int i=1;i<=4;i++)
				for(int j=1;j<=4;j++)
				{	
					int temp = in.nextInt();
					if(i==line1)
						num[temp]=1;
				}
			int line2 = in.nextInt();
			for(int i=1;i<=4;i++)
				for(int j=1;j<=4;j++)
				{
					int temp = in.nextInt();
					if(i==line2){
						if(num[temp]==1)
						{
							M_num++;
							ans=temp;
						}
					}
				}
			out.write("Case #"+k+": ");
			if(M_num==0) 
				out.write("Volunteer cheated!\n");
			else if(M_num==1)
				out.write(ans+"\n");
			else if(M_num>1)
				out.write("Bad magician!\n");

		}
		in.close();
		out.close();
	}

}
