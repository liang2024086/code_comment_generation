package methodEmbedding.Speaking_in_Tongues.S.LYD216;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
 
public class languageproblem {
 
public static void main(String[] args) {
 
  try
  {
  FileInputStream in = new FileInputStream("/Users/nanz/Downloads/A-small-attempt3.in");
  BufferedReader br = new BufferedReader(new InputStreamReader(in));
  String strLine;
  int line=0;
  int ln;
  while((strLine = br.readLine())!= null)
  {
   if(line==0)
	   {
	   ln = Integer.parseInt(strLine);  
   	   //System.out.println(ln);
	   }
   else
   
   {
	   int i=0;
	   System.out.print("Case #"+line+": ");

	   while(i<strLine.length())
	   {
		   switch(strLine.charAt(i))
		   {
		   case 'a': //strLine=strLine.replace('a','y');
		   			 System.out.print("y");
		   			 break;
		   			 
		   case 'b': //strLine=strLine.replace('b', 'h');
 			 	     System.out.print("h");

		   			  break;
 			 
		   case 'c': System.out.print("e");


 			 break;
 			 
 			 
		   case 'd': System.out.print("s");


 			 break;
 			 
 			 
 			 
		   case 'e': System.out.print("o");
		   			  break;
 			 	 
 			 
		   case 'f': System.out.print("c");


 			 break;
 			 
 			 
 			 
 			 
		   case 'g': System.out.print("v");


 			 break;
 			 
 			 
 			 
 			 
 			 
		   case 'h':  System.out.print("x");

 			 break;
 			 
 			 
 			 
		   case 'i': System.out.print("d");

 			 break;
 			 
 			 
 			 
 			 
		   case 'j': System.out.print("u");

 			 break;
 			 
		   case 'k':  System.out.print("i");

			 break; 
		   			
			 
		   case 'l': 	System.out.print("g");

			 break;
			 
			 
			 
		   case 'm': 	System.out.print("l");

			 break;
			 
			 
		   case 'n': 	System.out.print("b");

			 break;
			 
			 
			 
		   case 'o': 	System.out.print("k");

			 break;
			 
			 
			 
		   case 'p': 	System.out.print("r");

			 break;
			 
			 
		   case 'q': 	System.out.print("z");

			 break;
			 
			 
		   case 'r': 	System.out.print("t");

			 break;
			 
			 
		   case 's': 	System.out.print("n");

			 break;
			 
			 
		   case 't': 	System.out.print("w");

			 break;
			 
			 
		   case 'u': 	System.out.print("j");

			 break;
			 
			 
		   case 'v': 	System.out.print("p");

			 break;
			 
			 
		   case 'w': 	System.out.print("f");

			 break;
			 
			 
		   case 'x': 	System.out.print("m");

			 break;
			 
			 
		   case 'y': 	System.out.print("a");

			 break;
			 
			 
		   case 'z':    System.out.print("q");

			 break;
			 
		   case ' ':	System.out.print(" ");
		   break;
		   
		   
		   }
		   i++;
		   
		   
	   }
	   	System.out.print("\n");
   }
   
    line++;
   }
 
  }catch(Exception e){
   System.out.println(e);
  }
 
 }
}
