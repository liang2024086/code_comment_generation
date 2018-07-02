package methodEmbedding.Standing_Ovation.S.LYD1777;

import java.util.Scanner;

public class g01 {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int i=0;i<t;i++){
		int smax=sc.nextInt();
		String no=sc.next();
		int[] nums=new int[smax+1];
		int[] cum=new int[smax+1];
		int count=0;
		nums[0]=Integer.parseInt(no.substring(0,1));
		cum[0]=nums[0];
		for(int j=1;j<=smax;j++){
			nums[j]=Integer.parseInt(no.substring(j,j+1));
			if(cum[j-1]<j){
				count+=(j-cum[j-1]);
				cum[j-1]=j;
			}
			cum[j]=cum[j-1]+nums[j];
		}
		System.out.printf("Case #%d: %d\n",i+1,count);
	}
}
}
