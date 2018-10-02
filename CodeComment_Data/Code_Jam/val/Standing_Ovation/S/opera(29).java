package methodEmbedding.Standing_Ovation.S.LYD2096;


import java.util.Scanner;

public class opera {
	public static void main (String args[]){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i=0 ; i<t; i++){
			int re=0;

			int max = in.nextInt();
			String s=in.next();
			int mat[]= new int[max+1];
int f = 0 ;
			for(int j=0 ; j<=max;j++){
				mat[j]=Character.getNumericValue(s.charAt(j));
			//	System.out.print(mat[j]+" - ");
			//	System.out.println(f+" "+ j);
if(j==0){
	f=mat[0];
}
if(mat[j]>=1 && j>=1){
 	

					if (j>f){
 						int k=(j-f);
 						re+=k;
						f+=k;
						}
					f+=mat[j];

}				


			}

			//if (mat[0]==0){	re++; mat[0]=1;			}
			System.out.println("Case #"+(i+1)+": " +(int)re);
			
		}
		
		
		
	}

}
