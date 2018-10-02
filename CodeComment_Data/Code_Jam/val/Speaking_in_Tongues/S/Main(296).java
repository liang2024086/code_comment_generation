package methodEmbedding.Speaking_in_Tongues.S.LYD1234;


import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main
{
  static Map<Character, Character> mappings;
  
  public static void main(final String[] args) throws Exception
  {
    mappings = new HashMap<>();
    mappings.put('a','y');
    mappings.put('b','h');
    mappings.put('c','e');
    mappings.put('d','s');
    mappings.put('e','o');
    mappings.put('f','c');
    mappings.put('g','v');
    mappings.put('h','x');
    mappings.put('i','d');
    mappings.put('j','u');
    mappings.put('k','i');
    mappings.put('l','g');
    mappings.put('m','l');
    mappings.put('n','b');
    mappings.put('o','k');
    mappings.put('p','r');
    mappings.put('q','z');
    mappings.put('r','t');
    mappings.put('s','n');
    mappings.put('t','w');
    mappings.put('u','j');
    mappings.put('v','p');
    mappings.put('w','f');
    mappings.put('x','m');
    mappings.put('y','a');
    mappings.put('z','q');
    mappings.put(' ',' ');
    
    Scanner s = new Scanner(new File("D:\\unsorted\\a.in"));
    int T = s.nextInt();
    s.nextLine();
    
    for (int t = 0; t < T; t++)
    {
      String input = s.nextLine();
      String output = "";
      for (int i = 0; i < input.length(); i++)
        output += mappings.get(input.charAt(i));
      System.out.println("Case #"+(t+1)+": "+output);
    }
  }
}
