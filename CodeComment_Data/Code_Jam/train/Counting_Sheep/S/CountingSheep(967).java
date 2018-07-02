package methodEmbedding.Counting_Sheep.S.LYD1273;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountingSheep {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int cn=1; cn<=T;cn++){
			int N=sc.nextInt();
			int ans=0;
			if(N!=0){
				int count=0;
				int i=1;
				boolean seen[]=new boolean[10];
				while(count<10){
					long n=i*N;
					while(n>0){
						int d=(int) (n%10);
						if(!seen[d]){
							seen[d]=true;
							count++;
						}
						n/=10;
					}
					i++;
				}
				ans=(i-1)*N;
			}
			if(N==0)
				System.out.println("Case #"+cn+": INSOMNIA");
			else
				System.out.println("Case #"+cn+": "+ans); 
		}
	}

}
