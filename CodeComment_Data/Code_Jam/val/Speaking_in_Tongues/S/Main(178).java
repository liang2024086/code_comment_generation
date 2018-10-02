package methodEmbedding.Speaking_in_Tongues.S.LYD514;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Main 
{
	public static void main(String[] args) throws Exception 
	{
		try{
			  FileInputStream fstream = new FileInputStream("A-small-attempt2.in");
			  DataInputStream in = new DataInputStream(fstream);
			  FileWriter writer = new FileWriter(new File("output.txt"));
			  BufferedWriter wr = new BufferedWriter(writer);
			  BufferedReader br = new BufferedReader(new InputStreamReader(in));
			  int size=0;
			  String strLine;
			  size = Integer.parseInt(br.readLine());
			  for(int i=0;i<size;i++)
			  {
				  String result = "";
				  strLine = br.readLine();
				  for(int j=0;j<strLine.length();j++)
				  {
					  if(strLine.charAt(j)=='a')
					  {
						  result = result+"y";
					  }
					  else if(strLine.charAt(j)=='b')
					  {
						  result = result+"h";
					  }
					  else if(strLine.charAt(j)=='c')
					  {
						  result = result+"e";
					  }
					  else if(strLine.charAt(j)=='d')
					  {
						  result = result+"s";
					  }
					  else if(strLine.charAt(j)=='e')
					  {
						  result = result+"o";
					  }
					  else if(strLine.charAt(j)=='f')
					  {
						  result = result+"c";
					  }
					  else if(strLine.charAt(j)=='g')
					  {
						  result = result+"v";
					  }
					  else if(strLine.charAt(j)=='h')
					  {
						  result = result+"x";
					  }
					  else if(strLine.charAt(j)=='i')
					  {
						  result = result+"d";
					  }
					  else if(strLine.charAt(j)=='j')
					  {
						  result = result+"u";
					  }
					  else if(strLine.charAt(j)=='k')
					  {
						  result = result+"i";
					  }
					  else if(strLine.charAt(j)=='l')
					  {
						  result = result+"g";
					  }
					  else if(strLine.charAt(j)=='m')
					  {
						  result = result+"l";
					  }
					  else if(strLine.charAt(j)=='n')
					  {
						  result = result+"b";
					  }
					  else if(strLine.charAt(j)=='o')
					  {
						  result = result+"k";
					  }
					  else if(strLine.charAt(j)=='p')
					  {
						  result = result+"r";
					  }
					  else if(strLine.charAt(j)=='q')
					  {
						  result = result+"z";
					  }
					  else if(strLine.charAt(j)=='r')
					  {
						  result = result+"t";
					  }
					  else if(strLine.charAt(j)=='s')
					  {
						  result = result+"n";
					  }
					  else if(strLine.charAt(j)=='t')
					  {
						  result = result+"w";
					  }
					  else if(strLine.charAt(j)=='u')
					  {
						  result = result+"j";
					  }
					  else if(strLine.charAt(j)=='v')
					  {
						  result = result+"p";
					  }
					  else if(strLine.charAt(j)=='w')
					  {
						  result = result+"f";
					  }
					  else if(strLine.charAt(j)=='x')
					  {
						  result = result+"m";
					  }
					  else if(strLine.charAt(j)=='y')
					  {
						  result = result+"a";
					  }
					  else if(strLine.charAt(j)=='z')
					  {
						  result = result+"q";
					  }
					  else if(strLine.charAt(j)==' ')
					  {
						  result = result+" ";
					  }
					  else
					  {
						  result = result+"$";
					  }
				  }
				  wr.write("Case #"+(i+1)+": "+result);
				  wr.newLine();
				  wr.flush();
			  }
			  in.close();
			    }
		catch (Exception e)
		{
			System.err.println("Error: " + e.getMessage());
		}
	}

}
