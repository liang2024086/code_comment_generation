package methodEmbedding.Speaking_in_Tongues.S.LYD417;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Lang3 {
    public static void main(String[] args) {
                    String filename = args[0];
                    int i=0;
                    int testcase=0 ;
                    int n=0,k=0;
                    String out="";
                    BufferedWriter bufferedWriter = null;
                    try {
                        BufferedReader in = new BufferedReader(new FileReader(filename));
                        String str1;

                        str1 = in.readLine();
                        testcase = Integer.parseInt(str1);

                        bufferedWriter = new BufferedWriter(new FileWriter("o.wpd"));


                      for(k=0;k<testcase;k++)
                        {
                            String s= new String();

                            s=in.readLine();
                            StringBuffer sb= new StringBuffer(s);
                            sb.append(" ");
                            StringBuffer str= new StringBuffer();

                            int m=sb.length();

                            for(i=0;i<m;i++)
                            {
                                if(sb.charAt(i)=='a')
                                    str.append('y');
                                if(sb.charAt(i)=='b')
                                    str.append('h');
                                if(sb.charAt(i)=='c')
                                    str.append('e');
                                if(sb.charAt(i)=='d')
                                    str.append('s');
                                if(sb.charAt(i)=='e')
                                    str.append('o');
                                if(sb.charAt(i)=='f')
                                    str.append('c');
                                if(sb.charAt(i)=='g')
                                    str.append('v');
                                if(sb.charAt(i)=='h')
                                    str.append('x');
                                if(sb.charAt(i)=='i')
                                    str.append('d');
                                if(sb.charAt(i)=='j')
                                    str.append('u');
                                if(sb.charAt(i)=='k')
                                    str.append('i');
                                if(sb.charAt(i)=='l')
                                    str.append('g');
                                if(sb.charAt(i)=='m')
                                    str.append('l');
                                if(sb.charAt(i)=='n')
                                    str.append('b');
                                if(sb.charAt(i)=='o')
                                    str.append('k');
                                if(sb.charAt(i)=='p')
                                    str.append('r');
                                if(sb.charAt(i)=='q')
                                    str.append('z');
                                if(sb.charAt(i)=='r')
                                    str.append('t');
                                if(sb.charAt(i)=='s')
                                    str.append('n');
                                if(sb.charAt(i)=='t')
                                    str.append('w');
                                if(sb.charAt(i)=='u')
                                    str.append('j');
                                if(sb.charAt(i)=='v')
                                    str.append('p');
                                if(sb.charAt(i)=='w')
                                    str.append('f');
                                if(sb.charAt(i)=='x')
                                    str.append('m');
                                if(sb.charAt(i)=='y')
                                    str.append('a');
                                if(sb.charAt(i)=='z')
                                    str.append('q');
                                if(sb.charAt(i)==' ')
                                    str.append(' ');

                            }
                                out="Case #"+(k+1)+": ";
                                out +=str+"\n";
System.out.println("out="+out);
                                bufferedWriter.write(out);

                            
                            }
                        
                            in.close();
                    }
                    catch (IOException ex) {ex.printStackTrace();}
                    finally {
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

