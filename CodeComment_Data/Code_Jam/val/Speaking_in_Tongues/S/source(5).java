package methodEmbedding.Speaking_in_Tongues.S.LYD1271;

/**
 * The HelloWorldApp class implements an application that
 * simply prints "Hello World!" to standard output.
 */
import java.io.*;
import java.net.*;
import java.util.*;
import java.lang.Math;


class solve{
	
	public solve(){
		
	}
	
	public static void main(String[] args){
		
		HashMap<String,String> hash=new HashMap<String,String>();
		
		
		try{
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String line;
			String[] array1,array2;
			array1=new String[3];
			array2=new String[3];
			int ind=0;
			int i=0,j=0;
			
			while ((line=bf.readLine())!=null) {
				if (i==3 && j==3) {
					break;
				}
				if (ind==0) {
					ind=1;
					array1[i]=line;
					i++;
				}
				else {
					ind=0;
					array2[j]=line;
					j++;
				}
			}
			for (int k=0; k<3; k++) {
				int len=array1[k].length();
				for (int qw=0; qw<len; qw++) {
					//System.out.println("qw= "+qw+" char is="+array2[k].charAt(qw));
					hash.put(""+array1[k].charAt(qw),""+array2[k].charAt(qw));
				}
			}
			
			//bf.close();
			
			
			//BufferedReader bf2 = new BufferedReader(new InputStreamReader(System.in));
			String line2;
			int indicator=0;
			int counter=-1;
			int n=100000;
			String ans="";
			
			while ((line2=bf.readLine())!=null) {
				String temp="";
				if (indicator==0) {
					n=Integer.parseInt(line2);
					counter++;
				}
				else {
					int lent=line2.length();
					for (int tyu=0; tyu<lent; tyu++) {
						temp+=hash.get(""+line2.charAt(tyu));
					}
					counter++;
					ans+="Case #"+counter+": "+temp+"\n";
				}
				
				indicator=1;
				
				
				
				if (counter==n) {
					//bf2.close();
					break;
				}
			}
			System.out.println(ans);
			bf.close();
			BufferedWriter f=new BufferedWriter(new FileWriter("output.txt"));
			f.write(ans);
			f.close();
		}
		catch (Exception e) {
			System.out.println("error2");
		}
		
	}
}
