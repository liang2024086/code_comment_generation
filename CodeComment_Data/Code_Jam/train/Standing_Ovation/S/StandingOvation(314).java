package methodEmbedding.Standing_Ovation.S.LYD769;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StandingOvation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    File file = new File("src/input/A-small-attempt2.in");
	    File outFile = new File("A-small-attempt2.out");
	    BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(outFile));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    int testCases = 0;
		try {
			testCases = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    for(int t=1;t<=testCases;t++){
			int count = 0;
	    	try {
				String data = br.readLine();
				String[] tokens = data.split(" ");
				int maxShyness = Integer.parseInt(tokens[0]);
				String shynessData = tokens[1];
				int currentCount = 0;
				for (int i=0; i<=maxShyness; i++){
					//System.out.println(currentCount);
					int cur_val = (int) shynessData.charAt(i) - 48;
					if (currentCount < i && cur_val != 0){
						count += i - currentCount;
						currentCount += + i - currentCount;
					}
					currentCount += cur_val ;
				}
				
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

	        try {
				bw.write("Case #" + t +": "+count+"\n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
