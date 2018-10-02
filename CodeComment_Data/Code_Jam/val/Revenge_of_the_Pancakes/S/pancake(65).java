package methodEmbedding.Revenge_of_the_Pancakes.S.LYD836;

import java.lang.*;
import java.util.*;
class pancake
{    
    public static void main(String[] args)
    {
	Scanner in=new Scanner(System.in);	
	int ncase=in.nextInt();
	String S=in.nextLine();
	for(int icase=0;icase<ncase;icase++){
	    S=in.nextLine();
	    int N=S.length();
	    boolean[] stack=new boolean[N];
	    boolean[] stack2=new boolean[N];
	    for(int i=0;i<N;i++){
		stack[i]=true;
		if(S.charAt(i)=='-')
		    stack[i]=false;
	    }
	    int icount=0;
	    while(true){
		int ipos=-1;
		boolean top=stack[0];
		for(int i=0;i<N;i++){
		    stack2[i]=stack[i];
		    if(stack[i]==!top){
			ipos=i;
			break;
		    }		    
		}
		if(ipos==-1){
		    if(top){
			break;
		    }
		    else{
			icount++;
			break;
		    }
		}
		icount++;
		ipos--;
		for(int i=0;i<=ipos;i++){
		    stack[i]=!stack2[ipos-i];
		}
	    }
	    int icase1=icase+1;
	    System.out.println("Case #"+icase1+":"+" "+icount);	
	}
    }
}
