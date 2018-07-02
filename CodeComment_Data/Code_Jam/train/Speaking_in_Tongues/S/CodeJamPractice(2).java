package methodEmbedding.Speaking_in_Tongues.S.LYD173;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class CodeJamPractice {
	public static void main(String[] args) {
		char[] replacementArray = { 'y', 'h', 'e', 's', 'o', 'c', 'v', 'x',
				'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w',
				'j', 'p', 'f', 'm', 'a', 'q' };

		File fileIn = new File("C:/Users/vpamarty.SYMPHONY/Downloads/A-small-attempt1.in");
		File fileOut = new File(
				"C:/Users/vpamarty.SYMPHONY/Documents/A-output-1.txt");
		int ch;
		int lineCount = 0;
		int newLineFlag = 0;
		StringBuffer strContent = new StringBuffer("");
		FileInputStream fin = null;
		FileWriter fstream;

		try {
			fin = new FileInputStream(fileIn);
			fstream = new FileWriter(fileOut);
			BufferedWriter out = new BufferedWriter(fstream);

				while ((ch = fin.read()) != -1) {
					if (newLineFlag==1 && lineCount>0){
						if(lineCount>1){
						out.write("\nCase #"+lineCount+": ");}
						else out.write("Case #"+lineCount+": ");
						newLineFlag=0;
					}
					
					char chRep;

					if( (char)ch <= 'z' && (char)ch >= 'a'){
						chRep = replacementArray[ch - 'a'];
						out.write(chRep);
					} else if ((char)ch == ' '){
						chRep=' ';
						out.write(chRep);
					} else if (ch == 10){ 
						lineCount++;
						newLineFlag=1;
					}
				}

			fin.close();
			out.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
