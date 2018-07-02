package methodEmbedding.Speaking_in_Tongues.S.LYD1607;

import java.io.*;
import java.lang.*;
import java.lang.StringBuilder;
//import org.apache.commons.lang.ArrayUtils;

class Convert 
{
 public static void main(String args[])
   {
  try{
  
    char[] Aplphabets = { 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' '};
	char[] gAplphabets ={ 'y','n','f','i','c','w','l','b','k','u','o','m','x','s','e','v','z','p','d','r','j','g','t','h','a','q',' '};
	char[] toConvert;
   FileWriter ostream = new FileWriter("A-small-attempt0.out");
  BufferedWriter out = new BufferedWriter(ostream);
  
  FileInputStream fstream = new FileInputStream("A-small-attempt0.in");
  
  DataInputStream in = new DataInputStream(fstream);
  BufferedReader br = new BufferedReader(new InputStreamReader(in));
  String strLine;
  //StringBuilder result = new StringBuilder();
  strLine = br.readLine();
  strLine = br.readLine();
  int count = 0;
  out.write("Output");
  out.newLine();
  
  do{	
		toConvert = strLine.toCharArray();
		StringBuilder result = new StringBuilder();
	//	System.out.println (strLine);
	count++;
	result.append("Case #"+count+": ");
	for(int index=0; index< toConvert.length; index++)
	{
		
		for(int x=0; x<gAplphabets.length; x++)
		{
			
			if(toConvert[index]==gAplphabets[x])
			//if((toConvert[index]).compareTo(gAplphabets[x]))
			{
		   // System.out.print("Case : "+index);
			//System.out.println(toConvert[index] + "   "+gAplphabets[x] + "   "+Aplphabets[x]);
			
			result.append(Aplphabets[x]);
			//System.out.print(Aplphabets[x]);
			}
		}
	}
	//result.append('\n');
	//System.out.print(result.toString());
	out.write(result.toString());
	out.newLine();
  }
  while ((strLine = br.readLine()) != null);/*   {
  
  System.out.println (strLine);
  }*/
  
  in.close();
  out.close();
    }catch (Exception e){
  System.err.println("Error: " + e.getMessage());
   }
   }
 }
