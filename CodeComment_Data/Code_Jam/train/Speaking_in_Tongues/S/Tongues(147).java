package methodEmbedding.Speaking_in_Tongues.S.LYD1267;

import java.util.*;
/**
 * Google Code Jam 2012 Qualification Round Problem A: Speaking In Tongues 
 * 
 * @author Wayne Roswell
 * @version (4/14/2012 1:21PM EST
 */
public class Tongues
{
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        
        String b = a.nextLine();
        int c = Integer.parseInt(b);
        
        for(int i = 0; i < c; i++)
        {
            String d = a.nextLine();
            
            char[] e = d.toCharArray();
            String output = "";
            
            for(int j = 0; j < e.length; j++)
            {
                switch(e[j])
                {
                    case 'a': e[j] = 'y';
                        break;
                    case 'b': e[j] = 'h';
                        break;
                    case 'c': e[j] = 'e';
                        break;
                    case 'd': e[j] = 's';
                        break;
                    case 'e': e[j] = 'o';
                        break;
                    case 'f': e[j] = 'c';
                        break;
                    case 'g': e[j] = 'v';
                        break;
                    case 'h': e[j] = 'x';
                        break;
                    case 'i': e[j] = 'd';
                        break;
                    case 'j': e[j] = 'u';
                        break;
                    case 'k': e[j] = 'i';
                        break;
                    case 'l': e[j] = 'g';
                        break;
                    case 'm': e[j] = 'l';
                        break;
                    case 'n': e[j] = 'b';
                        break;
                    case 'o': e[j] = 'k';
                        break;
                    case 'p': e[j] = 'r';
                        break;
                    case 'q': e[j] = 'z';
                        break;
                    case 'r': e[j] = 't';
                        break;
                    case 's': e[j] = 'n';
                        break;
                    case 't': e[j] = 'w';
                        break;
                    case 'u': e[j] = 'j';
                        break;
                    case 'v': e[j] = 'p';
                        break;
                    case 'w': e[j] = 'f';
                        break;
                    case 'x': e[j] = 'm';
                        break;
                    case 'y': e[j] = 'a';
                        break;
                    case 'z': e[j] = 'q';
                        break;
                }
                output = output + e[j];
            }
            if(d.length() == output.length())
                System.out.println("Case #" + (i + 1) + ": " + output);
        }
    }
}
