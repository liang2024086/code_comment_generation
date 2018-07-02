package methodEmbedding.Magic_Trick.S.LYD543;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class MagicTrick {

	public static void main(String[] args) throws Exception{
		File file = new File(args[0]);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line;
		
		int n = Integer.parseInt(br.readLine());
		int nline = 1;
		while((line = br.readLine()) != null) {
			int a = Integer.parseInt(line);
			
			String[] numbersA = null;
			for(int i = 1; i <= 4; i++) {
				line = br.readLine();
				if(i == a) {
					numbersA = line.split(" ");
				}
			}
			
			line = br.readLine();
			int b = Integer.parseInt(line);
			
			String[] numbersB = null;
			for(int i = 1; i <= 4; i++) {
				line = br.readLine();
				if(i == b) {
					numbersB = line.split(" ");
				}
			}
			
			List<Integer> cartas = new LinkedList<Integer>();
			
			for(int i = 0; i < numbersA.length ; i++) {
				for(int j = 0; j < numbersB.length ; j++) {
					int ra = Integer.parseInt(numbersA[i]);
					int rb = Integer.parseInt(numbersB[j]);
					if(ra == rb) {
						cartas.add(ra);
					}
				}
			}
			
			if(cartas.size() == 0) {
				System.out.format("Case #%d: Volunteer cheated!\n", nline);
			}else if(cartas.size() == 1) {
				System.out.format("Case #%d: %s\n", nline, cartas.get(0));
			}else {
				System.out.format("Case #%d: Bad magician!\n", nline);
			}
			
			
			nline++;
		}
		
		br.close();
	
		
	}
	
}
