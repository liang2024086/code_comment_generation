package methodEmbedding.Counting_Sheep.S.LYD557;

import java.util.Scanner;

public class Sheep {
	public static void main(String args[]){
		int T,N,N1,n,c,temp=0,i=1,d=0,e=0;
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		
			if(T>=1 && T<=100){
				while(T>=1){
					    int A[]={0,0,0,0,0,0,0,0,0,0};
					    c=0;
					    i=0;
						N1 = sc.nextInt();
						e=0;
							while(c==0){
								e++;
								N=i*N1;
								temp=N;
								while(N!=0){
									n=N%10;
									N=N/10;
									A[n]=1;
								}
								c=1;
								i++;
								for(int j=0;j<10;j++){
									if(A[j]==0){
										c=0;
									    break;
									}
								}
								if(e>100){
									System.out.println("Case #"+(T-T+1+d)+": "+"INSOMNIA");
									break;
								}
						}
						
				if(c==1)
					System.out.println("Case #"+(T-T+1+d)+": "+temp);
					T--;
					d++;
			}
		}
		
		
	}
}
