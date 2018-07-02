package methodEmbedding.Speaking_in_Tongues.S.LYD1205;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class A {

	static HashMap<String,String> trans = new HashMap<String, String>(26);
	public static void main(String[] args) {

		trans.put("y","a");
		trans.put("n","b");
		trans.put("f","c");		
		trans.put("i","d");
		trans.put("c","e");
		trans.put("w","f");
		trans.put("l","g");
		trans.put("b","h");
		trans.put("k","i");
		trans.put("u","j");
		trans.put("o","k");
		trans.put("m","l");
		trans.put("x","m");
		trans.put("s","n");
		trans.put("e","o");
		trans.put("v","p");
		trans.put("z","q");
		trans.put("p","r");
		trans.put("d","s");
		trans.put("r","t");
		trans.put("j","u");
		trans.put("g","v");
		trans.put("t","w");
		trans.put("h","x");
		trans.put("a","y");
		trans.put("q","z");
		trans.put(" ", " ");
		
		try {
			BufferedReader s = new BufferedReader (new InputStreamReader(new FileInputStream("./bin/codeJam2011/A-small-attempt0.in")));
			
			int cases = Integer.parseInt(s.readLine());
			BufferedWriter output = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("./bin/a.out")));
			for(int i =0;i<cases;i++)
			{
				String line =s.readLine();
				String translated="";
				for(int b=0; b<line.length();b++)
				{
					translated +=trans.get(String.valueOf(line.charAt(b)));
					
				}
				System.out.println(translated);
				output.write("Case #"+(i+1)+": "+translated+"\n");

			}
			output.close();
			
		}
			catch (Exception e) {
				System.out.println("File?!");
			}
		}
		
	}

