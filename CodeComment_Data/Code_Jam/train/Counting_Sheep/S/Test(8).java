package methodEmbedding.Counting_Sheep.S.LYD1566;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test {
	private static Scanner in;

	public static void main(String args[]){
		in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t=in.nextInt();
		int[] out=new int[t];
		for(int i=0;i<t;i++){
			int n=in.nextInt();
			if(n==0){
				out[i]=-1;
			}else{
				boolean flag=true;
				int[] arr=new int[10];
				int mul=1;
				int l=n;
				int cnt=0;
				while(flag){
					int tmp=l;
					while(tmp>0){
						int x=tmp%10;
						tmp=tmp/10;
						if(arr[x]==0){
							cnt++;
							arr[x]=1;
						}
					}
					if(cnt>=10){
						out[i]=l;						
						flag=false;
					}else{
						l=n*++mul;
					}
				}
			}
		}
		for(int x=0;x<t;x++){
			if(out[x]==-1){
				System.out.println("Case #"+(x+1)+": "+"INSOMNIA");				
			}else{
				System.out.println("Case #"+(x+1)+": "+out[x]);
			}
		}
	}
}
