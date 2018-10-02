package methodEmbedding.Revenge_of_the_Pancakes.S.LYD494;

import java.util.*;
import java.io.*;

public class Main {
  private static Scanner in;

public static void main(String[] args) {
	File f = new File ("C:\\Users\\dev\\workspace\\GoogleJamDream\\src\\B-small-attempt0.in");
    try {
		in = new Scanner(f);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    File fileoutput = new File("C:\\Users\\dev\\workspace\\GoogleJamDream\\src\\B-small-attempt0.out");
    FileWriter writer = null;
    int t = in.nextInt();
    System.out.println("T: "+t);
    try {
        writer = new FileWriter(fileoutput);
        for (int i = 1; i <= t; ++i) {
            String n = in.next();
            Cookie c =new Cookie(n);
            writer.write("Case #" + i + ": " + c.calculNbrPas());
            if(i+1<=t) {
            	writer.write("\n");
            }
            System.out.println("Case #" + i + ": " + c.calculNbrPas());
          }
    } catch (IOException e) {
        e.printStackTrace(); // I'd rather declare method with throws IOException and omit this catch.
    } finally {
        if (writer != null) try { writer.close(); } catch (IOException ignore) {}
    }
  }
}
