package methodEmbedding.Magic_Trick.S.LYD998;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class MagicTrick {
	
	static BufferedReader in;
	static BufferedWriter out;

	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new FileReader("A-small-attempt0.in"));
		out = new BufferedWriter(new FileWriter("out.txt"));
		String line= in.readLine();
		int T = Integer.parseInt(line);
		int matrix1[][] = new int[4][4], matrix2[][] = new int[4][4];
		int linechosen1[] = new int[4], linechosen2[] = new int[4];
		String output;
		
		for(int t=0; t<T; t++){
			line = in.readLine();
			int firstLine = Integer.parseInt(line);
			
			for(int i=0; i<4; i++){
				line = in.readLine();
				String splitter[] = line.split(" ");
				for(int j=0; j<4; j++)
				{
					matrix1[i][j] = Integer.parseInt(splitter[j]);
				}
			}
			
			linechosen1 = matrix1[firstLine-1];
			
			line = in.readLine();
			//String splitter[] = line.split(" ");
			int secondLine = Integer.parseInt(line);
			
			for(int i=0; i<4; i++){
				line = in.readLine();
				String splitter[] = line.split(" ");
				for(int j=0; j<4; j++)
				{
					matrix2[i][j] = Integer.parseInt(splitter[j]);
				}
			}
			
			linechosen2 = matrix2[secondLine-1];
			
			int ultimTrobat=-1, trobats=0;
			
			for(Integer i: linechosen1)
				for(Integer ii: linechosen2){
					if(i==ii){
						trobats++;
						ultimTrobat = i;
					}
						
				}
			if(trobats == 0)
				output = "Volunteer cheated!";
			else if (trobats == 1)
				output = String.valueOf(ultimTrobat);
			else output = "Bad magician!";
			
			
			out.write("Case #"+(t+1)+": "+output+"\n");
			
			
		}
		in.close();out.close();
	}

}
