package methodEmbedding.Standing_Ovation.S.LYD1858;

import java.util.List;


public class StandingOvation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> data = FileReader.getData("./A-small-attempt2.in");
		
		for(int i = 1; i < data.size(); i++){
			String line = data.get(i);
			String[] temp = line.split("\\s+");
			
			char[] digits = temp[1].toCharArray();
			
			int res = 0;
			int before = digits[0] - '0';
			
			for(int j = 1; j < digits.length; j++){
				int cur = digits[j] - '0';
				
				if(before < j){
					if(cur != 0){
						res += (j - before);
						before += (j - before + cur);
					}
				}else
					before += cur;
			}
			System.out.println("Case #" + i + ": " + res);
		}
		
	}
}
