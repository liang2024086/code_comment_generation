package methodEmbedding.Magic_Trick.S.LYD120;

import java.util.Scanner;
import java.util.Arrays;
class Magician
{
    public static void main(String[] args)
    {
	Scanner in=new Scanner(System.in);
	int ncase=in.nextInt();
	int[][] array1=new int[4][4];
	int[][] array2=new int[4][4];
	int [] cand1=new int[4];
	int [] cand2=new int[4];
	
	for(int icase=0;icase<ncase;icase++){
	    int irow1=in.nextInt();
	    for(int i=0;i<4;i++){
		for(int j=0;j<4;j++)
		    cand1[j]=in.nextInt();
		Arrays.sort(cand1);
		for(int j=0;j<4;j++)
		    array1[i][j]=cand1[j];		
	    }
	    for(int i=0;i<4;i++)
		cand1[i]=array1[irow1-1][i];	    
	    int irow2=in.nextInt();
	    for(int i=0;i<4;i++){
		for(int j=0;j<4;j++)
		    cand2[j]=in.nextInt();
		Arrays.sort(cand2);
		for(int j=0;j<4;j++)
		    array2[i][j]=cand2[j];		
	    }
	    for(int i=0;i<4;i++)
		cand2[i]=array2[irow2-1][i];

	    int ifnd=0;
	    int ip1=0;
	    int ip2=0;
	    int iguess,iloc;
	    iguess=-1;
	    while(true){
		int ipiv=cand1[ip1];
		iloc=-1;
		for(int i2=ip2;i2<4;i2++){
		    if(cand2[i2]>=ipiv){
			iloc=i2;
			break;
		    }
		}
		if(iloc<0)break;
		if(cand2[iloc]==ipiv){
		    ifnd++;
		    iguess=ipiv;
		    iloc++;
		}
		if(ifnd>1)break;
		ip1++;
		ip2=iloc;
		if(ip1>3||ip2>3)break;
	    }
	    int icase1=icase+1;
	    if(ifnd==0){
		System.out.println("Case #"+icase1+":"+" "+"Volunteer cheated!");
	    }else if(ifnd==1){
		System.out.println("Case #"+icase1+":"+" "+iguess);
	    }else if(ifnd>1){
		System.out.println("Case #"+icase1+":"+" "+"Bad magician!");
	    }
	}
    }
}
