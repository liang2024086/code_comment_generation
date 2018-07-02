package methodEmbedding.Speaking_in_Tongues.S.LYD1333;

import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A {

	public static void main(String args[]){
		
		Scanner in=null;
		PrintWriter out=null;
		try{
			File ifile = new File(args[0]);
			File ofile = new File(args[1]);

			//Scanner in = new Scanner(System.in);
			//PrintWriter out = new PrintWriter(System.out);
			in = new Scanner(ifile);
			out = new PrintWriter(ofile);
			
			int T = in.nextInt();
			Map <Character,Character> map = new HashMap<Character,Character>();
			map.put('y', 'a');	map.put('n', 'b');	map.put('f', 'c');
			map.put('i', 'd');	map.put('c', 'e');	map.put('w', 'f');
			map.put('l', 'g');	map.put('b', 'h');	map.put('k', 'i');
			map.put('u', 'j');	map.put('o', 'k');	map.put('m', 'l');
			map.put('x', 'm');	map.put('s', 'n');	map.put('e', 'o');
			map.put('v', 'p');	map.put('z', 'q');	map.put('p', 'r');
			map.put('d', 's');	map.put('r', 't');	map.put('j', 'u');
			map.put('g', 'v');	map.put('t', 'w');	map.put('h', 'x');
			map.put('a', 'y');	map.put('q', 'z');
			
			in.nextLine();
			for(int ti=0;ti<T;ti++){
				
				String line = in.nextLine();
				int length = line.length();

				StringBuffer sb = new StringBuffer();
				char[] chars = line.toCharArray();
				for(int i=0;i<length;i++){
					if(map.containsKey(chars[i]))
						sb.append(map.get(chars[i]));
					else
						sb.append(chars[i]);
				}
				out.format("Case #%d: %s\n", ti+1, sb.toString());
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			out.flush();
			in.close();
			out.close();	
		}
	}
	
	
}
