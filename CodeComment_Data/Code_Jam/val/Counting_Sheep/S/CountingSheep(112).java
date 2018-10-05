package methodEmbedding.Counting_Sheep.S.LYD335;

import java.util.Scanner;

class CountingSheep {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		long N,temp;
		int c;
		boolean[] d=new boolean[10];
		for (int i = 1; i <= T; i++) {
			N=sc.nextInt();
			for (int j = 0; j < 10; j++) {
				d[j]=false;
			}
			if(N==0)
				System.out.println("Case #"+i+": INSOMNIA");
			else{
				temp=N;
				while(temp>0){
					d[(int)(temp%10)]=true;
					temp/=10;
				}
				c=1;
				while(d[0]==false){
					c++;
					temp=N*c;
					while(temp>0){
						d[(int)(temp%10)]=true;
						temp/=10;
					}
				}
				while(d[1]==false){
					c++;
					temp=N*c;
					while(temp>0){
						d[(int)(temp%10)]=true;
						temp/=10;
					}
				}
				while(d[2]==false){
					c++;
					temp=N*c;
					while(temp>0){
						d[(int)(temp%10)]=true;
						temp/=10;
					}
				}
				while(d[3]==false){
					c++;
					temp=N*c;
					while(temp>0){
						d[(int)(temp%10)]=true;
						temp/=10;
					}
				}
				while(d[4]==false){
					c++;
					temp=N*c;
					while(temp>0){
						d[(int)(temp%10)]=true;
						temp/=10;
					}
				}
				while(d[5]==false){
					c++;
					temp=N*c;
					while(temp>0){
						d[(int)(temp%10)]=true;
						temp/=10;
					}
				}
				while(d[6]==false){
					c++;
					temp=N*c;
					while(temp>0){
						d[(int)(temp%10)]=true;
						temp/=10;
					}
				}
				while(d[7]==false){
					c++;
					temp=N*c;
					while(temp>0){
						d[(int)(temp%10)]=true;
						temp/=10;
					}
				}
				while(d[8]==false){
					c++;
					temp=N*c;
					while(temp>0){
						d[(int)(temp%10)]=true;
						temp/=10;
					}
				}
				while(d[9]==false){
					c++;
					temp=N*c;
					while(temp>0){
						d[(int)(temp%10)]=true;
						temp/=10;
					}
				}
				System.out.println("Case #"+i+": "+N*c);
			}			
		}
		sc.close();
	}

}
