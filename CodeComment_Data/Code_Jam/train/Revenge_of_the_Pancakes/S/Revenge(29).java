package methodEmbedding.Revenge_of_the_Pancakes.S.LYD837;

import java.util.*;
 public class Revenge{
public static void main(String[] args){
        
		Scanner sc= new Scanner(System.in);

		int len,i;
		int t=sc.nextInt();
		sc.nextLine();
		for(int k=0;k<t;k++){
			System.out.print("Case #"+(k+1)+": ");
		    String ans=new String();
	        String s=sc.nextLine();
	        len=s.length();
	       ans=ans+s.charAt(0);
	      
	        for(i=1;i<len;i++){
	            if(s.charAt(i)!=s.charAt(i-1)){
	                ans=ans+s.charAt(i);
	            }
	            
	        }
	        int len2=ans.length();
	        //System.out.println(ans);
	        if(ans.charAt(len2-1)=='+'){
	            System.out.println(len2-1);
	        }
	        else{
	            System.out.println(len2);
	        }
	                
	            
		
	}

}
}
