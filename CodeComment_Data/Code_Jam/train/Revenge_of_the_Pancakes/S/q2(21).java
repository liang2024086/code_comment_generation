package methodEmbedding.Revenge_of_the_Pancakes.S.LYD949;

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
    	char[] c1 = br.readLine().toCharArray();
    	int prev=0;
    	int count=0;
    	for(int j=0;j<c1.length;j++){
    		if(c1[j]=='-'){
    			if(j==c1.length-1){
    				if(prev!=0)
    					count+=2;
    				else
    					count+=1;}
    			else if(c1[j+1]=='+'){
    				if(prev==0){
    					count+=1;
    				}
    				else{
    					count+=2;
    				}
    			}
    		}
    		else
    			prev++;
    	}
    	System.out.println("Case #"+(i+1)+": "+count);
    }
    }
}
