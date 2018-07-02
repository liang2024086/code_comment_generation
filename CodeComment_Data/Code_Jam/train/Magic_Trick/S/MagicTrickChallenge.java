package methodEmbedding.Magic_Trick.S.LYD1986;

import java.util.*;
import java.io.*;

public class MagicTrickChallenge {

	public static void main(String[] args) throws IOException {

		// Object to read input

		Scanner ob=new Scanner(System.in);

		// Object to write output to file

		FileOutputStream fos=new FileOutputStream("Output.txt");

		// Number of test cases

		int t=Integer.parseInt(ob.nextLine());

		// Checking limits

		if(t>=1 && t<=100) {

			for(int i=0;i<t;i++) {

			int[][] arrangementOne=new int[4][4];

			int[][] arrangementTwo=new int[4][4];

			// First answer

			int answerOne=Integer.parseInt(ob.nextLine());

			// Reading first arrangement

			if(answerOne>=1 && answerOne<=4) {

				for(int j=0;j<4;j++) {

					for(int k=0;k<4;k++) {

					arrangementOne[j][k]=ob.nextInt();

					}

				}

			}

			ob.nextLine();

			// Second answer

			int answerTwo=Integer.parseInt(ob.nextLine());

			// Reading second arrangment

			if(answerTwo>=1 && answerTwo<=4) {

				for(int j=0;j<4;j++) {

					for(int k=0;k<4;k++) {

					arrangementTwo[j][k]=ob.nextInt();

					}

				}

			}

			ob.nextLine();

			int count=0; int answer=0;

			StringBuffer output=new StringBuffer("Case #"+(i+1)+": ");

			// Check if only one card number is equal in both mentioned rows

			for(int j=0;j<4;j++) {

				for(int k=0;k<4;k++) {

					if(arrangementOne[answerOne-1][j]==arrangementTwo[answerTwo-1][k]) {

						count++;
	
						answer=j;

					}

				}

			}

			if(count==1) output.append(arrangementOne[answerOne-1][answer]+"\n");

			else if(count>1) output.append("Bad magician!\n");

			else if(count==0) output.append("Volunteer cheated!\n");

			try {
				byte[] finalOutput=output.toString().getBytes();

				fos.write(finalOutput);

			} catch(Exception e) {

				System.out.println(e.getMessage());

			}

			}

		}

		fos.close();

	}
}
