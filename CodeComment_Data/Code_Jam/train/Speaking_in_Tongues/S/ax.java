package methodEmbedding.Speaking_in_Tongues.S.LYD1507;

import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;

public class ax{
	public static void main(String[] args){
		try{			
			File output;
			FileWriter outputwriter;
			BufferedWriter out;
			String filename = "ax.out";
			
			output = new File(filename);
			outputwriter = new FileWriter(output);
			out = new BufferedWriter(outputwriter);
			
			//System.out.println("siap");
			//out.write("ardhianvv\nll");
			BufferedReader f = new BufferedReader(new FileReader("a.in"));
			StringTokenizer st = new StringTokenizer(f.readLine());
			int angka = Integer.parseInt(st.nextToken());
			char[] data = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p',
									'q',
									'r','s','t','u','v','w','x','y',
									'z',' '};
			char[] datax = new char[]{'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r',
									'z',
									't','n','w','j','p','f','m','a',
									'q',' '};
			for(int a=0;a<angka;a++){
				st = new StringTokenizer(f.readLine());
				String hh = st.nextToken("\n");
				String hasil = "";
				for(int b=0;b<hh.length();b++){
					boolean ada = false;
					for(int c=0;c<data.length;c++){
						if(hh.charAt(b)==data[c]){
							ada = true;
							hasil+=""+datax[c];
							c = data.length;
						}
					}
					if(!ada){
						hasil+=hh.charAt(b);
					}
				}
				if(a!=angka-1)
					out.write("Case #"+(a+1)+": "+hasil+"\n");
				else
					out.write("Case #"+(a+1)+": "+hasil);
			}
			//int angka = Integer.parseInt(st.nextToken());
			
			out.close();
		} catch(Exception cc){
			System.out.println(cc.toString());
		}
	}
}
