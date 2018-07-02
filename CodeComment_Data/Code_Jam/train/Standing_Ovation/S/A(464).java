package methodEmbedding.Standing_Ovation.S.LYD549;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;


public class A {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

		Scanner x=new Scanner(new BufferedReader(new FileReader("a.txt")));
		PrintWriter  writer = new PrintWriter("outpt.txt", "UTF-8");

		  int t=x.nextInt();
		  int c=1;
		 
		 while(t--!=0){
			 
			int max=x.nextInt();
			
			String str=x.next();
			
			int tot=str.charAt(0)-'0';
			int ret=0;
			
			for(int i=1;i<str.length();i++){
						
				if(str.charAt(i)=='0')continue;
				
				if(tot<i){
					
				ret+=(i-tot);
					
				tot+=(i-tot);
				
				}
			
				tot+=str.charAt(i)-'0';		
								
				
			}		
			 
			 writer.println("Case #"+c+": "+ret);
			 c++;
		 
		 }
		
		 writer.close();
		
		
	}

}
