package methodEmbedding.Speaking_in_Tongues.S.LYD1418;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shakya
 */

import java.io.*;
public class CodeJamA {


 public static void main(String args[])
  {
  try{
  // Open the file that is the first
  // command line parameter
  FileInputStream fstream = new FileInputStream("textfile.txt");
  // Get the object of DataInputStream
  DataInputStream in = new DataInputStream(fstream);
  BufferedReader br = new BufferedReader(new InputStreamReader(in));
  FileWriter fstream2 = new FileWriter("out.txt");
  BufferedWriter out = new BufferedWriter(fstream2);
  
  String strLine;
  //Read File Line By Line
  int testcase=Integer.parseInt(br.readLine());
  int j=1;
  while ((strLine = br.readLine()) != null)   {
      out.write("Case #"+j+": ");
  // Print the content on the console
  for(int i=0;i<strLine.length();i++)
  {

        switch(strLine.charAt(i)){
            case 'a':
                out.write("y");
                break;

           case 'b':
               out.write("h");
               break;
               case 'c':
                  out.write("e");
                  break;

            case 'd':
                out.write("s");
                break;
            case 'e':
                
                out.write("o");
                break;

            case 'f':
                out.write("c");
                break;
            case 'g':
                out.write("v");
                break;
            case 'h':
                out.write("x");
                break;

            case 'i':
                out.write("d");
                break;
            case 'j':
                out.write("u");
                break;
            case 'k':
                out.write("i");
                break;
            case 'l':
                out.write("g");
                break;
            case 'm':
                out.write("l");
                break;
            case 'n':
                out.write("b");
                break;
            case 'o':
                out.write("k");
                break;
            case 'p':
                out.write("r");
                break;
            case 'q':
                out.write("z");
                break;
            case 'r':
                out.write("t");
                break;
            case 's':
                out.write("n");
                break;
            case 't':
                out.write("w");
                break;
            case 'u':
                out.write("j");
                break;
            case 'v':
                out.write("p");
                break;
            case 'w':
                    out.write("f");
                break;
            case 'x':
                out.write("m");
                break;
            case 'y':
                out.write("a");
                break;
            case 'z':
                out.write("q");
                break;

            default: out.write(" ");

        }




  }
      j++;
  out.write("\n");
  }
  //Close the input stream
  in.close();
  out.close();
    }catch (Exception e){//Catch exception if any
  System.err.println("Error: " + e.getMessage());
  }
  }
}



