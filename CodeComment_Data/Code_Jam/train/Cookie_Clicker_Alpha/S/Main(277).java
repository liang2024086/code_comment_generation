package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1223;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileReader input_file = null;
		FileWriter output_file = null;
		String input_query = "";
		double c = 0.0, f = 0.0, x = 0.0, result = 0.0 ;
		int numTestCases = 0;
		int i = 1;
		try{
			input_file = new FileReader("B-small-attempt2.in");
			output_file = new FileWriter("output_txt");
			
			BufferedReader read_stream = new BufferedReader(input_file);
			BufferedWriter out_stream = new BufferedWriter(output_file);
			input_query = read_stream.readLine();
			numTestCases = Integer.parseInt(input_query) ;
//			System.out.println("Number of test cases: "+input_query);
			
			while(numTestCases > 0)
			{
				input_query = read_stream.readLine();
				StringTokenizer tokens = new StringTokenizer(input_query, " ");
				c = Double.parseDouble(tokens.nextToken());
				f = Double.parseDouble(tokens.nextToken());
				x = Double.parseDouble(tokens.nextToken());
				ClickProcessor object = new ClickProcessor(c, f, x);
//				System.out.println(c+" "+f+" "+x+" ");
				result = object.timeCalc();
//				System.out.println("Case #"+ i + ": "+ result);
				out_stream.write("Case #"+ i + ": "+ result);
				out_stream.newLine();
				i++;
				numTestCases--;
			}
			
			
			read_stream.close();
			out_stream.close();
		}	catch (Exception e){
			throw new RuntimeException(e);
		}	finally{
			if (input_file != null){
				try{
					input_file.close();
				}	catch (IOException e){
					// Ignore closing issues
				}
			}	
		}
		
	}

}
