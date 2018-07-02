package methodEmbedding.Speaking_in_Tongues.S.LYD183;

import java.util.Scanner;

public class Google1 {
  public static void main(String[] args) {
    String input[] = { "our language is impossible to understandzq", "there are twenty six factorial possibilities", "so it is okay if you want to just give up" };
    String output[] = { "ejp mysljylc kd kxveddknmc re jsicpdrysiqz", "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd", "de kr kd eoya kw aej tysr re ujdr lkgc jv" };
    String aToZ = "abcdefghijklmnopqrstuvwxyz";
    String aToZMap[] = new String[26];
    int aToZnum[] = new int[26];
    int count, inputIndex;
    boolean found = false;
    for (int i = 0; i < input.length; i++) {
      for (int j = 0; j < input[i].length(); j++) {
        if (input[i].substring(j, j + 1).equals(" "));
        else {
          found = false;
          count = 0;
          inputIndex = aToZ.indexOf(input[i].substring(j, j + 1));
          while (found == false) {
            if (aToZ.substring((count + inputIndex) % 26, ((count + inputIndex) % 26) + 1).equals(output[i].substring(j, j + 1))) {
              found = true;
              aToZMap[inputIndex] = output[i].substring(j, j + 1);
              aToZnum[inputIndex] = count;
            }
            else {
              count++;
            }
          }
        }
      }
    }
    Scanner kb = new Scanner(System.in);
    String input2;
    int num = kb.nextInt();
    String throwblank = kb.nextLine();
    for (int i = 0; i < num; i++) {
      input2 = kb.nextLine();
      System.out.print("Case #" + (i+1) + ": ");
      for (int j = 0; j < input2.length(); j++) {
        if (!input2.substring(j, j + 1).equals(" ")) {
          for (int k = 0; k < 26; k++) {
            if (aToZMap[k].equals(input2.substring(j, j + 1))) {
              System.out.print(aToZ.substring(k, k + 1));
              break;
            }
          }
        }
        else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}

