package methodEmbedding.Standing_Ovation.S.LYD1891;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;


public class Main {

	public static void main(String[] args) {
		try{
		BufferedReader reader=new BufferedReader(new InputStreamReader(new FileInputStream("A-small-attempt1.in")));
		BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Output.txt")));
    	int numOfCases=Integer.parseInt(reader.readLine());
    	int i=1;
    	while(i<=numOfCases){
    		String[] split=reader.readLine().split(" ");
    		int numAudience=Integer.parseInt(split[0]);
    		String audience=split[1];
    		writer.write(new Case(i, numAudience, audience).calculate());
    		writer.newLine();
    		i++;
    	}
    	reader.close();
    	writer.close();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
