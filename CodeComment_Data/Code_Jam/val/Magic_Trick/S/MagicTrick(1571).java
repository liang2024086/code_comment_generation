package methodEmbedding.Magic_Trick.S.LYD1304;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MagicTrick {
	public static void main(String[] args) {
		String inFile = "./src/cj2014/a/A-small-attempt0.in";
		String outFile = inFile.replace(".in", ".out");

		try {
			BufferedReader br = new BufferedReader(new FileReader(inFile));
			BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));
			int cases = Integer.parseInt(br.readLine());

			for (int i = 0; i < cases; i++) {
				
				// get first selected row
				int row1Selected = Integer.parseInt(br.readLine());
				List<String> row1SelectedList = null; 
				for(int rs1=1;rs1<=4;rs1++){
					String row = br.readLine();
					if(row1Selected == rs1) {
						row1SelectedList = Arrays.asList(row.split(" "));	
					}
				}
				
				// get second selected row
				int row2Selected = Integer.parseInt(br.readLine());
				List<String> row2SelectedList = null; 
				for(int rs2=1;rs2<=4;rs2++){
					String row = br.readLine();
					if(row2Selected == rs2) {
						row2SelectedList = Arrays.asList(row.split(" "));
					}
				}
				
				bw.write("Case #"+(i+1)+": "); bw.flush();
				
				List<String> temp = new ArrayList<String>();
				for(String s : row1SelectedList){
					temp.add(s);
				}
				temp.removeAll(row2SelectedList);
				
				if(temp.size()<3){
					bw.write("Bad magician!\n"); bw.flush();
				} else if (temp.size() == 4){
					bw.write("Volunteer cheated!\n"); bw.flush();
				} else {
					for(String s : row2SelectedList){
						if(row1SelectedList.indexOf(s)>=0){
							bw.write(s+"\n");bw.flush();
							break;
						}
					}
				
				}

			}

			br.close();
			bw.close();
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
