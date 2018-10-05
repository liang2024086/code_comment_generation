package methodEmbedding.Revenge_of_the_Pancakes.S.LYD173;

import java.util.*;
import java.io.*;


public class pancakes{
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int n = in.nextInt();
    for(int i=0;i<n;i++){
    	int count = 0;
    	String s = in.next();
    	char[] a = s.toCharArray();
    	int flag1 =0;
    	int flag2 = 0;
    	int flag3 = 0;
    	if(a[0]=='-'){
    		flag3 =1;
    	}
    	
    	
    	for(int j=0;j<a.length;j++){
    		if(a[flag1]!=a[j]){
    			flag2 = j;
    			if(a[flag1]=='-'&&a[flag2]=='+'){
    				count++;
    				flag1 = flag2;
    				flag3 = 0;
    			}
    			else if(a[flag1]=='+'&&a[flag2]=='-'){
    				count++;
    				flag1 = flag2;
    				flag3 = 1;
    			}
    		}
    		
    	}
    	if(flag1 == 0 && flag2 == 0 && flag3 ==1){
    		count = 1;
    	}
    	
    	if(flag1!=0 && flag1 == flag2 && flag3 ==1){
    		count++;
    	}
    	int q = i+1;
    	System.out.println("Case #"+ q + ":" + " " + count);
    	
    }
    


	in.close();
  }




}
