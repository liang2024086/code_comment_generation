package methodEmbedding.Standing_Ovation.S.LYD1903;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Ovation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = null;
		BufferedWriter out = null;
		try {
			 sc = new Scanner(new File("C:\\Users\\GAURAVAGARWAL\\Desktop\\A-small-attempt0.in"));
			 out = new BufferedWriter(new FileWriter("C:\\Users\\GAURAVAGARWAL\\Desktop\\outputTest.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int test = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < test; i++)
		{
			String line = sc.nextLine();
			int sMax = Integer.parseInt(line.split(" ")[0]);
			String string = line.split(" ")[1];
			int numReq = 0;
			int[] sum = new int[sMax+1];
			for(int j = 1; j <= sMax; j++)
			{
				sum[j] = sum[j-1] + Character.getNumericValue(string.charAt(j-1));
				int n = Character.getNumericValue(string.charAt(j));
				if(n > 0 && sum[j] < j)
				{
					numReq += (j - sum[j]);
					sum[j] += (j-sum[j]);
				}
				//System.out.println("Current Char is : "+n+", previous sum is : "+sum[j]+", Req : "+numReq);
				
				
			}
			//System.out.println("----");
			out.write("Case #"+(i+1)+": "+numReq);
			if(i != test-1)
				out.write("\n");
		}
		out.close();
		sc.close();

	}

}
