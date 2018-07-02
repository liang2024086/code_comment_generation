package methodEmbedding.Magic_Trick.S.LYD1566;

import java.io.*;
import java.util.Scanner;

public class Magic {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
	System.setIn(new FileInputStream("test.in"));
	// System.setOut(new PrintStream("file.out"));
	Scanner in = new Scanner(System.in);
	int z = in.nextInt();
	for (int i = 1; i <= z; i++) {
	    int answer1 = in.nextInt();
	    int answer2;
	    int[][] set1 = new int[4][4];
	    int[][] set2 = new int[4][4];
	    for (int y = 0; y < 4; y++) {
		for (int x = 0; x < 4; x++) {
		    set1[y][x] = in.nextInt();
		}
	    }
	    int[] set3 = set1[answer1-1];
	    
	    answer2 = in.nextInt();
	    for (int y = 0; y < 4; y++) {
		for (int x = 0; x < 4; x++) {
		    set2[y][x] = in.nextInt();
		}
	    }
	    int[] set4 = set2[answer2-1];

	    int solution = 0;
	    for (int a : set3) {
		for (int b : set4) {
		    if (a == b){
			if (solution == 0)
			    solution = a;
			else
			    solution = -1;
		    }
		}
	    }
	    System.out.print("Case #" + i + ": ");
	    if(solution == -1)
		System.out.println("Bad magician!");
	    else if(solution == 0)
		System.out.println("Volunteer cheated!");
	    else
		System.out.println(solution);
		
	}
    }
}
