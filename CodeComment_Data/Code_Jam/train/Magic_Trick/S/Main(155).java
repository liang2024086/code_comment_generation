package methodEmbedding.Magic_Trick.S.LYD1423;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	static BufferedReader in;

	
	public Main() {
		// TODO Auto-generated constructor stub

		

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			InputStream inputStream = System.in;
			OutputStream outputStream = System.out;
			in = new BufferedReader(new InputStreamReader(inputStream));
//			OutputWriter out = new OutputWriter(outputStream);
			String line = in.readLine();
			int testCount = Integer.parseInt(line);
			System.out.println();
			for (int i = 0; i < testCount; i++) {
				ArrayList<String> arraylist = null;

				for (int testcase = 0; testcase < 2; testcase++) {

					line = in.readLine();
					int lineNumber = Integer.parseInt(line);
					for (int j = 1; j <= 4; j++) {

						line = in.readLine();

						if (j == lineNumber) {

							String[] stringArray = line.split("\\s+");
							if(testcase == 0){
							  arraylist =   new ArrayList<String>(Arrays.asList(stringArray));
							}
							else{
								arraylist.retainAll(new ArrayList<String>(Arrays.asList(stringArray)));
								if(arraylist.size() == 0){
					     	     System.out.println("Case #"+(i+1)+": Volunteer cheated!");
								}
								else if(arraylist.size() == 1){
						     	     System.out.println("Case #"+(i+1)+": "+arraylist.get(0));
								}
								else if(arraylist.size() > 1){
						     	     System.out.println("Case #"+(i+1)+": Bad magician!");
								}
							}
						}
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
