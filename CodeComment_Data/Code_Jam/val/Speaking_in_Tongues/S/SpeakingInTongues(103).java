package methodEmbedding.Speaking_in_Tongues.S.LYD361;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SpeakingInTongues
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		SpeakingInTonguesSolver solver = SpeakingInTonguesSolver.getInstance();;
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int testCasesNumber = 0;
		try
		{
			testCasesNumber = Integer.parseInt(bufferedReader.readLine());
			
			for(int testCase = 0; testCase < testCasesNumber; testCase++)
			{
				String solution = solver.solve(bufferedReader.readLine());
				System.out.println("Case #" + (testCase+1) + ": "+solution);
			}
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
