package methodEmbedding.Magic_Trick.S.LYD157;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class MagicTrick {

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new FileReader("A-small-attempt2.in"));

			int i = 0;
			int numberOfTestCase = Integer.parseInt(br.readLine());

			int answer1, answer2;
			String lineSplit1[], lineSplit2[];
			String y, shuffle1L1, shuffle1L2, shuffle1L3, shuffle1L4, shuffle2L1, shuffle2L2, shuffle2L3, shuffle2L4;
			StringBuffer sb = new StringBuffer();
			int countFound;
			while (true) 
			{
				answer1 = Integer.parseInt(br.readLine());

				i++;
				shuffle1L1 = br.readLine();
				shuffle1L2 = br.readLine();
				shuffle1L3 = br.readLine();
				shuffle1L4 = br.readLine();

				answer2 = Integer.parseInt(br.readLine());

				shuffle2L1 = br.readLine();
				shuffle2L2 = br.readLine();
				shuffle2L3 = br.readLine();
				shuffle2L4 = br.readLine();

				lineSplit1 = answer1 == 1 ? shuffle1L1.split(" ") : answer1 == 2 ? shuffle1L2.split(" ") : 
					answer1 == 3 ? shuffle1L3.split(" ") : shuffle1L4.split(" ");

					lineSplit2 = answer2 == 1 ? shuffle2L1.split(" ") : answer2 == 2 ? shuffle2L2.split(" ") : 
						answer2 == 3 ? shuffle2L3.split(" ") : shuffle2L4.split(" ");

						countFound = 0;
						y = null;
						for(String card1 : lineSplit1)
						{
							for(String card2 : lineSplit2)
							{
								if(card1.equals(card2))
								{
									countFound++;
									y = card1;
								}
							}
						}

						if(countFound == 0)
						{
							sb.append("Case #").append(i).append(": Volunteer cheated!");
						}
						else if(countFound == 1 && y != null)
						{
							sb.append("Case #").append(i).append(": ").append(y);
						}
						else
						{
							sb.append("Case #").append(i).append(": Bad magician!");
						}

						if(i >= numberOfTestCase)
						{
							break;
						}
						else
						{
							sb.append("\n");
						}
			}
			br.close();
			
			BufferedWriter out = new BufferedWriter(new FileWriter("A-small-attempt2.out"));
			out.write(sb.toString());
			out.close();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
