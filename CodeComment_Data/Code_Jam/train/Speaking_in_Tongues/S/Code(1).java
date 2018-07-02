package methodEmbedding.Speaking_in_Tongues.S.LYD1349;

import java.io.*;
import java.util.*;

public class Code{

	public static void main(String args[]){
		try{
  			FileInputStream fstream = new FileInputStream("textfile.txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			FileWriter ffstream = new FileWriter("./output.txt");
		  	BufferedWriter out = new BufferedWriter(ffstream);
			String strLine,result;
			char[] enc = new char[26];
			enc[0]='y';
			enc[1]='h';//
			enc[2]='e';
			enc[3]='s';
			enc[4]='o';
			enc[5]='c';
			enc[6]='v';
			enc[7]='x';
			enc[8]='d';
			enc[9]='u';
			enc[10]='i';
			enc[11]='g';
			enc[12]='l';
			enc[13]='b';
			enc[14]='k';
			enc[15]='r';
			enc[16]='z';
			enc[17]='t';
			enc[18]='n';
			enc[19]='w';
			enc[20]='j';
			enc[21]='p';
			enc[22]='f';
			enc[23]='m';
			enc[24]='a';
			enc[25]='q';//
			int i=0;
			strLine = br.readLine();
			i=Integer.parseInt(strLine);
			int j=1;
			boolean upper=false;
			int val=0;
			while (j<=i)   {
				strLine = br.readLine();
				char[] cLine = strLine.toCharArray();
				int length = cLine.length;
				for(int k=0; k<length; k++){
					upper=false;
					char temp = cLine[k];
					if (Character.isLetter(temp)){
						if (Character.isUpperCase(temp)){
							upper=true;
							temp = Character.toLowerCase(temp);
						}
					 	val = (int)temp;
						val = val-97;
						cLine[k]=enc[val];
						if (upper=true){
							cLine[k]=Character.toLowerCase(enc[val]);
						}
					}
				}
				result = new String(cLine);
				out.write("Case #"+Integer.toString(j)+": "+result+"\n");
				j++;
			}
			
			in.close();
			out.close();
		}
		catch (Exception e){//Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
	}

}

