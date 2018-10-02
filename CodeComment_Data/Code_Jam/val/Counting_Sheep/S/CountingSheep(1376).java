package methodEmbedding.Counting_Sheep.S.LYD963;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class CountingSheep {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader f = new BufferedReader(new FileReader("C:\\Users\\Varun\\workspace\\GoogleCodeJam2016\\src\\A-small-attempt2.in"));
	    // input file name goes above
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\Varun\\workspace\\GoogleCodeJam2016\\src\\A-small-attempt0.out")));
		
		StringTokenizer st = new StringTokenizer(f.readLine());
		int n = Integer.parseInt(st.nextToken());
		int num = 0;
		boolean forever = false;
		int count = 1;
		int number = 0;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(f.readLine());
			num = Integer.parseInt(st.nextToken());
			count = 1;
			number = 0;
			forever = false;
			HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
			while(true) {
				number = num*count;
				//System.out.println(number);
				while (number > 0) {
					hm.put(new Integer(number % 10), new Integer(number % 10));
				    number = number / 10;
				}
				if(hm.size() == 10) {
					break;
				} else if(num == 0) {
					forever = true;
					break;
				}
				count++;
			}
			if(forever) {
				out.println("Case #" + (i + 1) + ": " + "INSOMNIA");
			} else {
				out.println("Case #" + (i + 1) + ": " + num*count);
			}
			
		}
		out.close();
		
	}

}
