package methodEmbedding.Speaking_in_Tongues.S.LYD830;

import java.util.*;
import java.io.*;
class TongueSpeaking{
static char a[]=new char[200];

public static void main(String[] args){
  try {
File file = new File("A-small-attempt4.in");  
 FileReader fr = new FileReader(file);
BufferedReader br = new BufferedReader(fr); 
File file1 = new File("A-small-output4.in");
FileWriter fw = new FileWriter(file1); 
PrintWriter pw = new PrintWriter(fw);
int T= Integer.valueOf(br.readLine());

int i,p=1,j,k;

Scanner cin=new Scanner(System.in);
//System.out.println("enter no. of test cases"+T);


a['a']='y';
a['b']='h';a['c']='e';
a['e']='o';a['d']='s';
a['f']='c';a['g']='v';a['h']='x';
a['i']='d';a['j']='u';a['k']='i';
a['l']='g';a['m']='l';a['n']='b';
a['o']='k';a['p']='r';a['q']='z';
a['r']='t';a['s']='n';a['t']='w';
a['u']='j';a['v']='p';a['w']='f';
a['x']='m';a['y']='a';a['z']='q';

while(p<=T )
{	

String G=br.readLine(); 
String S="";	
//System.out.println(G.length());

	for(i=0;i<G.length() && G!=null;i++)
	{
		if((G.charAt(i)==' '))
		S+=" ";
		else{
		j=(int)G.charAt(i);
		S+=a[j];		
		}
	}
pw.println("Case #"+p+":  "+S);
	
p++;

}

   fr.close(); 
fw.close();

  } catch(IOException e) { }
}//main
}//class
