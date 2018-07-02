package methodEmbedding.Magic_Trick.S.LYD1096;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class MagicTrick {
	
	public static void main(String[] args) throws IOException {
		Set<Integer> s1;
		Set<Integer> s2;
		int[][] a1 = new int[4][4];
		int[][] a2 = new int[4][4];
		int t = 0, r1 = 0, r2 = 0;
		
		FileReader input = null;
		try {
			input = new FileReader("A-small-attempt0.in");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	    BufferedReader br = new BufferedReader(input);
		
	    
		String line = br.readLine();
		t = Integer.parseInt(line);
		
		for (int i = 0; i<t; i++){
			s1 = new HashSet<Integer>();
			s2 = new HashSet<Integer>();
			line = br.readLine();
			r1 = Integer.parseInt(line);
			for (int j = 0; j<4; j++){
				line = br.readLine();
				String[] aux = line.split(" ");
				for (int k = 0; k<4; k++){
					a1[j][k]= Integer.parseInt(aux[k]);
				}
				
			}
			line = br.readLine();
			r2 = Integer.parseInt(line);
			for (int j = 0; j<4; j++){
				line = br.readLine();
				String[] aux = line.split(" ");
				for (int k = 0; k<4; k++){
					a2[j][k]= Integer.parseInt(aux[k]);
				}
				
			}
			
			for (int k = 0; k<4; k++){
				s1.add(a1[r1-1][k]);
				s2.add(a2[r2-1][k]);
			}
			
			s1.retainAll(s2);
			Iterator it = s1.iterator();
			if (s1.size()==1){
				System.out.println("Case #"+(i+1)+": "+it.next());
			}
			else if (s1.size()>1){
				System.out.println("Case #"+(i+1)+": Bad magician!");
			}
			else {
				System.out.println("Case #"+(i+1)+": Volunteer cheated!");
			}
		}
	}
}		
