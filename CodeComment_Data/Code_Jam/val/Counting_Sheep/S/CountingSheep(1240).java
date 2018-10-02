package methodEmbedding.Counting_Sheep.S.LYD1707;

import java.util.*;
import java.io.*;
public class CountingSheep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int len = input.nextInt();
		int [] number = new int [len];
		for (int i = 0; i<len; i++) {
			number[i] = input.nextInt();
		}
		int count = 0;
		int multiply = 2;
		int [] comparison = {0,1,2,3,4,5,6,7,8,9};
		boolean sleep = false;
		boolean loc = false;
		for (int i = 0; i<len; i++) {
			int [] done = {number[i],number[i],number[i],number[i],number[i],number[i],number[i],number[i],number[i],number[i]};
			int temp = number[i];
			while(!sleep) {
				if(number[i]==0) {
					String ret = "INSOMNIA";
					System.out.println("Case #" + (i+1) + ": " + ret);
					break;
				}
				String tem = String.valueOf(temp);
				for (int j = 0; j<tem.length();j++) {
					int t = Integer.parseInt(tem.substring(j, j + 1));
					done[t] = t; 
				}
				for (int j = 0; j<10;j++) {
					if (done[j] == comparison[j]) {
						count+=1;
					}
				}
				
				if(count==10) {
					sleep = true;
					int ret = temp;
					System.out.println("Case #" + (i+1) + ": " + ret);
					multiply = 2;
				}else {
					temp = number[i] * multiply;
					multiply +=1;
				}
				count = 0;
				
				
			}
			sleep = false;
		}

	}

}
