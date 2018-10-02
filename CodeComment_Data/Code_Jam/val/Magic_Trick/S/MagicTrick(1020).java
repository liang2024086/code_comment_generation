package methodEmbedding.Magic_Trick.S.LYD248;

import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MagicTrick {
	private static File f=new File("magic_trick_output.txt");
	public static void main(String args[]) throws Exception {
		FileReader fr = new FileReader("A-small-attempt0.in");
		Scanner in = new Scanner(fr);
		PrintWriter writer=new PrintWriter(f);
		//Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();
		for (int tc = 1; tc <= testcases; tc++) {
			int grid1[][] = new int[4][4];
			int grid2[][] = new int[4][4];
			int guess1=in.nextInt();
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					grid1[i][j]=in.nextInt();
				}
			}
			int guess2=in.nextInt();
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					grid2[i][j]=in.nextInt();
				}
			}
			//HashSet<Integer>  inter=new HashSet<Integer>();
		ArrayList<Integer> inter=new ArrayList<Integer>();
		for(int i=0;i<4;i++)
			for(int j=0;j<4;j++){
				if(grid1[guess1-1][i]==grid2[guess2-1][j])
					inter.add(grid2[guess2-1][j]);
			}
		if(inter.size()==0)
			//System.out.printf("Case #%d: Volunteer cheated!\n",tc);
			writer.printf("Case #%d: Volunteer cheated!\n",tc);
		else
			if(inter.size()>1)
				//System.out.printf("Case #%d: Bad magician!\n",tc);
				writer.printf("Case #%d: Bad magician!\n",tc);
			else
				//System.out.printf("Case #%d: %d\n",tc,inter.get(0));
			writer.printf("Case #%d: %d\n",tc,inter.get(0));
		}
		writer.close();
	}
}
