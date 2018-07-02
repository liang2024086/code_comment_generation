package methodEmbedding.Magic_Trick.S.LYD646;

import java.util.*;
class Magic{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int t=1;t<=T;t++)
		{
			int m=in.nextInt()-1;
			int[][] a=new int[4][4];
			for(int i=0;i<4;i++)
			for(int j=0;j<4;j++)
			a[i][j]=in.nextInt();
			int n=in.nextInt()-1;
			int[][] b=new int[4][4];
			for(int i=0;i<4;i++)
			for(int j=0;j<4;j++)
			b[i][j]=in.nextInt();
//			System.out.println(m+" "+n);
//			for(int i=0;i<4;i++)
//			System.out.println(Arrays.toString(a[i]));
//			for(int i=0;i<4;i++)
//			System.out.println(Arrays.toString(b[i]));
			int ans=0;
			int found=0;
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					if(a[m][i]==b[n][j]&&found==0){
						found=1;
						ans=a[m][i];
//						System.out.println(ans+" Match");
					}
					else if(a[m][i]==b[n][j]&&found==1&&ans!=a[m][i])
					{found=2;}
				}
			}
			if(found==0)
			System.out.println("Case #"+t+": Volunteer cheated!");
			else if(found==2)
			System.out.println("Case #"+t+": Bad magician!");
			else
			System.out.println("Case #"+t+": "+ans);
		}
	}
}
			
			
