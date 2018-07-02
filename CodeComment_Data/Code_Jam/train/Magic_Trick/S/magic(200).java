package methodEmbedding.Magic_Trick.S.LYD1966;

import java.io.File;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;


public class magic {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(new File("cards.in"));
		PrintWriter out = new PrintWriter(new File("cards.out"));
		int T = sc.nextInt();
		for(int t=1;t<=T;t++){
			int rowone = sc.nextInt()-1;
			TreeSet<Integer> TS = new TreeSet<Integer>();
			TreeSet<Integer> TS2 = new TreeSet<Integer>();
			int pos = 0;
			int[][] grid = new int[4][4];
			for(int a=0;a<4;a++){
				for(int b=0;b<4;b++){
					grid[a][b]=sc.nextInt();
					if(a==rowone)TS.add(grid[a][b]);
				}
			}
			int rowtwo = sc.nextInt()-1;
			grid = new int[4][4];
			for(int a=0;a<4;a++){
				for(int b=0;b<4;b++){
					grid[a][b]=sc.nextInt();
				}
			}
			
			for(int a=0;a<4;a++){
				TS2.add(grid[rowtwo][a]);
			}
			LinkedList<Integer> LL = new LinkedList<Integer>();
			for(Integer x : TS){
				for(Integer y : TS2){
					if(x==y)LL.add(y);
				}
			}
			String s = "Bad magician!";
			if(LL.size()==0) s = "Volunteer cheated!";
			if(LL.size()==1) s = ""+LL.poll();
			out.printf("Case #%d: %s%n",t,s);
		}
		out.close();
		
		
	}

}
