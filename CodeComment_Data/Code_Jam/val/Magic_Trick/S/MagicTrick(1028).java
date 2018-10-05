package methodEmbedding.Magic_Trick.S.LYD0;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class MagicTrick {
	public static void main(String[] args) {
		String[] lines = null;
		int index = 0;
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Michael Truell\\Downloads\\A-small-attempt1.in")))
		{
 
			String sCurrentLine;
 
			while ((sCurrentLine = br.readLine()) != null) {
				if(lines == null){
					lines = new String[Integer.parseInt(sCurrentLine)*10];
				}
				else {
					lines[index] = sCurrentLine;
					index++;
				}
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		String[] answer = new String[index/10];
		
		index = 0;
		
		for(int i = 0; i < lines.length; i+=10) {
			int down = Integer.parseInt(lines[i]);
			String[] first = lines[i+down].split(" ");
			
			int secondDown = Integer.parseInt(lines[i+5]);
			String[] second = lines[i+5+secondDown].split(" ");
			
			boolean one = false;
			String card = null;
			boolean multiple = false;
			
			for(int a = 0; a < first.length; a++) {
				for(int b = 0; b < second.length; b++) {
					if(first[a].equals(second[b])) {
						if(one) {
							multiple = true;
							break;
						} else {
							one = true;
							card = first[a];
						}
					}
				}
				if(multiple) {
					break;
				}
			}
			
			
			if(multiple) {
				answer[i/10] = "Case #" + (i/10+1) + ": Bad magician!";
			} else if(one) {
				answer[i/10] = "Case #" + (i/10+1) + ": " + card;
			} else {
				answer[i/10] = "Case #" + (i/10+1) + ": Volunteer cheated!";
			}
			
		}
		
		try {
			PrintWriter out = new PrintWriter(new FileWriter("C:\\Users\\Michael Truell\\Downloads\\output-magic-trick.txt")); 
			for(String i : answer)
				out.println(i); 
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
