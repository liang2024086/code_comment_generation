package methodEmbedding.Counting_Sheep.S.LYD1040;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class Test {
    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    for(int i=0;i<t;i++){
    	int n=Integer.parseInt(br.readLine());
    	int[] ar1=new int[10];
    	int ans=0,q=1,count=0;
    	if(n==0){
    		System.out.println("Case #"+(i+1)+": INSOMNIA");
    		continue;}
    	while(true){
    		int a=q*n;
    		while(a!=0){
    			if(ar1[a%10]==0){
    				ar1[a%10]++;
    				count++;
    				}
    			if(count==10){
					break;}
				a=a/10;
    		}
    		if(count==10){
    			System.out.println("Case #"+(i+1)+": "+q*n);
				break;}
    		
			q++;
    	}
    }
    }
}
