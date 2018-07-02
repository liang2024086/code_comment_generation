package methodEmbedding.Speaking_in_Tongues.S.LYD116;

//C:\Program Files (x86)\Java\jdk1.6.0_24
import java.io.*;
import java.util.*;
class goolan1
{
public static void main(String args[]) throws IOException
{
String [] x1={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"," "};
String [] x=  {"y","n","f","i","c","w","l","b","k","u","o","m","x","s","e","v","z","p","d","r","j","g","t","h","a","q"," "};
String t;
String t2="";
//int n;
Scanner sc = new Scanner(new FileReader("input.txt"));
PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));
int n = sc.nextInt();
sc.nextLine();
for(int k=0;k<n;k++)
{
t=sc.nextLine();

for(int i=0;i<t.length();i++)
 {
char t1=t.charAt(i);
String t11=""+t1+"";
  for(int j=0;j<x.length;j++)
  {
  if(t11.equals(x[j]))
   {
    t2=t2+x1[j];
   }
  }
 }
pw.println("Case #"+(k+1)+": "+t2);
t2="";
}
pw.close();
sc.close();
}
}
