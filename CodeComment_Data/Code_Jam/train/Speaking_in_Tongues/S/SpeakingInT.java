package methodEmbedding.Speaking_in_Tongues.S.LYD977;

import java.util.Scanner;


public class SpeakingInT {
	
	public static void main(String [] args)
	{

        Scanner c = new Scanner(System.in);
        
        int line = c.nextInt();
        String[] inp = new String[line];
        String w= "";
        c.nextLine();
        for(int i = 0; i < line; i++)
        {
            inp[i] = c.nextLine();
            
            
        }
        
            for(int j = 0; j < inp.length; j++)
            {
             
              for(int k = 0; k < inp[j].length(); k ++)
              {
               
             
                if(inp[j].charAt(k) == 'a')
                    w += 'y';
                else if(inp[j].charAt(k) == 'b')
                    w += 'h';
                else if(inp[j].charAt(k) == 'c')
                    w += 'e';
                else if(inp[j].charAt(k) == 'd')
                    w += 's';
                else if(inp[j].charAt(k) == 'e')
                    w += 'o';
                else if(inp[j].charAt(k) == 'f')
                    w += 'c';
                else if(inp[j].charAt(k) == 'g')
                    w += 'v';
                else if(inp[j].charAt(k) == 'h')
                    w += 'x';
                else if(inp[j].charAt(k) == 'i')
                    w += 'd';
                else if(inp[j].charAt(k) == 'j')
                    w += 'u';
                else if(inp[j].charAt(k) == 'k')
                    w += 'i';
                else if(inp[j].charAt(k) == 'l')
                    w += 'g';
                else if(inp[j].charAt(k) == 'm')
                    w += 'l';
                else if(inp[j].charAt(k) == 'n')
                    w += 'b';
                else if(inp[j].charAt(k) == 'o')
                    w += 'k';
                else if(inp[j].charAt(k) == 'p')
                    w += 'r';
                else if(inp[j].charAt(k) == 'q')
                    w += 'z';
                else if(inp[j].charAt(k) == 'r')
                    w += 't';
                else if(inp[j].charAt(k) == 's')
                    w += 'n';
                else if(inp[j].charAt(k) == 't')
                    w += 'w';
                else if(inp[j].charAt(k) == 'u')
                    w += 'j';
                else if(inp[j].charAt(k) == 'v')
                    w += 'p';
                else if(inp[j].charAt(k) == 'w')
                    w += 'f';
                else if(inp[j].charAt(k) == 'x')
                    w += 'm';
                else if(inp[j].charAt(k) == 'y')
                    w += 'a';
                else if(inp[j].charAt(k) == 'z')
                    w += 'q';
                else if(inp[j].charAt(k) == ' ')
                    w += ' ';   
                
            }
          	  
              System.out.println("Case #" + (j+1) +": " + w);
              w = "";
            }
           
            
        }

}
