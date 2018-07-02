package methodEmbedding.Standing_Ovation.S.LYD1197;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class A {

	/**
	 * @param args
	 */
	public static Scanner in;
	public static PrintStream out;

	public static void main(String[] args) throws FileNotFoundException {
		in = new Scanner(
				new File(
						"D:/Balaji/My Workspace/Practice/src/gcj2015/A-small-attempt1.in"));
		out = new PrintStream(new File(
				"D:/Balaji/My Workspace/Practice/src/out/out.txt"));
		int cases = in.nextInt();
		int count = 0, num = 0, current_count = 0, temp;
		String str = "";
		for (int loop = 1; loop <= cases; loop++) {
			count = 0;
			num = in.nextInt();
			str = in.next();
			current_count = Integer.parseInt(str.charAt(0) + "");
			for (int i = 1; i <= num; i++) 
			{
				temp = Integer.parseInt(str.charAt(i) + "");
				if(temp==0)
					continue;
				if (current_count >= i)
				{
					current_count += temp;
					//System.out.println(" current_count increased to "+current_count);
				}
				else 
				{
					count = count + (i - current_count);
					current_count = (i - current_count) + current_count +  temp;
					//System.out.println(" count increased to "+count);
					//System.out.println(" current_count increased to "+current_count);
				}
				//System.out.println(" temp : " + temp + " current_count : " + current_count + " i : "+i + " count " +  count);
			}

			out.println("Case #" + loop + ": " + count);
			System.out.println("Case #" + loop + ": " + count);
		}
	}
}
