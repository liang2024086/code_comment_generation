package methodEmbedding.Magic_Trick.S.LYD330;

import java.io.*;
import java.util.*;
public class a {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new FileReader("a-in.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("a-out.txt"));
		
		int testcases = sc.nextInt();
		int f1=0,f2=0,r;
		int[][] arr ;
		
		for (int i = 0; i < testcases ; i++) {
			arr = new int[16][2];
			f1 = sc.nextInt() -1;
			for(int j=0;j<4;j++)
			{
				for(int k=0;k<4;k++)
				{
					r = sc.nextInt();
					arr[r-1][0] = j;
				}
			}
			
			f2 = sc.nextInt()-1;
			for (int j = 0; j < 4; j++) {
				for (int j2 = 0; j2 < 4; j2++) {
					r = sc.nextInt();
					arr[r-1][1] = j;
				}
			}
			
			
			int[] ocaurence = new int[16];
			
			
			for(int ii=0;ii<16;ii++)
			{
				if(arr[ii][0]==f1)
				{
					ocaurence[ii]++;
				}
				if(arr[ii][1]==f2)
				{
					ocaurence[ii]++;
				}
			}
			
			
			int counter = 0, index = 0;
			
			
			for (int ii = 0; ii < ocaurence.length; ii++) {
				if(ocaurence[ii]==2)
				{
					counter++;
					index = ii;
				}
			}
			
			
			pw.printf("Case #%d: ",i+1);
			if(counter==0)
			{
				pw.println("Volunteer cheated!");
			} else if(counter==1)
			{
				pw.println(index+1);
			} else {
				pw.println("Bad magician!");
			}
			
			
			
		}
		
		
		
		
		
		pw.close();
		sc.close();
	}

}
