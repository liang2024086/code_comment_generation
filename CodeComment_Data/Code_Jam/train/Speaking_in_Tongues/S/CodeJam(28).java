package methodEmbedding.Speaking_in_Tongues.S.LYD244;

import java.io.*;
import java.util.Arrays;


public class CodeJam {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		  try
		  {
			  // Open the file that is the first 
			  // command line parameter
			  FileInputStream fstream = new FileInputStream("A-small-attempt6.in");
			  FileOutputStream out; // declare a file output object
              PrintStream pOut; // declare a print stream object
              out = new FileOutputStream("A-small-attempt6.out");

              // Connect print stream to the output stream
              pOut = new PrintStream( out );
			
			  
			  // Get the object of DataInputStream
			  DataInputStream in = new DataInputStream(fstream);
			  
			  BufferedReader br = new BufferedReader(new InputStreamReader(in));
			  
			  String strLine;
			  //Read File Line By Line
			  strLine = br.readLine();
			  int nTestCase=Integer.parseInt(strLine);

			  String[] set=new String[3];
			  set[0]="ejp mysljylc kd kxveddknmc re jsicpdrysi";
			  set[1]="rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
			  set[2]="de kr kd eoya kw aej tysr re ujdr lkgc jv";
			  
			  String[] data=new String[3];
			  data[0]="our language is impossible to understand";
			  data[1]="there are twenty six factorial possibilities";
			  data[2]="so it is okay if you want to just give up";
			  
			  
			  char q='z';
			  char z='q';
			  
			  char[] mapping=new char[26];
			  mapping[z/1-97]='z';
			  mapping[q/1-97]='q';
			  
			  for(int i=0;i<3;i++)
			  {
				  int nLength=set[i].length();
				  for(int j=0;j<nLength;j++)
				  {
					  char cLetter=set[i].charAt(j);
					  if(cLetter==' ')
						  continue;
					  int nIndex=cLetter/1-97;
					  mapping[nIndex]=data[i].charAt(j);
					  
				  }
			  }
			  for(int i=1;i<=nTestCase;i++)
			  {
				  strLine = br.readLine();
				  int nLength=strLine.length();
				  pOut.print("Case #");
				  pOut.print(i);
				  pOut.print(": ");
				  for(int j=0;j<nLength;j++)
				  {
					  char cLetter=strLine.charAt(j);
					  if(cLetter==' ')
						  pOut.print(" ");					  
					  else
					  {
					  int nIndex=cLetter/1-97;
					  
					  pOut.print(mapping[nIndex]);
					  }
				  }
				  pOut.println("");
			  }
			  /*
			  for(int i=0;i<26;i++)
				  pOut.println(mapping[i]);*/
			  /*
			  pOut.println(fTemp);
			  
			  System.out.println(nTestCase);
			  while ((strLine = br.readLine()) != null)   
			  {
				  // Print the content on the console
				  System.out.println (strLine);
			  }
			  */
			  //Close the input stream
			  in.close();
			  //Close the output stream
			  out.close();
			    
		  }
		  catch (Exception e)
		  {//Catch exception if any
			  System.err.println("Error: " + e.getMessage());
		  }
	

	}

}
