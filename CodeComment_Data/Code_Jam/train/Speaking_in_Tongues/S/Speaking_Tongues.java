package methodEmbedding.Speaking_in_Tongues.S.LYD1279;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

// TO MATCH THE SAMPLE INPUT
public class Speaking_Tongues {

	
	public static void main(String[] args) throws Exception{
		FileWriter ofstream = new FileWriter("outp.out");
		  BufferedWriter out = new BufferedWriter(ofstream);
			  FileInputStream fstream = new FileInputStream("inp.in");
			  DataInputStream in = new DataInputStream(fstream);
			  BufferedReader br = new BufferedReader(new InputStreamReader(in));
			  int n,countn=1,i;
			boolean upperflag=false;
				char ch='@',t;
				String str = " ";
				String strLine;
				  strLine = br.readLine();
				  n = Integer.parseInt(strLine);
				  while ((strLine = br.readLine()) != null)   {
					  str = "Case #" + countn + ": ";
					  ++countn;
					  for(i=0;i<strLine.length();i++)
					  {
						  ch = strLine.charAt(i);
						  
						  if(Character.isUpperCase(ch))
						  {
							  upperflag = true;
							  ch =Character.toLowerCase(ch);
					      }
						  switch (ch) {
						  case 'a': 
							  t = 'y';
						  break;
						  case 'b': 
							  t = 'h';
						  break;
						  case 'c': 
							  t = 'e';
						  break;
						  case 'd': 
							  t = 's';
						  break;
						  case 'e': 
							  t = 'o';
						  break;
						  case 'f': 
							  t = 'c';
						  break;
						  case 'g': 
							  t = 'v';
						  break;
						  case 'h': 
							  t = 'x';
						  break;
						  case 'i': 
							  t = 'd';
						  break;
						  case 'j': 
							  t = 'u';
						  break;
						  case 'k': 
							  t = 'i';
						  break;
						  case 'l': t = 'g';	
						  break;
						  case 'm': t = 'l';
						  break;
						  case 'n': t = 'b';
						  break;
						  case 'o': t = 'k';
						  break;
						  case 'p': t = 'r';
						  break;
						  case 'q': t = 'z';
						  break;
						  case 'r': t = 't';
						  break;
						  case 's': t = 'n';
						  break;
						  case 't': t = 'w';
						  break;
						  case 'u': t = 'j';
						  break;
						  case 'v': t = 'p';
						  break;
						  case 'w': t = 'f';
						  break;
						  case 'x': t = 'm';
						  break;
						  case 'y': t = 'a';
						  break;
						  case 'z': t = 'q';
						  break;
						  case ' ': t = ' ';
						  break;
						  default: 
						  t = ch;
						  break;				  
						  }
						  if(upperflag == true)
						  {
							  upperflag = false;
							  t = Character.toUpperCase(t);
							  str = str + t;
						  }
						  else
							  str = str + t;
						 
							  
					  }
					  out.write(str + "\n");
				  }
				  out.close();
	}

}
