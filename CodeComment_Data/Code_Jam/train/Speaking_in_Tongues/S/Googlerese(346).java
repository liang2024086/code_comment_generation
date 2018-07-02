package methodEmbedding.Speaking_in_Tongues.S.LYD1488;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

/**
 *
 * @author virginia
 *
 */
public class Googlerese {

 public static void main(String[] args) {
 try {
   BufferedReader br = new BufferedReader(new FileReader("A-small-attempt1.in"));
   BufferedWriter output=new BufferedWriter(new FileWriter("Output.txt"));
  PrintWriter pw = new PrintWriter(output);

   String[] arr = br.readLine().split(" ");
   int numOfPatterns = Integer.parseInt(arr[0]);

   List<String> wList = new ArrayList<String>();
   for(int i =0; i < numOfPatterns; i++)
    wList.add(br.readLine());

   int index = 0;
   for(String s : wList)
   {
		index++;
		char[] s1=s.toCharArray();
		for(int i=0;i<s1.length;i++)
		{
		switch(s1[i])
		{
		case 'a':s1[i]='y';
				break;
		case 'b':s1[i]='h';
				break;
		case 'c':s1[i]='e';
				break;
		case 'd':s1[i]='s';
				break;
	   case 'e':s1[i]='o';
				break;
	   case 'f':s1[i]='c';
				break;
	   case 'g':s1[i]='v';
				break;
	   case 'h':s1[i]='x';
				break;
	   case 'i':s1[i]='d';
				break;
	   case 'j':s1[i]='u';
				break;
	   case 'k':s1[i]='i';
				break;
	   case 'l':s1[i]='g';
				break;
	   case 'm':s1[i]='l';
				break;
	   case 'n':s1[i]='b';
				break;
	   case 'o':s1[i]='k';
				break;
	   case 'p':s1[i]='r';
				break;
	   case 'q':s1[i]='z';
				break;
	   case 'r':s1[i]='t';
				break;
	   case 's':s1[i]='n';
				break;
	   case 't':s1[i]='w';
				break;
	   case 'u':s1[i]='j';
				break;
	   case 'v':s1[i]='p';
				break;
	   case 'w':s1[i]='f';
				break;
	   case 'x':s1[i]='m';
				break;
	   case 'y':s1[i]='a';
				break;
	   case 'z':s1[i]='q';
				break;
	   case ' ':s1[i]=' ';
			break;
	   default:break;
	   }
    }
    s=s1.toString();
 pw.print("Case #" + index + ": ");
 pw.println(s1);
  System.out.print("Case #" + index + ": ");
  System.out.println(s1);

   }
output.close();
  } catch (FileNotFoundException e) {
   e.printStackTrace();
  } catch (IOException e) {
   e.printStackTrace();
  }
 }
}
