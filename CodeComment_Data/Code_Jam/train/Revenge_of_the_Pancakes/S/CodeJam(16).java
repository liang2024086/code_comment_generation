package methodEmbedding.Revenge_of_the_Pancakes.S.LYD303;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CodeJam {
	 public static void main(String[] args) throws NumberFormatException, IOException {
	     	BufferedReader br = new BufferedReader(new FileReader("in.txt"));
	     	BufferedWriter bw=new BufferedWriter(new FileWriter("Pancakes.txt"));
	        int T,moves;
	        String s;
	        T = Integer.valueOf(br.readLine());
	        for (int i=0;i<T;i++)
	            {
	        	moves=0;
	            s=br.readLine();
	            if(s.charAt(s.length()-1)=='-')moves++;
	           for(int k=s.length()-1;k>0;k--)
	            	if(s.charAt(k)!=s.charAt(k-1))moves++;
	            bw.write("Case #"+(i+1)+": "+moves);
	            
	            bw.newLine();
	        }	
	        br.close();
	        bw.close();
	   }
}
