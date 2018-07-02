package methodEmbedding.Speaking_in_Tongues.S.LYD180;




import  java.util.Scanner;
import java.io.BufferedWriter;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.Math;
import java.util.ArrayList;
import java.util.HashMap;
import java.math.BigInteger;
public class lang3 {


    public static void main(String[] args) {

                    
                    String filename =  "C://in.txt";
                    int i=0;
                    int testcase=0 ;
                    int n=0,k=0;
                    String out="";
                    BufferedWriter bufferedWriter = null;
                    try {
                        BufferedReader in = new BufferedReader(new FileReader(filename));
                        String str;

                        str = in.readLine();
                        testcase = Integer.parseInt(str);

                        bufferedWriter = new BufferedWriter(new FileWriter("oneoutput.txt"));


                      for(k=0;k<testcase;k++)
                        {
                            int p=0,g=0;
                            String s= new String();

                            s=in.readLine();
                            StringBuffer sb= new StringBuffer(s);
                            sb.append(" ");
                            StringBuffer so= new StringBuffer();

                            int m=sb.length();

                            for(i=0;i<m;i++)
                            {
                                if(sb.charAt(i)=='a')
                                    so.append('y');
                                if(sb.charAt(i)=='b')
                                    so.append('h');
                                if(sb.charAt(i)=='c')
                                    so.append('e');
                                if(sb.charAt(i)=='d')
                                    so.append('s');
                                if(sb.charAt(i)=='e')
                                    so.append('o');
                                if(sb.charAt(i)=='f')
                                    so.append('c');
                                if(sb.charAt(i)=='g')
                                    so.append('v');
                                if(sb.charAt(i)=='h')
                                    so.append('x');
                                if(sb.charAt(i)=='i')
                                    so.append('d');
                                if(sb.charAt(i)=='j')
                                    so.append('u');
                                if(sb.charAt(i)=='k')
                                    so.append('i');
                                if(sb.charAt(i)=='l')
                                    so.append('g');
                                if(sb.charAt(i)=='m')
                                    so.append('l');
                                if(sb.charAt(i)=='n')
                                    so.append('b');
                                if(sb.charAt(i)=='o')
                                    so.append('k');
                                if(sb.charAt(i)=='p')
                                    so.append('r');
                                if(sb.charAt(i)=='q')
                                    so.append('z');
                                if(sb.charAt(i)=='r')
                                    so.append('t');
                                if(sb.charAt(i)=='s')
                                    so.append('n');
                                if(sb.charAt(i)=='t')
                                    so.append('w');
                                if(sb.charAt(i)=='u')
                                    so.append('j');
                                if(sb.charAt(i)=='v')
                                    so.append('p');
                                if(sb.charAt(i)=='w')
                                    so.append('f');
                                if(sb.charAt(i)=='x')
                                    so.append('m');
                                if(sb.charAt(i)=='y')
                                    so.append('a');
                                if(sb.charAt(i)=='z')
                                    so.append('q');
                                if(sb.charAt(i)==' ')
                                    so.append(' ');

                            }
                                out="Case #"+(k+1)+": ";
                                out +=so+"\n";

                                bufferedWriter.write(out);


                            
                        }
                            in.close();
                    }
                    catch (IOException ex) {ex.printStackTrace();}
                    finally {
            //Close the BufferedWriter
                    try {
                            if (bufferedWriter != null)
                            {
                            bufferedWriter.flush();
                            bufferedWriter.close();
                            }
                        }
                        catch (IOException ex)
                        {
                        ex.printStackTrace();
                        }












                     }

    }

}

