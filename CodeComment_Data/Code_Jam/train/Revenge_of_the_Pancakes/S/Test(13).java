package methodEmbedding.Revenge_of_the_Pancakes.S.LYD751;

import java.io.File;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(new File("B-small-attempt0.in"));
		in.nextLine();
		int line = 0;
		while (in.hasNextLine()) {
			line++;
			String input = in.nextLine();
			String tin = input;
			if (!input.contains("-")) {
				System.out.println("Case #" + line + ": " + "0");
			} else if (!input.contains("+")) {
				System.out.println("Case #" + line + ": " + "1");
			} else {
				int flip = 0;
				int len=0;
				String tmp1="";
				String tmp2="";
				while (tin.contains("-")) {
					len = tin.lastIndexOf("-");
					if(len==0)
					{
						tin = tin.replace("-", "+");
						flip++;
					}
					else
					{
						tmp1=tin.substring(0, len+1);
						tmp1=tmp1.replace("+", "*");
						tmp1=tmp1.replace("-", "+");
						tmp1=tmp1.replace("*", "-");
						tin=tmp1;
						flip++;
					}
				}
				System.out.println("Case #" + line + ": "+flip);
			}
		}
	}
}
