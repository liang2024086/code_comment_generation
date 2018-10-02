package methodEmbedding.Speaking_in_Tongues.S.LYD1499;

import java.util.*;
class Speaking{
public static void main(String [] argv){
Scanner sc=new Scanner(System.in);
char bi[]={' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
char en[]={' ','y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
int T,i=0;
String g[]=new String[100];
String G=new String();
T=sc.nextInt();
	while(i<=T&&T<=30){
        g[i]=sc.nextLine();
        i++;
	}
	for(i=1;i<=T&&T<=30;i++){
		for(int j=0;j<g[i].length();j++){
			for(int k=0;k<27;k++){
				if(g[i].charAt(j)==bi[k])
					G+=en[k];
				if(g[i].charAt(j)==bi[0])
					G+="";
			}
		}
		System.out.println("case #"+i+": "+G);
		G=new String();
}
}
}
