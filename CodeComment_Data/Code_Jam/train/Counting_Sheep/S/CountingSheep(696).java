package methodEmbedding.Counting_Sheep.S.LYD478;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CountingSheep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t=sc.nextInt();
		int n,m,k;
		boolean[] bool=new boolean[10];
		boolean flag;
		for(int i=0;i<t;i++){
			n=sc.nextInt();
			k=0;
			for(int j=0;j<10;j++)
				bool[j]=false;
			flag=false;
			while(!flag){
				if(n==0){
					break;
				}
				m=(++k)*n;
				while(m>0){
					bool[m%10]=true;
					m=m/10;
				}
				for(boolean b:bool){
					if (b){
						flag=true;
					}else{
						flag=false;
						break;
					}
				}
			}
			if(n!=0)
			System.out.println("Case #"+(i+1)+": "+k*n);
			else
				System.out.println("Case #"+(i+1)+": INSOMNIA");
		}
		sc.close();
	}

}
