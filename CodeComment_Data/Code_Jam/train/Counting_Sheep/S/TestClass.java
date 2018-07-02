package methodEmbedding.Counting_Sheep.S.LYD991;

import java.util.*;
public class TestClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfLines = Integer.parseInt(sc.nextLine());
		HashSet<Integer> digitSet = new HashSet<>();
		StringBuffer sb = new StringBuffer();
		for (int i = 1; i <= numberOfLines; i++) {
    		int n = Integer.parseInt(sc.nextLine());
    		//System.out.println("n: " + n);
    		sb.append("Case #");
    		sb.append(i);
    		sb.append(": ");
    		if (n == 0) {
    			sb.append("INSOMNIA");
    			sb.append("\n");
    			continue;
    		}
    		int multiplier = 1;
    		while (digitSet.size() < 10) {
    			int number = n * multiplier;
    			//System.out.println("number: " + number);
    			while (number > 0) {
    				digitSet.add(number % 10);
    				number = number / 10;
				}
				multiplier++;
    		}
    		digitSet.clear();
    		sb.append(n * (multiplier - 1));
    		sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
