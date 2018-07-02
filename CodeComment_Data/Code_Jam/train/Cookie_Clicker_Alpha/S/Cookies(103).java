package methodEmbedding.Cookie_Clicker_Alpha.S.LYD740;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;


public class Cookies {
	public static void main(String[] args) throws Throwable {
		BufferedReader f = new BufferedReader(new FileReader("B-small-attempt0.in"));
		PrintWriter out = new PrintWriter(new FileWriter("magic.txt"));
		StringBuilder str=new StringBuilder();
		while(f.ready()){
			str.append(f.readLine()+" ");
		}
		StringTokenizer st = new StringTokenizer(str.toString());
		int numdo=Integer.parseInt(st.nextToken());
		for(int numbercas=0; numbercas<numdo;numbercas++){
			double t=0;
			double r=2;
			double pr= Double.parseDouble(st.nextToken());
			double gc= Double.parseDouble(st.nextToken());
			double go= Double.parseDouble(st.nextToken());
			boolean ndon=true;
			while(ndon){
				if(go/r<pr/r+go/(r+gc)){
					t+=go/r;
					ndon=false;
				}else{
					t+=pr/r;
					r+=gc;
				}
			}
			String s="Case #"+(numbercas+1)+": ";
			s+=t;
			System.out.println(s);
			out.println(s);
		}
		out.close();	
	}

}

