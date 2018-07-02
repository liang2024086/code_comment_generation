package methodEmbedding.Counting_Sheep.S.LYD366;

import java.util.*;
import java.io.*;
class Main{
public static void main(String args[]){
	Scanner st=new Scanner(System.in);
	int t=st.nextInt();
	int arr[]=new int[10];
	int l=1;
	while(t-->0){
		int c=0;
		int o=0;
		int k=0;
		int p=1;
		int ks=0;
		Arrays.fill(arr,-1);
		int n=st.nextInt();
		if(n==0){
			System.out.println("Case #"+l+": INSOMNIA");
			
		}else{
			//int op=12;
		while(true){
			k=p*n;
			ks=k;
		while(k>0){
			o=k%10;
			k=k/10;
			if(arr[o]==-1){
				arr[o]=1;
				c++;
			}
		}
		//System.out.println("Case #"+l+":"+ks+" "+c);
		if(c==10){
			System.out.println("Case #"+l+": "+ks);
			break;
		}
		
		p++;
		}
		
		}
		p=0;
		l++;
	}
}
}
