package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1135;


import java.util.*;
import java.io.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    	int c=sc.nextInt(),cc=1;
    	
    	while(c-->0){
    		String st=sc.next();
    		int count=0;
    		boolean b=true;
    		String str=st; 
    			for(int i=0;i<str.length()-1;i++){
    				if(st.charAt(i+1)!=st.charAt(i))
    					b=false;
    				else
    					b=true;
    				if(!b){
    					count++;
    					str="";
    					for(int j=0;j<=i;j++)
    						str+=st.charAt(i+1);
    					for(int j=i+1;j<=st.length()-1;j++)
    						str+=st.charAt(j);
    				}
    				//System.out.println(str+" "+count);
    			}
    		
    			if(str.charAt(0)=='-')
    				count++;
	    		
	    		System.out.println("Case #"+(cc++)+": "+count);
    		
    	}
  }
}
