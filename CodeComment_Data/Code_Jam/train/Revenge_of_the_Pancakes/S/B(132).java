package methodEmbedding.Revenge_of_the_Pancakes.S.LYD660;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class B {

		private static String path = "C:\\Users\\m.omodei\\Downloads\\Materiale Google\\Code Jam 2016\\";
		private static String file = "small-attempt0"; // "Test"; //"large-practice"; // 
		
		public static void main(String[] args) throws FileNotFoundException {
			
			long start = System.nanoTime();
			Scanner in = new Scanner(new File(path + B.class.getSimpleName() + "-" + file + ".in"));
			PrintWriter out = new PrintWriter(path + B.class.getSimpleName() + "-" + file + ".out");
			int T = in.nextInt();
			in.nextLine();
			for(int i = 1; i <= T; i++) {
				String line = in.nextLine();
				int move = 0, flip = 0;
				boolean foundP = false;
				for(char c : line.toCharArray()) {
					if(c == '+')
						foundP = true;
					else if(c == '-' && foundP) {
						flip++;
						foundP = false;
					}
				}
				move = 2 * flip + (line.charAt(0) == '-' ? 1 : 0);
				System.out.println("Case #" + i + ": " + move);
				out.println("Case #" + i + ": " + move);
		    }
		    in.close();
		    out.close();
		    System.out.println("Elapsed time: " + (System.nanoTime() - start) / 1000000000.0 + " seconds");

		}

	}
