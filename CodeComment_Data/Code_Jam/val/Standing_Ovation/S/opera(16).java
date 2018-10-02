package methodEmbedding.Standing_Ovation.S.LYD1790;

import java.util.Scanner;
import java.util.Arrays;
class opera
{
    public static void main(String[] args)
    {
	Scanner in=new Scanner(System.in);
	int ncase=in.nextInt();
	for(int icase=0;icase<ncase;icase++){
	    int icase1=icase+1;
	    int Smx=in.nextInt();
	    String S=in.next();
	    char ch[]=S.toCharArray();
	    int len=ch.length;
	    int[] shy=new int[len];
	    for(int i=0;i<len;i++)
		shy[i]=Integer.parseInt(Character.toString(ch[i]));
	    int add=0;
	    int tot=shy[0];
	    for(int i=1;i<len;i++){

		if(shy[i]==0)continue;
		//		System.out.println("i "+i+" shy:"+shy[i]+"tot:"+tot);
		if(tot<i){
		    int diff=i-tot;
		    tot+=diff;
		    add+=diff;
		}
		tot+=shy[i];
	    }		
	    System.out.println("Case #"+icase1+":"+" "+add);
	}
    }
}
