package methodEmbedding.Standing_Ovation.S.LYD114;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class CodeChallenge2015 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader=new BufferedReader(new FileReader("/Users/MathAndCheese/Downloads/A-small-attempt1.in"));
		int numCases=Integer.parseInt(reader.readLine());
		for (int i=0; i<numCases; i++){
			String s=reader.readLine();
			int a=s.indexOf(" ");
			String x=s.substring(0,a);
			String y=s.substring(a+1);
			int b=y.length();
			int sum=0;
			int finalCount=0;
			for (int j=0; j<b; j++){
				int k=Integer.parseInt(y.substring(j, j+1));
				if (sum==0 && k==0){
					finalCount++;
				}
				else{
					sum+=k-1;
				}
			}
			System.out.println("Case #"+(i+1)+": "+finalCount);
		}
	}

}
