package methodEmbedding.Magic_Trick.S.LYD767;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class MagicTrick {

	public static void main(String argv[]){
		try {
			FileReader file = new FileReader("A-small-attempt1.in");
			BufferedReader reader = new BufferedReader(file);
			String line = "";
			line = reader.readLine();
			
			FileWriter output = new FileWriter("output.txt");
			BufferedWriter writer = new BufferedWriter(output);
			
			int caseNum = Integer.valueOf(line);
			for(int i=0;i<caseNum;i++){
				int row1 = Integer.valueOf(reader.readLine())-1;
				int arrange1[][] = new int[4][4];
				int arrange2[][] = new int[4][4];
				for(int j=0;j<4;j++){
					line = reader.readLine();
					String[] values = line.split(" ");
					for(int k=0;k<4;k++){
						arrange1[j][k]=Integer.valueOf(values[k]);
					}
				}
				
				int row2 = Integer.valueOf(reader.readLine())-1;
				for(int j=0;j<4;j++){
					line = reader.readLine();
					String[] values = line.split(" ");
					for(int k=0;k<4;k++){
						arrange2[j][k]=Integer.valueOf(values[k]);
					}
				}
				
				ArrayList<Integer> answers = new ArrayList<>();
				for(int a=0;a<4;a++){
					for(int b=0;b<4;b++){
						if(arrange1[row1][a] == arrange2[row2][b]){
							answers.add(arrange1[row1][a]);
						}
					}
				}
				
				if(answers.size()>1){
					writer.write("Case #"+(i+1)+": Bad magician!\n");
				} else if (answers.size()<1){
					writer.write("Case #"+(i+1)+": Volunteer cheated!\n");
				} else {
					writer.write("Case #"+(i+1)+": "+answers.get(0) + "\n");
				}
			}

			writer.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
