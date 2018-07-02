package methodEmbedding.Magic_Trick.S.LYD155;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class magictrick {

	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new FileReader("magictrick.in"));
		PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("magictrick.out")));
		StringTokenizer st;
		
		int trials=Integer.valueOf(f.readLine());
		for(int x=0;x<trials;x++){
			//Get row of first value
			int row1=Integer.valueOf(f.readLine())-1;
			//Store values of first box
			int[][] box1=new int[4][4];
			for(int y=0;y<4;y++){
				String currentRow=f.readLine();
				st=new StringTokenizer(currentRow);
				for(int z=0;z<4;z++){
					box1[y][z]=Integer.valueOf(st.nextToken());
				}
			}
			//Get row of second value
			int row2=Integer.valueOf(f.readLine())-1;
			//Store values of second box
			int[][] box2=new int[4][4];
			for(int y=0;y<4;y++){
				String currentRow=f.readLine();
				st=new StringTokenizer(currentRow);
				for(int z=0;z<4;z++){
					box2[y][z]=Integer.valueOf(st.nextToken());
				}
			}
			int[]firstPull=box1[row1];
			int[]secondPull=box2[row2];
			
			for(int i:firstPull){
				System.out.println("FIRST: "+i);
			}
			for(int i:secondPull){
				System.out.println("SECOND: "+i);
			}
			
			ArrayList<Integer> matching=new ArrayList<Integer>();
			for(int i1:firstPull){
				for(int i2:secondPull){
					if(i1==i2){
						matching.add(i1);
						System.out.println("FOUND"+i1);
					}
				}
			}
			//
			for(int a=0;a<4;a++){
				for(int b=0;b<4;b++){
					System.out.print(box1[a][b]+" ");
				}
				System.out.println();
			}
			//
			//
			for(int a=0;a<4;a++){
				for(int b=0;b<4;b++){
					System.out.print(box2[a][b]+" ");
				}
				System.out.println();
			}
			//
			if(matching.size()==0){
				out.println("Case #"+(x+1)+": Volunteer cheated!");
			}
			else if(matching.size()==1){
				out.println("Case #"+(x+1)+": "+matching.get(0));
			}
			else if(matching.size()>1){
				out.println("Case #"+(x+1)+": Bad magician!");
			}
			
		}
		f.close();
		out.close();
		System.exit(0);
	}

}
