package methodEmbedding.Counting_Sheep.S.LYD1702;

import java.util.Scanner;


public class Class5 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		int T;
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		String ans[]=new String[T];
		for(int i=0;i<T;i++){
			boolean a[]=new boolean[10];
			for(int p=0;p<10;p++){
				a[p]=false;
			}
			int n=sc.nextInt();
			if(n==0){
				ans[i]="INSOMNIA";continue;}
			int count=1;
			int b=n;
			while(true){
				n=b*count;
				int k=n;
				//System.out.println(k);
				while(k>0)
				{
					
					a[k%10]=true;
					k=k/10;
				}
				boolean flag=false;
				for(int l=0;l<10;l++){
					if(a[l]==true)
						continue;
					else
					{flag=true;break;}
				}
				if(flag==false){ans[i]=""+n;
					break;}
				count++;
				
			}
		}
		sc.close();
		for(int i=0;i<T;i++){
			System.out.println("Case #"+(i+1)+": "+ans[i]);
		}

	}
	

}

