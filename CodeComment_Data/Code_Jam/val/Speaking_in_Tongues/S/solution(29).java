package methodEmbedding.Speaking_in_Tongues.S.LYD1573;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;



class solution {
    public static void main(String[] args) {
    	char[] Solution = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q' };
    
		/*String string1 = args[0];
    	String string2 = args[1];
    	System.out.println( string1);
    	System.out.println( string2);
    	char[] string3 = new char[30];
    	for( int i = 0; i < string1.length(); i++ ) {
    		if( string1.charAt(i) >= 'a' && string1.charAt(i) <= 'z' ) {
    			int index = string1.charAt(i) - 'a';
    			string3[index] = string2.charAt(i);
    		}
    	}
    	for( int i = 0; i <= 'z' - 'a'; i++) {
    		System.out.print("'" + string3[i] + "',"); 
    	}*/
    	String text = "";
    	if( args.length > 0) {
    		text = args[0];
    	} else {
	    	try {
				FileInputStream fos = new FileInputStream( "text.txt");
			    Scanner scanner = new Scanner(new FileInputStream("text.txt"));
			    try {
			      while (scanner.hasNextLine()){
			        text += scanner.nextLine() + "\n";
			      }
			    }
			    finally{
			      scanner.close();
			    }
				try {
					fos.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    
    	StringTokenizer st = new StringTokenizer(text, "[\r\n]+", false);
    	int cases = Integer.parseInt(st.nextToken());
        for (int x=1; x<= cases; x++) {
        	String current_case = st.nextToken();
        	int string_length = current_case.length();
            char[] line = new char[string_length];
            for( int i = 0; i < string_length; i++ ) {
            	char this_char = current_case.charAt(i);
            	if( this_char >= 'a' && this_char <= 'z' ) {
            		int index = current_case.charAt(i) - 'a';
            		line[i] = Solution[index];
            	} else {
            		line[i] = this_char;
            	}
            }
            System.out.println( "Case #" + x + ": " + new String(line));
        }
    }
}
