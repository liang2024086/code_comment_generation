package methodEmbedding.Magic_Trick.S.LYD392;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class MagicTrick {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line = br.readLine();
			int T = Integer.parseInt(line);
			
			for (int i=1; i<=T; i++) {
				
				int firstRow = Integer.parseInt(br.readLine());
				String[] firstGrid = new String[4];
				for (int j=0; j<4; j++) {
					firstGrid[j] = br.readLine();
				}
				String[] firstCandidates = firstGrid[firstRow-1].split(" ");

				
				int secondRow = Integer.parseInt(br.readLine());
				String[] secondGrid = new String[4];
				for (int j=0; j<4; j++) {
					secondGrid[j] = br.readLine();
				}
				String[] secondCandidates = secondGrid[secondRow-1].split(" ");
				
				Set<String> candidates = new HashSet<String>();
				for (String f : firstCandidates) {
					for (String s : secondCandidates) {
						if (f.equals(s)) {
							candidates.add(f);
						}
					}
				}
				
				String result = "";
				if (candidates.size() == 0) {
					result = "Volunteer cheated!";
				} else if (candidates.size() == 1){
					String[] temp = new String[1];
					candidates.toArray(temp);
					result = temp[0];
				} else {
					result = "Bad magician!";
				}
				
				System.out.println("Case #"+i+": "+result);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
