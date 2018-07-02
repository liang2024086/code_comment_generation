package methodEmbedding.Speaking_in_Tongues.S.LYD1321;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class A {
	public static void main(String[] args) throws IOException {
		BufferedReader input =
			new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(input.readLine());
		for (int j = 1; j <= a; j++) {
			String b = input.readLine();
			StringBuilder s = new StringBuilder();
			for (int i = 0; i < b.length(); i++) {
				switch(b.charAt(i)) {
					case 'y' : s.append('a'); break;
					case 'n' : s.append('b'); break;
					case 'f' : s.append('c'); break;
					case 'i' : s.append('d'); break;
					case 'c' : s.append('e'); break;
					case 'w' : s.append('f'); break;
					case 'l' : s.append('g'); break;
					case 'b' : s.append('h'); break;
					case 'k' : s.append('i'); break;
					case 'u' : s.append('j'); break;
					case 'o' : s.append('k'); break;
					case 'm' : s.append('l'); break;
					case 'x' : s.append('m'); break;
					case 's' : s.append('n'); break;
					case 'e' : s.append('o'); break;
					case 'v' : s.append('p'); break;
					case 'z' : s.append('q'); break;
					case 'p' : s.append('r'); break;
					case 'd' : s.append('s'); break;
					case 'r' : s.append('t'); break;
					case 'j' : s.append('u'); break;
					case 'g' : s.append('v'); break;
					case 't' : s.append('w'); break;
					case 'h' : s.append('x'); break;
					case 'a' : s.append('y'); break;
					case 'q' : s.append('z'); break;
					default : s.append(' ');
				}
            }
			System.out.println("Case #" + j + ": " + s.toString());
        }
	}
}
