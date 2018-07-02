package methodEmbedding.Speaking_in_Tongues.S.LYD1139;

import java.io.*;
import java.util.*;

public class Launcher2 {
	static int t, tcount;
	
	
	public static void main (String args[]) throws IOException {
		
		FileReader inputStream = null;
	    FileWriter outputStream = null;
	    t=1;
	    String tchar = "hi";
	    char a,b;
	    try {
	        inputStream = new FileReader("input.txt");
	        outputStream = new FileWriter("output.txt");
	
	        int c;
	        
	        while ((c = inputStream.read()) != 10){
	        }
	        
	        tchar = Integer.toString(t);
            outputStream.write('C');
            outputStream.write('a');
            outputStream.write('s');
            outputStream.write('e');
            outputStream.write(' ');
            outputStream.write('#');
            outputStream.write(tchar);
            outputStream.write(':');
            outputStream.write(' ');
            
	        while ((c = inputStream.read()) != -1) {
	        	
	        	if (c== 10){
	        		if ((c = inputStream.read()) != -1){
	        			t++;
		        		tchar = Integer.toString(t);
		        		
		        		outputStream.write(10);

			            outputStream.write('C');
			            outputStream.write('a');
			            outputStream.write('s');
			            outputStream.write('e');
			            outputStream.write(' ');
			            outputStream.write('#');
			            outputStream.write(tchar);
			            outputStream.write(':');
			            outputStream.write(' ');		            
	        		}
	        		else{
	        			break;
	        		}
	        	}
	        	
	        	a=(char)c;
	        	switch (a) {
	        	case ' ': outputStream.write(' ');break;
	        	case 'a': outputStream.write('y');break;
	        	case 'b': outputStream.write('h');break;
	        	case 'c': outputStream.write('e');break;
	        	case 'd': outputStream.write('s');break;
	        	case 'e': outputStream.write('o');break;
	        	case 'f': outputStream.write('c');break;
	        	case 'g': outputStream.write('v');break;
	        	case 'h': outputStream.write('x');break;
	        	case 'i': outputStream.write('d');break;
	        	case 'j': outputStream.write('u');break;
	        	case 'k': outputStream.write('i');break;
	        	case 'l': outputStream.write('g');break;
	        	case 'm': outputStream.write('l');break;
	        	case 'n': outputStream.write('b');break;
	        	case 'o': outputStream.write('k');break;
	        	case 'p': outputStream.write('r');break;
	        	case 'q': outputStream.write('z');break;
	        	case 'r': outputStream.write('t');break;
	        	case 's': outputStream.write('n');break;
	        	case 't': outputStream.write('w');break;
	        	case 'u': outputStream.write('j');break;
	        	case 'v': outputStream.write('p');break;
	        	case 'w': outputStream.write('f');break;
	        	case 'x': outputStream.write('m');break;
	        	case 'y': outputStream.write('a');break;
	        	case 'z': outputStream.write('q');break;
	        	}
	        }
	    } finally {
	        if (inputStream != null) {
	            inputStream.close();
	        }
	        if (outputStream != null) {
	            outputStream.close();
	        }
	    }
	
	}//main

} //class
