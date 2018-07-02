package methodEmbedding.Revenge_of_the_Pancakes.S.LYD962;

import java.util.*;
import java.io.*;
public class Bq{
   public static void main(String args[]){
   	Scanner sc=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t=sc.nextInt();
    for(int i=1;i<=t;i++){
    	int count=0;
    	String s=sc.next();
    	char a[]=s.toCharArray();
        for(int j=0;j<s.length()-1;j++){
        	if(a[j]!=a[j+1]){
        		for(int k=0;k<=j;k++){
        			if(a[k]=='+')a[k]='-';
        			else a[k]='+';
        		}
        		count++;
        	}
        } 
        if(a[s.length()-1]=='-')count++;
        System.out.println("Case #"+i+": "+count);	
       }
        	
  }
}
