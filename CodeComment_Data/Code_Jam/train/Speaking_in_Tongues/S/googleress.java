package methodEmbedding.Speaking_in_Tongues.S.LYD1194;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class googleress {

	/**
	 * @param args
	 */
	static String convert="yhesocvxduiglbkrztnwjpfmaq"; //String used for conversion
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw=new BufferedWriter(new FileWriter("out2.out")); //used for writing
		BufferedReader bf=new BufferedReader(new FileReader("A-small-attempt4.in")); //used for reading
		int count=Integer.parseInt(bf.readLine()); //gets # of test cases
		for(int ii=0;ii<count-1;ii++){ //operates for the 1st N-1 test cases 
	
		String x=bf.readLine(); 
		String y="";
		for(int i=0;i<x.length();i++) //Conversion
		{	if(x.charAt(i)==' ')
			y+=' ';
		else
			y+=convert.charAt((x.charAt(i)-'a')%26);
		}
		
		bw.write("Case #"+(ii+1)+": "+y); //output
		bw.newLine();
		
		
	}//for the last test case same code as above just needed
		//so as not to write an extra newline
		String x=bf.readLine();
		String y="";
		for(int i=0;i<x.length();i++)
		{	if(x.charAt(i)==' ')
			y+=' ';
		else
			y+=convert.charAt((x.charAt(i)-'a')%26);
		}
		
		bw.write("Case #"+(count)+": "+y);
		bw.close();
	}
}
