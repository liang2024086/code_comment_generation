package methodEmbedding.Speaking_in_Tongues.S.LYD1664;

import java.util.*;
import java.io.*;
public class pfin {
public static void main(String args[]){
	try{
		char[] a={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] b={'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
		FileInputStream fstream = new FileInputStream("A-small-attempt2.in");
		  // Get the object of DataInputStream
		  DataInputStream in = new DataInputStream(fstream);
		  BufferedReader br = new BufferedReader(new InputStreamReader(in));
		  FileWriter fstreamo = new FileWriter("out.txt");
		  BufferedWriter out = new BufferedWriter(fstreamo);
		 // out.write("are u there?");
		  int t=Integer.parseInt(br.readLine());
		  int i,j,k,l;
		  String str,s,sl;
		  char[] s1,s2;
		  for(i=0;i<t;i++){
			  out.write("Case "+"#"+(i+1)+": ");
			  str = br.readLine();
			  StringTokenizer st=new StringTokenizer(str);
			  while(st.hasMoreTokens()){
				 s=st.nextToken();
				 s1=s.toCharArray();
				 for(j=0;j<s.length();j++){
					 for(k=0;k<26;k++){
						 if(s1[j]==a[k])
							 break;
					 }
				  s1[j]=b[k];
				 }
				 for(j=0;j<s.length();j++){
					 
					out.write(s1[j]);
				 }
			      out.write(" ");	 
				// sl=s1.toString();
				 //System.out.println(sl);
				 //out.write(sl);
			  }
			  out.newLine();
		  }
		  
	out.close();
	in.close();
	
	
	}
	catch(Exception e){//Catch exception if any
		  System.err.println("Error: " + e.getMessage());
	  }
}
}
