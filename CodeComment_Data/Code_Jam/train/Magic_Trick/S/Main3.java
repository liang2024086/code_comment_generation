package methodEmbedding.Magic_Trick.S.LYD1828;


import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Scanner;

public class Main3 {


	 
	
	public static void main (String[] args)  throws Exception
	{
	 
		FileWriter writer=new FileWriter("d:/MagicTOutput1.txt");
		Scanner scanner=new Scanner(new FileInputStream("d:/A-small-attempt0.in"));
	    
		int count_case = scanner.nextInt();
		
		 
		//System.out.println("case count "+count_case);
		 
		int a[];
		int b[];
		a = new int[4];
		b = new int[4];
		int a1;
		for (long i =0;i<count_case;i++)
		{
			
			int res =  scanner.nextInt();
			int result_same = 0;
			int result_value = 0;
			for (int j = 0; j < (res-1)*4 ;j++)
			{
				a1 =  scanner.nextInt();
			}
			
			for (int j = 0; j < 4;j++ )
			{
				a[j] = scanner.nextInt();
			}
			for (int j = (res)*4;j<16;j++)
			{
				a1 =  scanner.nextInt();
			}
			
			res =  scanner.nextInt();
			
			for (int j = 0; j < (res-1)*4 ;j++)
			{
				a1 =  scanner.nextInt();
			}
			
			for (int j = 0; j < 4;j++ )
			{
				b[j] = scanner.nextInt();
			}
			for (int j = (res)*4;j<16;j++)
			{
				a1 =  scanner.nextInt();
			}


			for (int m = 0;m<4;m++)
			{
				for (int n = 0;n<4;n++)
				{
					if (a[m] == b[n])
					{
						result_value = a[m];
						result_same += 1;
					}
					
				}
			}
			if (result_same > 1)
			{
				writer.write("Case #"+(i+1)+": "+"Bad magician!"+"\n");
			}
			else if (result_same == 1)
			{
				writer.write("Case #"+(i+1)+": "+result_value+"\n");
			}
			else if (result_same == 0)
			{
				writer.write("Case #"+(i+1)+": "+"Volunteer cheated!"+"\n");
			} 
			
		}
		
		writer.close();
	}
	
	
	
}
