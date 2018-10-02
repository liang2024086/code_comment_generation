package methodEmbedding.Cookie_Clicker_Alpha.S.LYD322;

import java.io.*;
import java.util.*;

public class cf{

	public cf(){
	
	}
	public static void main(String arg[]){
	
		double c,f,x,ck=2,prev=0.0,curr=0.0,ct=0.0,time=0.0;
		int turn,i,j;
		try{
		
			Scanner s=new Scanner(new File("B-small-attempt4.in"));
			PrintWriter pw=new PrintWriter("B-small-attempt4.out");
			turn=s.nextInt();
			i=0;
			while(i<turn){
			
				c=s.nextDouble();
				f=s.nextDouble();
				x=s.nextDouble();
				ck=2.0;
				prev=x/ck;
				ct=0.0;
				curr=0.0;
				if(x/ck<c/ck){
				
					pw.printf("Case #"+(i+1)+": %1$.7f\n",x/ck);
				}
				else{
				
					for(j=0;;j++){
					
						ct+=c/ck;
						ck+=f;
						time=x/ck;
						curr=time+ct;
						if(curr>prev){
						
							pw.printf("Case #"+(i+1)+": %1$.7f\n",prev);
							break;
						}
						else
							prev=curr;
					}
				}
				pw.flush();
				i++;
			}
		}catch(Exception e){
		
			e.printStackTrace();
		}
	}
}
