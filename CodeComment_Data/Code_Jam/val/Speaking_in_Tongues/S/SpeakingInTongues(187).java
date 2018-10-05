package methodEmbedding.Speaking_in_Tongues.S.LYD1313;


import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

/*
 * Problem

We have come up with the best possible language here at Google, called Googlerese. To translate text into Googlerese, we take any message and replace each English letter with another English letter. This mapping is one-to-one and onto, which means that the same input letter always gets replaced with the same output letter, and different input letters always get replaced with different output letters. A letter may be replaced by itself. Spaces are left as-is.

For example (and here is a hint!), our awesome translation algorithm includes the following three mappings: 'a' -> 'y', 'o' -> 'e', and 'z' -> 'q'. This means that "a zoo" will become "y qee".

Googlerese is based on the best possible replacement mapping, and we will never change it. It will always be the same. In every test case. We will not tell you the rest of our mapping because that would make the problem too easy, but there are a few examples below that may help.

Given some text in Googlerese, can you translate it to back to normal text?

Solving this problem

Usually, Google Code Jam problems have 1 Small input and 1 Large input. This problem has only 1 Small input. Once you have solved the Small input, you have finished solving this problem.

Input

The first line of the input gives the number of test cases, T. T test cases follow, one per line.

Each line consists of a string G in Googlerese, made up of one or more words containing the letters 'a' - 'z'. There will be exactly one space (' ') character between consecutive words and no spaces at the beginning or at the end of any line.

Output

For each test case, output one line containing "Case #X: S" where X is the case number and S is the string that becomes G in Googlerese.

Limits

1 ? T ? 30.
G contains at most 100 characters.
None of the text is guaranteed to be valid English.
Sample

Input
3
ejp mysljylc kd kxveddknmc re jsicpdrysi
rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd
de kr kd eoya kw aej tysr re ujdr lkgc jv


Output
Case #1: our language is impossible to understand
Case #2: there are twenty six factorial possibilities
Case #3: so it is okay if you want to just give up

 * */
public class SpeakingInTongues {
	static HashMap<Character,Character> g2s;
	static String g1 = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
	static String g2 = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
	static String g3 = "de kr kd eoya kw aej tysr re ujdr lkgc jv";
	static String s1 = "our language is impossible to understand";
	static String s2 = "there are twenty six factorial possibilities";
	static String s3 = "so it is okay if you want to just give up";
	static ArrayList<String> g;
	static ArrayList<String> s;
	
	public static void main(String[] args) throws IOException{
		g2s = new HashMap<Character,Character>();
		g = new ArrayList<String>();
		s = new ArrayList<String>();
		g.add(g1);
		g.add(g2);
		g.add(g3);
		s.add(s1);
		s.add(s2);
		s.add(s3);
		g2s.put(Character.valueOf('y'), Character.valueOf('a'));
		g2s.put(Character.valueOf('e'), Character.valueOf('o'));
		g2s.put(Character.valueOf('q'), Character.valueOf('z'));
		for(int i=0;i<3;++i){
			for(int j=0;j<g.get(i).length();++j){
				if(Character.isLetter(g.get(i).charAt(j))){
					g2s.put(Character.valueOf(g.get(i).charAt(j)), Character.valueOf(s.get(i).charAt(j)));
				}
			}
		}
		System.out.println(g2s.size());
		Character missedkey=null;
		Character missedvalue=null;
		for(int i='a';i<='z';++i){
			if(!g2s.containsKey(Character.valueOf((char)i))){
				missedkey=Character.valueOf((char)i);
			}
			if(!g2s.containsValue(Character.valueOf((char)i))){
				missedvalue = Character.valueOf((char)i); 
			}
		}
	//	System.out.println(missedkey+":"+missedvalue);
		g2s.put(missedkey, missedvalue);
		BufferedReader file = new BufferedReader(new FileReader(new File("src/input")));
		String firstline = file.readLine();
		int casenum = Integer.parseInt(firstline);
		StringWriter s= new StringWriter();
		for(int i=0;i<casenum;++i){
			String temp = file.readLine();
			s.append("Case #"+(i+1)+": ");
			for(int j=0;j<temp.length();++j){
				Character c = Character.valueOf(temp.charAt(j));
				if(g2s.containsKey(c)){
					s.append(g2s.get(c));
				}
				else{
					s.append(c);
				}
			}
			s.append("\n");
		}
		
		FileWriter fout = new FileWriter("src/out.txt");
		fout.write(s.toString());
		fout.close();
	}
}
