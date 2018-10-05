package methodEmbedding.Counting_Sheep.S.LYD549;

import java.io.*;
import java.util.*;

class Codejam1{

	public static void main(String[] args) {
		
		int t;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		int tc=1;
		while(t-->0){

			int [] a={0,1,2,3,4,5,6,7,8,9};
			long n=sc.nextLong();
			long k=1;
			long count=0;
			if(n==0){

				System.out.println("Case"+" "+"#"+tc+":"+" "+"INSOMNIA");
			}
			else{
				
				long temp2=0;
				while(true){
					long temp1=n*k;
					temp2=temp1;
					k++;
					while(temp1>0){

						int dig=(int)temp1%10;
						if(a[dig]==dig){

							a[dig]=-1;
							count++;
						}
						temp1/=10;
					}
					if(count==10)
						break;
				}
				System.out.println("Case"+" "+"#"+tc+":"+" "+temp2);
			}
			tc++;
		}
	}
}
