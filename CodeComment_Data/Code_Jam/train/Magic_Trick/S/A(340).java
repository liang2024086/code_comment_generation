package methodEmbedding.Magic_Trick.S.LYD1796;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class A {
	
	
	public static void main(String args[]) throws IOException {
		System.out.println("Hello world");
		boolean c[] = new boolean[16];

		BufferedReader br = new BufferedReader(new FileReader("A.in"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("A.out"));
		int T = Integer.parseInt(br.readLine());
		for (int t = 1 ; t <= T ; t++){
			for (int i = 0; i < c.length; i++) {
				c[i] =false;
			}
			int a1 = Integer.parseInt(br.readLine()) - 1;
			for (int i = 0 ; i < 4 ; i++){
				String line = br.readLine();
				if (i == a1) {
					String[] tmp = line.split(" ");
					for (int j = 0 ; j < 4 ; j++){
						c[Integer.parseInt(tmp[j])-1] = true;
					}
				}
			}
			int a2 = Integer.parseInt(br.readLine()) - 1;
			int ans = -1;
			for (int i = 0 ; i < 4 ; i++){
				String line = br.readLine();
				if (i == a2) {
					String[] tmp = line.split(" ");
					for (int j = 0 ; j < 4 ; j++){
						int k = Integer.parseInt(tmp[j])-1;
						if (c[k]){
							if (ans != -1) {
								ans = -2;
							} else {
								ans = k;
							}
						}
					}
				}
			}
			
			if (ans == -1) {
				bw.write(String.format("Case #%d: Volunteer cheated!\n", t));
			} else if (ans == -2) {
				bw.write(String.format("Case #%d: Bad magician!\n", t));
			} else {
				bw.write(String.format("Case #%d: %d\n", t,ans+1));
			}
		}
		
		br.close();
		bw.close();
		System.out.println("Finish");
	}
}
