package methodEmbedding.Counting_Sheep.S.LYD143;

import java.util.*;
import java.io.*;
public class Main {
  private static Scanner in;

public static void main(String[] args) {
	File f = new File ("C:\\Users\\dev\\workspace\\GoogleJamDream\\src\\A-small-attempt0.in");
    try {
		in = new Scanner(f);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    File fileoutput = new File("C:\\Users\\dev\\workspace\\GoogleJamDream\\src\\small_output.txt");
    FileWriter writer = null;
    int t = in.nextInt();
    System.out.println("T: "+t);
    Calcul c =new Calcul();
    try {
        writer = new FileWriter(fileoutput);
        for (int i = 1; i <= t; ++i) {
            int n = in.nextInt();
            long calculChiffre = c.calculChiffre(n);
            if (calculChiffre == -1) {
                writer.write("Case #" + i + ": INSOMNIA\n");
            } else {
                writer.write("Case #" + i + ": " + calculChiffre+"\n");
            }
            System.out.println("Case #" + i + ": " + calculChiffre);
          }
    } catch (IOException e) {
        e.printStackTrace(); // I'd rather declare method with throws IOException and omit this catch.
    } finally {
        if (writer != null) try { writer.close(); } catch (IOException ignore) {}
    }
  }
}
