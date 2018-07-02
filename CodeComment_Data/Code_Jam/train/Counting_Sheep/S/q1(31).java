package methodEmbedding.Counting_Sheep.S.LYD175;

import java.util.*;
public class q1{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int x=1;x<=t;x++){
			int n = in.nextInt();
			if(n==0){
				System.out.println("Case #"+x+": INSOMNIA");
				continue;
			}
			int a[] = new int[10];
			int sum = 0;
			int count = 0;
			for(int i=1;count!=10;i++){
				sum = i*n;
				int temp = sum;
				while(temp>0){
					int y = temp%10;
					temp /= 10;
					if(a[y]!=1){
						a[y] = 1;
						count++;
					}
				}
			}
			System.out.println("Case #"+x+": "+(sum));
		}
	}
}
