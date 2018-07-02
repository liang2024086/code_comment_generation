package methodEmbedding.Revenge_of_the_Pancakes.S.LYD489;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author jestinmyladiyil
 * 
 */
public class RevengeOfPancake {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Pattern patern = Pattern.compile("(\\+)|(\\-+)");
    int testCase = scanner.nextInt();
    for (int count = 1; count <= testCase; count++) {
      int result = 0;
      String input = scanner.next();
      Matcher match = patern.matcher(input);
      if (match.find() && match.group().contains("-")) {
        result++;
      }
      while (match.find()) {
        if (match.group().contains("-")) {
          result += 2;
        }
      }
      System.out.println("Case #" + count + ": " + result);
    }
  }
}
