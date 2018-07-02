package methodEmbedding.Magic_Trick.S.LYD2058;

import java.util.*;
public class Magic {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int chose[]=new int[T];
		for(int i=0;i<T;i++){
			int ans1 = scan.nextInt();
			int cardIn[][]=new int[4][4];
			for(int l=0;l<4;l++){
				for(int j=0;j<4;j++){
					cardIn[l][j]=scan.nextInt();
				}
			}
			int ans2 = scan.nextInt();
			int cardIn2[][]=new int[4][4];
			for(int l=0;l<4;l++){
				for(int j=0;j<4;j++){
					cardIn2[l][j]=scan.nextInt();
				}
			}	
			int found=0;
			for(int l=0;l<4;l++){
					for(int j=0;j<4;j++){
						if(cardIn[ans1-1][l]==cardIn2[ans2-1][j]){
							found++;
							chose[i]=cardIn2[ans2-1][j];
						}
					}
				}
			if(found>1){
				chose[i]=98;
			}
			if(found==0){
				chose[i]=99;
			}
		}
		for(int i=0;i<T;i++){
			if(i==T-1){
				if(chose[i]==98){
					System.out.print("Case #"+(i+1)+": Bad magician!");
				}
				else if(chose[i]==99){
					System.out.print("Case #"+(i+1)+": Volunteer cheated!");
				}
				else System.out.print("Case #"+(i+1)+": "+chose[i]);
				
			}
			else{
		if(chose[i]==98){
			System.out.println("Case #"+(i+1)+": Bad magician!");
		}
		else if(chose[i]==99){
			System.out.println("Case #"+(i+1)+": Volunteer cheated!");
		}
		else System.out.println("Case #"+(i+1)+": "+chose[i]);
		}}
	}
	
}
