package methodEmbedding.Revenge_of_the_Pancakes.S.LYD62;

import java.io.IOException;

public class B {

	public static void main(String[] args) throws IOException
	
	{
		InputReader in = new InputReader("B-small-attempt0.in");
		OutputWriter out = new OutputWriter("small.txt");
		int cases = Integer.parseInt(in.getCur());
		for (int num = 1; num <= cases; num++)
		{
			int flips = 0;
			String pancakes = in.getNext();
			boolean lastplus = (pancakes.charAt(0)== '+');
			for (int i = 1; i < pancakes.length(); i++)
			{
				if (lastplus && (pancakes.charAt(i) == '-'))
				{
					flips ++;
					lastplus = false;
				}
				else if (!lastplus && (pancakes.charAt(i) == '+'))
				{
					flips++;
					lastplus = true;
				}
			}
			if (!lastplus)
				flips++;
			String outs = flips +"";
			if (num < cases)
				outs += "\n";
			out.writeCase(outs, num);
		}
		out.close();
	}
	
	
}
