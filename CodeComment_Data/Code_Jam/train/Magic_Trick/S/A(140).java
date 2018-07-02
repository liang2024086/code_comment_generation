package methodEmbedding.Magic_Trick.S.LYD760;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in;
		try {
			in = new Scanner(new File("C:\\temp\\google\\A-small-attempt0.in"));
			int T = in.nextInt();
			for(int cas=1; cas<=T; cas++) {
				int Pos1 = in.nextInt();
				int[][] Arr1 = new int[4][];
				for(int i=0; i<4; i++)
				{
					Arr1[i]=new int[4];
					for(int j=0; j<4; j++)
					{
						Arr1[i][j] = in.nextInt();
					}
					Arrays.sort(Arr1[i]);
				}
				
				int Pos2 = in.nextInt();
				int[][] Arr2 = new int[4][];
				for(int i=0; i<4; i++)
				{
					Arr2[i]=new int[4];
					for(int j=0; j<4; j++)
					{
						Arr2[i][j] = in.nextInt();
					}
					Arrays.sort(Arr2[i]);
				}
				
				int count=0;
				int lastResult=0;
				for(int i=0; i<4; i++){
					if (Arrays.binarySearch(Arr2[Pos2-1],Arr1[Pos1-1][i])>=0)
					{
						lastResult=Arr1[Pos1-1][i];
						count++;
					}
				}
				
				double ans = 0;
				
				if (count==1)
					System.out.printf("Case #%d: %d\n", cas, lastResult);
				else if (count==0) 
					System.out.printf("Case #%d: Volunteer cheated!\n", cas);
				else 
					System.out.printf("Case #%d: Bad magician!\n", cas);
				
					
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
