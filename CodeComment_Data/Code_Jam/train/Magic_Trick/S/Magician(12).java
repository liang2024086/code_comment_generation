package methodEmbedding.Magic_Trick.S.LYD1786;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Magician {
	public static void main(String[] args) {
		BufferedReader br = null;
		int tests = 0;
		int n = 0;
		try {
			 
			String sCurrentLine;
			br = new BufferedReader(new FileReader("/Users/arnabsarkar/Documents/Docs/NYU/Sem2/test.txt"));
			if((sCurrentLine = br.readLine()) != null) {
				tests = Integer.parseInt(sCurrentLine);
			}
			for(int i = 0;i<tests;i++ ){
				sCurrentLine = br.readLine();
				int row1 = Integer.parseInt(sCurrentLine);
				for (int j = 0; j < row1; j++) {
					sCurrentLine = br.readLine();
				}
				StringTokenizer st = new StringTokenizer(sCurrentLine);
				int array[] = new int[16];
				while (st.hasMoreTokens()) {
					int val = Integer.parseInt(st.nextToken());
					array[val-1]++;
				}				
				for (;row1 <= 4; row1++)
					sCurrentLine = br.readLine();				
				int row2 = Integer.parseInt(sCurrentLine);
				for (int j = 0; j < row2; j++) {
					sCurrentLine = br.readLine();
				}
				st = new StringTokenizer(sCurrentLine);
				while (st.hasMoreTokens()) {
					int val = Integer.parseInt(st.nextToken());
					array[val-1]++;
				}
				int check = 0;
				int answer=0;				
				for (int j = 0; j < 16; j++)
				{
					if (check == 0 && array[j] == 2) {
						check = 1;
						answer = j;
					} else if (check == 1 && array[j] == 2) {
						check = -1;
					} 
				}
				n++;
				System.out.print("Case #"+ n +": ");
				if (check == 1){
					System.out.println(answer+1);
				} else if (check == -1) {
					System.out.println("Bad magician!");
				} else {
					System.out.println("Volunteer cheated!");
				}
				for (;row2 < 4; row2++)
					sCurrentLine = br.readLine();				
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
