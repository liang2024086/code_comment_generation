package methodEmbedding.Counting_Sheep.S.LYD1387;

import java.io.*;
import java.util.*;
public class Counting {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		//BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		//PrintWriter outp = new PrintWriter(System.out);
		BufferedReader read = new BufferedReader(new FileReader("/Users/vedant12/Documents/workspace2/Coding/src/A-small-attempt0.in"));
        PrintWriter outp = new PrintWriter(new FileWriter("/Users/vedant12/Documents/workspace2/Coding/src/Output"));		
		int T = Integer.parseInt(read.readLine().trim());
		
		for(int i=0;i<T;i++){
			long n = Long.parseLong(read.readLine().trim());
			outp.print("Case #"+(i+1)+": ");
			if(n==0){
				outp.print("INSOMNIA");
			}
			else{
			int ar[] = new int[10];
			int count = 0;
			int num = 1;
			long answer = n;
			while(count<10){
				
				long temp = n*num;
				answer = temp;
				while(temp>0){
					int remainder = (int)temp%10;
					//System.out.println(remainder);
					temp = temp/10;
					if(ar[remainder]==0){
						ar[remainder]=1;
						count++;
					}
					
					
				}
				num++;
			}
			outp.print(answer);
			}
			outp.println();
		}
		
		//outp.flush();
		outp.close();

	}

}
