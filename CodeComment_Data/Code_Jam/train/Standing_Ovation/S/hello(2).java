package methodEmbedding.Standing_Ovation.S.LYD1036;


import java.util.Scanner;

public class hello {
public static void main(String [] arg){
	Scanner in=new Scanner(System.in);
	int t=in.nextInt();
	int [] re=new int[t];
	for(int i=0;i<t;i++){
		int row=in.nextInt();
		int count=0;
		int att=0;
		char [] tem=in.next().toCharArray();
		
		for(int j=1;j<=row;j++){
			//int x=
			att=att+(int)tem[j-1]-48;
			if(att<j){
				count=j-att+count;
				att=j;
			}
		}
		re[i]=count;
		
	}
	//System.out.println("aaaaaaaa");
	for(int i=1;i<=t;i++){
		System.out.printf("Case #%d: %d\n",i,re[i-1]);
	}
	
}
}
