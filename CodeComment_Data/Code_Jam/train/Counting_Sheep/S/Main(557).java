package methodEmbedding.Counting_Sheep.S.LYD1639;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(new File(
				"C:\\Users\\kille\\Desktop\\A-small-attempt0.in")));
		System.setOut(new PrintStream(new File("C:\\Users\\kille\\Desktop\\A-small-attempt0.out")));
		Integer testCases = Integer.valueOf(br.readLine());
		long num;
		Set<Character> digits;
		char[] numArray;
		String input;
		long result=0;
		for (int i = 0; i < testCases; i++) {
			digits = new HashSet<Character>(); 
			input=br.readLine().trim();
			num = Long.valueOf(input);
			long mul=1;
			int setSize=0;
			setSize = digits.size();
			int mulSize=0;
			long testNum=0;
			while(true)
			{
				mulSize=String.valueOf(mul).length();
				testNum = num*mul;
				numArray=String.valueOf(testNum).toCharArray();
				for (char c : numArray) {
					digits.add(c);
				}
				mul=mul+1;
				if(String.valueOf(mul).length()>mulSize)
				{
					if(setSize==digits.size())
					{
						result=-1;
						break;
					}
					setSize = digits.size();
				}
				if(digits.size()==10)
				{
					result=testNum;
					break;
				}
			}
			System.out.println(result==-1?"Case #"+(i+1)+": INSOMNIA":"Case #"+(i+1)+": "+testNum);
		}
	}

}
