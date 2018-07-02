package methodEmbedding.Magic_Trick.S.LYD2009;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A {
public static void main(String[] args) {
	
	try {
		FileReader file=new FileReader("A-small-attempt0.in");
		PrintWriter pw = new PrintWriter("A-small-response0.out");
		Scanner in;
		in = new Scanner(file);
		in.nextLine();
		int cas=0;
		while (in.hasNext()){
			cas++;
			int firstResponse=new Integer(in.nextLine()).intValue();
			for (int i = 1; i < firstResponse; i++) {
				in.nextLine();
			}
			String firstRow=in.nextLine();
			for (int i = firstResponse+1; i <= 4; i++) {
				in.nextLine();
			}
			int secondResponse=new Integer(in.nextLine()).intValue();
			for (int i = 1; i < secondResponse; i++) {
				in.nextLine();
			}
			String secondRow=in.nextLine();
			for (int i = secondResponse+1; i <= 4; i++) {
				in.nextLine();
			}
			HashSet s=new HashSet();
			Scanner linesc=new Scanner(firstRow);
			for (int i = 0; i < 4; i++) {
				s.add(linesc.next());
			}
			linesc=new Scanner(secondRow);
			String value="";
			for (int i = 0; i < 4; i++) {
				int lng=s.size();
				String key=linesc.next();
				s.add(key);
				if (lng==s.size()) value=key; 
			}
			if (s.size()==8) pw.println("Case #"+cas+": Volunteer cheated!");
			if (s.size()==7) pw.println("Case #"+cas+": "+value);
			if (s.size()<7) pw.println("Case #"+cas+": Bad magician!");
				}
				
		
			
		in.close();
		pw.flush();
		pw.close();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	

	
}

}

