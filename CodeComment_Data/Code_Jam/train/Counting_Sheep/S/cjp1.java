package methodEmbedding.Counting_Sheep.S.LYD1183;


import java.util.*;
public class cjp1 {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		int a[]={0,1,2,3,4,5,6,7,8,9};
		for(int i=1;i<=t;i++){
			int b[]=new int[10];
			b[0]=10;
			int n=in.nextInt();
			if(n==0){
				System.out.println("Case #"+i+": INSOMNIA");
				continue;
			}
			int q=n;
			int z=2;
			while(!Arrays.equals(a,b)){
				
				int j=q;
				while(j>0){
					int s=j%10;
					j=j/10;
					if(b[s]!=s){
						b[s]=s;
					}
				}
				if(Arrays.equals(a,b)){
					break;
				}
				else{
				q=z*n;
				z++;
				}
			}
			System.out.println("Case #"+i+": "+q);
			
		}
		in.close();
	}

}
