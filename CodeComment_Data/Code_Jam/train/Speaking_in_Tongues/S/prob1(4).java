package methodEmbedding.Speaking_in_Tongues.S.LYD1158;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class prob1 {
	public static void main(String args[]) {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(new DataInputStream(new FileInputStream("./src/prob1/data.in"))));
			BufferedReader out = new BufferedReader(new InputStreamReader(new DataInputStream(new FileInputStream("./src/prob1/data.out"))));
			BufferedReader rin = new BufferedReader(new InputStreamReader(new DataInputStream(new FileInputStream("./src/prob1/a-small.in"))));
			BufferedWriter rout = new BufferedWriter(new FileWriter("./src/prob1/a-small.out"));

			// map
			int line = Integer.parseInt(in.readLine());
			char[] map = new char[26];
			map['z' - 'a'] = 'q';
			map['q' - 'a'] = 'z';
			for (int i = 0; i < line; i++) {
				String inLine = in.readLine();
				String outLine = out.readLine();
				assert inLine.length() == outLine.length();
				for (int l = 0; l < inLine.length(); l++) {
					if (inLine.charAt(l) >= 'a' && inLine.charAt(l) <= 'z') {
						map[inLine.charAt(l) - 'a'] = outLine.charAt(l);
					}
				}
			}


			int liner = Integer.parseInt(rin.readLine());
			for (int i = 0; i < liner; i++) {
				String inLine = rin.readLine();
				rout.append("Case #"+(i+1)+": ");
				for (int l = 0; l < inLine.length(); l++) {
					if (inLine.charAt(l) >= 'a' && inLine.charAt(l) <= 'z') {
						rout.append(map[inLine.charAt(l)-'a']);
					}else{
						rout.append(inLine.charAt(l));
					}
				}
				rout.append("\n");
			}
			
			rout.flush();
			in.close();
			out.close();
			rin.close();
			rout.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}

	}
}
