package methodEmbedding.Speaking_in_Tongues.S.LYD852;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;

public class Tongue {
	public static void main(String args[]){
				
		Tongue t=new Tongue();
		BufferedReader in;
		int T;
		int A, B;
		int temp, len;
		int div, rem, no, goo;
		List ipl, opl;
		
		int count = 0;
		try{
			in = new BufferedReader(new FileReader("test.txt"));
			PrintWriter pw = new PrintWriter(new FileWriter("Ans.txt"));
			String str="";
			str = in.readLine();
			T = Integer.parseInt(str);
			int ind;
			String ip = "";
			String op = "";
			ipl = new ArrayList();
			opl = new ArrayList();
			int i=0;
			ipl.add(i," "); opl.add(i," ");
			ipl.add(++i,"e"); opl.add(i,"o");
			ipl.add(++i,"j"); opl.add(i,"u");
			ipl.add(++i,"p"); opl.add(i,"r");
			ipl.add(++i,"m"); opl.add(i,"l");
			ipl.add(++i,"y"); opl.add(i,"a");
			ipl.add(++i,"s"); opl.add(i,"n");
			ipl.add(++i,"l"); opl.add(i,"g");
			ipl.add(++i,"c"); opl.add(i,"e");
			ipl.add(++i,"k"); opl.add(i,"i");
			ipl.add(++i,"d"); opl.add(i,"s");
			ipl.add(++i,"x"); opl.add(i,"m");
			ipl.add(++i,"v"); opl.add(i,"p");
			ipl.add(++i,"n"); opl.add(i,"b");
			ipl.add(++i,"r"); opl.add(i,"t");
			ipl.add(++i,"i"); opl.add(i,"d");
			ipl.add(++i,"b"); opl.add(i,"h");
			ipl.add(++i,"t"); opl.add(i,"w");
			ipl.add(++i,"a"); opl.add(i,"y");
			ipl.add(++i,"h"); opl.add(i,"x");
			ipl.add(++i,"w"); opl.add(i,"f");
			ipl.add(++i,"f"); opl.add(i,"c");
			ipl.add(++i,"g"); opl.add(i,"v");
			ipl.add(++i,"u"); opl.add(i,"j");
			ipl.add(++i,"o"); opl.add(i,"k");
			ipl.add(++i,"q"); opl.add(i,"z");
			ipl.add(++i,"z"); opl.add(i,"q");
			String val="";
			while(T>0)
			{
				
				ip = in.readLine();
				op = "";
				for(int j=0; j<ip.length(); j++)
				{
					val = String.valueOf(ip.charAt(j));
					ind = ipl.indexOf(val);
					op = op + (String)opl.get(ind);
				}
				
				//System.out.println(op);
				pw.println("Case #"+ ++count +": "+ op);
				pw.flush();
				
				T--;
			}
			pw.close();
		}catch(Exception e){}

	}
}
