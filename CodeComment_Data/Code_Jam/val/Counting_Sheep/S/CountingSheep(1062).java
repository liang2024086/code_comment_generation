package methodEmbedding.Counting_Sheep.S.LYD17;

import java.io.*;
import java.util.*;

class CountingSheep{
	public static void main(String args[])throws IOException{
		Scanner sc =  new Scanner(System.in);
		int t = sc.nextInt();
		int i,j,k;
		long n,temp;
		
		for(k=1;k<=t;k++){
			n = sc.nextLong();
			
			boolean digit[] = new boolean[10];
			long ans = n;
			temp = n;
			
			if(n==0)
				System.out.println("Case #"+k+": INSOMNIA");
			else{
				boolean status = false;
				for(j=1;!status;j++){
					
					temp = j*n;
					ans = temp;
					
					while(temp>0){
						digit[(int)temp%10] = true;
						temp /= 10;
					}
					status = true;
					for(i=0;i<10;i++){
						if(!digit[i]) status = false;
					}
					temp = ans;
				}
				
				System.out.println("Case #"+k+": "+temp);
			}
		}
	}
}
