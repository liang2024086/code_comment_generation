package methodEmbedding.Speaking_in_Tongues.S.LYD770;

/*
 * Gabriel Shaw
 * 4/13/12
 */
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;
public class SpeakingInTongues 
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("A-small-attempt0.in");
        PrintWriter outfile = new PrintWriter("A-small.out");
        Scanner infile = new Scanner(file);
        int numberOfStrings;
        String inString;
        String outString = null;
        numberOfStrings = infile.nextInt();
        infile.nextLine();
        
        for(int i=0 ; i<numberOfStrings ; i++)
        {
            inString = infile.nextLine();
            for(int j=0 ; j<inString.length() ; j++)
            {
                switch(inString.charAt(j))
                {
                    case ' ': outString += " ";
                        break;
                    case 'a': outString += "y";
                        break;
                    case 'b': outString += "h";
                        break;
                    case 'c': outString += "e";
                        break;
                    case 'd': outString += "s";
                        break;
                    case 'e': outString += "o";
                        break;
                    case 'f': outString += "c";
                        break;
                    case 'g': outString += "v";
                        break;
                    case 'h': outString += "x";
                        break;
                    case 'i': outString += "d";
                        break;
                    case 'j': outString += "u";
                        break;
                    case 'k': outString += "i";
                        break;
                    case 'l': outString += "g";
                        break;
                    case 'm': outString += "l";
                        break;
                    case 'n': outString += "b";
                        break;
                    case 'o': outString += "k";
                        break;
                    case 'p': outString += "r";
                        break;
                    case 'q': outString += "z";
                        break;
                    case 'r': outString += "t";
                        break;
                    case 's': outString += "n";
                        break;
                    case 't': outString += "w";
                        break;
                    case 'u': outString += "j";
                        break;
                    case 'v': outString += "p";
                        break;
                    case 'w': outString += "f";
                        break;
                    case 'x': outString += "m";
                        break;
                    case 'y': outString += "a";
                        break;
                    case 'z': outString += "q";
                        break;
                }//end of switch(inString.charAt(j))
            }//end of for(int j=0 ; j<inString.length() ; j++)
            //System.out.println("Case #" +(i+1) +": " +outString.subSequence(4, outString.length()));
            outfile.println("Case #" +(i+1) +": " +outString.subSequence(4, outString.length()));
            outString = null;
        }//end of for(int i=0 ; i<numberOfStrings ; i++)
        outfile.close();
    }//end of public void main(String[] args)
}//end of public class SpeakingInTongues
