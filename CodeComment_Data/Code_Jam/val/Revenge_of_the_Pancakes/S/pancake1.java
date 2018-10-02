package methodEmbedding.Revenge_of_the_Pancakes.S.LYD820;

import java.util.*;
import java.lang.*;
import java.io.*;

class pancake1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		//String s1=new String();
		Scanner s =new Scanner(System.in);
		
		
		char c;
		int i=0,l=0,a=0,count=0;
		
		int j,T=0;
		if(s.hasNextInt()){
		T=s.nextInt();
		}
		s.nextLine();
		
		for(j=1;j<=T;j++){
			
			String s1=s.nextLine();
			
			char pan[] = s1.toCharArray();
			count=0;
			i=0;
			while(true){
				a=0;
				c=pan[0];
				while(c==pan[i]){
					i++;
					if(i>=pan.length)
						break;
				}
			//l=i;
				if(i==s1.length()){
					if(pan[0]=='-'){
						count++;
						break;
					}
					else 
						break;
				}
				
				
				while(a<i){
					pan[a]=pan[i];
					a++;
				}
				i=0;
				count++;
			}
			System.out.println("Case #"+j+": "+count);
		}
	}
}	
	
