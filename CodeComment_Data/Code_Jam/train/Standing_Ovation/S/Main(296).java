package methodEmbedding.Standing_Ovation.S.LYD1624;

import java.io.*;
import java.util.*;
 
public class Main
{
   public static void main(String[] args) throws IOException
   {
      FileInputStream fin = new FileInputStream("A-small-attempt0.in");
	  FileOutputStream fout = new FileOutputStream("out");
	  BufferedReader br = new BufferedReader(new InputStreamReader(fin));
	  PrintWriter out = new PrintWriter(fout);
	  
	  int c = 1, t = Integer.parseInt(br.readLine());
	   
	   for (; c <= t; c++)
	   {
		   String[] input = br.readLine().split(" ");
		   int n = Integer.parseInt(input[0]);
		   String s = input[1];
		   int answer = 0, standing = s.charAt(0) - '0';
		   
		   for (int i = 1; i <= n; i++)
		   {
			   
			   if (i <= standing) standing += s.charAt(i) - '0';
			   else
			   {
				   answer += i - standing;
				   standing += s.charAt(i) - '0' + (i - standing);
			   }
		   }
		   
		   out.println("Case #"+c+": "+answer);
	   }
	   
	  out.close();
   }
}
 
