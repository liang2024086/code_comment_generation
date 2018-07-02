package methodEmbedding.Magic_Trick.S.LYD91;

import java.io.*;
import java.util.*;
public class magic {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("A-small-attempt0.in");
		BufferedReader br = new BufferedReader(fr);
		int numTests = Integer.parseInt(br.readLine());
		for(int n=0;n<numTests;n++){
			int firstChoice=Integer.parseInt(br.readLine());
			String [] row1a=br.readLine().split(" ");
			String [] row1b=br.readLine().split(" ");
			String [] row1c=br.readLine().split(" ");
			String [] row1d=br.readLine().split(" ");
			int[][] rows1=new int [4][4];
			for(int x=0;x<4;x++){
				rows1[0][x]=Integer.parseInt(row1a[x]);
				rows1[1][x]=Integer.parseInt(row1b[x]);
				rows1[2][x]=Integer.parseInt(row1c[x]);
				rows1[3][x]=Integer.parseInt(row1d[x]);
			}
			int secondChoice=Integer.parseInt(br.readLine());
			String [] row2a=br.readLine().split(" ");
			String [] row2b=br.readLine().split(" ");
			String [] row2c=br.readLine().split(" ");
			String [] row2d=br.readLine().split(" ");
			int[][] rows2=new int [4][4];
			for(int x=0;x<4;x++){
				rows2[0][x]=Integer.parseInt(row2a[x]);
				rows2[1][x]=Integer.parseInt(row2b[x]);
				rows2[2][x]=Integer.parseInt(row2c[x]);
				rows2[3][x]=Integer.parseInt(row2d[x]);
			}
			ArrayList nums = new ArrayList();
			for(int x=0;x<4;x++){
				for(int y=0;y<4;y++){
					if(rows1[firstChoice-1][x]==rows2[secondChoice-1][y]){
						nums.add(rows1[firstChoice-1][x]);
					}
				}
			}
			if(nums.size()==1){
				System.out.println("Case #"+(n+1)+": "+nums.get(0));
			}
			else if(nums.size()>1){
				System.out.println("Case #"+(n+1)+": Bad magician!");
			}
			else
				System.out.println("Case #"+(n+1)+": Volunteer cheated!");
		}
	}

}
