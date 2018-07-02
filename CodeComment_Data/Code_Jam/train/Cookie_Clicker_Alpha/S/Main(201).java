package methodEmbedding.Cookie_Clicker_Alpha.S.LYD116;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;


public class Main {
	// debug switch
	public static final boolean debug = false;
	
	// target filename - will read fname.in, and output to fname.out
	public static final String fname = "files\\competition\\B-small-attempt1";

	
	public static void main(String[] args) {
		
		// program Object, change class for relevant program
		Cookie prog = new Cookie();
		
		try (BufferedReader br = new BufferedReader(new FileReader(fname+".in"))) {
			 
			PrintWriter pw = new PrintWriter(fname+".out");
			int testCases = Integer.parseInt(br.readLine());
			
			for (int i = 1;i <= testCases;i++) {
				pw.print("Case #"+i+": ");
				if (debug) System.out.println("====Test case "+i+"====");
				prog.testCase(br,pw);
				pw.print("\n");
				pw.flush();
			}
			 
		} catch (Exception e) {
			e.printStackTrace();
		} 

		System.out.println("Done!");
	}

}
