package methodEmbedding.Standing_Ovation.S.LYD1627;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PrimaDonna {
	
	public static void main(String[] args) throws IOException {		
		File file = new File(args[0]);
		FileReader fileReader = new FileReader(file);
		BufferedReader br = new BufferedReader(fileReader);
		
		boolean isFirstLine = true;
		//int t = 0;
		int caseNumber = 0;
		String line = null;
		while ((line = br.readLine()) != null) {
			if (isFirstLine) {
				//t = Integer.valueOf(line).intValue();
				isFirstLine = false;
				continue;
			}
			String[] split = line.split(" ");
			//int sMax = Integer.valueOf(split[0]).intValue();
			String[] shynessLevels = split[1].split("");
			
			int result = 0;
			int already = 0;
			for(int i = 0; i < shynessLevels.length; ++i) {
				int n = Integer.valueOf(shynessLevels[i]).intValue();
				if (already >= i) {
					already += n;
					continue;
				}
				++result;
				already += n + 1;
			}
			
			++caseNumber;
			System.out.println("Case #"+caseNumber+ ": " + result);
		}
		
		br.close();
	}

}
