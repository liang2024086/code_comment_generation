package methodEmbedding.Counting_Sheep.S.LYD1646;

import java.util.*;
class CountingSheep{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);	
		int t=s.nextInt();
		for(int i=1;i<=t;i++){
			int n=s.nextInt();
			boolean b[]=new boolean[10];
			for(int j=0;j<10;j++){
			b[j]=false;
			}
			int ans=0;
			for(int j=1;j<1000;j++){
				int m=n*j;
				int p=m;
				while(p!=0){
					int lastDigit=p%10;
					p=p/10;
					b[lastDigit]=true;
				}
				boolean f=true;
				for(int q=0;q<10;q++){
					f=f&b[q];
				}
				if(f){
					ans=m;
					break;
				}
			}
			if(ans>0){
				System.out.println("Case #"+i+": "+ans);
				}else{
					System.out.println("Case #"+i+": INSOMNIA");
				}

		}
	}
}
