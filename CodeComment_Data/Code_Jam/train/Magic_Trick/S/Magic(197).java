package methodEmbedding.Magic_Trick.S.LYD2081;

import java.util.*;

class Magic{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	for(int tc=1;tc<=T;tc++){
	    int r1=sc.nextInt();
	    int[] a=new int[4];
	    for(int i=1;i<=4;i++){
		for(int j=0;j<4;j++){
		    int x=sc.nextInt();
		    if(i==r1)a[j]=x;
		}}
	    int r2=sc.nextInt();
	    int count=0;int ans=-1;
	    for(int i=1;i<=4;i++){
		for(int j=0;j<4;j++){
		    int x=sc.nextInt();
		    if(i==r2){
			for(int k=0;k<4;k++){
			    if(a[k]==x){ans=x;count++;}
			}
		    }}}

	    System.out.printf("Case #%d: ",tc);
	    if(count==1)System.out.println(ans);
	    else System.out.println(count==0?"Volunteer cheated!":"Bad magician!");
	}
    }
}


