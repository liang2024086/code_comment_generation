package methodEmbedding.Speaking_in_Tongues.S.LYD309;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class SpeakingInTongues {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String input="ynficwlbkuomxsevzpdrjgthaq ";
		String output="abcdefghijklmnopqrstuvwxyz ";
		
		
		
		FileInputStream fis = new FileInputStream("c:/small1.txt");
        DataInputStream dis = new DataInputStream(fis);
        BufferedReader br = new BufferedReader(new InputStreamReader(dis));
        
        FileWriter fstream = new FileWriter("c:/out1.txt");
        BufferedWriter out = new BufferedWriter(fstream);
               
        
        String str=br.readLine();
        int T=Integer.parseInt(str);
        String temp=null;
        int caseNo=1;
        while( (str = br.readLine()) != null && T>0) 
        {
        	
        	char[] inStr=str.toCharArray();
        	char[] outStr=new char[inStr.length];
        	
        	if(caseNo>1)
        		out.newLine();
        	
        	
        	
        	for (int i = 0; i < inStr.length; i++) {
        		
        		outStr[i]=output.charAt(input.indexOf(inStr[i]));
				//System.out.println("in= "+inStr[i]+" and out= "+outStr[i]);
			}
        	
        	temp=new String(outStr);
        	System.out.println(temp);
        	out.write("Case #"+caseNo+": "+temp);
        	
        	T--;
        	caseNo++;
        }
        
        out.close();

	}

}
