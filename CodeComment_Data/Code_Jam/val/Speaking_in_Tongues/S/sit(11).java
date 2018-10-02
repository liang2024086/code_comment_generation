package methodEmbedding.Speaking_in_Tongues.S.LYD1635;

import java.util.ArrayList;
import java.util.Scanner;

public class sit
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner (System.in);
    String scases = in.nextLine(); //int inttwo = Integer.parseInt(two);
    int T = Integer.parseInt(scases);
    for(int i = 1; i<(T+1); i++)
    {
      String sin = in.nextLine();
      String sout = "";
      for(int j = 0; j<sin.length();j++)
      {
	switch (sin.charAt(j)) 
	{
	case 'a': 
	  sout += "y";
	  break;
	case 'b': 
	  sout += "h";
	  break;
	case 'c': 
	  sout += "e";
	  break;
	case 'd': 
	  sout += "s";
	  break;
	case 'e': 
	  sout += "o";
	  break;
	case 'f': 
	  sout += "c";
	  break;
	case 'g': 
	  sout += "v";
	  break;
	case 'h': 
	  sout += "x";
	  break;
	case 'i': 
	  sout += "d";
	  break;
	case 'j': 
	  sout += "u";
	  break;
	case 'k': 
	  sout += "i";
	  break;
	case 'l': 
	  sout += "g";
	  break;
	case 'm': 
	  sout += "l";
	  break;
	case 'n': 
	  sout += "b";
	  break;
	case 'o': 
	  sout += "k";
	  break;
	case 'p': 
	  sout += "r";
	  break;
	case 'q': 
	  sout += "z";
	  break;
	case 'r': 
	  sout += "t";
	  break;
	case 's': 
	  sout += "n";
	  break;
	case 't': 
	  sout += "w";
	  break;
	case 'u': 
	  sout += "j";
	  break;
	case 'v': 
	  sout += "p";
	  break;
	case 'w': 
	  sout += "f";
	  break;
	case 'x': 
	  sout += "m";
	  break;
	case 'y': 
	  sout += "a";
	  break;
	case 'z': 
	  sout += "q";
	  break;
	default: 
	  sout += " ";
	}
      }
      System.out.println("Case #" + i +": "+sout);
    }
  }

}
