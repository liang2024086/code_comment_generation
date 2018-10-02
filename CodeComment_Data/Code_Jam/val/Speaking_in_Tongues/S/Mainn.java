package methodEmbedding.Speaking_in_Tongues.S.LYD238;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Writer;


public class Mainn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			  
			
			  try{
			
				  int index=0;
				  int xx=1;
			  FileInputStream fstream = new FileInputStream("C:\\Users\\Mostafa\\Desktop\\A-small-attempt1.in");
			 
			  DataInputStream in = new DataInputStream(fstream);
			  BufferedReader br = new BufferedReader(new InputStreamReader(in));
			  String strLine;
	
			  FileWriter fstreamww = new FileWriter("C:\\Users\\Mostafa\\Desktop\\out.txt");
			  BufferedWriter out = new BufferedWriter(fstreamww);
			
			  while ((strLine = br.readLine()) != null)   {
			  
				  if (xx==1)
				  {
				  
				  int z;
				  z=Integer.parseInt(strLine);
				  xx=2;
				
				  }
				
	//		
				  else{
				
			  char[] c=new char[150];
			  c=strLine.toCharArray();
			  for(int i=0;i<c.length;i++)
			  {
				  char x=c[i];
				
				  switch(x)
				  {
				  case 'a': c[i]='y';
					    break;
				  case 'b': c[i]='h';
					    break;
				  case 'c': c[i]='e';
					    break;
				  case 'd': c[i]='s';
					    break;
				  case 'e': c[i]='o';
					    break;
				  case 'f': c[i]='c';
					    break;
				  case 'g': c[i]='v';
					    break;
				  case 'h': c[i]='x';
					    break;
				  case 'i': c[i]='d';
					    break;
				  case 'j': c[i]='u';
					    break;
				  case 'k': c[i]='i';
					    break;
				  case 'l': c[i]='g';
					    break;
				  case 'm': c[i]='l';
					    break;
				  case 'n': c[i]='b';
					    break;
				  case 'o': c[i]='k';
					    break;
				  case 'p': c[i]='r';
					    break;
				  case 'q': c[i]='z';
					    break;
				  case 'r': c[i]='t';
					    break;
				  case 's': c[i]='n';
					    break;
				  case 't': c[i]='w';
					    break;
				  case 'u': c[i]='j';
					    break;
				  case 'v': c[i]='p';
					    break;
				  case 'w': c[i]='f';
					    break;
				  case 'x': c[i]='m';
					    break;
				  case 'y': c[i]='a';
					    break;
				  case 'z': c[i]='q';
					    break;
				  default: x = ' ' ;
                  break;
                  
				  }
				 
				
			  }
			 
			  String newString1 = new String(c);
			  try
			    {
				 
				 out.append("Case #"+index+": "+ newString1);
				 
				 out.newLine();
			
				  
			    } catch (IOException e)
			    {
			      e.printStackTrace();
			    }
			  }
				 index++;
			  }
			 
			  
			
			  in.close();
			  out.close();
			    }catch (Exception e){
			  System.err.println("Error: " + e.getMessage());
			  }
			    	

			  }
}
}
