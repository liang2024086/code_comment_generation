package methodEmbedding.Speaking_in_Tongues.S.LYD1024;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SpeakingInToungues  {
	public static void main(String args[])throws IOException{
		Scanner scan = new Scanner(new File(System.getProperty("user.dir")+"/input.in"));
		int n=Integer.parseInt(scan.nextLine());
		FileWriter file = new FileWriter("output.out");
		for(int j=0;j<n;j++){
			String s = scan.nextLine();
			String out=new String();
			for(int i=0;i<s.length();i++){
				switch(s.charAt(i)){
				case 'a':out+="y"; break;
				case 'b':out+="h"; break;
				case 'c':out+="e"; break;
				case 'd':out+="s"; break;
				case 'e':out+="o"; break;
				case 'f':out+="c"; break;
				case 'g':out+="v"; break;
				case 'h':out+="x"; break;
				case 'i':out+="d"; break;
				case 'j':out+="u"; break;
				case 'k':out+="i"; break;
				case 'l':out+="g"; break;
				case 'm':out+="l"; break;
				case 'n':out+="b"; break;
				case 'o':out+="k"; break;
				case 'p':out+="r"; break;
				case 'q':out+="z"; break;
				case 'r':out+="t"; break;
				case 's':out+="n"; break;
				case 't':out+="w"; break;
				case 'u':out+="j"; break;
				case 'v':out+="p"; break;
				case 'w':out+="f"; break;
				case 'x':out+="m"; break;
				case 'y':out+="a"; break;
				case 'z':out+="q"; break;
				default: out+=" ";break;
				}
			}
			file.write("Case #"+Integer.toString(j+1)+": "+out+"\r\n");
		}
		file.close();
	}
}
