package methodEmbedding.Magic_Trick.S.LYD14;

import java.util.*;
public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int k=1;k<=T;k++){
			int n = in.nextInt();
			int[][] arr = new int[4][4];
			HashSet<Integer> map = new HashSet<Integer>();
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					arr[i][j]=in.nextInt();
					
					if(i+1==n){
						map.add(arr[i][j]);
					}
				}
			}
			
			n = in.nextInt();
			int tot=0;
			int val=0;
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					arr[i][j]=in.nextInt();
					
					if(i+1==n){
						if(map.contains(arr[i][j]))	 {
							tot++;
							val=arr[i][j];
						}
					}
				}
			}
			
			if(tot==0){
				System.out.println("Case #"+k+": Volunteer cheated!");
			}
			else if(tot>1){
				System.out.println("Case #"+k+": Bad magician!");
			}
			else{
				System.out.println("Case #"+k+": "+val);
			}
		}
	}

}
