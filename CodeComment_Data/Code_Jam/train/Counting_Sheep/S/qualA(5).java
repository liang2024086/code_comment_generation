package methodEmbedding.Counting_Sheep.S.LYD604;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class qualA {
public static void main(String[] args) {
		String prblm="A"; boolean fl=!true;
		String filein=prblm+"-"+((fl)?"large":"small")+".in.txt";
		String fileout=prblm+"-"+((fl)?"large":"small")+".out.txt";
		try {
			BufferedReader fr= new BufferedReader(new FileReader(filein));
			BufferedWriter fw= new BufferedWriter(new FileWriter(fileout));
			String s=fr.readLine();
			int T=Integer.parseInt(s);
			for (int i = 1; i <= T; i++) {
				s=fr.readLine();
				int N=Integer.parseInt(s),x=0;
				if (N==0) s="INSOMNIA";
				else {
					int r=0,j=1;
					for (; true; j++) {
						x+=N;
						int y=x;
						while (y>0){
							r|=1<<(y%10);
							y=y/10;
						}					
						if (r==(1<<10)-1) break;					
					}
					s=""+j*N;
				}
				System.out.println(s);
				fw.write("Case #"+i+": "+ s  +"\n");
			}
			fr.close();
			fw.close();
		} catch (Exception e) {			
			e.printStackTrace();
		}		
	}
}
