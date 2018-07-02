package methodEmbedding.Speaking_in_Tongues.S.LYD1352;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;

public class Speaking_in_Tongues {

    /**
     * The first line of the input gives the number of test cases, T. T test cases follow, one per line.
		Each line consists of a string G in Googlerese, made up of one or more words containing the letters 'a' - 'z'. 
		There will be exactly one space (' ') character between consecutive words and no spaces at the beginning or at the end of any line. 
     * @throws IOException
 
     */
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        Scanner in=new Scanner(new File("A-small-attempt0.in"));
        FileWriter fstream = new FileWriter("A-small-attempt0.out");
        BufferedWriter out = new BufferedWriter(fstream);
         //Close the output stream
        int testCase=Integer.parseInt(in.nextLine());
        for(int i=0;i<testCase;i++) {
        	 out.write("Case #"+(i+1)+":\t");
            String G = in.nextLine();
           // String mapping = "yhesocvxduiglbkrztnwjpfmaq";
           
            for(int j=0;j<G.length();j++)
            {
            	
            	if(G.charAt(j) == 'a' || G.charAt(j) =='A')
            	{
                    out.write('y');
                    
            	}
            	if(G.charAt(j) == 'b' || G.charAt(j) =='B')
            	{
                    out.write('h');
                    
            	}
            	if(G.charAt(j) == 'c' || G.charAt(j) =='C')
            	{
                    out.write('e');
                    
            	}
            	if(G.charAt(j) == 'd' || G.charAt(j) =='D')
            	{
                    out.write('s');
                    
            	}
            	if(G.charAt(j) == 'e' || G.charAt(j) =='E')
            	{
                    out.write('o');
                    
            	}
            	if(G.charAt(j) == 'f' || G.charAt(j) =='F')
            	{
                    out.write('c');
                    
            	}
            	if(G.charAt(j) == 'g' || G.charAt(j) =='G')
            	{
                    out.write('v');
                    
            	}
            	if(G.charAt(j) == 'h' || G.charAt(j) =='H')
            	{
                    out.write('x');
                    
            	}
            	if(G.charAt(j) == 'i' || G.charAt(j) =='I')
            	{
                    out.write('d');
                    
            	}
            	if(G.charAt(j) == 'j' || G.charAt(j) =='J')
            	{
                    out.write('u');
                    
            	}
            	if(G.charAt(j) == 'k' || G.charAt(j) =='K')
            	{
                    out.write('i');
                    
            	}
            	if(G.charAt(j) == 'l' || G.charAt(j) =='L')
            	{
                    out.write('g');
                    
            	}
            	if(G.charAt(j) == 'm' || G.charAt(j) =='M')
            	{
                    out.write('l');
                    
            	}
            	if(G.charAt(j) == 'n' || G.charAt(j) =='N')
            	{
                    out.write('b');
                    
            	}
            	if(G.charAt(j) == 'o' || G.charAt(j) =='O')
            	{
                    out.write('k');
                    
            	}
            	if(G.charAt(j) == 'p' || G.charAt(j) =='P')
            	{
                    out.write('r');
                    
            	}
            	if(G.charAt(j) == 'q' || G.charAt(j) =='Q')
            	{
                    out.write('z');
                    
            	}
            	if(G.charAt(j) == 'r' || G.charAt(j) =='R')
            	{
                    out.write('t');
                    
            	}
            	if(G.charAt(j) == 's' || G.charAt(j) =='S')
            	{
                    out.write('n');
                    
            	}
            	if(G.charAt(j) == 't' || G.charAt(j) =='T')
            	{
                    out.write('w');
                    
            	}
            	if(G.charAt(j) == 'u' || G.charAt(j) =='U')
            	{
                    out.write('j');
                    
            	}
            	if(G.charAt(j) == 'v' || G.charAt(j) =='V')
            	{
                    out.write('p');
                    
            	}
            	if(G.charAt(j) == 'w' || G.charAt(j) =='W')
            	{
                    out.write('f');
                    
            	}
            	if(G.charAt(j) == 'x' || G.charAt(j) =='X')
            	{
                    out.write('m');
                    
            	}
            	if(G.charAt(j) == 'y' || G.charAt(j) =='Y')
            	{
                    out.write('a');
                    
            	}
            	if(G.charAt(j) == 'z' || G.charAt(j) =='Z')
            	{
                    out.write('q');
                    
            	}
            	if(G.charAt(j) == ' ')
            	{
                    out.write(' ');
                    
            	}
            	
            	
            }
            out.write("\n");
            
            }
        	
         out.close();   
    }

}
