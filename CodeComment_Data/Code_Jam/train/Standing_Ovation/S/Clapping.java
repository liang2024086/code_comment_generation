package methodEmbedding.Standing_Ovation.S.LYD270;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Clapping {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = null;
		StringBuffer outBuff = new StringBuffer();
		File file = new File("C:\\Workspace\\CodeJam\\InputFils\\A-small-attempt1-output.txt");
		 
		// if file doesnt exists, then create it
		if (!file.exists()) {
			file.createNewFile();
		}

		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		br = new BufferedReader(new FileReader("C:\\Workspace\\CodeJam\\InputFils\\A-small-attempt1.in"));
		
		int tc = Integer.parseInt(br.readLine());
		int count = 1;
		while(count <= tc){
			String val = br.readLine();
			String[] Svals = val.split(" ");
			int Smax = Integer.parseInt(Svals[0]);
			int len = Svals[1].length();
			int totalFriends = 0;
			int totalClapping = 0;
			for(int clapIndex = 0; clapIndex < len; clapIndex++){
				int noc = Character.getNumericValue(Svals[1].charAt(clapIndex));
				
				if(clapIndex <= totalClapping){
					totalClapping += noc;
				}else{
					int reqClappers = clapIndex - totalClapping;
					totalFriends += reqClappers;
					totalClapping += reqClappers+noc;
				}
			}
			
			outBuff.append("Case #"+(count)+": "+totalFriends);
			outBuff.append(System.lineSeparator());
			count ++;
		}
		
		bw.write(outBuff.toString());
		bw.close();
		
	}

}
