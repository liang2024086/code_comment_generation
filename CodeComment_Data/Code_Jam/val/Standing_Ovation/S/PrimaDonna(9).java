package methodEmbedding.Standing_Ovation.S.LYD1359;

import java.util.Scanner;
import java.io.*;

class Solution{
	public static void main(String[] args){
		File file = new File("A-small-attempt1.in");


		try {
			File fout = new File("output.txt");
			if(!fout.exists()){
				fout.createNewFile();
			}

			FileWriter fos = new FileWriter(fout.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fos);

			Scanner input = new Scanner(file);
			int testCases = input.nextInt();

			for(int cases = 0; cases < testCases; cases++){
				int maxLevel = input.nextInt();

				String num = input.next();

				int friendCount = 0;
				int standingCount = 0;

				if(num.charAt(0) == '0'){
					friendCount ++;
					standingCount ++;
				}
				else{
					standingCount += (num.charAt(0) - '0');
				}

				for(int i = 1; i <= maxLevel; i++){
					if(standingCount >= i){
						standingCount += (num.charAt(i) - '0'); 
					}
					else {
						friendCount += (i - standingCount);
						standingCount +=  (i - standingCount);
						standingCount += (num.charAt(i) - '0'); 
					}	
				}
				bw.write("Case #" + (cases+1) + ": " + friendCount);
				bw.newLine();
			}
			bw.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e){
			e.printStackTrace();
		}
	}
}
