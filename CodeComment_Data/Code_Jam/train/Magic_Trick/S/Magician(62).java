package methodEmbedding.Magic_Trick.S.LYD2121;


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Magician
{
	public static void main (String[] args) throws java.lang.Exception
	{
		PrintWriter pw=new PrintWriter(new OutputStreamWriter(new FileOutputStream(args[1])));
		FileInputStream fin=new FileInputStream(args[0]);
		BufferedReader buffer=new BufferedReader(new InputStreamReader(fin));
		String line=buffer.readLine();
		int testNumber=Integer.parseInt(line);
	
		for(int testCase=1;testCase<=testNumber;testCase++){
			String aSet="";
			line=buffer.readLine();
			int row=Integer.parseInt(line);
			for(int i=1;i<=4;i++){
				line=buffer.readLine();

				if(i==row){
					aSet=line;
				}
			}
			line=buffer.readLine();
			row=Integer.parseInt(line);
			String bSet="";
			for(int i=1;i<=4;i++){
				line=buffer.readLine();

				if(i==row){
					bSet=line;
				}
			}
			int countFounds=0;
			String found="";
			StringTokenizer st1=new StringTokenizer(aSet," ");
			while (st1.hasMoreTokens()) {
				String a=st1.nextToken();
					StringTokenizer st2=new StringTokenizer(bSet," ");

				while (st2.hasMoreTokens()) {
				String b=st2.nextToken();
				
					//System.out.println(a+" $$$ "+b);
				
					if(a.equals(b)){
					
						found=b;
						countFounds++;
					}
						
				}
			}
			if(countFounds==0)
				pw.println("Case #"+testCase+": Volunteer cheated!");
			
			if(countFounds>1)
				pw.println("Case #"+testCase+": Bad magician!");
			if(countFounds==1)
				pw.println("Case #"+testCase+": "+found);
			
		}
		pw.close();
		fin.close();
	}
}
