package methodEmbedding.Magic_Trick.S.LYD1024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MagicTrick {
	/**
	 * Teerapun Jaikla 
	 * XxYeSiSaexX@Gmail.com
	 */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt();
		int []box1 = new int[4];
		int []box2 = new int[4];
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0;i<t;i+=1){
			int line = kb.nextInt();
			for(int j=0;j<4;j+=1){
				if((line-1)==j){
					for(int k = 0;k<4;k+=1)
						box1[k]=kb.nextInt();					
				}else{
					for(int k = 0;k<4;k+=1)
						kb.nextInt();					
				}				
			}
			line = kb.nextInt();
			for(int j=0;j<4;j+=1){
				if((line-1)==j){
					for(int k = 0;k<4;k+=1)
						box2[k]=kb.nextInt();
					
				}else{
					for(int k = 0;k<4;k+=1)
						kb.nextInt();					
				}				
			}
			int count = 0;
			int temp = 0;
			Arrays.sort(box1);
			Arrays.sort(box2);
			for(int j=0;j<box1.length;j+=1){
				for(int k = 0;k<box2.length;k+=1){
					if(box1[j]==box2[k]){
						temp = box1[j];
						count += 1;
						break;
					}
				}
				
			}
			
			if(count == 0)
				System.out.println("Case #"+(i+1)+": Volunteer cheated!");
			else if(count == 1)
				System.out.println("Case #"+(i+1)+": "+temp);
			else
				System.out.println("Case #"+(i+1)+": Bad magician!");			
		}
	}
}
