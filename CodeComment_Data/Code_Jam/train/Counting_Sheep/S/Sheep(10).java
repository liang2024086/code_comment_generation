package methodEmbedding.Counting_Sheep.S.LYD940;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Sheep {
	public static void main(String[] args) {
		int n;
		int ans = 0;
		int count = 0;
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));		
		int len = sc.nextInt();
		for(int i = 1; i<=len; i++) {
			int[] arr = new int[10];
			n = sc.nextInt();
			if(n != 0) {
				for(int j = n; count < 10; j= j + n) {
					for(int k = j; k > 0; k = k/10) {
						int d = k%10;
						if(arr[d] == 0) {
							arr[d] = 1;
							count++;
							ans = j;
						}
					}
				}
			}
			if(ans != 0) {
				System.out.println("Case #"+i+": "+ans);
			} else {
				System.out.println("Case #"+i+": INSOMNIA");
			}
			count = 0;
			ans = 0;
		}
	}

}
