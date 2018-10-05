package methodEmbedding.Magic_Trick.S.LYD1747;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
public class MagicTrick {
	public static void main(String[] args) {		
		try (BufferedReader br = new BufferedReader(new FileReader("data.in"))) {
			BufferedWriter bw = new BufferedWriter(new FileWriter("data.out"));
			int N = Integer.parseInt(br.readLine());
			for(int i=0; i<N; i++){
				int A1 = Integer.parseInt(br.readLine());
				HashSet<Integer> hs1 = new HashSet<Integer>();
				for(int j=0; j<4; j++){
					String s = br.readLine();
					if(j+1 == A1){
						StringTokenizer tok = new StringTokenizer(s);
						while(tok.hasMoreTokens()){
							hs1.add(Integer.parseInt(tok.nextToken()));
						}
					}
				}
				int A2 = Integer.parseInt(br.readLine());
				HashSet<Integer> hs2 = new HashSet<Integer>();
				for(int j=0; j<4; j++){
					String s = br.readLine();
					if(j+1 == A2){
						StringTokenizer tok = new StringTokenizer(s);
						while(tok.hasMoreTokens()){
							hs2.add(Integer.parseInt(tok.nextToken()));
						}
					}
				}
				hs1.retainAll(hs2);
				switch(hs1.size()){
				case 0:
					bw.write("Case #" + (i+1) + ": Volunteer cheated!\n");
					break;
				case 1:
					bw.write("Case #" + (i+1) + ": " + hs1.toArray()[0] + "\n");
					break;
				default:
					bw.write("Case #" + (i+1) + ": Bad magician!\n");
					break;
				}
			}
			br.close();
			bw.close();
		} catch (IOException e) {

		}
	}
}
