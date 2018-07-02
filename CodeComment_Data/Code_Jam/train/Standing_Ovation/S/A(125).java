package methodEmbedding.Standing_Ovation.S.LYD204;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		for(int i=0; i<a; i++) {
			int friends = 0;
			int standing = 0;
			String[] arr = br.readLine().split(" ");
			for(int j=0; j<=Integer.parseInt(arr[0]); j++) {
				int n = Integer.parseInt(arr[1].substring(j,j+1));
				if(n > 0 && standing < j) {
					friends += j - standing;
					standing += friends;
				}
				standing += n;
			}
			System.out.println("Case #"+(i+1)+": "+friends);
		}
	}
}
