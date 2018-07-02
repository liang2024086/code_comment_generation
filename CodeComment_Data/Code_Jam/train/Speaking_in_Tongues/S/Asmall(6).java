package methodEmbedding.Speaking_in_Tongues.S.LYD1465;

import java.util.Scanner;

public class Asmall {
    public static void main(String[] args) {
	
	Scanner in = new Scanner (System.in);
	Scanner inn = new Scanner (System.in);
	String scases = in.nextLine();
	int g = Integer.parseInt(scases);
	
    
    
    for (int i=1; i <= g; i++){
	
	String input = in.nextLine() ;
	String output = "Case #" + i + ": " ;
	  for (int z=0 ; z< input.length() ; z++){
	    switch (input.charAt(z)) {
            case ' ':  output += " " ;
                     break;
	    case 'a':  output += "y" ;
                     break;
            case 'b':  output += "h" ;
                     break;
            case 'c':  output += "e" ;
                     break;
            case 'd':  output += "s" ;
                     break;
            case 'e':  output += "o" ;
                     break;
            case 'f':  output += "c" ;
                     break;
            case 'g':  output += "v" ;
                     break;
            case 'h':  output += "x" ;
                     break;
            case 'i':  output += "d" ;
                     break;
            case 'j':  output += "u" ;
                     break;
            case 'k':  output += "i" ;
                     break;
            case 'l':  output += "g" ;
                     break;
	    case 'm':  output += "l" ;
                     break;
	    case 'n':  output += "b" ;
                     break;
	    case 'o':  output += "k" ;
                     break;
	    case 'p':  output += "r" ;
                     break;
	    case 'q':  output += "z" ;
                     break;
	    case 'r':  output += "t" ;
                     break;
	    case 's':  output += "n" ;
                     break;
	    case 't':  output += "w" ;
                     break;
	    case 'u':  output += "j" ;
                     break;
	    case 'v':  output += "p" ;
                     break;
	    case 'w':  output += "f" ;
                     break;
	    case 'x':  output += "m" ;
                     break;
	    case 'y':  output += "a" ;
                     break;
	    case 'z':  output += "q" ;
                     break;
	  }
        }
        System.out.println(output);
    }
    }
}
