package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1303;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class task2 {

	public static void main(String[] args) {
		
		int numcases = 0;
		
		HashMap<Integer, Game> cases = new HashMap<Integer, Game>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("B-small-attempt0.in"));
			String line = null;
			numcases = Integer.valueOf(br.readLine());
			
			for (int i = 0; i < numcases; i++) {
				
				
				line = br.readLine();
				String[] splitter = line.split("\\s+");
				Game game=new Game(Double.parseDouble(splitter[0]),Double.parseDouble(splitter[1]),Double.parseDouble(splitter[2])); 
			
				
				cases.put(i+1, game);
			}
			
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			Game variables = null;
			BufferedWriter bw = new BufferedWriter(new FileWriter("solution.txt"));
			for (int i = 1; i < numcases+1; i++) {
				variables = (Game) cases.get(i);
//				bw.write("Case #" + (i) + ": " + variables[2] + " ");
				bw.write("Case #" + (i) + ": " + variables.recurse(0,variables.getGoal()/2,0));
				
				if(i!=numcases){
				bw.newLine();
				}
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
