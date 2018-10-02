package methodEmbedding.Standing_Ovation.S.LYD2075;


import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.util.List;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
/**
 * Created by santosh on 11/04/15.
 */
public class StandingOvation {

    private int friends, audience;

    public static void main( String[] args ) throws Exception {
      if ( args.length == 1 ) {
        String filename = args[0];
        File f = new File(filename);
        if( f.exists() && !f.isDirectory() ) {
          //System.out.println("File found");
          FileInputStream file = new FileInputStream(f);
          BufferedInputStream buffer = new BufferedInputStream(file);
          DataInputStream data = new DataInputStream(buffer);
          FileWriter output = new FileWriter("output");
          BufferedWriter outBuffer = new BufferedWriter(output);

          int lines = 0;
          int Case = 0;

          while ( data.available() != 0 ) {
            if (lines == 0 ) {
              lines = Integer.parseInt(data.readLine());
              System.out.println("Lines : " + lines);
            }
            else {
              //Resolve each case ( from line to Integer list)
              String line= data.readLine();
              //int audience = line.nextInt();
              List<Integer> numbers = new ArrayList<Integer>();
              int count = 0;
              int size;

              for (int i = 0; i < line.length(); i++) {
                int number = (int)line.charAt(i);

                if ( count == 0 ) {
                  size = number;
                }
                else if (count > 1) {
                  numbers.add(number-48);
                }
                count += 1;
              }
              //System.out.println(numbers.toString());
              // Check each case
              int needed = 0;
              int position = 0;
              count = 0;
              for (int people : numbers) {
                if (position > count+needed) {
                  needed += 1;
                }
                //int x = count+needed;
                //System.out.println(position + "\t" + people + "\t" + x);
                count += people;
                position += 1;
              }
              System.out.println("Case #"+Case + ": " + needed);
              String out = "Case #"+Case + ": " + needed+"\n";
              outBuffer.write(out);
            }
            Case += 1;
          }
          outBuffer.close();
        }
        else {
          System.out.println("No such file exists");
        }

      }
      else if ( args.length == 0 ){
        System.out.println("No input file mentioned.");
      }
      else {
        System.out.println("Invalid Arguments, Enter a valid input file name");
      }
    }
}
