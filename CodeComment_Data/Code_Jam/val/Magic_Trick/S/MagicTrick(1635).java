package methodEmbedding.Magic_Trick.S.LYD1046;

import java.util.LinkedList;

import com.google.util.IOUtil;

public class MagicTrick {

	public static void main(String[] args) {
		IOUtil io = new IOUtil("C:\\Users\\Tom\\Downloads\\A-small-attempt1.in", "C:\\Users\\Tom\\Downloads\\testout.txt");
		int numberOfCases = io.getInt();
		for(int caseNum = 1; caseNum <= numberOfCases; caseNum++){
			int matches = 0;
			Integer answer = null;
			LinkedList<Integer> firstFour = io.getRowAsLinkedList();
			LinkedList<Integer> secondFour = io.getRowAsLinkedList();
			
			for(Integer num : firstFour)
				if (secondFour.contains(num)){
					matches++;
					answer = num;
				}
			
			if (matches == 0)
				io.writePretty("Volunteer cheated!");
			else if (matches == 1)
				io.writePretty(answer.toString());
			else
				io.writePretty("Bad magician!");
		}
		io.close();
	}

}
