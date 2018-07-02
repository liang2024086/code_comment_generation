package methodEmbedding.Magic_Trick.S.LYD1665;

import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;
public class Magician{

	public static void main(String [] args) throws IOException{
		
		File input = new File("/home/pietro/Scrivania/input");

		File output = new File ("/home/pietro/Scrivania/output");

		BufferedReader br = new BufferedReader (new FileReader(input));

		PrintWriter pw = new PrintWriter (new FileWriter(output));

		int nCases = Integer.parseInt(br.readLine());

		for (int n = 1; n<=nCases; n++){
			
			int firstAnsw = Integer.parseInt(br.readLine());

			String firstRow="";

			for (int i = 1; i<5; i++) // 4 round
				if (i == firstAnsw)
					firstRow = br.readLine();
				else
					br.readLine(); //skip other lines;

			int secAnsw = Integer.parseInt(br.readLine());

			String secRow="";

			for (int j = 1; j<5; j++) // 4 round
				if (j == secAnsw)
					secRow = br.readLine();
				else
					br.readLine(); //skip other lines;

			int answType = 0; //1 for OK, 2 for BadMagician, 0 for cheater
			int finalAnsw = -1;

System.out.println("CASE #"+n);
System.out.println(firstRow+"\n"+secRow);

			StringTokenizer one = new StringTokenizer(firstRow," ");

			ArrayList<Integer> nums = new ArrayList<Integer> (4);
			for (int i = 0; i<4; i++)
				nums.add(Integer.parseInt(one.nextToken()));			


			StringTokenizer two = new StringTokenizer(secRow," ");

			for (int i = 0; i<4; i++){

				int current = Integer.parseInt(two.nextToken());

				if (nums.contains(current)){
					answType++;
					finalAnsw = current;
				}
			}

			if (answType == 0)
				pw.println("Case #"+n+": Volunteer cheated!");
			else if(answType>=2)
				pw.println("Case #"+n+": Bad magician!");
			else // 0
				pw.println("Case #"+n+": "+finalAnsw);


		}

	pw.close();

	}


}
