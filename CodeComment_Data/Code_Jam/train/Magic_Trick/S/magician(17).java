package methodEmbedding.Magic_Trick.S.LYD164;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		int cases = 0;
		int numCase = 0;
		try {
			BufferedReader in = new BufferedReader(new FileReader("test"));
			cases = Integer.parseInt(in.readLine());
			for (int i = 0; i < cases; i++)
			{
				numCase++;
				int possibilities = 0;
				int line = 0;
				int answer = -1;
				//first square
				line = Integer.parseInt(in.readLine());
				for (int j = 1; j < line; j++)
					in.readLine();
				List<Integer> row = new ArrayList<Integer>();
				String[] rowString = in.readLine().split(" ");
				for (String number:rowString)
					row.add(Integer.parseInt(number));
				for (int j = 4; j > line; j--)
					in.readLine();
				//second square
				line = Integer.parseInt(in.readLine());
				for (int j = 1; j < line; j++)
					in.readLine();
				List<Integer> row2 = new ArrayList<Integer>();
				String[] rowString2 = in.readLine().split(" ");
				for (String number:rowString2)
					row2.add(Integer.parseInt(number));
				for (int j = 4; j > line; j--)
					in.readLine();
				for (int num:row)
				{
					for (int num2:row2)
					{
						if (num2 == num)
						{
							possibilities++;
							answer = num;
						}
					}
				}
				if (possibilities > 1)
					System.out.println("Case #" + numCase +  ": Bad magician!");
				else if (possibilities == 1)
					System.out.println("Case #" + numCase +  ": " + answer);
				else
					System.out.println("Case #" + numCase +  ": Volunteer cheated!");
			}
			in.close();
		} catch (IOException e) {System.out.println("file not found");}
	}
}
