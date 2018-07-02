package methodEmbedding.Standing_Ovation.S.LYD1657;

import java.io.*;
class miente
{
 static BufferedReader reader;
 static BufferedWriter writer;
 public static void main(String ar[]) throws IOException
 {
  BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
  File inFile = new File("A-small-attempt1.in");
  File outFile = new File("output.out");
  FileWriter fwriter = new FileWriter(outFile);
  writer = new BufferedWriter(fwriter);
  FileReader freader = new FileReader(inFile);
  reader = new BufferedReader(freader);
  int mshy=0,c=0,t,i,l=0,a[]=new int[1001],ps=0,pre[]=new int[101];
  String str="";
  t=Integer.parseInt(reader.readLine());
  do
  {
   ps=0;
   str=reader.readLine();
   l=str.length();
   for(i=0;i<l;i++)
   {
    if(str.charAt(i)==' ')
	{
	 mshy=Integer.parseInt(str.substring(0,i));
	 str=str.substring(i+1);
	 break;
	}
   }
   l=str.length();
   if(str.charAt(l-1)=='0')
   {
    c++;
	continue;
   }
   str=str+" ";
   for(i=0;i<=mshy;i++)
    a[i]=Integer.parseInt(str.substring(i,i+1));
	ps+=a[0];
   for(i=1;i<=mshy;i++)
   {
    if(i>ps)
	{
	   pre[c]+=(i-ps);
	 ps+=(i-ps);
	  if(a[i]==0)
	   continue;
	   ps+=a[i];
	}
	else
	ps+=a[i];
   }
	   System.out.println(ps);
   c++;
  }while(c!=t);
  for(i=0;i<c;i++)
  writer.write("Case #"+(i+1)+": "+pre[i]+"\n");
  writer.close();
 }
}	
