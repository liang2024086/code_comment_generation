package methodEmbedding.Standing_Ovation.S.LYD697;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			StringBuilder sb=new StringBuilder();
			BufferedReader br=new BufferedReader(new FileReader("A-small-attempt0.in"));
			int T=Integer.valueOf(br.readLine());
			for (int i = 0; i < T; i++) {
				String[] ps=br.readLine().split(" ");
				int sh=Integer.valueOf(ps[0]);
				int ex=0;
				int ne=0;
				for (int j = 0; j < ps[1].length(); j++) {
					if(ex<(j)){
						int toAdd=(j-ex);
						ne+=toAdd;
						ex+=toAdd;
					}
					
					ex+=(ps[1].charAt(j)-'0');
				}
				sb.append("case #"+(i+1)+": "+ne+"\n");
			}
			BufferedWriter bw=new BufferedWriter(new FileWriter("A-small-attempt0.out"));
			bw.write(sb.toString());
			bw.close();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		

	}

}
