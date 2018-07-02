package methodEmbedding.Magic_Trick.S.LYD877;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.StringTokenizer;
import java.util.Vector;

public class JamMain {
	public static void main(String[] args) {
		System.out.println("wtf duh");
		
		try
		{
			BufferedReader input = new BufferedReader(new FileReader("A-small-attempt0.in"));
			BufferedWriter output = new BufferedWriter(new FileWriter("output.txt"));
			Vector<InputCase> inputCases = new Vector<InputCase>();

			int testCaseCount = Integer.parseInt(input.readLine());
			 
			for( int iCase = 0; iCase < testCaseCount; iCase++ )
			{
				InputCase inputCase = new InputCase();
				inputCase.firstRow = Integer.parseInt(input.readLine()) - 1;
				for( int iRow = 0; iRow< 4; iRow++ )
				{
					StringTokenizer st = new StringTokenizer(input.readLine());
					for( int iCol = 0; iCol < 4; iCol++ )
					{
						inputCase.firstGrid[iRow][iCol] = Integer.parseInt(st.nextToken());
					}
				}
				inputCase.secondRow = Integer.parseInt(input.readLine()) - 1;
				for( int iRow = 0; iRow< 4; iRow++ )
				{
					StringTokenizer st = new StringTokenizer(input.readLine());
					for( int iCol = 0; iCol < 4; iCol++ )
					{
						inputCase.secondGrid[iRow][iCol] = Integer.parseInt(st.nextToken());
					}
				}
				inputCases.add(inputCase);

			}
			
			String badMagician = "Bad magician!";
			String volunteerCheated = "Volunteer cheated!";

			// process
			for( int iCase = 0; iCase < testCaseCount; iCase++ )
			{
				InputCase inputCase = inputCases.elementAt(iCase);
				String caseAnswer;
				// For each test case, output one line containing "Case #x: y", 
			
				// If there is a single card the volunteer could have chosen, 
				// y should be the number on the card.
				Vector<Integer> intersection = new Vector<Integer>();
				for( int iColA = 0; iColA < 4; iColA++ )
				{
					int firstRowVal = inputCase.firstGrid[inputCase.firstRow][iColA];
					for( int iColB = 0; iColB < 4; iColB++ )
					{
						if( firstRowVal
								== inputCase.secondGrid[inputCase.secondRow][iColB] )
						{
							intersection.add(firstRowVal);
						}
					}
				}
				if( intersection.size() == 1 )
				{
					caseAnswer = intersection.elementAt(0).toString();
				}
				else if( intersection.size() == 0 )
				{
					caseAnswer = volunteerCheated;
				}
				else
				{
					caseAnswer = badMagician;
				}
				
				// If there are multiple cards the volunteer could have chosen, 
				// y should be "Bad magician!", without the quotes. 
				
				// If there are no cards consistent with the volunteer's answers, 
				// y should be "Volunteer cheated!", without the quotes.
				 
				String outputLine = "Case #" + (iCase+1) + ": " + caseAnswer + "\r\n";
				output.write(outputLine);
				output.flush();
			}

			  
			 
			System.out.println("success");
		}
		catch( Exception e )
		{
			System.out.println("Exception: e=" + e);
		}
	}
}
