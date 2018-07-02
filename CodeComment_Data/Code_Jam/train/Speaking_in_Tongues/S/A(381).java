package methodEmbedding.Speaking_in_Tongues.S.LYD1589;

import java.io.*;
import java.util.Scanner;
public class A {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
			  // Open the file that is the first 
			  // command line parameter
			  FileInputStream fstream = new FileInputStream("A-small-attempt2.in");
			  // Get the object of DataInputStream
			  DataInputStream in = new DataInputStream(fstream);
			  BufferedReader br = new BufferedReader(new InputStreamReader(in));
		
		Scanner scan = new Scanner(System.in);
		
		char[] letter = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};
		
		int num = Integer.parseInt(br.readLine());
		
		String[] output = new String[num];
		
		for(int i=0; i<num; i++) {
			String input = br.readLine();
			String result = "";
			for(int j=0; j<input.length(); j++) {
				System.out.println((int)(input.charAt(j)));
				if(input.charAt(j) != ' ') {
					System.out.println((int)(input.charAt(j)));
					char swap = letter[((int)(input.charAt(j)))-97];
					result += swap;
				} else {
					result += " ";
				}
				
			}
			output[i] = result;
		}
		in.close();
		
			FileWriter stream = new FileWriter("A-small-attempt2.txt");
			PrintWriter out = new PrintWriter(stream);
		
		for(int i =0; i<num; i++) {
				  // Create file 
				  out.println("Case #" + (i+1) + ": " + output[i]);
				  //Close the output stream
		}
		
		out.close();
		

	}
	
}
