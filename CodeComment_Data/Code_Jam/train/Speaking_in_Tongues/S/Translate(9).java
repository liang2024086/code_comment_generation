package methodEmbedding.Speaking_in_Tongues.S.LYD1344;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
/**
 *
 * @author Antonio Lievano
 */
public class Translate {
    public static void main (String[]Args) throws FileNotFoundException {
    FileReader reader = new FileReader("C:\\Users\\Antonio Lievano\\Desktop\\A-small-attempt3.in");
    Scanner in = new Scanner(reader);
    int cases = Integer.parseInt(in.nextLine());
    for (int i = 0; i<cases; i++) {
    System.out.print("Case #" + (i+1) + ": ");
    String line = in.nextLine();
    for (int j = 0; j<line.length(); j++){
    String temp = line.substring(j,j+1);
    if (temp.equalsIgnoreCase("y"))
        System.out.print("a");
    if (temp.equalsIgnoreCase("a"))
        System.out.print("y");
    if (temp.equalsIgnoreCase("e"))
        System.out.print("o");
    if (temp.equalsIgnoreCase("q"))
        System.out.print("z");
    if (temp.equalsIgnoreCase("j"))
        System.out.print("u");
    if (temp.equalsIgnoreCase("p"))
        System.out.print("r");
    if (temp.equalsIgnoreCase("m"))
        System.out.print("l");
    if (temp.equalsIgnoreCase("s"))
        System.out.print("n");
    if (temp.equalsIgnoreCase("l"))
        System.out.print("g");
    if (temp.equalsIgnoreCase("c"))
        System.out.print("e");
    if (temp.equalsIgnoreCase(" "))
        System.out.print(" ");
    if (temp.equalsIgnoreCase("k"))
        System.out.print("i");
    if (temp.equalsIgnoreCase("d"))
        System.out.print("s");
    if (temp.equalsIgnoreCase("x"))
        System.out.print("m");
    if (temp.equalsIgnoreCase("v"))
        System.out.print("p");
    if (temp.equalsIgnoreCase("n"))
        System.out.print("b");
    if (temp.equalsIgnoreCase("r"))
        System.out.print("t");
    if (temp.equalsIgnoreCase("i"))
        System.out.print("d");
    if (temp.equalsIgnoreCase("b"))
        System.out.print("h");
    if (temp.equalsIgnoreCase("t"))
        System.out.print("w");
    if (temp.equalsIgnoreCase("h"))
        System.out.print("x");
    if (temp.equalsIgnoreCase("f"))
        System.out.print("c");
    if (temp.equalsIgnoreCase("w"))
        System.out.print("f");
    if (temp.equalsIgnoreCase("o"))
        System.out.print("k");
    if (temp.equalsIgnoreCase("g"))
        System.out.print("v");
    if (temp.equalsIgnoreCase("u"))
        System.out.print("j");
    if (temp.equalsIgnoreCase("z"))
        System.out.print("q");
    }
    System.out.println();
    }
}
}
