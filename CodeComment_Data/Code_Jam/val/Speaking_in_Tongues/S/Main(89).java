package methodEmbedding.Speaking_in_Tongues.S.LYD207;

import java.io.*;
import java.math.*;
import java.util.*;

class Main{

	static BufferedReader br;
	static PrintWriter pw;
	static File in;
	static File out;
	static String name="A-small-attempt1";
	
	static HashMap<Character,Character> table=new HashMap<Character,Character>();
	
	public static void main(String[] args){
		try{
			in=new File(name+".in");
			out=new File(name+".out");
			br=new BufferedReader(new FileReader(in));
			pw=new PrintWriter(new BufferedWriter(new FileWriter(out)));
			
			int nbCase = Integer.parseInt(br.readLine());
			
			table.put('a','y');
			table.put('b','h');
			table.put('c','e');
			table.put('d','s');
			table.put('e','o');
			table.put('f','c');
			table.put('g','v');
			table.put('h','x');
			table.put('i','d');
			table.put('j','u');
			table.put('k','i');
			table.put('l','g');
			table.put('m','l');
			table.put('n','b');
			table.put('o','k');
			table.put('p','r');
			table.put('q','z');
			table.put('r','t');
			table.put('s','n');
			table.put('t','w');
			table.put('u','j');
			table.put('v','p');
			table.put('w','f');
			table.put('x','m');
			table.put('y','a');
			table.put('z','q');
			
			for (int n=1;n<=nbCase;n++){
				String line=br.readLine();
				String newLine="";
				for (int i=0;i<line.length();i++){
					if (line.charAt(i)==' ') newLine=newLine+" ";
					else newLine=newLine+String.valueOf(table.get(line.charAt(i)));
				}
				pw.println("Case #"+n+": "+newLine);
			}
			
			
			pw.flush();
			pw.close();
			br.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	
	
}
