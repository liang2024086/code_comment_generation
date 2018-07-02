package methodEmbedding.Magic_Trick.S.LYD2030;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class CodeJamQR2014 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filePath = "A-small-attempt0.in";
		Scanner in = new Scanner(new DataInputStream(new FileInputStream(new File(filePath))));
		FileWriter fw = new FileWriter("out.txt");
		int nt = in.nextInt();
		int a[][] = new int[4][4];
		int b[][] = new int[4][4];
		int cc = 0;
		while(cc++ < nt){
			int x = in.nextInt();
			for(int i = 0;i < 4;i ++)
				for(int j = 0;j < 4;j ++)
					a[i][j] = in.nextInt();
			int y = in.nextInt();
			for(int i = 0;i < 4;i ++)
				for(int j = 0;j < 4;j ++)
					b[i][j] = in.nextInt();
			x --;
			y --;
			int ans = -1;
			for(int i = 0;i < 4;i ++)
				for(int j = 0;j < 4;j ++)
				{
					if(a[x][i] == b[y][j]){
						if(ans == -1)ans = i;
						else if(ans >= 0)ans = 10;
					}
				}
			fw.write("Case #"+cc+": ");
			if(ans == -1)
				fw.write("Volunteer cheated!");
			else if(ans < 4){
				fw.write(Integer.toString(a[x][ans]));
				//System.out.println(a[x][ans]);
			}
			else
				fw.write("Bad magician!");
			fw.write("\n");
		}
		fw.close();
	}

}
