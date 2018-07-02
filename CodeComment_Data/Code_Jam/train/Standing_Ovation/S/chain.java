package methodEmbedding.Standing_Ovation.S.LYD156;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.io.*
;
public class chain {
public static void main(String []args)throws IOException{
	 File infile=new File("small.txt");
	 FileInputStream fis=new FileInputStream(infile);
	 DataInputStream inp=new DataInputStream(fis);

	 PrintWriter out=new PrintWriter("output.txt");
	int i=0;
int t=Integer.parseInt(inp.readLine());;
for(i=1;i<=t;i++){
	String s=inp.readLine();
	String s1[]=s.split(" ");
	int j=0;
	int sum=0,sum2=0;
	int arr[]=new int[s1[1].length()];
	for ( j = 0; j <s1[1].length() ; j++) {
	    arr[j] = Integer.valueOf(s1[1].substring(j, j + 1));
	    
	   
	    if(j-sum>0){
	    	sum2++;
	    	sum++;
		}
	    sum=sum+arr[j];
	}

		out.println("Case #"+i+":"+" "+sum2);
}
out.close();
inp.close();
		}
	


}
