package methodEmbedding.Magic_Trick.S.LYD86;

import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int num = 1, n = 4;
		while(T-->0){
			String ans = "";
			int rowq = Integer.parseInt(br.readLine());
			int mapq[][] = new int[n][n];
			HashSet<Integer> set = new HashSet<Integer>();
			for(int i = 0 ; i < n ; i++){
				String s[] = br.readLine().split(" ");
				for(int j = 0 ; j < n ; j++){
					mapq[i][j] = Integer.parseInt(s[j]);
					if(rowq == i+1) set.add(mapq[i][j]);
				}
			}
			
			int rowa = Integer.parseInt(br.readLine());
			int mapa[][] = new int[n][n];
			int cek = 0;
			int ansint = -1;
			for(int i = 0 ; i < n ; i++){
				String s[] = br.readLine().split(" ");
				for(int j = 0 ; j < n ; j++){
					mapa[i][j] = Integer.parseInt(s[j]);
					if(rowa == i+1 && set.contains(mapa[i][j])){
						cek++; ansint= mapa[i][j];
					}
				}
			}
			
			if(cek == 0) ans = "Volunteer cheated!";
			else if(cek == 1) ans = ""+ansint;
			else if(cek > 1) ans = "Bad magician!";
			
			System.out.println("Case #"+ num++ +": "+ans);
		}
	}
}
