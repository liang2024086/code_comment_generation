package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1279;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CookiesFarm {

	public static void main(String[] args) throws IOException {
		File fileIn = new File("input.in");
		FileReader fin = new FileReader(fileIn);
		File fileOut = new File("output.out");
		FileWriter fout = new FileWriter(fileOut);
		BufferedWriter bw = new BufferedWriter(fout);
		int testCases=0;
		int caseNumber=1;
		try{
			BufferedReader br = new BufferedReader(fin);
			String line = br.readLine();
			if(line!=null){
				testCases = Integer.parseInt(line);
			}
			while(caseNumber<=testCases){
				String str = br.readLine();
				String[] inputData = str.split(" ");
				Double c = Double.parseDouble(inputData[0]);
				Double f = Double.parseDouble(inputData[1]);
				Double x = Double.parseDouble(inputData[2]);
				Double incrementor=2.0;
				Double time=0.0;
				String isXPurchased="No";
				while(!"Yes".equals(isXPurchased)){
					Double value = c+((c*incrementor)/f);
					if(x>value){
						time+=c/incrementor;
						incrementor+=f;
					} else {
						time+=x/incrementor;
						isXPurchased = "Yes";
					}
				}
				bw.write("case #"+caseNumber+": "+time+"\n");
				System.out.println("case #"+caseNumber+": "+time);
				caseNumber++;
			}
		}  catch(IOException e){
			e.printStackTrace();
		} finally{
			bw.close();
		}

	}

}
