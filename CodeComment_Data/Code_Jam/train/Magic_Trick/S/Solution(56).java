package methodEmbedding.Magic_Trick.S.LYD1780;

import java.io.*;
import java.util.Scanner;
import java.util.*;
import java.math.*;
class Solution{
	public static void main(String args[]) throws IOException{
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		for (int i=0;i<cases;i++){
			int ans1 = in.nextInt();
			HashSet<Integer> row = new HashSet<Integer>(4);
			for (int j=0;j<16;j++){
				if(j/4==ans1-1){
						int val = in.nextInt();
						row.add(val);
				}
				else{
					int str = in.nextInt();
				}
			}
			int ans2 = in.nextInt();
			int res = -99;
			for (int j=0;j<16;j++){
					if(j/4==ans2-1){
						int num = in.nextInt();
						if(row.contains(num)&&res==-99){res=num;}
						else if (row.contains(num)&&res!=-99){res=-1;}
					}
					else{
						in.nextInt();
					}
			}
			if (res == -99)
				System.out.println("Case #"+(i+1)+": Volunteer cheated!");
			else if (res==-1)
				System.out.println("Case #"+(i+1)+": Bad magician!");
			else
				System.out.println("Case #"+(i+1)+": "+res);
		}
	}
}
