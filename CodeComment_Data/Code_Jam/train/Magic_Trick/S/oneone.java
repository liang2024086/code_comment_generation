package methodEmbedding.Magic_Trick.S.LYD1741;

import java.util.Scanner;


public class oneone {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();int x=1;
		while(x<=t){
			
			int[][] a=new int[4][4];
			int r1=sc.nextInt();
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					
					a[i][j]=sc.nextInt();	
					                 }	
			}
			
			int[][] b=new int[4][4];
			int r2=sc.nextInt();
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					
					b[i][j]=sc.nextInt();	
					                 }	
			}int i;int j;int count=0;int no=0;
			 for(i=0;i<4;i++){
				 for(j=0;j<4;j++)
				 {
				 if(a[r1-1][i]==b[r2-1][j]) { count++; no=a[r1-1][i];}
				 }}
				 if(count==1) System.out.println("Case #"+x+":"+" "+no);
				 else if(count>1) System.out.println("Case #"+x+":"+" Bad magician!");
				 else if(count==0) {System.out.println("Case #"+x +":"+" Volunteer cheated!");
				 }
			x++;
		}
		
		
		
		
	}
}
