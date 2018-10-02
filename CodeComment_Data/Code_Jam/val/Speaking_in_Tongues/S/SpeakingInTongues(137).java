package methodEmbedding.Speaking_in_Tongues.S.LYD170;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SpeakingInTongues {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
		FileWriter fw = new FileWriter("A-small-practice.out");
		int N = new Integer(in.readLine());
		for(int cases = 1; cases <= N; cases++){
			String st = new String(in.readLine());
			char[] starray = st.toCharArray();
			fw.write("Case #" + cases + ": ");
			for(int i = 0; i < st.length(); i++){
				switch (starray[i])  {
				case ' ' : fw.write(" "); break;
				case 'a' : fw.write("y"); break;
				case 'b' : fw.write("h"); break;
				case 'c' : fw.write("e"); break;
				case 'd' : fw.write("s"); break;
				case 'e' : fw.write("o"); break;
				case 'f' : fw.write("c"); break;
				case 'g' : fw.write("v"); break;
				case 'h' : fw.write("x"); break;
				case 'i' : fw.write("d"); break;
				case 'j' : fw.write("u"); break;
				case 'k' : fw.write("i"); break;
				case 'l' : fw.write("g"); break;
				case 'm' : fw.write("l"); break;
				case 'n' : fw.write("b"); break;
				case 'o' : fw.write("k"); break;
				case 'p' : fw.write("r"); break;
				case 'q' : fw.write("z"); break;
				case 'r' : fw.write("t"); break;
				case 's' : fw.write("n"); break;
				case 't' : fw.write("w"); break;
				case 'u' : fw.write("j"); break;
				case 'v' : fw.write("p"); break;
				case 'w' : fw.write("f"); break;
				case 'x' : fw.write("m"); break;
				case 'y' : fw.write("a"); break;
				case 'z' : fw.write("q"); break;
				default  : break;	
				}
			
			}
			if (cases != N) { fw.write("\n"); }
		}
		fw.flush();
		fw.close();
	}
}
