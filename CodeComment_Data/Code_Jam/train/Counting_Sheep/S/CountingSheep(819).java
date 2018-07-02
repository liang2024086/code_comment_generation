package methodEmbedding.Counting_Sheep.S.LYD427;

import java.util.*;
import java.io.*;
public class CountingSheep {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	
    int t = in.nextInt();
    for (int i = 1; i <= t; ++i) {
		int n = in.nextInt();
		if(n == 0) {
			System.out.println("Case #" + i + ": " + "INSOMNIA");
			continue;
		}	
		int digits[] = new int[10]; // Array to check digits from 0-9
		int l = 0, num = 0, last = 0;
		for(int j=1; l != 9 ;j++) {
			num = j * n;
			last = num;
			int count = 0, rem = 0;
			while(num > 0) {
				count++;
				rem = num%10;
				num = num/10;
				
				if((count == 1) & (j == 1))
					digits[l] = rem;
				else {
					int flag = 0;
					for(int k=0;k<=l;k++)  {
						if(rem == digits[k])
							flag = 1;
					}	
					if(flag == 0) {
						l++;
						digits[l] = rem;
					}
				}
			}
		}
		System.out.println("Case #" + i + ": " + last);
    }
  }
}
