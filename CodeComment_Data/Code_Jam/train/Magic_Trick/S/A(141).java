package methodEmbedding.Magic_Trick.S.LYD514;

import java.util.Arrays;
import java.util.Scanner;


public class A {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int n=sc.nextInt();
		int []v=new int[16];
		String []res=new String[n];	

		for (int i = 0; i < n; i++) {		
			
			int temp=2;
			while (temp!=0) {
				
								
				int r=sc.nextInt();
				for (int j = 0; j < 4; j++) {
					for (int k = 0; k < 4; k++) {
						int var=sc.nextInt();
						if (j==r-1) {						
							v[var-1]++;							
						}
					}
				}
				temp--;
			}
			
			int c=0,ind=0;
			
			
			for (int j = 0; j < 16; j++) {
				if(v[j]==2){c++;ind=j+1;}
			}	
			
			if(c==0) res[i]="Case #"+(i+1)+": Volunteer cheated!";
			else if(c==1)res[i]="Case #"+(i+1)+": "+ind;
			else res[i]="Case #"+(i+1)+": Bad magician!";

			Arrays.fill(v, 0);

		}
		
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}

}
