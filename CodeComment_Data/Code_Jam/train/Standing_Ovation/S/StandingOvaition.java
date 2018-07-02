package methodEmbedding.Standing_Ovation.S.LYD1380;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StandingOvaition {

	public static void main(String[] args){
		String filePath = "C:/Users/Vineeth/Desktop/A-small-attempt1.in";
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String outputFilePath = "C:/Users/Vineeth/Desktop/A-small-attempt1.txt";
			File file = new File(outputFilePath);
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);

			String line = br.readLine();
			int NtestCases = Integer.parseInt(line);
			for(int j = 0; j<NtestCases; j++){
				String input = br.readLine();
				int nStanding = 0, nInvitedStanding = 0, nInvited = 0;
				String[] inputs = input.split(" ");
				String data = inputs[1];
				for(int i = 0; i<data.length(); i++){
					int nShy = data.charAt(i) - '0';
					if(nStanding < i){
						nInvitedStanding = i-nStanding;
						nStanding = nStanding + nInvitedStanding + nShy;
						nInvited = nInvited + nInvitedStanding;
					} else {
						nStanding += nShy;
					}
				}
				bw.write("Case #"+ (j+1) + ": " + nInvited + "\n");
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

