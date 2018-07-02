package methodEmbedding.Counting_Sheep.S.LYD226;

import java.util.*;

public class Q1 {
	static int arr[],count,INSOMNIA;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int i=1;i<=T;i++){
			int N = s.nextInt();
			int index=0;
			arr=new int[10];
			count=0;
			INSOMNIA=0;
			if(N==0) INSOMNIA=1;
			while(count<10&&INSOMNIA==0){
				index++;
				int temp=N*index;
				while(temp>0){
					if(arr[temp%10]==0){
						arr[temp%10]=1;
						count++;
					}
					temp/=10;
				}
			}
			if(INSOMNIA==0) System.out.println("Case #"+i+": "+N*index);
			else System.out.println("Case #"+i+": INSOMNIA");
		}
	}
}
/*
public class Q1 {
	static int arr[],count,pre_count,less,INSOMNIA;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int i=1;i<=T;i++){
			int N = s.nextInt();
			int index=0;
			arr=new int[10];
			count=0;
			pre_count=0;
			less=0;
			INSOMNIA=0;
			if(N==0) INSOMNIA=1;
			while(count<10&&INSOMNIA==0){
				index++;
				pre_count=count;
				cut(N*index);
				if(count-pre_count==0){
					less++;
				}
				else{
					less=0;
				}
				if(less>9) INSOMNIA =1;
			}
			if(INSOMNIA==0) System.out.println("Case #"+i+": "+N*index);
			else System.out.println("Case #"+i+": INSOMNIA");
		}
	}
	static void cut(int n){
		while(n>0){
			if(arr[n%10]==0){
				arr[n%10]=1;
				count++;
			}
			n/=10;
		}
	}
}
*/
