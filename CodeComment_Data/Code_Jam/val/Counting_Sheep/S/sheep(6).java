package methodEmbedding.Counting_Sheep.S.LYD1409;


import java.util.*;
import java.lang.*;
import java.io.*;

class sheep
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int T=0,n=0,i,f,g,j=1,n1=0;
		String c;
		Scanner s =new Scanner(System.in);
		//TreeSet <Integer>t = new TreeSet<Integer>();
		//s.hasNextInt();
		if(s.hasNextInt()){
		T=s.nextInt();
		}
		
		for(i=1;i<=T;i++){
		
			n=s.nextInt();
			n1=n;
			TreeSet <Integer>t = new TreeSet<Integer>();
			j=1;
			if(n==0)
			 System.out.println("Case #"+i+": INSOMNIA");
			else{
				
				outer: while(true){
					
					f=n;
					g=n;
					while(g!=0){
						g=g%10;
						t.add(g);
						if(t.size()==10){
							
							break outer;
						}
						f=f/10;
						g=f;
					}
					j++;
					n=n1*j;
					
				}
				System.out.println("Case #"+i+": "+n);
			}
		}
	}
}
