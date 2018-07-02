package methodEmbedding.Speaking_in_Tongues.S.LYD1214;

// Skeleton program used for reading and outputing the results
// Part1 with alphabet

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class part1
{
  public static void main(String args[])
  {
    HashMap<Character,Character> ta = new HashMap<Character,Character>();
    
    ta.put('y','a');
    ta.put('n','b');
    ta.put('f','c');
    ta.put('i','d');
    ta.put('c','e');
    ta.put('w','f');
    ta.put('l','g');
    ta.put('b','h');
    ta.put('k','i');
    ta.put('u','j');
    ta.put('o','k');
    ta.put('m','l');
    ta.put('x','m');
    ta.put('s','n');
    ta.put('e','o');
    ta.put('v','p');
    ta.put('z','q');
    ta.put('p','r');
    ta.put('d','s');
    ta.put('r','t');
    ta.put('j','u');
    ta.put('g','v');
    ta.put('t','w');
    ta.put('h','x');
    ta.put('a','y');
    ta.put('q','z');
    ta.put(' ',' ');

    Scanner scanner = new Scanner(System.in);

    int number = scanner.nextInt();
    String[] array = new String[number];
    scanner.nextLine();
    for (int i = 0; i < number; i ++)
    {
      array[i] = scanner.nextLine();
    }



    for (int i = 0; i < number; i++)
    {
      char[] charArray = array[i].toCharArray();
      for (int k = 0; k < charArray.length; k++)
      {
	charArray[k] = ta.get(charArray[k]);
      }
      System.out.println("Case #" + (i + 1) + ": " + (new String(charArray)));
    }


  }


}
