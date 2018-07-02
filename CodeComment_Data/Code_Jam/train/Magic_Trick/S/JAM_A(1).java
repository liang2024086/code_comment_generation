package methodEmbedding.Magic_Trick.S.LYD347;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JAM_A 
{
	public static int N =4;
	public static String bad = "Bad magician!";
	public static String cheater = "Volunteer cheated!";
	public static void main(String args[]) throws FileNotFoundException
	{
//		Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(new FileInputStream("D:/Users/????/workspace/JAM_A/src/A-small-attempt0.in"));
		int TEST_CASE_NUMBER = sc.nextInt();
//		System.out.println(TEST_CASE_NUMBER);
		
		for(int test_case = 0;test_case<TEST_CASE_NUMBER;test_case++)
		{
			int row_number_start = sc.nextInt();
//			System.out.println(row_number_start);
			int[][] matrix_start = new int[N][N];
			for(int i=0;i<N;i++)
			{
				for(int j=0;j<N;j++)
				{
					matrix_start[i][j] = sc.nextInt();
//					System.out.print(matrix_start[i][j]+" ");
				}
//				System.out.println();
			}
			
			int row_number_end = sc.nextInt();
//			System.out.println(row_number_end);
			int[][] matrix_end = new int[N][N];
			
			for(int i=0;i<N;i++)
			{
				for(int j=0;j<N;j++)
				{
					matrix_end[i][j] = sc.nextInt();
//					System.out.print(matrix_end[i][j]+" ");
				}
//				System.out.println();
			}
			
			int Number_Equals = 0;
			int Equal_Number = -1;
			Here:for(int i=0;i<N;i++)
			{
				for(int j=0;j<N;j++)
				{
					if(matrix_start[row_number_start-1][i] == matrix_end[row_number_end-1][j])
					{
						Number_Equals++;
						Equal_Number = matrix_start[row_number_start-1][i];
					}
					
					if(Number_Equals>=2) break Here;
				}
			}
			
			if(Number_Equals == 0)
			{
				System.out.println("Case #"+(int)(test_case+1)+": "+cheater);
			}
			
			if(Number_Equals > 1)
			{
				System.out.println("Case #"+(int)(test_case+1)+": "+bad);
//				System.out.println("Number Equals :" + Number_Equals);
			}
			
			if(Number_Equals == 1)
			{
				System.out.println("Case #"+(int)(test_case+1)+": "+Equal_Number);
			}

		}
	}

}
