package methodEmbedding.Magic_Trick.S.LYD903;

import java.util.*;
public class a {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int t=in.nextInt();
	for(int z=0;z<t;z++){
		
		int n=in.nextInt()-1;
		int[][]b=new int[4][4];
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				b[i][j]=in.nextInt();
			}
		}
		int m=in.nextInt()-1;
		int[][]a=new int[4][4];
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				a[i][j]=in.nextInt();
			}
		}
		
		HashSet<Integer> bef=new HashSet<Integer>();
		HashSet<Integer> aft=new HashSet<Integer>();
		HashSet<Integer> ans=new HashSet<Integer>();
		
		for(int i=0;i<4;i++){
			bef.add(b[n][i]);
			aft.add(a[m][i]);
		}
		
		for(int e:bef){
			if(aft.contains(e))ans.add(e);
		}
		for(int e:aft){
			if(bef.contains(e))ans.add(e);
		}
//		System.out.println(ans.size());
//		for(int e: ans)System.out.println(e);

		System.out.print("Case #"+(z+1)+": ");
		if(ans.size()==0)System.out.println("Volunteer cheated!");
		else if(ans.size()>1)System.out.println("Bad magician!");
		else{
			for(int e:ans){
				System.out.println(e);
				break;
			}
		}
		
	}
}
}
