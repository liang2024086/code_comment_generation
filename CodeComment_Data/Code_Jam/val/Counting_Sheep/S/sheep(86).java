package methodEmbedding.Counting_Sheep.S.LYD465;

import java.lang.*;
import java.util.*;
class sheep
{    
    public static void main(String[] args)
    {
	Scanner in=new Scanner(System.in);	
	boolean[] found;
	found=new boolean[10];
	int ncase=in.nextInt();
	for(int icase=0;icase<ncase;icase++){
	    int N=in.nextInt();
	    int icase1=icase+1;


	    if(N==0){
		System.out.println("Case #"+icase1+":"+" "+"INSOMNIA");
		continue;
	    }

	    for(int i=0;i<10;i++)
		found[i]=false;
	    
	    int N1=N;
	   
	    int iflag=0;

	    
	    while(iflag==0){
		int M=N1;
		int indx;
		while(M>0){
		    indx=M%10;
		    found[indx]=true;
		    M/=10;
		}	
		int icount=0;
		for(int i=0;i<10;i++)
		    if(found[i])icount++;
		if(icount==10)
		   break;
		N1+=N;
	    }
	    System.out.println("Case #"+icase1+":"+" "+N1);		
	}
    }
}
