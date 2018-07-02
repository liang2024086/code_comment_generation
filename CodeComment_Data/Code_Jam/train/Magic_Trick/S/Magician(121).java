package methodEmbedding.Magic_Trick.S.LYD790;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class Magician {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new File("C:/Users/Sample/Desktop/Code JAM 2014/in.txt"));
		PrintWriter out = new PrintWriter(new FileWriter("C:/Users/Sample/Desktop/Code JAM 2014/out.txt"));  


		int t;
		t= in.nextInt();

		for(int k=1;k<=t;k++){
			Integer arr1[][] = new Integer[5][5];
			Integer arr2[][] = new Integer[5][5];
			Integer a[]= new Integer[4];
			Integer b[]= new Integer[4];
			int r1,r2;
			
			r1 = in.nextInt() -1 ;
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					arr1[i][j]=in.nextInt();
				}
			}
			
			for (int i = 0; i < 4; i++) {
				a[i] = arr1[r1][i];
			}
			
			r2 = in.nextInt() -1 ;
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					arr2[i][j]=in.nextInt();
				}
			}
			
			for (int i = 0; i < 4; i++) {
				b[i] = arr2[r2][i];
			}

			Set<Integer> s1 = new HashSet<Integer>(Arrays.asList(a));
			Set<Integer> s2 = new HashSet<Integer>(Arrays.asList(b));
			s1.retainAll(s2);
			
			
		
			
			if(s1.size()==1)
				out.println("Case #"+k+": "+s1.toArray()[0]);
			else if(s1.size()==0)
				out.println("Case #"+k+": Volunteer cheated!");
			else
				out.println("Case #"+k+": Bad magician!");
		}

		out.close();
	}

}
