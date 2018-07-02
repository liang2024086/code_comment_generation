package methodEmbedding.Standing_Ovation.S.LYD444;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class StandingOvation {

	public static void main(String[] args) throws NumberFormatException, IOException {
		String ris="";
		FileReader f=new FileReader("C:/Users/Admin/Desktop/A-small-attempt1.in");

	    BufferedReader b=new BufferedReader(f);
	    
		int casi = Integer.parseInt(b.readLine());
		for (int i=0;i<casi;i++) {
			int cont =0;
			int agg=0;
			String s = b.readLine();
			String[] split = s.split(" ");
			int maxS = Integer.parseInt(split[0]);
			for (int x=0;x<maxS+1;x++) {
				while ((cont+agg)<x) agg++;
				cont+=Integer.parseInt(split[1].substring(x,x+1));
			}
			ris+="Case #"+(i+1)+": "+agg+"\n";
		}
		System.out.println(ris);
	}
}
