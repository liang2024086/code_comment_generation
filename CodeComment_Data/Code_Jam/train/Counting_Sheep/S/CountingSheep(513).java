package methodEmbedding.Counting_Sheep.S.LYD35;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class CountingSheep {
	
	public static void main(String [] args)
	{
		BufferedReader br = null;
		PrintWriter pw = null;
		String format = "Case #";
		String infinite = "INSOMNIA";
		String [] ret = null;
		try{
			br = new BufferedReader(new FileReader("test.in"));
			String line = null;
			int testCaseNumber = Integer.parseInt((br.readLine()));
			ret = new String [testCaseNumber];
			Set<Integer> set;
			int index = 0;
			while((line = br.readLine()) != null)
			{
				int number = Integer.parseInt(line);
				set = new HashSet<Integer>();
				int count = 1;
				int countAttempts = 0;
				int temp = 0;
				int oldTemp = 0;
				boolean isInfinite = false;
				while(set.size() < 10){
					temp = number*count;
					countAttempts++;
					if(temp != oldTemp){
						countAttempts = 0;
						oldTemp = temp;
					}
					else if(countAttempts > 10){
						isInfinite = true;
						break;
					}
					char [] digits = String.valueOf(temp).toCharArray();
					for(int i = 0; i < digits.length; i++){
						int nr = (int)digits[i] - 48;
						set.add(nr);
					}
					count++;
				}
				if(isInfinite) ret[index] = infinite;
				else ret[index] = ""+temp;
				index++;
			}
			pw = new PrintWriter(new FileWriter("out.txt"));
			for(int i = 1; i <= testCaseNumber; i++)
			{
				pw.println(format + i + ": " + ret[i-1]);
			}
		}
		catch(Exception e){ e.printStackTrace(); }
		finally{
			if(br != null)
				try {
					br.close();
				} catch (IOException e) { }
			if(pw != null){
				pw.close();
			}
		}
	}
}
