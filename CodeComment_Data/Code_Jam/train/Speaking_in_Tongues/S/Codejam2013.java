package methodEmbedding.Speaking_in_Tongues.S.LYD1059;

import java.io.*;
import java.util.*;
class Codejam2013 
{
	public static void main(String args[])
	{
            Scanner obj = new Scanner(System.in);
            int N = obj.nextInt();
            String strLine= obj.nextLine();
            
            FileOutputStream out; // declare a file output object
                PrintStream p; // declare a print stream object

                try
                {
                        // Create a new file output stream
                        // connected to "myfile.txt"
                        out = new FileOutputStream("myfile.txt");

                        // Connect print stream to the output stream
                        p = new PrintStream( out );
                        for(int i = 1 ;i<=N ;i++)
                        {
                           strLine= obj.nextLine();
			
                            p.print("Case #"+i+": ");
                            
                            for(int j=0;j<strLine.length();j++)
                            {
                                char c = strLine.charAt(j);
                                if(c=='a')
                                    p.print("y");
                                else if(c=='b')
                                    p.print("h");
                                else if(c=='c')
                                    p.print("e");
                                else if(c=='d')
                                    p.print("s");
                                else if(c=='e')
                                    p.print("o");
                                else if(c=='f')
                                    p.print("c");
                                else if(c=='g')
                                    p.print("v");
                                else if(c=='h')
                                    p.print("x");
                                else if(c=='i')
                                    p.print("d");
                                else if(c=='j')
                                    p.print("u");
                                else if(c=='k')
                                    p.print("i");
                                else if(c=='l')
                                    p.print("g");
                                else if(c=='m')
                                    p.print("l");
                                else if(c=='n')
                                    p.print("b");
                                else if(c=='o')
                                    p.print("k");
                                else if(c=='p')
                                    p.print("r");
                                else if(c=='q')
                                    p.print("z");
                                else if(c=='r')
                                    p.print("t");
                                else if(c=='s')
                                    p.print("n");
                                else if(c=='t')
                                    p.print("w");
                                else if(c=='u')
                                    p.print("j");
                                else if(c=='v')
                                    p.print("p");
                                else if(c=='w')
                                    p.print("f");
                                else if(c=='x')
                                    p.print("m");
                                else if(c=='y')
                                    p.print("a");
                                else if(c=='z')
                                    p.print("q");
                                else
                                    p.print(" ");
                                
                            }     
                            p.println();
                        }
			
		
                        
                        p.close();
                }
                catch (Exception e)
                {
                        System.err.println ("Error writing to file");
                }
        		 
		
			
	}
}
