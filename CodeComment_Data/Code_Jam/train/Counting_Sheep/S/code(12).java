package methodEmbedding.Counting_Sheep.S.LYD401;

import java.util.Scanner;

public class CountingSheep {
	public static void main(String args[]){
		Scanner x = new Scanner(System.in);
		int T = x.nextInt();
		for(int i=0; i<T; i++){
			int A[] = {0,0,0,0,0,0,0,0,0,0};
			long N = x.nextLong(); int m=1,l=1, n=2;
			long N2=N,N3=N;
			if(N==0){
				System.out.println("Case #"+(i+1)+": INSOMNIA");
				m=0;
			}
			while(l!=0&&m!=0){
			while(N2>0){
				long s = N2%10;
				int q = (int)s;				
				switch(q){
				case 0: A[0]=1; break;
				case 1: A[1]=1; break;
				case 2: A[2]=1; break;
				case 3: A[3]=1; break;
				case 4: A[4]=1; break;
				case 5: A[5]=1; break;
				case 6: A[6]=1; break;
				case 7: A[7]=1; break;
				case 8: A[8]=1; break;
				default : A[9]=1;
				}
				N2 = N2/10;
			}
				if(A[0]==1&&A[1]==1&&A[2]==1&&A[3]==1&&A[4]==1&&A[5]==1&&A[6]==1&&A[7]==1&&A[8]==1&&A[9]==1){
					System.out.println("Case #"+(i+1)+": "+N3);
					l=0;
				}
				else{
					N2 = n*N;
					N3=N2;
					n++;
				}
			}
		}
	}
}
