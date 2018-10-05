package methodEmbedding.Speaking_in_Tongues.S.LYD40;

import java.util.Scanner;

public class Main
{

  public static void main(String[] args)
  {//-97
    char[] letters = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j','p', 'f', 'm', 'a', 'q'};
    Scanner in = new Scanner(System.in);
    Integer numCases = Integer.parseInt(in.nextLine());
    for (int k = 0; k < numCases; k++)
    {
      String word = in.nextLine();
      String newWord = "";
      for (int i = 0; i < word.length(); i++)
      {
	if (word.charAt(i) == ' ')
	  newWord += " ";
	else
	  newWord += letters[word.charAt(i)-97];
      }
      System.out.println("Case #"+(k+1)+": "+newWord);
    }
  }

}
