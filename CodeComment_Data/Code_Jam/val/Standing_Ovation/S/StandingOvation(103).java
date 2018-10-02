package methodEmbedding.Standing_Ovation.S.LYD1232;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StandingOvation {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File(StandingOvation.class.getClassLoader().getResource("test.txt").getFile()));
		int T = Integer.parseInt(in.nextLine());
		String line = null;
		String[] array = null;
		for(int i=0; i<T; i++) {
			line = in.nextLine();
			array = line.split(" ");
			System.out.println(array[1].length() - array[1].replace("0", "").length());
		}
		in.close();
	}
}
