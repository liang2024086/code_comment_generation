package methodEmbedding.Revenge_of_the_Pancakes.S.LYD458;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class CodeJamQualification2 {
	public static void main(String[] args) throws IOException{
		InputStreamReader is = new InputStreamReader(new FileInputStream("input.txt"));
		PrintWriter file = new PrintWriter(new File("output.txt"));
		int nul = (int)'0', plus = (int)'+', minus = (int)'-';
		int c = is.read();
		int count = 0, con;
		int[] B = new int[1000];
		boolean bist;
		int  previous;
		int result;
		while(c != -1 && c != 13){
			count = (c-nul)+(count*10);
			c = is.read();
		}
		if(c == 13)
			c = is.read();
		for(int t = 0 ; t < count; ++t){
			System.out.print("Case #" + (t+1) + ": ");
			file.print("Case #" + (t+1) + ": ");
			c = is.read();
			int i=-1;
			
			while(c != -1 && c != 13){
				++i;
				if(c == plus)
					B[i] = 1;
				else
					B[i] = 0;
				c = is.read();
			}
			con = i;
			if(c == 13)
				c = is.read();
			
			result = 0;
			
			previous = B[0];
			if(B[0] == 0)
				result = 1;
			i = 1;
			for(; i <=con; ++i){
				if(B[i] == previous){
					continue;
				}
				else if(B[i] == 1){
					previous = 1;
					continue;
				}
				else{
					previous = 0;
					result += 2;
				}
				
			}
			System.out.print(result);
			System.out.println();
			file.print(result);
			file.println();
			for(int k = 0 ; k<1000; ++k)
				B[k] = 0;
			
		}
		file.close();
	}
}
