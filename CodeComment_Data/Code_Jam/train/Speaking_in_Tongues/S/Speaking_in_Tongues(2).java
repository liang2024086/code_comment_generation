package methodEmbedding.Speaking_in_Tongues.S.LYD842;

import java.util.Scanner;

public class Speaking_in_Tongues {

	public static void main(String[] args) throws java.io.IOException {
        Scanner cin = new Scanner(System.in); 
	    String c = cin.nextLine(); 

        
        
	    String tran[] = new String[Integer.parseInt(c)+1];

	    System.out.println(tran.length);
	    for(int z=0; z<=Integer.parseInt(c); z++){
	    	tran[z] = " ";
	    }
		for(int i=0; i <= Integer.parseInt(c) ; i++){
		    String x = cin.nextLine(); 
		    String n = "";
		    for(int j=0; j<x.length(); j++){
		    	if(x.charAt(j) == 'a')
		    		n = "y";
		    	else if(x.charAt(j) == 'b')
		    		n = "h";
		    	else if(x.charAt(j) == 'c')
		    		n = "e";
		    	else if(x.charAt(j) == 'd')
		    		n = "s";
		    	else if(x.charAt(j) == 'e')
		    		n = "o";
		    	else if(x.charAt(j) == 'f')
		    		n = "c";
		    	else if(x.charAt(j) == 'g')
		    		n = "v";
		    	else if(x.charAt(j) == 'h')
		    		n = "x";
		    	else if(x.charAt(j) == 'i')
		    		n = "d";
		    	else if(x.charAt(j) == 'j')
		    		n = "u";
		    	else if(x.charAt(j) == 'k')
		    		n = "i";
		    	else if(x.charAt(j) == 'l')
		    		n = "g";
		    	else if(x.charAt(j) == 'm')
		    		n = "l";
		    	else if(x.charAt(j) == 'n')
		    		n = "b";
		    	else if(x.charAt(j) == 'o')
		    		n = "k";
		    	else if(x.charAt(j) == 'p')
		    		n = "r";
		    	else if(x.charAt(j) == 'q')
		    		n = "z";
		    	else if(x.charAt(j) == 'r')
		    		n = "t";	
		    	else if(x.charAt(j) == 's')
		    		n = "n";
		    	else if(x.charAt(j) == 't')
		    		n = "w";
		    	else if(x.charAt(j) == 'u')
		    		n = "j";
		    	else if(x.charAt(j) == 'v')
		    		n = "p";
		    	else if(x.charAt(j) == 'w')
		    		n = "f";
		    	else if(x.charAt(j) == 'x')
		    		n = "m";
		    	else if(x.charAt(j) == 'y')
		    		n = "a";
		    	else if(x.charAt(j) == 'z')
		    		n = "q";
		    	else if(x.charAt(j) == ' ')
		    		n = " ";
		    	
		    	tran[i] += n;
		    }
		        
		}
		
	    for(int k=0; k<tran.length; k++){
		    System.out.println("Case #" + (k+1) +":" + tran[k]);
	    	
	    }
        
	}

}
