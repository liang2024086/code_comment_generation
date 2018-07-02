package methodEmbedding.Counting_Sheep.S.LYD1156;


import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author jestinmyladiyil
 * 
 */
public class CountingSheep {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int testCase = scanner.nextInt();
    String result = "";
    for (int count = 1; count <= testCase; count++) {
      long counter = 1;
      long inputNumber = scanner.nextInt();
      if(inputNumber==0){
        System.out.println("Case #"+count+": "+"INSOMNIA");
        continue;
      }
      Set<String> digits = new TreeSet<String>();
      while (digits.size()<10) {
        result = String.valueOf(counter * inputNumber);
        String[] digitArray = result.trim().split("");
        Collections.addAll(digits, digitArray);
        ++counter;
        digits.remove("");
      }
      System.out.println("Case #"+count+": "+result);
    }
  }
}
