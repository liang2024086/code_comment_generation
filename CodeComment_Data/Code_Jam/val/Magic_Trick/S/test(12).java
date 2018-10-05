package methodEmbedding.Magic_Trick.S.LYD1031;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class test {
	private static Scanner in;
	private static PrintWriter pw;

	public static void main(String[] args) throws FileNotFoundException {

		int N;
		File fi = new File("src\\Qualification\\A-small.in");
		File fo = new File("src\\Qualification\\A-small.out");

		pw = new PrintWriter(fo);
		in = new Scanner(fi);

		List<Integer> L = new ArrayList<Integer>();
		List<Integer> L1 = new ArrayList<Integer>();

		int[][] tableau = new int[4][4];
		int[][] tableau1 = new int[4][4];

		N =in.nextInt();

		int i=0,j,a,b,n,k,aide,compteur=0,x = 0;
		while(i<N){
			compteur=0;
			a=in.nextInt();

			for(j=0;j<4;j++){
				for(k=0;k<4;k++){
					//pw.println(in.nextInt());
					aide=in.nextInt();
					tableau[j][k]=aide;
				}
			}

			b=in.nextInt();
			for(j=0;j<4;j++){
				for(k=0;k<4;k++){
					//pw.println(in.nextInt());
					aide=in.nextInt();
					tableau1[j][k]=aide;
				}
			}

			for(j=0;j<4;j++){
				L.add(tableau[a-1][j]);
				L1.add(tableau1[b-1][j]);
			}

			//pw.println(L+"  "+L1);

			for(j=0;j<4;j++){
				if(L.contains(L1.get(j))){
					x=L1.get(j);
					compteur++;
				}
			}
			n=i+1;
			if(compteur>1)
				pw.println("Case #"+n+": Bad magician!");

			else{
				if(compteur==0)
					pw.println("Case #"+n+": Volunteer cheated!");
				else{
					pw.println("Case #"+n+": "+x);
				}
			}
			L.clear();
			L1.clear();
			i++;
		}
		pw.close();
	}
}


