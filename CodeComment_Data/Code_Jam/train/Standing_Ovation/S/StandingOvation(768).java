package methodEmbedding.Standing_Ovation.S.LYD1124;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StandingOvation {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		File answers = new File("C:\\Users\\Manish\\workspace\\GoogleCodeJam\\src\\Answers.txt");
		FileWriter fstream = new FileWriter(answers);
		BufferedWriter out = new BufferedWriter(fstream); 
		for (int i = 1; i <= testCases; i++) {
			//System.out.println("TESTCASE"+i);
			int maxShyLevel = sc.nextInt();
			int number = sc.nextInt();
			int personWithShyLevel[] = new int[maxShyLevel + 1];
			int j = maxShyLevel;
			while (number > 0) {
				int remainder = number % 10;
				personWithShyLevel[j] = remainder;
				j--;
				number = number / 10;
			}
			/*for(int k=0;k<personWithShyLevel.length;k++){
				System.out.print(personWithShyLevel[k]);
			}
			System.out.println();*/
			int noOfPerson = personWithShyLevel[0];
			int personNeeded = 0;
			int k =0;
			//System.out.println("Length is " + personWithShyLevel.length);
			for (j = 1; j < personWithShyLevel.length; j++) {
				//System.out.println("Person needed "+personNeeded);
				k=0;
				if(personWithShyLevel[j]!=0){
					if (noOfPerson < j) {
						personNeeded += (j - noOfPerson);
						k= personNeeded;
					}
				}
				noOfPerson += (personWithShyLevel[j]+k);
			}
			//System.out.println("Person Needded are " + personNeeded);
			String str = "Case #"+i+": "+personNeeded;
			 out.write(str+"\n");
		}
		 out.close();
		 fstream.close();
	}
}
