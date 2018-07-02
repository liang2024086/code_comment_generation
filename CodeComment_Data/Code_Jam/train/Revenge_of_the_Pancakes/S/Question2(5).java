package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1079;


import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question2 {
	private static String path = "C:\\Users\\Ong Keng Chai\\Documents\\property\\codeJam\\src\\code\\jam\\";
	
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(new File(path + "input.txt"));
		PrintWriter out = new PrintWriter(new File(path + "output.txt"));
		
		int caseCount = in.nextInt();
		in.nextLine();
		for (int caseInstance = 1; caseInstance <= caseCount; caseInstance++) {
			System.out.println("======== case " + caseInstance);
			String line = in.nextLine();
			
			int count = 0;
			char currCh = '\0';
			for (int i = 0; i < line.length(); i++) {
				char ch = line.charAt(i);
				if (ch != currCh) {
					currCh = ch;
					count++;
				}
			}
			if (currCh == '+') {
				count --;
			}
			
			out.println("Case #" + caseInstance + ": " + count);
		}
		in.close();
		out.close();
	}
}
