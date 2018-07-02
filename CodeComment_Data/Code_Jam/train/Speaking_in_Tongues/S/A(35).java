package methodEmbedding.Speaking_in_Tongues.S.LYD751;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;


public class A {
	
	public static void main(String[] args) throws Exception {
		String alphabet="yhesocvxduiglbkrztnwjpfmaq";
		Scanner s=new Scanner(new File("./data/A.txt"));
		PrintWriter pw=new PrintWriter(new File("./data/A_sol.txt"));
		int ncases=s.nextInt();s.nextLine();
		for(int i=0;i<ncases;i++){
			String st=s.nextLine();
			String ans="";
			for(char c: st.toCharArray()){
				if(c==' ')ans+=' ';
				else{
					ans+=alphabet.charAt( c-'a' );
				}
			}
			pw.println("Case #"+(i+1)+": " +ans);
		}
		pw.close();
		
	}
}
