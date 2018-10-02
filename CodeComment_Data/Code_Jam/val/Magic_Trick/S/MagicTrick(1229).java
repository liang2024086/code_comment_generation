package methodEmbedding.Magic_Trick.S.LYD1956;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class MagicTrick {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int x=0;x<t;x++){
			int[][] first = new int[4][4];
			int[][] second = new int[4][4];
			int q1 = sc.nextInt();
			for(int y=0;y<4;y++){
				for(int z=0;z<4;z++){
					first[y][z] = sc.nextInt();
				}
			}
			int q2 = sc.nextInt();
			for(int y=0;y<4;y++){
				for(int z=0;z<4;z++){
					second[y][z] = sc.nextInt();
				}
			}
			int[] n = new int[8];
			for(int y = 0;y<4;y++){
				n[y] = first[q1-1][y];
				n[y+4] = second[q2-1][y];
			}
			HashMap<Integer,Integer> a = new HashMap<Integer,Integer>();
			for(int k=0;k<first.length;k++){
				a.put(n[k],1);
			}
			for(int k=4;k<n.length;k++){
				if(a.containsKey(n[k])){
					a.put(n[k], a.get(n[k]) + 1);
				}
			}
			int max = 1;
			int max_val = n[0];
			int flag = 0;
			for(Integer k : a.keySet()){
				if(max  <  a.get(k)){
					max_val = k;
					max = 2;
					flag = 2;
				}
				else if(a.get(k) == 2){
					flag = 1;
				}
				
			}
			
			if(flag == 0){
				System.out.println("Case #" + (x+1) + ": " + "Volunteer cheated!");
			}
			else if(flag == 1){
				System.out.println("Case #" + (x+1) + ": " + "Bad magician!");
			}
			else{
				System.out.println("Case #" + (x+1) + ": " + max_val);
			}
			
			
			
			
			
		}
		
			
	}

}
