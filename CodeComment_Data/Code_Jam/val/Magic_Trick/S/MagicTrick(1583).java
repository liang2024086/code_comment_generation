package methodEmbedding.Magic_Trick.S.LYD969;

import java.util.Scanner;


public class MagicTrick {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int tt=1;
		int t=sc.nextInt();
		while(t-->0){
			int[][] a1=new int[4][4];
			int[][] a2=new int[4][4];
			
			int n1=sc.nextInt();
			
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					a1[i][j]=sc.nextInt();
				}
			}
			
			int n2=sc.nextInt();
			
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					a2[i][j]=sc.nextInt();
				}
			}
			int c=0;
			int p=-1;
			n1--;
			n2--;
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					if(a1[n1][i]==a2[n2][j]){
						c++;
						p=a1[n1][i];
					}
				}
			}
			if(c==0){
				System.out.println("Case #"+(tt++)+": Volunteer cheated!");
			}else if(c==1){
				System.out.println("Case #"+(tt++)+": "+p);
			}else{
				System.out.println("Case #"+(tt++)+": Bad magician!");
			}
		}
	}
}
