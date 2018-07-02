package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1093;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class qualB {
public static void main(String[] args) {
		String prblm="B"; boolean fl=!true;
		String filein=prblm+"-"+((fl)?"large":"small")+".in.txt";
		String fileout=prblm+"-"+((fl)?"large":"small")+".out.txt";
		try {
			BufferedReader fr= new BufferedReader(new FileReader(filein));
			BufferedWriter fw= new BufferedWriter(new FileWriter(fileout));
			String s=fr.readLine();
			int T=Integer.parseInt(s);
			for (int i = 1; i <= T; i++) {
				s=fr.readLine();
				int nf=0; char lt=s.charAt(0);
				for (int j = 1; j < s.length(); j++) {
					if (lt!=s.charAt(j)) { nf++;
						lt=s.charAt(j);
					}
				}
				if (lt=='-') nf++;
				System.out.println(nf);
				fw.write("Case #"+i+": "+ nf  +"\n");
			}
			fr.close();
			fw.close();
		} catch (Exception e) {			
			e.printStackTrace();
		}		
	}
}
