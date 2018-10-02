package methodEmbedding.Speaking_in_Tongues.S.LYD1293;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author KazakhPride
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        Scanner in = new Scanner( new File( "A-small-attempt2.in" ) );
        PrintWriter out = new PrintWriter( new File( "output.txt" ) );
        
        int n = in.nextInt();
        String s = "";
        
        for( int j = 0; j <= n; j++ ){
            if(j==0){
                s = in.nextLine();
            }
            else{
            out.print( "Case #" + j + ": " );
            s = in.nextLine();
            char c1;
            
            for( int i = 0; i < s.length(); i++ ){
                c1 = s.charAt( i );
                if( c1 == ' ' )
                    out.print( ' ' );
                switch ( c1 ){
                    case 'y':
			out.print( "a" );break;
                    case 'n':
			out.print( "b" );break;
                    case 'f':
			out.print( "c" );break;
                    case 'i':
			out.print( "d" );break;
                    case 'c':
			out.print( "e" );break;
                    case 'w':
			out.print( "f" );break;
                    case 'l':
			out.print( "g" );break;
                    case 'b':
			out.print( "h" );break;
                    case 'k':
			out.print( "i" );break;
                    case 'u':
			out.print( "j" );break;
                    case 'o':
			out.print( "k" );break;
                    case 'm':
			out.print( "l" );break;
                    case 'x':
			out.print( "m" );break;
                    case 's':
			out.print( "n" );break;
                    case 'e':
			out.print( "o" );break;
                    case 'v':
			out.print( "p" );break;
                    case 'z':
			out.print( "q" );break;
                    case 'p':
			out.print( "r" );break;
                    case 'd':
			out.print( "s" );break;
                    case 'r':
			out.print( "t" );break;
                    case 'j':
			out.print( "u" );break;
                    case 'g':
			out.print( "v" );break;
                    case 't':
			out.print( "w" );break;
                    case 'h':
                        out.print( "x" );break;
                    case 'a':
			out.print( "y" );break;
                    case 'q':
			out.print( "z" );break;
                }    
            }
            out.println();
        }
        }
        in.close();
        out.close();
    }
}
