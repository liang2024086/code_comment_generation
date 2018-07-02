package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1065;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class B {

	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(new File("D:/x????/eclipse2/eclipseWorkSpace/GoogleCodeJam2016/src/input/B-small-attempt0.in"));
			try {
				FileWriter fw = new FileWriter(new File("D:/x????/eclipse2/eclipseWorkSpace/GoogleCodeJam2016/src/output/B-small.txt"));
				int caseNum = Integer.parseInt(input.nextLine());
				for(int i = 1; i <= caseNum; i++) {
					String str = input.nextLine();
					char[] ch = str.toCharArray();
					int len = ch.length;
					char mark = ch[0];
					int flipTimes = 0;
					for(int j = 1; j < len; j++) {
						if(ch[j] != mark) {
							flipTimes++;
							mark = ch[j];
						}
					}
					if(mark == '-') {
						flipTimes++;
					}

					String output = "Case #" + i + ": " + flipTimes + "\n";
					fw.write(output);
				}
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			input.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
