package methodEmbedding.Standing_Ovation.S.LYD469;

import java.io.*;
import java.util.*;

class StandOv{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int numcase = sc.nextInt();
		for(int i =0;i<numcase;i++){
			int shylvl = sc.nextInt();
			String ppl = sc.next();
			int inv = 0;
			int standing = Integer.parseInt(ppl.substring(0,1));
			for(int j=1;j<shylvl;j++){
				int shyppl = Integer.parseInt(ppl.substring(j,j+1));
				if(standing<j){
					inv = inv + j-standing;
					standing = j + shyppl;
				}
				else{
					standing = standing + shyppl;
				}
			}
			int last = Integer.parseInt(ppl.substring(shylvl));
			if(standing<shylvl){
				inv = inv + shylvl-standing;
				standing = shylvl + last;
			}
			else{
				standing = standing + last;
			}
			System.out.println("Case #"+(i+1)+": "+inv);
		}
	}
	
}
