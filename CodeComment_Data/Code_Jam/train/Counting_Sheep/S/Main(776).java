package methodEmbedding.Counting_Sheep.S.LYD1609;


import java.util.*;
import java.io.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    	int c=sc.nextInt(),cc=1;
    	
    	while(c-->0){
    		int n=sc.nextInt(),count=1;
    		Set<Integer> s=new HashSet<Integer>();
    		
    		if(n!=0){
	    		while(s.size()<10){
	    			int num=n*count;
	    			
	    			while(num>0){
	    				s.add(num%10);
	    				num/=10;
	    			}
	    			
	    			count++;
	    		}
	    		
	    		System.out.println("Case #"+(cc++)+": "+n*(count-1));
    		}else
    			System.out.println("Case #"+(cc++)+": INSOMNIA");
    	}
  }
}
