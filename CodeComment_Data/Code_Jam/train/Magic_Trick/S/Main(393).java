package methodEmbedding.Magic_Trick.S.LYD1858;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader input_file = null;
		FileWriter output_file = null;
		String input_query = "", row1_1="",row2_1="",row3_1="",row4_1="";
		String row1_2="",row2_2="",row3_2="",row4_2="";
		int numTestCases = 0, pos1 = 0, pos2 = 0;
		int i = 1;
		try{
			input_file = new FileReader("A-small-attempt0.in");
			output_file = new FileWriter("output_txt");
			
			BufferedReader read_stream = new BufferedReader(input_file);
			BufferedWriter out_stream = new BufferedWriter(output_file);
			input_query = read_stream.readLine();
			numTestCases = Integer.parseInt(input_query) ;
//			System.out.println("Number of test cases: "+input_query);
			
			while(numTestCases > 0)
			{
				pos1 = Integer.parseInt(read_stream.readLine());
				row1_1 = read_stream.readLine();
				row2_1 = read_stream.readLine();
				row3_1 = read_stream.readLine();
				row4_1 = read_stream.readLine();
				pos2 = Integer.parseInt(read_stream.readLine());
				row1_2 = read_stream.readLine();
				row2_2 = read_stream.readLine();
				row3_2 = read_stream.readLine();
				row4_2 = read_stream.readLine();
				Magician object = new Magician(pos1, row1_1, row2_1, row3_1, row4_1, pos2,row1_2,row2_2,row3_2, row4_2);
				input_query = object.trick();
				out_stream.write("Case #"+ i + ": "+ input_query);
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
