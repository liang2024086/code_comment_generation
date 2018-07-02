package methodEmbedding.Speaking_in_Tongues.S.LYD615;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.io.*;


public class SpeakingInTongues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character,Character> charMap = new HashMap<Character,Character>();
		String str = "ejpmysljylckdkxveddknmcrejsicpdrysirbcpcypcrtcsradkhwyfrepkymveddknkmkrkcddekrkdeoyakwaejtysrreujdrlkgcjv ";
		String answer = "ourlanguageisimpossibletounderstandtherearetwentysixfactorialpossibilitiessoitisokayifyouwanttojustgiveup ";

		if (str.length()==answer.length())
		{
			for (int i=0;i<str.length();i++)
			{
				charMap.put(str.charAt(i), answer.charAt(i));
			}
		}
		
		HashMap<Character,ArrayList<Character>> tempCharMap = new HashMap<Character,ArrayList<Character>>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("A-small-attempt4.in"));
			String strLine;
			
			strLine = br.readLine();
			int numOfLine = Integer.parseInt(strLine);
			
			ArrayList<String> inputs = new ArrayList<String>();
			for (int i=0;i<numOfLine;i++) {
				strLine = br.readLine();
				
				inputs.add(strLine);
				
				for (int j=0;j<strLine.length();j++) {
					Character charInStr = strLine.charAt(j);
					if (charMap.containsKey(charInStr)) {
						continue;
					}
					else {
						Set<Character> containedCharSet = charMap.keySet();
						
						ArrayList<Character> possibleList;
						if (tempCharMap.containsKey(charInStr)) {
							possibleList = tempCharMap.get(charInStr);
						}
						else
						{
							possibleList = new ArrayList<Character>();
							String charset = "abcdefghijklmnopqrstuvwxyz ";
							for (int k=0;k<charset.length();k++) {
								possibleList.add(charset.charAt(k));
							}
						}

						for (Character c : containedCharSet) {
							possibleList.remove(c);
						}
						possibleList.remove(charInStr);

						if (possibleList.size()==1) {
							System.out.println(charInStr);
							System.out.println(possibleList.get(0));
							charMap.put(new Character(charInStr), new Character(possibleList.get(0)));
							System.out.println(charMap.get(charInStr));
						}
						
					}
				}
			}
//			TreeSet<Character> sortedChar = new TreeSet<Character>(charMap.keySet());
//			System.out.println(sortedChar);
//			System.out.println(charMap.get('z'));
			charMap.put('q', 'z');
			charMap.put('z', 'q');
			FileWriter fostream = new FileWriter("output.txt");
			BufferedWriter out = new BufferedWriter(fostream);
			
			int i = 1;
			for (String input : inputs) {
				String output = "";
				for (int j=0;j<input.length();j++) {
					output += charMap.get(input.charAt(j));
				}
				System.out.println("Case #" + i + ": " + output);
				out.write("Case #" + i + ": " + output + "\n");
				i++;
			}
			
			out.close();
		}
		catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
		
	}

}
