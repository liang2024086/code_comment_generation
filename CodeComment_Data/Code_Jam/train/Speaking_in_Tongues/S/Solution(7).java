package methodEmbedding.Speaking_in_Tongues.S.LYD422;

import java.io.*;
import java.util.*;
public class Solution {
	public static void main(String args[]){
		try{
		FileInputStream fin=new FileInputStream("C:\\Program lang\\Google Code Jam\\input02.txt");
		DataInputStream datain=new DataInputStream(fin);
		BufferedReader br=new BufferedReader(new InputStreamReader(datain));
		File file = new File("C:\\Program lang\\Google Code Jam\\output02.txt");
		BufferedWriter bw=new BufferedWriter(new FileWriter(file));
		int T=Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++){
			String s=br.readLine();
			s=s.toUpperCase();
			String Googleerese="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String English=    "yhesocvxduiglbkrztnwjpfmaq";
			for(int j=0;j<25;j++)
						s=s.replaceAll(Googleerese.substring(j,j+1), English.substring(j,j+1));
			s=s.replaceAll(Googleerese.substring(25), English.substring(25));
			bw.write("Case #"+(i+1)+": "+s);
			bw.newLine();
			}
		bw.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
}
