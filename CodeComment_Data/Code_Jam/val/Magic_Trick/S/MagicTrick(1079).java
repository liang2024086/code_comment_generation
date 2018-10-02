package methodEmbedding.Magic_Trick.S.LYD881;

import java.io.*;
import java.util.*;
public class MagicTrick {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader k=new BufferedReader(new FileReader("input.txt"));
		PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
		int test = Integer.parseInt(k.readLine());
		
		
		for (int i = 1; i <= test; i++) {
			
			int firstAns = Integer.parseInt(k.readLine());
			ArrayList<Integer>ans = new ArrayList<>();
			
			for (int j = 0; j < 4; j++) {
				StringTokenizer str=new StringTokenizer(k.readLine());
				if (j + 1 == firstAns) {
					
					for (int l = 0; l < 4; l++) {
						ans.add(Integer.parseInt(str.nextToken()));
					}
					
					
				}
			}
			
			int secondAns = Integer.parseInt(k.readLine());
			int y = -1;
			for (int j = 0; j < 4; j++) {
				StringTokenizer str=new StringTokenizer(k.readLine());
				if (secondAns == j + 1) {
					
					
					for (int j2 = 0; j2 < 4; j2++) {
						int x = Integer.parseInt(str.nextToken());
						
						if (ans.contains(new Integer(x))) {
							if (y == -1) {
								 y = x;
							}
							else {
								y = -2;
							}
						}
					}
				}
				
			}
			
			
			out.print("Case #"+i+": ");
			
			if (y == -1) {
				out.println("Volunteer cheated!");
			}
			
			else if (y == -2) {
				out.println("Bad magician!");
			}
			else {
				out.println(y);
			}
			
			
			
			
			
			
		}
		
		out.close();

	}

}
