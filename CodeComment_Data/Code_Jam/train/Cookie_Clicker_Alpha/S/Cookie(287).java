package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1101;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;


public class Cookie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
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
			br = new BufferedReader(new FileReader("C:\\Users\\duttaran\\Downloads\\B-small-attempt0.in"));
			int numOfTestCases = Integer.parseInt(br.readLine());
			DecimalFormat df = new DecimalFormat("#.0000000"); 
			for(int i = 1; i <= numOfTestCases; i++){
				String[] inputArr = br.readLine().split(" ");
				double c = Double.parseDouble(inputArr[0]);
				double f = Double.parseDouble(inputArr[1]);
				double x = Double.parseDouble(inputArr[2]);
				double speed = 2.0;
				double timeConsumed = 0.0;
				while(true){
					if(x/speed >= (x/(speed+f) + c/speed)){
						timeConsumed = timeConsumed + c/speed;
						speed = speed + f;
					}else{
						timeConsumed = timeConsumed + x/speed;
						break;
					}
				}
				bw.write("Case #" + i + ": " + df.format(timeConsumed));
				if(i < numOfTestCases){
					bw.newLine();
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
