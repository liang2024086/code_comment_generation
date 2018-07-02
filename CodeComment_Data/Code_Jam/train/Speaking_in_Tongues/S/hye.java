package methodEmbedding.Speaking_in_Tongues.S.LYD1226;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;


public class hye {
	public static void main(String args[]) throws IOException
	{
Hashtable a = new Hashtable();
ArrayList<String> f = new ArrayList();
a.put('a','y');
a.put('b','h');

a.put('c','e');

a.put('d','s');

a.put('e','o');

a.put('f','c');

a.put('g','v');

a.put('h','x');

a.put('i','d');

a.put('j','u');

a.put('k','i');

a.put('l','g');

a.put('m','l');


a.put('n','b');
a.put('o','k');

a.put('p','r');

a.put('q','z');

a.put('r','t');

a.put('s','n');

a.put('t','w');



a.put('u','j');

a.put('v','p');

a.put('w','f');

a.put('x','m');

a.put('y','a');

a.put('z','q');

Scanner in = new Scanner(System.in);



DataInputStream d = new DataInputStream(new BufferedInputStream(new FileInputStream("C:/Users/ANKIT/Desktop/A-small-attempt1.in")));

String num = d.readLine();

int num1;
//System.out.println(num);
num1 = Integer.parseInt(num);
for(int i=0;i<num1;i++)
{
String j = d.readLine();
//System.out.println(j);

String m = "" ;
for(int k=0;k<j.length();k++)
{
	char r = j.charAt(k);
	if(r !=' ')
	{
char ch = (Character) a.get(j.charAt(k));	

m = m+ch;
	}
	else 
		m=m+" ";
}
f.add(m);
}

PrintWriter f11 =new PrintWriter("hello");

for(int y=0;y<f.size();y++)
	
{
	
	
	String j = "Case #"+(y+1)+":" +" "+ f.get(y)+'\n';

f11.print(j);

}
f11.close();
	}
	
}
