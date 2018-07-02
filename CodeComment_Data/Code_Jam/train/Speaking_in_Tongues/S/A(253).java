package methodEmbedding.Speaking_in_Tongues.S.LYD464;

/* luwum patrick*/


import java.util.*;
import java.io.*;
import static java.lang.Math.*;
import java.lang.*;

public class A{
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("A-small.in"));
		FileWriter fw = new FileWriter("A-small-attempt0.out");
		int T = new Integer(in.readLine());
                int i;

		for (int cases = 1; cases <= T; cases++)
 {           fw.write("Case #" +cases+": ");

                    
			String I = new String(in.readLine());
                        String[] G = I.split(" ");                        
                        

                   for (int j = 0; j < G.length; j++)
                     {
                        
                          String[] leters=G[j].split("");

                            for (i = 0; i < leters.length; i++)
                              { 
                                 if (leters[i].equals("a"))
                                     {
                                       leters[i]="y";
                                      }
                                   else

                                 if (leters[i].equals("b"))
                                     {
                                       leters[i]="h";
                                      }
                                    else

                                 if (leters[i].equals("c"))
                                     {
                                       leters[i]="e";
                                      }
                                   else

                                 if (leters[i].equals("d"))
                                     {
                                       leters[i]="s";
                                      }
                                   else

                                 if (leters[i].equals("e"))
                                     {
                                       leters[i]="o";
                                      }
                                    else

                                 if (leters[i].equals("f"))
                                     {
                                       leters[i]="c";
                                      }

                                     else
                                 if (leters[i].equals("g"))
                                     {
                                       leters[i]="v";
                                      }
                                   else

                                 if (leters[i].equals("h"))
                                     {
                                       leters[i]="x";
                                      }
                                     else

                                 if (leters[i].equals("i"))
                                     {
                                       leters[i]="d";
                                      }
                                   else
                                 if (leters[i].equals("j"))
                                     {
                                       leters[i]="u";
                                      } 
                                    else
                               
                                 if (leters[i].equals("k"))
                                     {
                                       leters[i]="i";
                                      }
                                    else
                                 if (leters[i].equals("l"))
                                     {
                                       leters[i]="g";
                                      }else
                                 if (leters[i].equals("m"))
                                     {
                                       leters[i]="l";
                                      }else
                                  if (leters[i].equals("n"))
                                     {
                                       leters[i]="b";
                                      }else
                                   if (leters[i].equals("o"))
                                     {
                                       leters[i]="k";
                                      }else
                                   if (leters[i].equals("p"))
                                     {
                                       leters[i]="r";
                                      }else
                                   if (leters[i].equals("q"))
                                     {
                                       leters[i]="z";
                                      }else
                                    if (leters[i].equals("r"))
                                     {
                                       leters[i]="t";
                                      }else
                                    if (leters[i].equals("s"))
                                     {
                                       leters[i]="n";
                                      }else
                                    if (leters[i].equals("t"))
                                     {
                                       leters[i]="w";
                                      }else
                                    if (leters[i].equals("u"))
                                     {
                                       leters[i]="j";
                                      }else
                                    if (leters[i].equals("v"))
                                     {
                                       leters[i]="p";
                                      } else
                                    if (leters[i].equals("w"))
                                     {
                                       leters[i]="f";
                                      } else
                                    if (leters[i].equals("x"))
                                     {
                                       leters[i]="m";
                                      }else

                                     if (leters[i].equals("y"))
                                     {
                                       leters[i]="a";
                                      }else
 
                                    if (leters[i].equals("z"))
                                     {
                                       leters[i]="q";
                                      }
                         

                              
                                  fw.write(leters[i] );

                               }
                              fw.write(" ");

                            
                           
                     }
fw.write("\n");
		}
		fw.flush();
		fw.close();
	}

}
