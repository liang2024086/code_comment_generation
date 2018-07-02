package methodEmbedding.Counting_Sheep.S.LYD1055;

import java.io.File;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(new File("A-small-attempt0.in"));
		in.nextLine();
		String valid = "0123456789";
		String num="";
		int line=0;
		while (in.hasNextLine()) {
			line++;
			String input = in.nextLine();
			if (input.equals("0")) {
				System.out.println("Case #"+line+":" +"INSOMNIA");
			} else {
				int i = 0;
				String temp = valid;
				while (!temp.equals("")) {
					int count = 0;
					num = String.valueOf((i + 1) * Integer.parseInt(input));
					int len = num.length();
					while (count < len) {
						String bit = Character.toString(num.charAt(count));
						if (temp.contains(bit)) {
							String   tmpString = temp.replace(bit,"");
							temp=tmpString;
						}
						count++;
					}
					i++;
				}
				System.out.println("Case #"+line+": "+num);
			}
		}
	}
}
