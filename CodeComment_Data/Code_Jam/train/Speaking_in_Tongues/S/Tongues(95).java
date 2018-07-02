package methodEmbedding.Speaking_in_Tongues.S.LYD1440;

import java.io.*;
import java.util.Scanner;

public class Tongues 
{
    public static void main(String[] args) throws IOException
    {
        String file = "A-small-attempt0.in", line, output = "output.txt";
        char[] array;
        
        File openFile = new File(file);
        Scanner inFile = new Scanner(openFile);
        PrintWriter outFile = new PrintWriter (output);
        int cases = Integer.parseInt(inFile.nextLine());
        int numCases = 0;
        
        while(inFile.hasNext())
        {
            line = inFile.nextLine();
            array = line.toCharArray();
            
            if(numCases < cases)
            {
                outFile.print("Case #" + (numCases + 1) + ": ");
                numCases++;
            }
            
            for (int i = 0; i < array.length; i++)
            {
                if(Character.isLetter(array[i]))
                {
                    switch(array[i])
                    {
                        case 'a': array[i] = 'y';
                                  outFile.print(array[i]);
                                  break;
                        case 'b': array[i] = 'h';
                                  outFile.print(array[i]);
                                  break;
                        case 'c': array[i] = 'e';
                                  outFile.print(array[i]);
                                  break;
                        case 'd': array[i] = 's';
                                  outFile.print(array[i]);
                                  break;
                        case 'e': array[i] = 'o';
                                  outFile.print(array[i]);
                                  break;
                        case 'f': array[i] = 'c';
                                  outFile.print(array[i]);
                                  break;
                        case 'g': array[i] = 'v';
                                  outFile.print(array[i]);
                                  break;
                        case 'h': array[i] = 'x';
                                  outFile.print(array[i]);
                                  break;
                        case 'i': array[i] = 'd';
                                  outFile.print(array[i]);
                                  break;
                        case 'j': array[i] = 'u';
                                  outFile.print(array[i]);
                                  break;
                        case 'k': array[i] = 'i';
                                  outFile.print(array[i]);
                                  break;
                        case 'l': array[i] = 'g';
                                  outFile.print(array[i]);
                                  break;
                        case 'm': array[i] = 'l';
                                  outFile.print(array[i]);
                                  break;
                        case 'n': array[i] = 'b';
                                  outFile.print(array[i]);
                                  break;
                        case 'o': array[i] = 'k';
                                  outFile.print(array[i]);
                                  break;
                        case 'p': array[i] = 'r';
                                  outFile.print(array[i]);
                                  break;
                        case 'q': array[i] = 'z';
                                  outFile.print(array[i]);
                                  break;
                        case 'r': array[i] = 't';
                                  outFile.print(array[i]);
                                  break;
                        case 's': array[i] = 'n';
                                  outFile.print(array[i]);
                                  break;
                        case 't': array[i] = 'w';
                                  outFile.print(array[i]);
                                  break;
                        case 'u': array[i] = 'j';
                                  outFile.print(array[i]);
                                  break;
                        case 'v': array[i] = 'p';
                                  outFile.print(array[i]);
                                  break;
                        case 'w': array[i] = 'f';
                                  outFile.print(array[i]);
                                  break;
                        case 'x': array[i] = 'm';
                                  outFile.print(array[i]);
                                  break;
                        case 'y': array[i] = 'a';
                                  outFile.print(array[i]);
                                  break;
                        case 'z': array[i] = 'q';
                                  outFile.print(array[i]);
                                  break;
                    }
                }
                
                else
                {
                    outFile.print(array[i]);
                }
            }
            
            outFile.println();
        }
        
        inFile.close();
        outFile.close();
    }
}
