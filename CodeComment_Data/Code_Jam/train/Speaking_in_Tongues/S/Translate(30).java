package methodEmbedding.Speaking_in_Tongues.S.LYD1013;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Translate {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		
        Map<String,String> mp=new HashMap<String, String>();

        // adding or set elements in Map by put method key and value pair
        mp.put("a" , "y");
        mp.put("b" , "h");
        mp.put("c" , "e");
        mp.put("d" , "s");
        mp.put("e" , "o");
        mp.put("f" , "c");
        mp.put("g" , "v");
        mp.put("h" , "x");
        mp.put("i" , "d");
        mp.put("j" , "u");
        mp.put("k" , "i");
        mp.put("l" , "g");
        mp.put("m" , "l");
        mp.put("n" , "b");
        mp.put("o" , "k");
        mp.put("p" , "r");
        mp.put("q" , "z");
        mp.put("r" , "t");
        mp.put("s" , "n");
        mp.put("t" , "w");
        mp.put("u" , "j");
        mp.put("v" , "p");
        mp.put("w" , "f");
        mp.put("x" , "m");
        mp.put("y" , "a");
        mp.put("z" , "q");		
		
		try {
			// Open the file that is the first
			// command line parameter
			FileInputStream fstream = new FileInputStream("t");
			// Get the object of DataInputStream
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			FileWriter ostream = new FileWriter("out.txt");
			BufferedWriter out = new BufferedWriter(ostream);
			StringBuffer readLine = new StringBuffer("");
			// Read File Line By Line
			int counter =0;
			int maxCount = Integer.parseInt(br.readLine());
			
			while ((readLine = new StringBuffer(br.readLine())) != null) 
			{
				counter++;
				StringBuffer translatedLine = new StringBuffer("");
				// Print the content on the console
				System.out.println( readLine);

		        //Get Map in Set interface to get key and value
		        for (int i=0 ; i<readLine.length();i++)
		        {
		        	String cuurentChar = readLine.substring(i,i+1);
		        	if(mp.containsKey(cuurentChar))
		        		translatedLine.append(mp.get(cuurentChar));
		        	else
		        		translatedLine.append(cuurentChar);
		        	//System.out.println(cuurentChar);
		        }
		        System.out.println("Case #"+ counter +": "+ translatedLine);
		        out.write("Case #"+ counter +": "+ translatedLine);
		        if(counter == maxCount)
		        {
		        	break;

		        }
		        out.newLine();
		        out.flush();
			}
			
			// Close the input stream
			in.close();
			out.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
	}

}
