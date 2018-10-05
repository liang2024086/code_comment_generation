package methodEmbedding.Magic_Trick.S.LYD1105;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MagicTrick {

	public static void main(String[] args) throws IOException {

		Scanner scanner=new Scanner(new File("A-small-attempt0.in"));
		BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("op.out"));
		int testCase=scanner.nextInt();
		int ansOne=0,ansTwo=0,t=0,j=0;
		String res="";
		int [][]arrOne=new int[4][4];
		int [][]arrTwo=new int[4][4];

		for (int i = 0; i < testCase; i++) 
		{
			int cnt=0;
			ansOne=scanner.nextInt();
			
			for ( j = 0; j < 4; j++) 
				for (int k = 0; k < 4; k++) 
					arrOne[j][k]=scanner.nextInt();
			
			ansTwo=scanner.nextInt();
			
			for (j = 0; j < 4; j++) 
				for (int k = 0; k < 4; k++) 
					arrTwo[j][k]=scanner.nextInt();
			
			for (j = 0; j < 4; j++)
			{
					if(arrOne[ansOne-1][j]==arrTwo[ansTwo-1][0] || arrOne[ansOne-1][j]==arrTwo[ansTwo-1][1] || arrOne[ansOne-1][j]==arrTwo[ansTwo-1][2] || arrOne[ansOne-1][j]==arrTwo[ansTwo-1][3])
					{
						++cnt;
						res=Integer.toString(arrOne[ansOne-1][j]);
					}
			}

			if(cnt==0)
				res="Volunteer cheated!";
			else if(cnt>1)
			res="Bad magician!";
		t=i+1;
	bufferedWriter.write("Case #"+t+": "+res+"\n");
	System.out.println("Case #"+t+": "+res);
	}
		scanner.close();
		bufferedWriter.close();

}
}
