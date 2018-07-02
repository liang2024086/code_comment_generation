package methodEmbedding.Magic_Trick.S.LYD40;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> input = new ArrayList<String>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader("D:\\prob1input.txt"));
			String line = null;
			while ((line = reader.readLine()) != null) {
				input.add(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		int numT = Integer.parseInt(input.get(0));
		for (int i = 0; i < numT; i++) {
			int start = 10*i;
			int r1 = Integer.parseInt(input.get(start+1).trim());
			ArrayList<String> vals1 = new ArrayList<String>(Arrays.asList(input.get(start+1+r1).trim().split(" ")));
			int r2 = Integer.parseInt(input.get(start+6).trim());
			ArrayList<String> vals2 = new ArrayList<String>(Arrays.asList(input.get(start+6+r2).trim().split(" ")));
			ArrayList<String> possAns = new ArrayList<String>();
			for (String val : vals1) {
				if (vals2.contains(val)) {
					possAns.add(val);
				}
			}
			if (possAns.isEmpty()) {
				System.out.println("Case #"+(i+1)+": Volunteer cheated!");
			} else if (possAns.size() > 1) {
				System.out.println("Case #"+(i+1)+": Bad magician!");
			} else {
				System.out.println("Case #"+(i+1)+": "+possAns.get(0));
			}
		}
		return;
	}
}
