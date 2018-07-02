package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1088;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EN2016QB {
	public static void main(String[] args) {
		File inputFile = new File("c:/tmp/B-small-attempt0.in");
		File outputFile = new File("c:/tmp/B-small-attempt0.out");
		FileReader filereader = null;
		BufferedReader br = null;
		FileWriter filewriter = null;
		BufferedWriter bw = null;

		try {
			// ??????
			filereader = new FileReader(inputFile);
			br = new BufferedReader(filereader);

			// ??????
			filewriter = new FileWriter(outputFile);
			bw = new BufferedWriter(filewriter);

			/**************************************************************************************
			// ????????????????????????????????????
			 **************************************************************************************/
			int T;

			// ???????????????????????????
			String lineStr = br.readLine();
			T = Integer.parseInt(lineStr);
			System.out.println("T = " + T + "\n");

			/**************************************************************************************
			// Case???1???????????????
			 **************************************************************************************/
			long caseIndex = 1;
			for(int t=0; t < T; t++) {
				/**************************************************************************************
				// Case?????????
				 **************************************************************************************/
				// ??????
				int caseAnser = -1;

				String pancakes = br.readLine();
				System.out.println(pancakes);

				// "+"???"-"???????????????????????????????????????
				// 1?????????????????????????????????1??????????????????????????????
				// ???????????????????????????"-"????????????????????????????????????????????????

				// ????????????????????????????????????
				int groupNum = 1;
				for(int i=0; i<(pancakes.length()-1); i++){
//					System.out.println("i = " + i + "  " + pancakes.charAt(i) + " " + pancakes.charAt(i+1));
					if(pancakes.charAt(i) != pancakes.charAt(i+1)){
						groupNum++;
					}
				}
				System.out.println("groupNum = " + groupNum);

				if(pancakes.charAt(pancakes.length()-1) == '-'){
					caseAnser = groupNum;
				} else {
					caseAnser = groupNum - 1;
				}


				/**************************************************************************************
				// Case?????????
				 **************************************************************************************/
				String output = "Case #" + caseIndex + ": " + caseAnser;
				caseIndex++;
				System.out.println(output);
				bw.write(output);
				bw.newLine();
				bw.flush();

				/**************************************************************************************
				// ??????Case???????????????
				 **************************************************************************************/
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

			try {
				if (filereader != null) {
					filereader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

			try {
				if (bw != null) {
					bw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

			try {
				if (filewriter != null) {
					filewriter.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
