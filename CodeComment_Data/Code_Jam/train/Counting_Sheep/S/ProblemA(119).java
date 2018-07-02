package methodEmbedding.Counting_Sheep.S.LYD1109;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProblemA {

	public static void main(String[] args) throws NumberFormatException, IOException {
		String problem = "A";
		boolean small = true;
		int attempt = 1;
		
		String size = small ? "small-attempt" + attempt : "large";
		BufferedReader br = new BufferedReader(new FileReader("2016-qualification/"+problem+"-"+size+".in"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("2016-qualification/"+problem+"-"+size+".out"));
		
		//bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int numTestCases = Integer.parseInt(br.readLine());
		for (int i = 1; i <= numTestCases; i++){
			// Do the thing.
			String[] line = br.readLine().split(" ");
			int num = Integer.parseInt(line[0]);

			if (num == 0){
				bw.write("Case #" + i + ": INSOMNIA\n");
				continue;
			}
			List<Integer> myNum = new ArrayList<Integer>();
			while(num >=1) {
				int digit = num%10;
				num = num/10;
				myNum.add(digit);
			}

			List<Integer> runningResult = new ArrayList<Integer>(myNum);
			
			int carry = 0;
			int ticker = 30;
			Integer[] VALUES = new Integer[] { 0,1,2,3,4,5,6,7,8,9 };
			Set<Integer> left = new HashSet<Integer>(Arrays.asList(VALUES));

			// Do fun stuff
			
			while (ticker > 0) {
				for (Integer a : runningResult){
					if (left.remove(a)) ticker = 100;
				}
				if (left.size() == 0){
					break;
				}
				List<Integer> newList = new ArrayList<Integer>();
				
				for (int iii = 0 ; iii < runningResult.size(); iii++) {
					int toAdd = runningResult.get(iii);
					if (iii < myNum.size()) {
						toAdd += myNum.get(iii);
					}
					toAdd += carry;
					carry = toAdd / 10;
					toAdd = toAdd % 10;
					newList.add(toAdd);
				}
				if (carry > 0) {
					newList.add(carry);
					carry=0;
				}
				runningResult = newList;
				ticker--;
			}
			if (ticker == 0){
				bw.write("Case #" + i + ": INSOMNIA\n");
			}
			
			Collections.reverse(runningResult);
			
			bw.write("Case #" + i + ": ");
			// Result here.
			for (Integer dig : runningResult) {
				bw.write(dig.toString());
			}
			bw.write("\n");
		}
		br.close();
		bw.close();
	}
}
