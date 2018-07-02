package methodEmbedding.Speaking_in_Tongues.S.LYD1371;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOSEPH
 */

import java.io.*;
import java.util.Scanner;
public class Replacestring {
    public static void main(String[] args) {
        String strLine,str;
        char c;
        int a;
        int count=0;
        
        try{
            // Open the file that is the first 
            // command line parameter
         FileInputStream fstream = new FileInputStream("F:\\A-small-attempt4.in");
            // Get the object of DataInputStream
          DataInputStream in = new DataInputStream(fstream);
          int k=1;
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
             FileWriter filestream = new FileWriter("F:\\output.out");
  BufferedWriter out = new BufferedWriter(filestream);
            
             //Read File Line By Line
              while ((strLine = br.readLine()) != null)   
                    {
                    
                        StringBuilder strbuf = new StringBuilder();
                    if (count ==0)
                    {
                        a = Integer.parseInt(strLine);
                        System.out.println (a);
                        
                    }
                        else
                    {
                        
                        //System.out.println (strLine);
                       for(int i =0; i<strLine.length(); i++)
                       {
                           
                           c= strLine.charAt(i);
                           switch(c)    
                           {
                               case 'a':
                                   c='y';
                                   break;
                               case 'b':
                                   c='h';
                                   break;
                               case 'c':
                                   c='e';
                                   break;
                               case 'd':
                                   c='s';
                                   break;
                               case 'e':
                                   c='o';
                                   break;
                               case 'f':
                                   c='c';
                                   break;
                               case 'g':
                                   c='v';
                                   break;
                               case 'h':
                                   c='x';
                                   break;
                               case 'i':
                                   c='d';
                                   break;
                               case 'j':
                                   c='u';
                                   break;
                               case 'k':
                                   c='i';
                                   break;
                               case 'l':
                                   c='g';
                                   break;
                               case 'm':
                                   c='l';
                                   break;
                               case 'n':
                                   c='b';
                                   break;
                               case 'o':
                                   c='k';
                                   break;
                               case 'p':
                                   c='r';
                                   break;
                               case 'q':
                                   c='z';
                                   break;
                               case 'r':
                                   c='t';
                                   break;
                               case 's':
                                   c='n';
                                   break;
                               case 't':
                                   c='w';
                                   break;
                               case 'u':
                                   c='j';
                                   break;
                               case 'v':
                                   c='p';
                                   break;
                               case 'w':
                                   c='f';
                                   break;
                               case 'x':
                                   c='m';
                                   break;
                               case 'y':
                                   c='a';
                                   break;
                               case 'z':
                                   c='q';
                                   break;
                               default:
                                   c=' ';
                           }
                       strbuf.append(c);
                       
                       }
                    System.out.println(strbuf);
                    try{
  // Create file 
 out.write("\n");
  String outText = strbuf.toString();
  
  out.write("Case #"+k+":");
  out.write(outText);
  //Close the output stream
  k++;
  }
                    catch (Exception e)
                     {//Catch exception if any
                        System.err.println("Error: " + e.getMessage());
                        }
                    
                    }
                    count++;
                    }
              
             //Close the input stream
                in.close();
                out.close();
        }
        catch (Exception e){//Catch exception if any
  System.err.println("Error: " + e.getMessage());
  }
    /*Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of lines");
    int a = sc.nextInt();
    for (int i=1; i<=a; i++)
        {
        System.out.println(i);
        }
    }*/
    
    }
         
}
