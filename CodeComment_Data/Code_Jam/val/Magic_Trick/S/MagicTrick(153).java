package methodEmbedding.Magic_Trick.S.LYD1789;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;



public class MagicTrick {
	
	static int ncases;
	
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
			PrintWriter writer = new PrintWriter("output.txt");
			ncases = Integer.parseInt(reader.readLine());
			for(int i = 1; i<= ncases ; i++){
				int ans1 = Integer.parseInt(reader.readLine())-1;
				int[][] field1 = new int[4][4];
				for(int row = 0; row<4; row++){
					String[] linea = reader.readLine().split(" ");
					for(int column = 0; column<4; column++){
							field1[row][column] = Integer.parseInt(linea[column]);
					}
				}
				int ans2 = Integer.parseInt(reader.readLine())-1;
				int[][] field2 = new int[4][4];
				for(int row = 0; row<4; row++){
					String[] linea = reader.readLine().split(" ");
					for(int column = 0; column<4; column++){
							field2[row][column] = Integer.parseInt(linea[column]);
					}
				}
				
				ArrayList<Integer> array = new ArrayList<>(4);
				for (int j = 0; j < 4; j++) {
					array.add(field1[ans1][j]);
				}
				int number = 0;
				int answer = 0;
				for (int j = 0; j < 4; j++) {
					if(array.contains(field2[ans2][j])){
						number++;
						answer = field2[ans2][j];
						}
					System.out.println(i +" " + answer);
				}
				
				String out;
				if(number == 0)
					out =  "Volunteer cheated!";
				else if(number == 1 && answer != 0)
					out = String.valueOf(answer);
				else 
					out = "Bad magician!";
				
				writer.println("Case #"+i+": "+out);
			}
			reader.close();
			writer.close();
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	
}
