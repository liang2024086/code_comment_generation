package methodEmbedding.Speaking_in_Tongues.S.LYD441;

import java.util.*;
import java.io.*;

public class googlese {
    public static void main(String[] args) throws Throwable {
	String map="yhesocvxduiglbkrztnwjpfmaq";
	Scanner input=new Scanner(new File("googlese.in"));
	PrintWriter out=new PrintWriter("googlese.out");
	int n=input.nextInt();
	input.nextLine();
	for(int i=0;i<n;i++) {
	    String s=input.nextLine();
	    StringBuffer s1=new StringBuffer();
	    for(int j=0;j<s.length();j++) {
		if(s.charAt(j)==' ') s1.append(' ');
		else s1.append(map.charAt(s.charAt(j)-'a'));
		}
	    out.println("Case #"+(i+1)+": "+s1.toString());
	    }
	out.close();
	}
    }
