package methodEmbedding.Standing_Ovation.S.LYD457;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class A {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		for (int t = 1; t <= T; t++) {
			String[] input = bf.readLine().split(" ");
			int Smax = Integer.parseInt(input[0]);
			
			int[] A = new int[Smax+1];
			for(int i=0; i<=Smax; ++i){
				A[i] = Integer.parseInt(input[1].charAt(i)+"");
			}
			int standing = A[0], count=0;
			for(int i=1; i<=Smax; ++i){
				if(A[i]>0 && standing<i){
					count += i-standing;
					standing = i;
				}
				standing += A[i];
			}
			
			System.out.println("Case #"+t+": "+count);
		}
	}

}
