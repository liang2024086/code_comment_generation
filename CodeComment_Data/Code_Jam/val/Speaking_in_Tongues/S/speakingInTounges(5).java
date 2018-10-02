package methodEmbedding.Speaking_in_Tongues.S.LYD732;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class speakingInTounges {
	
	private static Map<Character,Character> decoder = new HashMap<Character, Character>();
	
	static
	{
		decoder.put('a', 'y');
		decoder.put('b', 'h');
		decoder.put('c', 'e');
		decoder.put('d', 's');
		
		decoder.put('e', 'o');
		
		decoder.put('f', 'c');
		decoder.put('g', 'v');
		decoder.put('h', 'x');
		decoder.put('i', 'd');
		decoder.put('j', 'u');
		decoder.put('k', 'i');
		decoder.put('l', 'g');
		decoder.put('m', 'l');
		decoder.put('n', 'b');
		decoder.put('o', 'k');
		decoder.put('p', 'r');
		decoder.put('q', 'z');
		decoder.put('r', 't');
		decoder.put('s', 'n');
		decoder.put('t', 'w');
		decoder.put('u', 'j');
		decoder.put('v', 'p');
		decoder.put('w', 'f');
		decoder.put('x', 'm');
		decoder.put('y', 'a');
		decoder.put('z', 'q');
	}
	
	public static void main(String[] args)
	{
		File inputFile = new File("input/" + args[0]);
		
		if (!inputFile.exists())
		{
			System.out.print("File DNE");
			return;
		}
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile)));
			
			Integer caseCount = new Integer(br.readLine());
			String[] lines = new String[caseCount];
			
			for (int i = 0; i < caseCount; i++)
			{
				lines[i] = br.readLine();
				System.out.println(lines[i]);
				
			}
			
			File outputFile = new File("output/" + args[0] + ".out");
			FileWriter fw = new FileWriter(outputFile);
			
			for (int i = 0; i < lines.length; i++)
			{
				fw.write("Case #" + (i + 1) + ": ");
				char[] line = lines[i].toCharArray();
				for (int j = 0; j < line.length; j++)
				{
					if (decoder.get(line[j]) != null)
					{
						fw.write(decoder.get(line[j]));
					}
					else
					{
						fw.write(line[j]);
					}
				}
				fw.write("\n");
			}
			
			fw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
