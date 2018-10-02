package methodEmbedding.Speaking_in_Tongues.S.LYD663;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Suarabh Agarwal
 */
import java.io.*;
import java.util.Scanner;

public class Main
{
 public static void main(String args[])
  {
  try{
  // Open the file that is the first
  // command line parameter
  Scanner  scan1 = new Scanner(new FileReader("input"));
  Scanner  scan2 = new Scanner(new FileReader("output"));
  Scanner  scan3 = new Scanner(new FileReader("input1.txt"));
  PrintWriter out = new PrintWriter("output1.txt");
  String T = scan1.nextLine();
  System.out.println(T);
  int i=0;
  int x=0;
  int test_case = Integer.parseInt(T);
  char letters[] = new char[27];
  while(test_case >0)
  {
      String temp1 = scan1.nextLine();
      String temp2 = scan2.nextLine();
      while(i<temp1.length())
      {
         // System.out.println(temp1.charAt(i));
             
          switch(temp1.charAt(i))
          {
              case 'a' : x = 0;
              break;
              case 'b' : x = 1;
              break;
              case 'c' : x = 2;
              break;
              case 'd' : x = 3;
              break;
              case 'e' : x = 4;
              break;
              case 'f' : x = 5;
              break;
              case 'g' : x = 6;
              break;
              case 'h' : x = 7;
              break;
              case 'i' : x = 8;
              break;
              case 'j' : x = 9;
              break;
              case 'k' : x = 10;
              break;
              case 'l' : x = 11;
              break;
              case 'm' : x = 12;
              break;
              case 'n' : x = 13;
              break;
              case 'o' : x = 14;
              break;
              case 'p' : x = 15;
              break;
              case 'q' : x = 16;
              break;
              case 'r' : x = 17;
              break;
              case 's' : x = 18;
              break;
              case 't' : x = 19;
              break;
              case 'u' : x = 20;
              break;
              case 'v' : x = 21;
              break;
              case 'w' : x = 22;
              break;
              case 'x' : x = 23;
              break;
              case 'y' : x = 24;
              break;
              case 'z' : x = 25;
              break;
              default  : x = 26;
              break;
          }
         // System.out.println(x);
          letters[x]=temp2.charAt(i);
          i++;
      }
      i=0;
       test_case--;
  }
  x = 0;
  letters[16]= 'z';
  letters[25]= 'q';
  String Test = scan3.nextLine();
  int Test_case = Integer.parseInt(Test);
  int count= Test_case;
  //System.out.println(Test_case);
  int j= 0;
  while(Test_case >0)
  {
      out.print("Case #" + (count-Test_case+1) +": ");
      String temp3 = scan3.nextLine();
      while(j<temp3.length())
      {
         // System.out.println(temp3.charAt(j));

          switch(temp3.charAt(j))
          {
                case 'a' : x = 0;
              break;
              case 'b' : x = 1;
              break;
              case 'c' : x = 2;
              break;
              case 'd' : x = 3;
              break;
              case 'e' : x = 4;
              break;
              case 'f' : x = 5;
              break;
              case 'g' : x = 6;
              break;
              case 'h' : x = 7;
              break;
              case 'i' : x = 8;
              break;
              case 'j' : x = 9;
              break;
              case 'k' : x = 10;
              break;
              case 'l' : x = 11;
              break;
              case 'm' : x = 12;
              break;
              case 'n' : x = 13;
              break;
              case 'o' : x = 14;
              break;
              case 'p' : x = 15;
              break;
              case 'q' : x = 16;
              break;
              case 'r' : x = 17;
              break;
              case 's' : x = 18;
              break;
              case 't' : x = 19;
              break;
              case 'u' : x = 20;
              break;
              case 'v' : x = 21;
              break;
              case 'w' : x = 22;
              break;
              case 'x' : x = 23;
              break;
              case 'y' : x = 24;
              break;
              case 'z' : x = 25;
              break;
              default  : x = 26;
              break;
          }
          out.print(letters[x]);
          j++;
      }
         j = 0;
         Test_case--;
         out.print("\n");
  }

  scan1.close();
  scan2.close();
  scan3.close();
  out.close();
  //Read File Line By Line
  //Close the input stream
  }catch (Exception e){//Catch exception if any
  System.err.println("Error: " + e.getMessage());
  }
  }
}
