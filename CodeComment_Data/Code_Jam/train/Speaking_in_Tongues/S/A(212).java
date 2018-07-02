package methodEmbedding.Speaking_in_Tongues.S.LYD349;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A {



	public static void main(String[] args){
		Map<String,String> m = new HashMap<String,String>();
		m.put("a", "y");
		m.put("b", "h");
		m.put("c", "e");
		m.put("d", "s");
		m.put("e", "o");
		m.put("f", "c");
		m.put("g", "v");
		m.put("h", "x");
		m.put("i", "d");
		m.put("j", "u");
		m.put("k", "i");
		m.put("l", "g");
		m.put("m", "l");
		m.put("n", "b");
		m.put("o", "k");
		m.put("p", "r");
		m.put("q", "z");
		m.put("r", "t");
		m.put("s", "n");
		m.put("t", "w");
		m.put("u", "j");
		m.put("v", "p");
		m.put("w", "f");
		m.put("x", "m");
		m.put("y", "a");
		m.put("z", "q");
		m.put(" "," ");

		String in ="small.txt";
		String out = "output.txt";
		Scanner sc;
		String answers[]=new String[3];
		try {
			sc = new Scanner(new File(in));
			int T = sc.nextInt();
			//System.out.println(sc.nextLine());
			sc.nextLine();
			answers = new String[T];
			for(int zz =0;zz<T;zz++)
			{
				String s = sc.nextLine();
				String google = "";
				System.out.println("s "+s);
				
				for(int i =0;i<s.length();i++)
				{
					String tmp = ""+s.charAt(i);
					google+=m.get(tmp);
				}
				int z = zz+1;
				answers[zz]="Case #"+z+": "+google+"\n";

			}




		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try
		{
			PrintWriter pw = new PrintWriter(out);
			for(int i=0;i<answers.length;i++)
				pw.println(answers[i]);
			pw.close();	

		}
		catch (Exception e){
			System.out.println(e.toString());
		}



	}


}
