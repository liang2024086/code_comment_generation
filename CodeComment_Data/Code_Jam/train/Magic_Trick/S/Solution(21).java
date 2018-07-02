package methodEmbedding.Magic_Trick.S.LYD1957;

import java.util.*;
import static java.lang.Math.*;

public class Solution {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		int[][] first = new int[4][4];
		int[][] second  = new int[4][4];
		for(int zz = 1; zz <= T;zz++){
			int count=0;
			int value=-1;
			String result="";
			int first_row = in.nextInt();
				for(int i = 0; i < 4;i++){
					for(int j = 0; j < 4;j++){
						first[i][j]= in.nextInt();
					}
				}
			int second_row = in.nextInt();
				for(int i = 0; i < 4;i++){
					for(int j = 0; j < 4;j++){
						second[i][j]= in.nextInt();
					}
				}
			for (int i =0 ;i<4;i++){
				for (int j =0; j<4;j++){
					if(first[first_row-1][i]==second[second_row-1][j]){
						count++;
						value= first[first_row-1][i];
					}
					
				}
			}
			if(count>1) result="Bad magician!";
			if(count==0)result="Volunteer cheated!";
			if(count==1)result =new  Integer(value).toString();
			System.out.format("Case #%d: %s\n", zz, result);
		}
	}
}
