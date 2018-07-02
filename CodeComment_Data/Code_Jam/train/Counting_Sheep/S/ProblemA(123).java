package methodEmbedding.Counting_Sheep.S.LYD1531;

import java.io.*;
import java.util.*;

public class ProblemA{
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int t = Integer.parseInt(s.nextLine());
		for(int i = 0; i < t; i++){
			int n = Integer.parseInt(s.nextLine());
			if(n == 0){
				System.out.println("Case #"+(i+1)+": INSOMNIA");
				continue;
			}
			boolean[] digits = new boolean[10];
			boolean sleep = false;
			for(int j = 1; j*n <= Integer.MAX_VALUE; j++){
				
				int number = n*j;
				if(number < 0)
					break;
				while(number > 0){
					digits[number%10] = true;
					number = number / 10;
				}
				
				sleep = true;
				for(boolean d:digits){
					sleep = sleep && d;
				}
				
				if(sleep){
					System.out.println("Case #"+(i+1)+": "+(n*j));
					break;
				}
				
				if(number == Integer.MAX_VALUE)
					break;
				
			}
			if(!sleep)
				System.out.println("Case #"+i+": INSOMNIA");
		}
	}
}
