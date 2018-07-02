package methodEmbedding.Magic_Trick.S.LYD785;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EN2014QA {
	public static void main(String[] args) {
		File inputFile = new File("c:/tmp/A-small-attempt0.in");
		File outputFile = new File("c:/tmp/A-small-attempt0.out");
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
				String caseAnser = null;
				int assentCount = 0;
				int anser = 0;

				lineStr = br.readLine();
				int firstAnswer = Integer.parseInt(lineStr);
				
				int candidateNumbers[] = new int[4];
				
				for(int j=0; j<4; j++){
					lineStr = br.readLine();
					
					if((j+1) == firstAnswer){
						String line[] = lineStr.split(" ");
						for(int i=0; i<4; i++){
							candidateNumbers[i] = Integer.parseInt(line[i]);
						}
					}
				}
//				System.out.println(candidateNumbers[0] + ", " + candidateNumbers[1] + ", " + candidateNumbers[2] + ", " + candidateNumbers[3]);
				
				lineStr = br.readLine();
				int secondAnswer = Integer.parseInt(lineStr);
				
				for(int j=0; j<4; j++){
					lineStr = br.readLine();
					
					if((j+1) == secondAnswer){
						String line[] = lineStr.split(" ");
						for(int i=0; i<4; i++){
							int num = Integer.parseInt(line[i]);

							for(int n = 0; n < candidateNumbers.length; n++){
//								System.out.println(candidateNumbers[n] + "=" + num);
								if(candidateNumbers[n] == num){
									System.out.println(num);
									anser = num;
									assentCount++;
								}
							}
						}
					}
				}

				switch(assentCount){
				case 0:
					caseAnser = "Volunteer cheated!";
					break;
				case 1:
					caseAnser = String.valueOf(anser);
					break;
				default:
					caseAnser = "Bad magician!";				
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
