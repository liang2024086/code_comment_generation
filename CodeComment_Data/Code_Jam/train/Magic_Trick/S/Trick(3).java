package methodEmbedding.Magic_Trick.S.LYD773;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Trick {
  static int answer = 0;
  public static void main(String[] args) throws FileNotFoundException {
    Scanner scanner = new Scanner(new File("A-small-attempt0.in"));
    int n = scanner.nextInt();
    
    PrintWriter writer = new PrintWriter("output.txt");
    for (int i = 0; i < n; i++) {
      writer.print("Case #" + (i + 1) + ": ");
      int line1 = scanner.nextInt();
      scanner.nextLine();
      for (int j = 1; j < line1; j++) {
        scanner.nextLine();
      }
      Set<Integer> set = new HashSet<Integer>();
      for (int j = 0; j < 4; j++) {
        set.add(scanner.nextInt());
      }
      scanner.nextLine();
      for (int j = line1 + 1; j <= 4; j++) {
        scanner.nextLine();
      }
      
      int line2 = scanner.nextInt();
      scanner.nextLine();
      for (int j = 1; j < line2; j++) {
        scanner.nextLine();
      }
      int count = 0;
      int number = -1;
      for (int j = 0; j < 4; j++) {
        number = scanner.nextInt();
        if (set.contains(number)) {
          answer = number;
          count++;
        }
      }
      scanner.nextLine();
      if (count == 1) {
        writer.println(answer);
      }
      if (count == 0) {
        writer.println("Volunteer cheated!");
      }
      if (count > 1) {
        writer.println("Bad magician!");
      }
      
      for (int j = line2 + 1; j <= 4; j++) {
        scanner.nextLine();
      }
    }
    scanner.close();
    writer.close();
  }

}
