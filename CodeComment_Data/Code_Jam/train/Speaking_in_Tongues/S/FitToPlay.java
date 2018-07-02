package methodEmbedding.Speaking_in_Tongues.S.LYD1148;

import java.util.List;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;


class FileRead 
{
	public static void main(String args[])
	{
		try{

			FileInputStream fstream = new FileInputStream("/tmp/codejam/A-small-attempt0.in");
			//DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			PrintWriter out = new PrintWriter(new File("/home/peeyushk/tmp/output.ou"));
			String strLine;
			strLine = br.readLine().trim();
			int test = Integer.parseInt(strLine.trim());
			HashMap<Character, Character> hash = new HashMap<Character, Character>();
			hash.put('a', 'y');
			hash.put('b', 'h');
			hash.put('c', 'e');
			hash.put('d', 's');
			hash.put('e', 'o');
			hash.put('f', 'c');
			hash.put('g', 'v');
			hash.put('h', 'x');
			hash.put('i', 'd');
			hash.put('j', 'u');
			hash.put('k', 'i');
			hash.put('l', 'g');
			hash.put('m', 'l');
			hash.put('n', 'b');
			hash.put('o', 'k');
			hash.put('p', 'r');
			hash.put('q', 'z');
			hash.put('r', 't');
			hash.put('s', 'n');
			hash.put('t', 'w');
			hash.put('u', 'j');
			hash.put('v', 'p');
			hash.put('w', 'f');
			hash.put('x', 'm');
			hash.put('y', 'a');
			hash.put('z', 'q');
			hash.put(' ', ' ');
			Character[] charArr;
			for (int i=0;i<test;i++) {
				strLine = br.readLine().trim();
				charArr = new Character[strLine.length()];
				for (int j=0;j<strLine.length();j++) {
					charArr[j] = hash.get(strLine.charAt(j)); 
				}
				int k = i+1;
				out.print("Case #" + k + ": ");
				for (int j=0;j<strLine.length();j++)
				out.print(charArr[j]);
				out.println();
			}
			//out.flush();
			out.close();
			br.close();

		}catch (Exception e){//Catch exception if any
			e.printStackTrace();
		}
	}
}
