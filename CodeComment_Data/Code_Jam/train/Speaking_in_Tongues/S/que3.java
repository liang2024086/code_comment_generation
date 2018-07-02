package methodEmbedding.Speaking_in_Tongues.S.LYD566;

import java.io.*;
public class que3
{
    
public static void main(String arg[])throws IOException
{
char eng[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' '};
    char goo[]={'y','n','f','i','c','w','l','b','k','u','o','m','x','s','e','v','z','p','d','r','j','g','t','h','a','q',' '};

    
    BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
   int aa=1;
  
  String ans="Case #1: ";
 		int count = 0;
 try{
 	FileReader fr = new FileReader("A-small-attempt0.in");
				LineNumberReader ln = new LineNumberReader(fr);
		
				while (ln.readLine() != null){
					count++;
				}
 }  
 catch(Exception e){}
 count--;
 int cntr=2;
   try{
  
FileInputStream fis = new FileInputStream("A-small-attempt0.in");


 DataInputStream in = new DataInputStream(fis);
  BufferedReader br = new BufferedReader(new InputStreamReader(in));
int n = 0,pos=0; 

String t=in.readLine();

while ((n = fis.read()) != -1){ 
char c = (char)n; 


if(c=='\n')
{
ans+="\r\nCase #"+cntr+": ";
System.out.println();
cntr++;
}


int p=0;
for(int i=0;i<=26;i++)
{
	
	String a=c+"";
	String b=goo[i]+"";

    if(a.equals(b))
    {    pos=i;
    System.out.print(eng[pos]);
   ans+=eng[pos];
    
  		  break;
    }

}


}


}
catch(FileNotFoundException fnfe){ 
System.err.println("FileNotFoundException: " + fnfe.getMessage()); 
}
catch(IOException ioe){ 
System.err.println("IOException: " + ioe.getMessage()); 
} 
  
 try{
 	 FileWriter fstream = new FileWriter("output.txt");
  BufferedWriter out = new BufferedWriter(fstream);
  
  out.write(ans);
  out.close();
 } 
 catch(Exception e)
 {
 	System.out.println("Error"+e);
 }

  
}

}
