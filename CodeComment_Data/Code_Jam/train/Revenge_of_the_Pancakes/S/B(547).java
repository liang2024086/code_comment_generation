package methodEmbedding.Revenge_of_the_Pancakes.S.LYD779;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class B {
	
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new FileReader("C:\\Users\\William\\Downloads\\B-small-attempt0.in"));
		//Scanner in = new Scanner(System.in);
		FileWriter out = new FileWriter("outputBsmall.txt");

		int T = in.nextInt();
		in.nextLine();
		for(int t = 0; t < T; t++)
		{
			String input = in.nextLine();
			char curr = input.charAt(0);
			int flips;
			if(curr == '+')
				flips = 0;
			else
				flips = 1;
			for(int i = 1; i < input.length(); i++)
			{
				if(curr != input.charAt(i) && curr == '+')
					flips += 2;
				curr = input.charAt(i);
			}
			out.write("Case #" + (t+1) + ": " + flips + "\n");
		}

		in.close();
		out.close();
	}

}
