package methodEmbedding.Speaking_in_Tongues.S.LYD322;

import java.io.*;
import java.util.*;

public class Test {
        
    public static void main(String[] args) {
    	try{      
        FileReader fr = new FileReader("D:/codejam/A-small-attempt0.in");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("D:/codejam/A-small-attempt0-out.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        
        int c;
        String line;
        c = Integer.parseInt(br.readLine());
        
        
        for(int i=1;i<=c;i++) {
        	line = br.readLine();
        	//line = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
        	String ans = "Case #"+i+": ";
        	for(int j=0;j<line.length();j++) {
        		char ch = line.charAt(j);
        		switch(ch) {
        			case 'a':ans = ans + 'y';break;
		        	case 'b':ans = ans + 'h';break;
		        	case 'c':ans = ans + 'e';break;
		        	case 'd':ans = ans + 's';break;
		        	case 'e':ans = ans + 'o';break;
		        	case 'f':ans = ans + 'c';break;
		        	case 'g':ans = ans + 'v';break;
		        	case 'h':ans = ans + 'x';break;
		        	case 'i':ans = ans + 'd';break;
		        	case 'j':ans = ans + 'u';break;
		        	case 'k':ans = ans + 'i';break;
		        	case 'l':ans = ans + 'g';break;
		        	case 'm':ans = ans + 'l';break;
		        	case 'n':ans = ans + 'b';break;
		        	case 'o':ans = ans + 'k';break;
		        	case 'p':ans = ans + 'r';break;
		        	case 'q':ans = ans + 'z';break;
		        	case 'r':ans = ans + 't';break;
		        	case 's':ans = ans + 'n';break;
		        	case 't':ans = ans + 'w';break;
		        	case 'u':ans = ans + 'j';break;
		        	case 'v':ans = ans + 'p';break;
		        	case 'w':ans = ans + 'f';break;
		        	case 'x':ans = ans + 'm';break;
		        	case 'y':ans = ans + 'a';break;
		        	case 'z':ans = ans + 'q';break;
		        	case ' ':ans = ans + ' ';break;
        		}
        	}
        	bw.write(ans,0,ans.length());
        	bw.flush();
        	bw.newLine();
        	System.out.println(ans);
        }
    	}
    	catch(Exception e){}
    }
}
