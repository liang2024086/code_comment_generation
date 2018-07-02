package methodEmbedding.Magic_Trick.S.LYD1136;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class MagicGame {
	
	public static void main(String[] args){
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
 
			String currentLine;
			File file = new File("C:\\Users\\duttaran\\Downloads\\ouput.txt");
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			bw = new BufferedWriter(fw);
			br = new BufferedReader(new FileReader("C:\\Users\\duttaran\\Downloads\\A-small-attempt1.in"));
			int numOfTestCases = Integer.parseInt(br.readLine());
			for(int i = 1; i <= numOfTestCases; i++){
				Set<String> set = new HashSet<String>();
				for(int j=1;j<=2;j++){
					int rowNum = Integer.parseInt(br.readLine());
					for(int k=1;k<=4;k++){
						String row = br.readLine();
						if(k == rowNum){
							String[] nums = row.split(" ");
							if(j == 1){
								set.addAll(Arrays.asList(nums));
							}else if(j == 2){
								String ans = "";
								int count = 0;
								for(int m = 0; m<4; m++){
									if(set.contains(nums[m])){
										ans = nums[m];
										count++;
									}
								}
								if(count == 0){
									bw.write("Case #" + i + ": Volunteer cheated!");
								}else if(count > 1){
									bw.write("Case #" + i + ": Bad magician!");
								}else if(count == 1){
									bw.write("Case #" + i + ": " + ans);
								}
								if(i < numOfTestCases){
									bw.newLine();
								}
							}else{
								throw new RuntimeException("error");
							}
						}
					}
				}
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

}
