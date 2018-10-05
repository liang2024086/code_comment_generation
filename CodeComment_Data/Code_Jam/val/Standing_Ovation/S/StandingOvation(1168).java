package methodEmbedding.Standing_Ovation.S.LYD1270;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StandingOvation {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("Input.txt"));
		FileWriter fileWriter =new FileWriter("output.txt");
		BufferedWriter bufferedWriter =new BufferedWriter(fileWriter);
		String testC = br.readLine();

		for (int j = 0;j<Integer.parseInt(testC);j++)
		{
			int totalTillNow = 0;
			int currentReq = 0;
			int totalInvite =0;
			String input = br.readLine();
			String[] inputs = input.split(" ");
			String people = inputs[1];
			for(int i = 0;i<people.length();i++)
			{
				currentReq  = i;
				if(currentReq<=totalTillNow)
				{
					totalTillNow+=Integer.parseInt(new String(""+people.charAt(i)).trim());
				}
				else
				{
					totalInvite+=(currentReq-totalTillNow);
					totalTillNow+=(currentReq-totalTillNow)+Integer.parseInt(new String(""+people.charAt(i)).trim());
				}
			}
			bufferedWriter.write("Case #"+(j+1)+": "+totalInvite);
			bufferedWriter.newLine();
			bufferedWriter.flush();
		}
	}

}
