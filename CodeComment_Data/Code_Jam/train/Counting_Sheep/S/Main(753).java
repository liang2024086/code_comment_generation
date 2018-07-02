package methodEmbedding.Counting_Sheep.S.LYD275;

import java.util.*;
import java.io.*;
public class Main {
public static void main(String[] args) {
	Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
	for (int i = 1; i <= t; ++i) {
		int n = in.nextInt();
		boolean nums[] = new boolean[10];
		boolean isSleep = false;
		int times = 0;
		
		// Code to calculate
		while(!isSleep){
			times++;
			isSleep = true;
			boolean isInf = false;
			
			
			// Without check about more infinite cases
			if(n == 0){
				isInf = true;
			}
			else{
				// start to count
				int temp_n = times * n;
			
				while((temp_n/10)!=0){
					nums[temp_n%10] = true;
					temp_n = temp_n/10;
				}
				if(temp_n<10){
					nums[temp_n%10] = true;
				}
				for(int j=0; j<10; j++){
					if(!nums[j]){
						isSleep = false;
						break;
					}
				}
			}
			
			// print output
			if(isInf&&isSleep)
				System.out.println("Case #" + i + ": "  + "INSOMNIA");
			else if(isSleep)
				System.out.println("Case #" + i + ": "  + times*n);
			else
			;
 		}

	}
}
}
