package methodEmbedding.Counting_Sheep.S.LYD399;


import java.util.Scanner;

public class CountingSheep {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int t =  sc.nextInt();
		int cs = 0;
		while(t-->0){
			cs++;
			long n = sc.nextLong();
			long m = n;
			if(n==0){
				System.out.println("Case #"+cs+": INSOMNIA");
				continue;
			}
			int[] h = new int[10];
			int c = 0;
			while(c!=10){
				long temp = n;
				while(temp>0){
					int p = (int) (temp%10);
					if(h[p]==0){
						h[p]=1;
						c++;
					}
					temp=temp/10;
				}
				if(c==10) break;
				n+=m;//overflow ? 
			}
			System.out.println("Case #"+cs+": "+n);
		}
	}
}
