package methodEmbedding.Speaking_in_Tongues.S.LYD280;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		try{
			  // Open the file that is the first 
			  // command line parameter
//			  FileInputStream fstream = new FileInputStream("C-small-practice.in");
			  FileInputStream fstream = new FileInputStream("A-small-attempt0.in");
			  // Get the object of DataInputStream
			  DataInputStream in = new DataInputStream(fstream);
			  BufferedReader br = new BufferedReader(new InputStreamReader(in));
			  String strLine;
			  FileWriter foutstream = new FileWriter("out.txt");
			  BufferedWriter out = new BufferedWriter(foutstream);
			  System.out.println (br.readLine());
			  int Case = 0;
			  char[] charset = { 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
			  String alphabet = "abcdefghijklmnopqrstuvwxyz";
			  while ((strLine = br.readLine()) != null)   
			  {
				  Case+=1;
				  out.write("Case #" + Case + ": ");
				  System.out.println (strLine);
				  
				  String str = strLine;
				  char[] c = strLine.toCharArray();
				  for(int i=0;i<c.length;i++)
				  {
				 if (c[i]=='y') c[i]= 'a';
				 else if (c[i]=='n') c[i]= 'b';
				 else if (c[i]=='f') c[i]='c'; // FOZ
				 else if (c[i]=='i') c[i]= 'd';
				 else if (c[i]=='c') c[i]= 'e';
				 else if (c[i]=='w') c[i]= 'f';
				 else if (c[i]=='l') c[i]= 'g';
				 else if (c[i]=='b') c[i]= 'h';
				 else if (c[i]=='k') c[i]= 'i';
				 else if (c[i]=='u') c[i]= 'j';
				 else if (c[i]=='o') c[i]= 'k'; // FOZ
				 else if (c[i]=='m') c[i]= 'l';
				 else if (c[i]=='x') c[i]= 'm';
				 else if (c[i]=='s') c[i]= 'n';
				 else if (c[i]=='e') c[i]= 'o';
				 else if (c[i]=='v') c[i]= 'p';
				 else if (c[i]=='z') c[i]= 'q'; //FOZ
				 else if (c[i]=='p') c[i]= 'r';
				 else if (c[i]=='d') c[i]= 's';
				 else if (c[i]=='r') c[i]= 't';
				 else if (c[i]=='j') c[i]= 'u';
				 else if (c[i]=='g') c[i]= 'v';
				 else if (c[i]=='t') c[i]= 'w';
				 else if (c[i]=='h') c[i]= 'x';
				 else if (c[i]=='a') c[i]= 'y';
				 else if (c[i]=='q') c[i]= 'z';
				  }

				 System.out.println(String.valueOf(c));
				  out.append(String.valueOf(c));
				  out.newLine();
				  
				  
			  }
			  out.close();
			  //Close the input stream
			  in.close();
			    }catch (Exception e){//Catch exception if any
			  System.err.println("Error: " + e.getMessage() + " " + e.getCause());
			  }

	}

}
