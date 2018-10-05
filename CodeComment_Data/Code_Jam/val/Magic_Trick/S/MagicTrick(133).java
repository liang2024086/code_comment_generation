package methodEmbedding.Magic_Trick.S.LYD695;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Vector;

public class MagicTrick {
	public static final String filename = "A";
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(new File(filename+".in"));
		PrintWriter out = new PrintWriter(new FileWriter(filename+".out"));
		int Tries = s.nextInt();
		int triesDone = 0;
		while(Tries > triesDone){
			int row1 = s.nextInt();
			s.nextLine();
			Vector<Integer> numInRow1 = new Vector<Integer>();
			for(int i = 0; i < 4; i++){
				if(i == row1-1){
					numInRow1.add(s.nextInt());
					numInRow1.add(s.nextInt());
					numInRow1.add(s.nextInt());
					numInRow1.add(s.nextInt());
				}
				s.nextLine();
			}
			
			
			int row2 = s.nextInt();
			s.nextLine();
			Vector<Integer> numInRow2 = new Vector<Integer>();
			for(int i = 0; i < 4; i++){
				if(i == row2-1){
					numInRow2.add(s.nextInt());
					numInRow2.add(s.nextInt());
					numInRow2.add(s.nextInt());
					numInRow2.add(s.nextInt());
				}
				s.nextLine();
			}
			
			Vector<Integer> resp = new Vector<Integer>(numInRow1);
			resp.retainAll(numInRow2);
			if(resp.size() == 1){
				out.printf("Case #%d: %d\n",triesDone+1, resp.firstElement());
			} else if (resp.size() <= 4 && resp.size() > 0) {
				out.printf("Case #%d: Bad magician!\n",triesDone+1);
			} else if (resp.size()==0){
				out.printf("Case #%d: Volunteer cheated!\n",triesDone+1);
			}
			triesDone++;
		}
		out.close();
		s.close();
	}
}

