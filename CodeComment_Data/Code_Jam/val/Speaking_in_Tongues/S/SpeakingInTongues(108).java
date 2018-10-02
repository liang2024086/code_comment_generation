package methodEmbedding.Speaking_in_Tongues.S.LYD305;


import java.io.*;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ankur
 */
public class SpeakingInTongues {

    public static void main(String[] args) {
        try
	{
	    FileWriter fout = new FileWriter("out");
	    BufferedWriter out = new BufferedWriter(fout);
	    try
	    {
		Scanner in = new Scanner(new File("in"));
                /*try
                {
                    Scanner inchar = new Scanner(new File("inpchar"));*/
                    int T = in.nextInt();
                    String tp = in.nextLine();
                    char a[]= new char [26];
                    a[0] = 'y';
                    a[1] = 'h';
                    a[2] = 'e';
                    a[3] = 's';
                    a[4] = 'o';
                    a[5] = 'c';
                    a[6] = 'v';
                    a[7] = 'x';
                    a[8] = 'd';
                    a[9] = 'u';
                    a[10] = 'i';
                    a[11] = 'g';
                    a[12] = 'l';
                    a[13] = 'b';
                    a[14] = 'k';
                    a[15] = 'r';
                    a[16] = 'z';
                    a[17] = 't';
                    a[18] = 'n';
                    a[19] = 'w';
                    a[20] = 'j';
                    a[21] = 'p';
                    a[22] = 'f';
                    a[23] = 'm';
                    a[24] = 'a';
                    a[25] = 'q';
                    
                    for(int i=0; i<T; ++i)
                    {
                        String buffer = in.nextLine();
                        out.write("Case #" + (i+1) + ": ");
                        for(int j=0; j<buffer.length(); ++j)
                        {
                            if(buffer.charAt(j) == ' ')
                                out.write(" ");
                            else
                            {
                                int x = buffer.charAt(j);
                                out.write(a[x-97]);
                            }
                        }
                        out.newLine();
                    }
                    out.close();
                /*}catch(FileNotFoundException e1)
                {
                    System.out.println("ERROR: File Not Found!");
                }*/
	    }catch(FileNotFoundException e)
	    {
		System.out.println("ERROR: File Not Found!");
	    }
	}catch(IOException x)
	{
	    System.out.println("ERROR: Can't create output file");
	}
    }
}
