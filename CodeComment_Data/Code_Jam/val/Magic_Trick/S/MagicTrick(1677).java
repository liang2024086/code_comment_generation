package methodEmbedding.Magic_Trick.S.LYD2107;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.HashSet;

import util.FileUtil;
import y2009.AlienLanguage;

public class MagicTrick {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = FileUtil.getBufferedReader(MagicTrick.class);
		BufferedWriter bw = FileUtil.getBufferedWriter(MagicTrick.class);
		int noOfCases = Integer.parseInt(br.readLine());
		for(int i=0;i<noOfCases;i++){
			int firstAnswer = Integer.parseInt(br.readLine());
			String[] firstArray = null;
			String[] secondArray = null;
			for(int j=1;j<5;j++){
				String line = br.readLine();
				if(j==firstAnswer){
					firstArray = line.split(" ");
				}
			}
			
			HashSet<String> firstSet = new HashSet<String>();
			for(String s : firstArray){
				firstSet.add(s);
			}
			
			int secondAnswer = Integer.parseInt(br.readLine());
			for(int k=1;k<5;k++){
				String line = br.readLine();
				if(k == secondAnswer){
					secondArray = line.split(" ");
				}
			}
			
			
			HashSet<String> secondSet = new HashSet<String>();
			for(String s : secondArray){
				secondSet.add(s);
			}
			firstSet.retainAll(secondSet);
			if(firstSet.size() == 1){
				bw.write("Case #"+(i+1)+": "+Integer.parseInt((String)firstSet.toArray()[0]));
				bw.newLine();
			}
			else if(firstSet.size() > 1){
				bw.write("Case #"+(i+1)+": Bad magician!");
				bw.newLine();
			}
			else{
				bw.write("Case #"+(i+1)+": Volunteer cheated!");
				bw.newLine();
			}
			
		}
		bw.close();
		

	}

}
