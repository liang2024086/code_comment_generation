package methodEmbedding.Counting_Sheep.S.LYD1257;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Sheep {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new FileReader("D:\\tools\\A-small-attempt2.in"));
		PrintWriter pw = new PrintWriter(new FileWriter("D:\\tools\\A-small-attempt.out"));
		Set<String> test = new HashSet<String>();
		Set<String> resSet = new HashSet<String>();
		for (int i = 0; i < 10; i++) {
			test.add(String.valueOf(i));
		}
		int caseCnt = sc.nextInt();
		Long resultat=0L;
		String st =null;
		for (int caseNum = 1; caseNum <= caseCnt; caseNum++) {
			long X = sc.nextInt();
			boolean stop = false;
			long i = 1;
			if(X==0){
				st="INSOMNIA";
				stop = true;

			}

			while (!stop) {
				
				resultat = i * X;
			//	System.out.println("resultat "+resultat);
				
				 st = String.valueOf(resultat);

				for (int j = 0; j < st.length(); j++) {
					resSet.add(st.substring(j, j+1));
				}
				if (resSet.containsAll(test) || resultat>1000000) {
					stop = true;
					resSet.removeAll(test);
				} else {
					i++;
				}
			}			pw.println("Case #" + caseNum + ": " + st);

		}
		pw.flush();
		pw.close();
		sc.close();
	}

}
