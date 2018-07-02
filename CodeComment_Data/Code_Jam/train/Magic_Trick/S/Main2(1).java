package methodEmbedding.Magic_Trick.S.LYD526;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc=new Scanner(new File("src/input.txt"));
		int [][]grid1=new int[4][4];
		int [][]grid2=new int[4][4];
		
		int []ans=new int[4];
		
		
		int n=sc.nextInt();
		sc.nextLine();

		for(int i=0;i<n;i++){//outer most loop;n inputs
			for(int u=0;u<4;u++){
				ans[u]=111;
			}
			int c1=sc.nextInt();
			sc.nextLine();
			
			for(int x=0;x<4;x++){
				for(int y=0;y<4;y++){
					grid1[x][y]=sc.nextInt();
					//System.out.print(grid1[x][y]+" ");
				}//System.out.println();
			}
			
			
			int c2=sc.nextInt();
			sc.nextLine();
			
			for(int x=0;x<4;x++){
				for(int y=0;y<4;y++){
					grid2[x][y]=sc.nextInt();
					//System.out.print(grid2[x][y]+" ");
				}//System.out.println();
			}
			
			
			
			
			
			int x=0;
			for(int a=0;a<4;a++){
				for(int b=0;b<4;b++){
					if(grid1[c1-1][a]==grid2[c2-1][b]){
						ans[x]=grid1[c1-1][a];
						x++;
					}//else ans[x]=111;
				}//System.out.print(ans[i]+" ");
			}
			
			if(ans[0]==111){
				System.out.println("Case #"+(i+1)+": Volunteer cheated!");

			}
			else if(ans[1]==111){
				System.out.println("Case #"+(i+1)+": "+ans[0]);
			}
			else {
				System.out.println("Case #"+(i+1)+": Bad magician!");

			}

		}//outermost loop; for n
		
		
		
		
	}//main
}
