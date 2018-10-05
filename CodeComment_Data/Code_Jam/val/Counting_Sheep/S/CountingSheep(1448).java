package methodEmbedding.Counting_Sheep.S.LYD288;

import java.util.*;
import java.io.*;
public class CountingSheep {
  public static void main(String[] args) {
    Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	
    int t = s.nextInt();
    for (int i = 1; i <= t; ++i) {
		int n = s.nextInt();
		if(n == 0) {
			System.out.println("Case #" + i + ": " + "INSOMNIA");
			continue;
		}	
		int digits[] = new int[10]; 
		int l = 0, number = 0, last = 0;
		for(int j=1; l != 9 ;j++) {
			number = j * n;
			last = number;
			int count = 0, r = 0;
			while(number > 0) {
				count++;
				r = number%10;
				number = number/10;
				
				if((count == 1) & (j == 1))
					digits[l] = r;
				else {
					int flag = 0;
					for(int k=0;k<=l;k++)  {
						if(r == digits[k])
							flag = 1;
					}	
					if(flag == 0) {
						l++;
						digits[l] = r;
					}
				}
			}
		}
		System.out.println("Case #" + i + ": " + last);
    }
  }
}
