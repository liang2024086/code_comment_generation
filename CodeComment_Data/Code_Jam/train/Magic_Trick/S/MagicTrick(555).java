package methodEmbedding.Magic_Trick.S.LYD103;

import java.io.*;

public class MagicTrick {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set up files
		File file = new File("input.txt");
		File outfile = new File("output.txt");
		if(!file.exists()) {
			System.err.println("File doesn't exist!");
			return;
		}
		// Set up data
		int ans, x1, x2, x3, x4; // x1-4 are the numbers in the first row, to be compared with the second row; ans stores the first found number
		int T, rowNum, resCode; // T test cases, rowNum is the row the number is in, resCode holds result code - 0 = "Volunteer cheated!", 1 = answer, 2 = "Bad magician!"
		
		try {
			// Set up streams
			BufferedReader fin = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			BufferedWriter fout = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outfile)));
			
			String line = fin.readLine();
			T = Integer.parseInt(line.trim());
			
			for(int caseNum=0; caseNum<T; ++caseNum) {
				resCode = 0; // reset
				ans = 0; // reset
				line = fin.readLine();
				rowNum = Integer.parseInt(line.trim());
				// We only care about the row the number is found in
				for(int i=rowNum; i>0; --i)
					line = fin.readLine();
				String[] vals = line.split(" ");
				x1 = Integer.parseInt(vals[0]);
				x2 = Integer.parseInt(vals[1]);
				x3 = Integer.parseInt(vals[2]);
				x4 = Integer.parseInt(vals[3]);
				for(int i=4; i>rowNum; --i)
					line = fin.readLine();
				line = fin.readLine();
				rowNum = Integer.parseInt(line.trim());
				for(int i=rowNum; i>0; --i)
					line = fin.readLine();
				vals = line.split(" ");
				for(int i=0; i<4; ++i) {
					int x = Integer.parseInt(vals[i]);
					if(x==x1 || x==x2 || x==x3 || x==x4)
					{
						ans = x;
						++resCode;
					}
				}
				for(int i=4; i>rowNum; --i)
					line = fin.readLine();
				
				System.out.print("Case #" + (caseNum+1) + ": ");
				fout.write("Case #" + (caseNum+1) + ": ");
				switch(resCode) {
				case 0:
					System.out.println("Volunteer cheated!");
					fout.write("Volunteer cheated!\n");
					break;
				case 1:
					System.out.println(ans);
					fout.write("" + ans + "\n");
					break;
				default:
					System.out.println("Bad magician!");
					fout.write("Bad magician!\n");
					break;
				}
			}
			
			// Clean up streams
			fin.close();
			fout.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}		

	}

}
