package methodEmbedding.Speaking_in_Tongues.S.LYD1363;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;


public class problem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			char[] code = new char[26];
			code[0]='y';
			code[1]='h';
			code[2]='e';
			code[3]='s';
			code[4]='o';
			code[5]='c';
			code[6]='v';
			code[7]='x';
			code[8]='d';
			code[9]='u';
			code[10]='i';
			code[11]='g';
			code[12]='l';
			code[13]='b';
			code[14]='k';
			code[15]='r';
			code[16]='z';
			code[17]='t';
			code[18]='n';
			code[19]='w';
			code[20]='j';
			code[21]='p';
			code[22]='f';
			code[23]='m';
			code[24]='a';
			code[25]='q'; 
			try{
				  // Create file 
				  FileWriter fstream1 = new FileWriter("E:/out.txt");
				  BufferedWriter outp = new BufferedWriter(fstream1);
				  
				  
			try{
				  // Open the file that is the first 
			 // command line parameter
			  FileInputStream fstream = new FileInputStream("E:/A-small-attempt1.in");
			  // Get the object of DataInputStream
			  DataInputStream in = new DataInputStream(fstream);
			  BufferedReader br = new BufferedReader(new InputStreamReader(in));
			  String strLine;
			  strLine = br.readLine();
			  //Read File Line By Line
			  int cnt =1;
			  while ((strLine = br.readLine()) != null)   {
				  char[] inp = strLine.toCharArray();
				  char[] out = new char[strLine.length()];
				  for(int i=0;i<strLine.length();i++){
					  if(inp[i]!=' ')
						  out[i]=code[(inp[i]-97)];
					  else
						  out[i]=' ';
				  }
				  String output = new String(out);
				  outp.write("Case #"+cnt+": "+output+'\n');
				  cnt++;
			  }
			//Close the input stream
			  in.close();
			    }catch (Exception e){//Catch exception if any
			  System.err.println("Error: " + e.getMessage());
			  }
			outp.close();
			}catch (Exception e){//Catch exception if any
				  System.err.println("Error: " + e.getMessage());
				  }
	}

}
