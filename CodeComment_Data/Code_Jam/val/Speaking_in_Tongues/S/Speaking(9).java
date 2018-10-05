package methodEmbedding.Speaking_in_Tongues.S.LYD929;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class Speaking {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("A-small-practice.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("A-small-practice.out")));
	    StringTokenizer st = new StringTokenizer(f.readLine());
	    
	    int tests = Integer.parseInt(st.nextToken());
	    
	    for (int i = 0; i < tests; i++){
	    	out.printf("Case #%d: ", i+1);
	    	st = new StringTokenizer(f.readLine());
		    while (st.hasMoreTokens()) {
			    String a = st.nextToken();
			    StringBuffer b = new StringBuffer();
			    for(int j = 0; j < a.length(); j++){
			    	switch(a.charAt(j)){
			    	case 'a':
			    		b.append('y');
			    		break;
			    	case 'b':
			    		b.append('h');
			    		break;
			    	case 'c':
			    		b.append('e');
			    		break;
			    	case 'd':
			    		b.append('s');
			    		break;
			    	case 'e':
			    		b.append('o');
			    		break;
			    	case 'f':
			    		b.append('c');
			    		break;
			    	case 'g':
			    		b.append('v');
			    		break;
			    	case 'h':
			    		b.append('x');
			    		break;
			    	case 'i':
			    		b.append('d');
			    		break;
			    	case 'j':
			    		b.append('u');
			    		break;
			    	case 'k':
			    		b.append('i');
			    		break;
			    	case 'l':
			    		b.append('g');
			    		break;
			    	case 'm':
			    		b.append('l');
			    		break;
			    	case 'n':
			    		b.append('b');
			    		break;
			    	case 'o':
			    		b.append('k');
			    		break;
			    	case 'p':
			    		b.append('r');
			    		break;
			    	case 'q':
			    		b.append('z');
			    		break;
			    	case 'r':
			    		b.append('t');
			    		break;
			    	case 's':
			    		b.append('n');
			    		break;
			    	case 't':
			    		b.append('w');
			    		break;
			    	case 'u':
			    		b.append('j');
			    		break;
			    	case 'v':
			    		b.append('p');
			    		break;
			    	case 'w':
			    		b.append('f');
			    		break;
			    	case 'x':
			    		b.append('m');
			    		break;
			    	case 'y':
			    		b.append('a');
			    		break;
			    	case 'z':
			    		b.append('q');
			    		break;
			    	default:
			    		break;
			    	}
			    }
			    out.printf(b.toString());
			    if(st.hasMoreTokens())out.printf(" ");
			    else {
			    	out.printf("\n");
			    }
		     }
	    }
	   
	    out.close();
	    System.exit(0);
	}
}
