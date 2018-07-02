package methodEmbedding.Speaking_in_Tongues.S.LYD513;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class SpeakinginTongues {
	public SpeakinginTongues() {
		BufferedReader in = null;
		PrintWriter out = null;
		try {
			in = new BufferedReader(new FileReader("small.in"));
			out = new PrintWriter(new FileWriter("small.out"));
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			int num = Integer.parseInt(in.readLine());
			for(int ii=0;ii<num;ii++){
				String source=in.readLine();
				String target="";
				for(int i=0;i<source.length();i++){
					switch(source.charAt(i)){
					case 'a':target=target+"y";break;
					case 'b':target=target+"h";break;
					case 'c':target=target+"e";break;
					case 'd':target=target+"s";break;
					case 'e':target=target+"o";break;
					case 'f':target=target+"c";break;
					case 'g':target=target+"v";break;
					case 'h':target=target+"x";break;
					case 'i':target=target+"d";break;
					case 'j':target=target+"u";break;//10
					case 'k':target=target+"i";break;
					case 'l':target=target+"g";break;
					case 'm':target=target+"l";break;
					case 'n':target=target+"b";break;
					case 'o':target=target+"k";break;
					case 'p':target=target+"r";break;
					case 'q':target=target+"z";break;
					case 'r':target=target+"t";break;
					case 's':target=target+"n";break;
					case 't':target=target+"w";break;//20
					case 'u':target=target+"j";break;
					case 'v':target=target+"p";break;
					case 'w':target=target+"f";break;
					case 'x':target=target+"m";break;
					case 'y':target=target+"a";break;
					case 'z':target=target+"q";break;
					case ' ':target=target+" ";break;
					}
				}
				int inn=ii+1;
				target="Case #"+inn+": "+target;
				out.println(target);
			}
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.close();
	}

	public static void main(String args[]) {
		new SpeakinginTongues();
	}
}
