package methodEmbedding.Speaking_in_Tongues.S.LYD509;

import java.io.*;
class FileRead 
{
 public static void main(String args[])
  {
	 int len=0,j=0;
  try{
 
  FileInputStream fstream = new FileInputStream("D:/Downloads/A-small-attempt1.in");
  
  DataInputStream in = new DataInputStream(fstream);
  BufferedReader br = new BufferedReader(new InputStreamReader(in));
  String strLine;
 int k=1;
  while ((strLine = br.readLine()) != null)   {
	  if(k==1){k=0;continue;}
	  len=strLine.length();
	  char[] ch = new char[len];
	  
	for (int i = 0; i < len; i++) {
          ch[i] =   strLine.charAt(i);
          
          switch(ch[i]){
          case 'a': ch[i] = 'y'; break;
          case 'c': ch[i] = 'e'; break;
          case 'b': ch[i] = 'h'; break;
          case 'e': ch[i] = 'o'; break;
          case 'd': ch[i] = 's'; break;
          case 'g': ch[i] = 'v'; break;
          case 'f': ch[i] = 'c'; break;
          case 'i': ch[i] = 'd'; break;
          case 'h': ch[i] = 'x'; break;
          case 'k': ch[i] = 'i'; break;
          case 'j': ch[i] = 'u'; break;
          case 'm': ch[i] = 'l'; break;
          case 'l': ch[i] = 'g'; break;
          case 'o': ch[i] = 'k'; break;
          case 'n': ch[i] = 'b'; break;
          case 'q': ch[i] = 'z'; break;
          case 'p': ch[i] = 'r'; break;
          case 's': ch[i] = 'n'; break;
          case 'r': ch[i] = 't'; break;
          case 'u': ch[i] = 'j'; break;
          case 't': ch[i] = 'w'; break;
          case 'w': ch[i] = 'f'; break;
          case 'v': ch[i] = 'p'; break;
          case 'y': ch[i] = 'a'; break;
          case 'x': ch[i] = 'm'; break;
          case 'z': ch[i] = 'q'; break;

          }
	}
	j++;
	 String strLine1 = new String(ch);
  System.out.println ("Case #" + j + ": " + strLine1);
  }
  
  in.close();
    }catch (Exception e){
  System.err.println("Error: " + e.getMessage());
  }
  }
}
