package methodEmbedding.Standing_Ovation.S.LYD1985;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class A {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(sc.readLine());
		for(int i=1; i<=t; i++) {
			String[] s = sc.readLine().split(" ");
			int n = Integer.parseInt(s[0]);
			int[] arr = new int[n + 1];
			for(int j=0; j<=n; j++){
				arr[j] = s[1].charAt(j) - '0';
			}
			int ans = 0;
			int sum = arr[0];
			for(int l=1; l<=n; l++) {
				if(sum < l) {
					ans += l-sum;
					sum = l;
				}
				sum += arr[l];
			}
			
			System.out.println("Case #"+i+": "+ans);
		}
		sc.close();
	}

}
