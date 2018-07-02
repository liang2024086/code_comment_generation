package methodEmbedding.Magic_Trick.S.LYD335;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Magic {
	static int numCases = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		String s;
		numCases = Integer.parseInt(br.readLine());
//		System.out.println("num casees:"+numCases);
		int firstChoice;
		//		while ((s=br.readLine())!=null) {

		for (int trickNum = 1; trickNum <= numCases; trickNum++) {
//			System.out.println("case:"+trickNum);

			s=br.readLine();
//			System.out.println(s);
			firstChoice = Integer.parseInt(s);
			int counter = firstChoice;
			while (counter!=1) {
				br.readLine();

				counter--;

			}
			s = br.readLine();
			String choiceStrings[] = s.split(" ");
			Integer choices[] = new Integer[choiceStrings.length];
			for (int i = 0; i < choiceStrings.length; i++) {
				choices[i] = Integer.parseInt(choiceStrings[i]);
			}

//			System.out.println("first choices"+Arrays.toString(choices));

			for (int i = 0; i < choices.length-firstChoice; i++) {
				br.readLine();
			}
			int secondChoice = Integer.parseInt(br.readLine());

			counter = secondChoice;

			while (counter!=1) {
				br.readLine();

				counter--;

			}
			s = br.readLine();
			
			String choiceStrings2[] = s.split(" ");
			Integer choices2[] = new Integer[choiceStrings2.length];
			for (int i = 0; i < choiceStrings.length; i++) {
				choices2[i] = Integer.parseInt(choiceStrings2[i]);
			}
			
			for (int i = 0; i < choices2.length-secondChoice; i++) {
				br.readLine();
			}
			
//			System.out.println("second choice:"+Arrays.toString(choices2));
			Arrays.asList(choices);
			Set<Integer> s1 = new HashSet<Integer>(Arrays.asList(choices));
			Set<Integer> s2 = new HashSet<Integer>(Arrays.asList(choices2));
			s1.retainAll(s2);
			List l = new ArrayList();
			l.addAll(s1);
//			System.out.println(l.toString());
			if (l.size()==1) {
				System.out.println("Case #"+trickNum+": "+l.get(0));
			}
			else if (l.size()==0) {
				System.out.println("Case #"+trickNum+": "+"Volunteer cheated!");
			}
			else {
				System.out.println("Case #"+trickNum+": "+"Bad magician!");
			}
		}
	}
	//	}

}
