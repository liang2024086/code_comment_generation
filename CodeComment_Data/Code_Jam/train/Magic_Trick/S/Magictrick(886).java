package methodEmbedding.Magic_Trick.S.LYD1193;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.lang.Integer;

class Magictrick {
   public static void main (String[] args){
    BufferedReader br = null;
 
		try {
 
			String sCurrentLine;
 
			br = new BufferedReader(new FileReader("A-small-attempt0.in"));
			int nTest = Integer.parseInt(br.readLine());

			for(int i=0; i<nTest; i++){
				int firstRowN = Integer.parseInt(br.readLine());
				String firstRow = null;
				for(int j=0; j<4; j++) {
					if(firstRowN == j+1) {
						firstRow = br.readLine();
					} else {
						br.readLine();
					}
				}
				
				int secondRowN = Integer.parseInt(br.readLine());
				String secondRow = null;
				for(int j=0; j<4; j++) {
					if(secondRowN == j+1) {
						secondRow = br.readLine();
					} else {
						br.readLine();
					}
				}
				
				Set<String> s1 = new HashSet<String>(Arrays.asList(firstRow.split(" ")));
				Set<String> s2 = new HashSet<String>(Arrays.asList(secondRow.split(" ")));
				s1.retainAll(s2);

				switch(s1.size()){
					case 0: System.out.println("Case #"+(i+1) + ": Volunteer cheated!"); break;
					case 1: System.out.println("Case #"+(i+1) + ": " + s1.iterator().next()); break;
					default: System.out.println("Case #"+(i+1) + ": Bad magician!"); break;
				}
			}
			
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
 
   }
}

