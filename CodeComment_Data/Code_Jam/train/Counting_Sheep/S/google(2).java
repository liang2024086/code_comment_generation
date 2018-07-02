package methodEmbedding.Counting_Sheep.S.LYD359;

import java.util.Scanner;
public class google
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[10];
		int T=sc.nextInt();
		for(int i=0;i<T;i++){
			int cnt=0,mul=1;
			long N=sc.nextLong();
			if(N==0){
				System.out.println("Case #"+(i+1)+": INSOMNIA");
			}
			else{
				while(cnt<10){
					long tnum=N*mul;
					mul++;
					while(tnum>0){
						long lnum=tnum%10;
						tnum=tnum/10;
						int flag=0;
						for(int k=0;k<cnt;k++){
							if(arr[k]==lnum){
								flag=1;
								break;
							}
						}
						if(flag==0){
							arr[cnt]=(int)lnum;
							cnt++;
						}
					}
				}
				System.out.println("Case #"+(i+1)+": "+(N*(mul-1)));
			}
		}
	}
}
