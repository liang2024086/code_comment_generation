package methodEmbedding.Magic_Trick.S.LYD1013;

import java.util.Scanner;
import java.io.*;

public class magic{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int c = 1;
		int n = sc.nextInt();
		
		while(c<=n){
			int s = -1;
			String result = "Volunteer cheated!";

			int a = sc.nextInt()-1;
			int[] m = new int[16];
			for(int i=0; i<16; i++){
				int d = sc.nextInt();
				if(i/4 == a){
					m[d-1] = 1;
				}
			}
			int b = sc.nextInt()-1;
			for(int i=0; i<16; i++){
				int d = sc.nextInt();
				if(b == i/4 && m[d-1] == 1){
					if(s == -1){
						result = Integer.toString(d);
						s = d;
					}else{
						result = "Bad magician!";
					}
				}
			}
			
			System.out.println("Case #" + c + ": " + result);

			c++;
		}
		
		sc.close();

	}

}
