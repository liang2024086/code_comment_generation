package methodEmbedding.Speaking_in_Tongues.S.LYD459;

import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class A{



        public static void main(String []args) throws Exception {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int t = Integer.parseInt(br.readLine());
                
		int a = 0;
                while(t > 0) { t--;a++;
			 String in = br.readLine();
                	String r = "";
                	for(int i = 0; i < in.length(); i++) {
                        	char c = in.charAt(i);
                        	if(c == ' ') { r += (c+"");}
                        	else if(c != ' ') { 
				 if(c == 'a') { r +='y';}
        			else if(c == 'b') { r += 'h';}
        			else if(c == 'c') {  r += 'e';}
        			else if(c == 'd') {  r += 's';}
         			else if(c == 'e') {  r += 'o';}
         			else if(c == 'f') {  r += 'c';}
         			else if(c == 'g') {  r += 'v';}
         			else if(c == 'h') {  r += 'x';}
         			else if(c == 'i') {  r += 'd';}
         			else if(c == 'j') {  r += 'u';}
         			else if(c == 'k') {  r += 'i';}
         			else if(c == 'l') {  r += 'g';}
         			else if(c == 'm') {  r += 'l';}
         			else if(c == 'n') {  r += 'b';}
         			else if(c == 'o') {  r += 'k';}
         			else if(c == 'p') {  r += 'r';}
         			else if(c == 'q') {  r += 'z';}
         			else if(c == 'r') {  r += 't';}
         			else if(c == 's') {  r += 'n';}
         			else if(c == 't') {  r += 'w';}
         			else if(c == 'u') {  r += 'j';}
         			else if(c == 'v') {  r += 'p';}
         			else if(c == 'w') {  r += 'f';}
        			 else if(c == 'x') {  r += 'm';}
         			else if(c == 'y') {  r += 'a';}
         			else if(c == 'z') {  r += 'q';}

				}
                	}
		
		System.out.println("Case #"+a+": "+r);
        	}
	}
}

