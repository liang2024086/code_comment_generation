package methodEmbedding.Magic_Trick.S.LYD2010;

import java.util.*;
public class Solution {

    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
	TreeSet<Integer>list1;
	TreeSet<Integer>list2;
	
	int b1[][]=new int[4][4];
	int b2[][]=new int[4][4];
	
	int T=s.nextInt();
	int l,k;
	int counter=1;
	while(counter<=T){
		l=s.nextInt();
		for(int i=0;i<4;++i){
			for(int j=0;j<4;++j){
				b1[i][j]=s.nextInt();
			}
		}
		
		k=s.nextInt();
		for(int i=0;i<4;++i){
			for(int j=0;j<4;++j){
				b2[i][j]=s.nextInt();
			}
		}
		
		//list1
		list1=new TreeSet<Integer>();
		for(int i=0;i<4;++i){
			list1.add(b1[l-1][i]);
		}
		
		//list2
				list2=new TreeSet<Integer>();
				for(int i=0;i<4;++i){
					list2.add(b2[k-1][i]);
				}
		list1.retainAll(list2);
		if(list1.size()==1){
			int ans=0;
			for (int tmp : list1) {
				ans=tmp;
			}
			System.out.println("Case #"+counter+": "+ ans);
		}
		else if(list1.size()==0){
			System.out.println("Case #"+counter+": Volunteer cheated!" );
		}
		else if(list1.size()>1){
			System.out.println("Case #"+counter+": Bad magician!" );
		}
		++counter;
	}

    }
}
