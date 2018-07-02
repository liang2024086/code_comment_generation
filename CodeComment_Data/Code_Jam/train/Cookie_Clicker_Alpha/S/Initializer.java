package methodEmbedding.Cookie_Clicker_Alpha.S.LYD618;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

public class Initializer {

	public static void main(String[] args) {
		Scanner input = null;
		try {
			input = new Scanner(Initializer.class.getResourceAsStream("B-small-attempt0.in"));
		} catch (Exception e1) {
		}
		int cases = Integer.parseInt(input.nextLine());
		int count = 0;
		PrintWriter out = null;
		try {
		    out = new PrintWriter(new BufferedWriter(new FileWriter("output2", true)));
		}catch(Exception e){
			
		}

		while (input.hasNext()) {
			count++;
			String[] s = input.nextLine().split("\\s+");
			CookieCalculator c = new CookieCalculator(Float.parseFloat(s[1]), Float.parseFloat(s[2]),Float.parseFloat(s[0]));
			String a = "Case #" + count + ": "+c.calculate(2);
			out.println(a);
			System.out.println(a);
		}
		out.close();
	}
}
