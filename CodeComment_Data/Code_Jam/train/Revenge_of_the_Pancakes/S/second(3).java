package methodEmbedding.Revenge_of_the_Pancakes.S.LYD647;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Second
{
  public static void main (String[] args) throws java.lang.Exception
  {    
    LinkedList<Character> queueOriginal = new LinkedList<Character>();
    LinkedList<Character> queueCopy = new LinkedList<Character>();

    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int size = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
    in.nextLine();
    for (int i = 0; i < size; ++i) {
      String line = in.nextLine();
      
      for (int j = 0; j < line.length(); j++) {
        queueOriginal.addLast(line.charAt(j));
      }

      int limit = queueOriginal.size();
      boolean bandera = false;
      int contador = 0;
      
      while(limit != 0) {
        for(int k = 0; k < limit; k++) {
          queueCopy.push(queueOriginal.pop());
        }

        char element = queueCopy.pop();
        while (element == '+') {
          queueOriginal.push(element);
          limit--;
          if(queueCopy.size() == 0) {
            break;
          }
          element = queueCopy.pop();
                   
        }

        if (element == '-') {
          contador++;
          queueOriginal.push('+');
          limit--;
          for(int k = 0; k < limit; k++) {
            element = queueCopy.pop();
            if(element == '+') {
              queueOriginal.push('-');
            } else {
              queueOriginal.push('+');
            }
          }
        }
      }
      //clean queues
      while (queueOriginal.size() != 0) {
        queueOriginal.pop();
      }
      while (queueCopy.size() != 0) {
        queueCopy.pop();
      }
      System.out.printf("Case #%d: %d%n", i + 1, contador);
    }
  }
}
