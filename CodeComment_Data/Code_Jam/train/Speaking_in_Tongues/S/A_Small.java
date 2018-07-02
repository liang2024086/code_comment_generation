package methodEmbedding.Speaking_in_Tongues.S.LYD493;

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;

public class A_Small {

    static String[] code = {"y", "h", "e", "s", "o", "c", "v", "x", "d",
		     "u", "i", "g", "l", "b", "k", "r", "z", "t",
		     "n", "w", "j", "p", "f", "m", "a", "q", " "};
    static String base = "abcdefghijklmnopqrstuvwxyz ";
    
    public static void main(String[] args) {
	try {
	    FileWriter writer = new FileWriter("A-small-attempt.out");
	    BufferedWriter out = new BufferedWriter(writer);
	    String current, result;
	    result = "";
	    Scanner sc = new Scanner(new File("A-small-attempt1.in"));
	    int x = Integer.parseInt(sc.nextLine());
	    for (int k = 0; k < x; k++) {
		result = "Case #" + (k+1) + ": ";
		current = sc.nextLine();
		for (int i = 0; i < current.length(); i++) {
		    int y = base.indexOf(current.charAt(i));
		    result = result + code[y];
		}
		out.write(result);
		out.newLine();
	    }
	    out.close();
	} catch (Exception e) {
	    System.out.println("error");
	}
    }

}
