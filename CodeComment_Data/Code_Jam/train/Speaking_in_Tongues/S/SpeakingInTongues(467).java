package methodEmbedding.Speaking_in_Tongues.S.LYD885;

import java.io.*;
import java.util.*;
import java.lang.Math.*;

public class SpeakingInTongues {

	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(new File("SpeakingInTongues.in"));
	    PrintWriter p = new PrintWriter("SpeakingInTongues.out");
	    int n;
	    String l;
	    String googlerese = "yhesocvxduiglbkrztnwjpfmaq";
	    n = Integer.parseInt(in.nextLine());
	    for(int c = 1; c < n+1; c++){
	    	p.print("Case #"+c+": ");
	    	l = in.nextLine();	    
	    	for(int i = 0; i < l.length(); i++){
	    		if(l.charAt(i)==' '){
	    			p.print(' ');
	    		}else{
	    			p.print(googlerese.charAt(l.charAt(i)-97));
	    		}
	    	}p.println();
	    }
	    in.close();
	    p.close();
	}

}
