package methodEmbedding.Magic_Trick.S.LYD1372;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.StringTokenizer;

public class MagicTrick {
	public static void main(String[] args) {
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("testing.txt"));
			int times = Integer.valueOf(br.readLine());
			
			for (int i=0; i<times; i++){
				int firstAnswer = Integer.valueOf(br.readLine());
				int runner = firstAnswer;
				while(runner > 1){
					br.readLine();
					runner--;
				}
				String firstAnswerRow = br.readLine();
				while (firstAnswer < 4){
					br.readLine();
					firstAnswer++;
				}
				int secAnswer = Integer.valueOf(br.readLine());
				runner = secAnswer;
				while(runner > 1){
					br.readLine();
					runner--;
				}
				String secAnswerRow = br.readLine();
				while (secAnswer < 4){
					br.readLine();
					secAnswer++;
				}
				
				StringTokenizer st = new StringTokenizer(firstAnswerRow);
				HashSet<String> answerMap = new HashSet<String>();
				while (st.hasMoreTokens()) {
			         answerMap.add(st.nextToken());
			     }
				
				StringTokenizer st2 = new StringTokenizer(secAnswerRow);
				int found = 0;
				String foundVal = "";
				while (st2.hasMoreTokens()) {
					String curVal = st2.nextToken();
					if (answerMap.contains(curVal)){
						found++;
						if (found > 1)
							break;
						foundVal = curVal;
					}
				}
				String returnVal = "Case #"+(i+1) + ": ";
				if (found == 1) 
					returnVal += foundVal;
				else if (found > 1)
					returnVal += "Bad magician!";
				else
					returnVal += "Volunteer cheated!";
				System.out.println(returnVal);
			}
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
