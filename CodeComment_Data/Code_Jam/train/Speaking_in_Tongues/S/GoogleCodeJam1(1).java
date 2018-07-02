package methodEmbedding.Speaking_in_Tongues.S.LYD1030;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * Google Code Jam 2012, Speaking in Tongues
 * @author matt1618
 */
public class GoogleCodeJam1 {
   
    public static void main(String[] args) {
        
      try{          
          FileInputStream fstream = new FileInputStream("input.in");
          
          DataInputStream in = new DataInputStream(fstream);
          BufferedReader br = new BufferedReader(new InputStreamReader(in));
          String line = br.readLine();
          int lines = new Integer(line);
          
          for(int i = 1; i <= lines; i++){          
              if((line = br.readLine()) == null){
                  System.err.println("Error: Empty line ?");
                  break;
              }
              System.out.print("Case #"+ i +": ");
              int length = line.length(); 
              if(length > 100) length = 100;
              for(int j = 0; j < length; j++){
                   switch(line.charAt(j)){                   
                       case ' ': System.out.print(' '); break;
                       case 'a': System.out.print('y'); break;
                       case 'b': System.out.print('h'); break;
                       case 'c': System.out.print('e'); break;
                       case 'd': System.out.print('s'); break;
                       case 'e': System.out.print('o'); break;
                       case 'f': System.out.print('c'); break;
                       case 'g': System.out.print('v'); break;
                       case 'h': System.out.print('x'); break;
                       case 'i': System.out.print('d'); break;
                       case 'j': System.out.print('u'); break;
                       case 'k': System.out.print('i'); break;
                       case 'l': System.out.print('g'); break;
                       case 'm': System.out.print('l'); break;
                       case 'n': System.out.print('b'); break;
                       case 'o': System.out.print('k'); break;
                       case 'p': System.out.print('r'); break;
                       case 'q': System.out.print('z'); break;
                       case 'r': System.out.print('t'); break;
                       case 's': System.out.print('n'); break;
                       case 't': System.out.print('w'); break;
                       case 'u': System.out.print('j'); break;
                       case 'v': System.out.print('p'); break;
                       case 'w': System.out.print('f'); break;
                       case 'x': System.out.print('m'); break;
                       case 'y': System.out.print('a'); break;
                       case 'z': System.out.print('q');  break;                      
                       default: System.out.print('?'); break;
                   }
              }   
              System.out.println("");
          }
          
          in.close();
      }catch (Exception e){
          System.err.println("Error: " + e.getMessage());
      }
    }
}
