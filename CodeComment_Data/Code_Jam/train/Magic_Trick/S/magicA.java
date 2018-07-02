package methodEmbedding.Magic_Trick.S.LYD774;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class magicA {
	
	public static void main(String[] str) throws IOException
	{
		
		File file=new File("/java/caseAtest.txt");
		FileReader reader=new FileReader(file);
		FileWriter writer=new FileWriter("/java/out5.txt");
		
		Scanner in=new Scanner(file);
		
		int[][] table1=new int[4][4];
		int[][] table2=new int[4][4];
		
		int rownum1=0;
		int rownum2=0;
		int found=0;
		int numfound=0;
		int casenum=Integer.valueOf(in.nextLine());
		
		for ( int cases=1;cases<casenum+1;cases++)
		{
			found=0;
			rownum1=in.nextInt();
			
			for (int x1=0;x1<4;x1++)
				for (int y1=0;y1<4;y1++)
				table1[x1][y1]=in.nextInt();
			
			rownum2=in.nextInt();
			//System.out.println(rownum1+" "+rownum2);
			for (int x2=0;x2<4;x2++)
				for (int y2=0;y2<4;y2++)
				table2[x2][y2]=in.nextInt();
			
			for (int y=0;y<4;y++)
				for (int f=0;f<4;f++)
				if (table1[rownum1-1][y]==table2[rownum2-1][f]){
					found++;
					
					numfound=table1[rownum1-1][y];
					System.out.println(numfound);
				}
			System.out.println(found);
			if (found==1)
				//System.out.println("Case #"+cases+": "+numfound);
				writer.append("Case #"+cases+": "+numfound+"\n");
			if (found>1)
				//System.out.println("Case #"+cases+": "+"Bad magician!");
				writer.append("Case #"+cases+": "+"Bad magician!"+"\n");
			if (found==0)
				//System.out.println("Case #"+cases+": "+"Volunteer cheated!");
				writer.append("Case #"+cases+": "+"Volunteer cheated!"+"\n");
			
					
			
		
		
		}
		writer.close();
	}

}
