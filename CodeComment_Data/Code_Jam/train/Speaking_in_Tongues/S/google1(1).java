package methodEmbedding.Speaking_in_Tongues.S.LYD551;

import java.io.*;
public class google1
{
public static void main(String []args)throws IOException
{
BufferedReader x=new BufferedReader(new InputStreamReader(System.in));



int lines;


 try{
  // Open the file that is the first 
  // command line parameter
  FileInputStream fstream = new FileInputStream("A-small-attempt0.in.txt");
  // Get the object of DataInputStream
  DataInputStream in = new DataInputStream(fstream);
  BufferedReader br = new BufferedReader(new InputStreamReader(in));
  String strLine;
  strLine=br.readLine();
  int a=Integer.parseInt(strLine);
  lines=a;//Read File Line By Line
 String b[]=new String[a];
 int i=0;
  while ((strLine = br.readLine()) != null)   {
  // Print the content on the console
  b[i]=strLine;i++;
  }
  in.close();
  
  
  
  
  String f[]=new String[a];
int len;char ch;String temp;
for(int j=0;j<a;j++)
{f[j]="";
len=b[j].length();
for(int k=0;k<len;k++)
{
ch=b[j].charAt(k);
switch(ch)
{
case 'a':f[j]=f[j]+'y';
break;
case 'b':f[j]=f[j]+'h';
break;
case 'c':f[j]=f[j]+'e';
break;
case 'd':f[j]=f[j]+'s';
break;
case 'e':f[j]=f[j]+'o';
break;
case 'f':f[j]=f[j]+'c';
break;
case 'g':f[j]=f[j]+'v';
break;
case 'h':f[j]=f[j]+'x';
break;
case 'i':f[j]=f[j]+'d';
break;
case 'j':f[j]=f[j]+'u';
break;
case 'k':f[j]=f[j]+'i';
break;
case 'l':f[j]=f[j]+'g';
break;
case 'm':f[j]=f[j]+'l';
break;
case 'n':f[j]=f[j]+'b';
break;
case 'o':f[j]=f[j]+'k';
break;
case 'p':f[j]=f[j]+'r';
break;
case 'q':f[j]=f[j]+'z';
break;
case 'r':f[j]=f[j]+'t';
break;
case 's':f[j]=f[j]+'n';
break;
case 't':f[j]=f[j]+'w';
break;
case 'u':f[j]=f[j]+'j';
break;
case 'v':f[j]=f[j]+'p';
break;
case 'w':f[j]=f[j]+'f';
break;
case 'x':f[j]=f[j]+'m';
break;
case 'y':f[j]=f[j]+'a';
break;
case 'z':f[j]=f[j]+'q';
break;
case ' ':f[j]=f[j]+' ';
break;
}
}
}
 FileOutputStream out = new FileOutputStream(new File("output.txt"));
 
 int g=0;for(int l=0;l<a;l++)
{g=l+1;byte[] s = ("Case #"+g+": "+f[l]+"\n").getBytes();
out.write(s);
}


}
catch (Exception e){//Catch exception if any
  System.err.println("Error: " + e.getMessage());
  }
}
}
