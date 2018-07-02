package methodEmbedding.Standing_Ovation.S.LYD572;


import java.io.*;

public class StandingOvation {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("A-small-attempt0.in");
		BufferedReader br = new BufferedReader(fr);
		int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++){
			String [] input = br.readLine().split(" ");
			int sMax = Integer.parseInt(input[0]);
			String shyness = input[1];
			int numPpl = 0;
			int numAdds = 0;
			for(int i = 0; i < shyness.length(); i++){
				if (i <= numPpl){
					numPpl += Integer.parseInt(""+shyness.charAt(i));
				}
				else {
					numAdds += i - numPpl;
					numPpl += Integer.parseInt(""+shyness.charAt(i)) + i - numPpl;
				}
			}
			System.out.println("Case #" + (t+1) + ": " + numAdds);
		}
		

	}

}
