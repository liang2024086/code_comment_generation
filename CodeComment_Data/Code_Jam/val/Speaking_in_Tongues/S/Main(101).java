package methodEmbedding.Speaking_in_Tongues.S.LYD71;



import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
	
		ArrayList<Character>text=new ArrayList<Character>(26);
		text.add('y');text.add('n');text.add('f');text.add('i');
		text.add('c');text.add('w');text.add('l');text.add('b');
		text.add('k');text.add('u');text.add('o');text.add('m');
		text.add('x');text.add('s');text.add('e');text.add('v');
		text.add('z');text.add('p');text.add('d');text.add('r');
		text.add('j');text.add('g');text.add('t');text.add('h');
		text.add('a');text.add('q');
	BufferedReader in = new BufferedReader(new FileReader("A-small-attempt1.in"));
	FileWriter out= new FileWriter("A-small-attempt1.out");
	// BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	int t= Integer.parseInt(in.readLine());
	String  G,S;
	char z='a';
		for (int i = 1; i <= t; i++) {
		G=in.readLine();
		S="Case #"+i+": ";
			for (int j = 0; j < G.length(); j++) {
				if(G.charAt(j)==' '){
				S+=" ";
				continue;
				}
				else{
					S+=(char)(z+text.indexOf(G.charAt(j)));
					
				}
			}
			
			out.write(S+"\n");
		}
		
		out.close();
	
	}
}
