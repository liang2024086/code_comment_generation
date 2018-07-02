package methodEmbedding.Speaking_in_Tongues.S.LYD1220;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class SpeakingInTongues {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new FileReader("A-small-attempt0.in"));
		//Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new FileWriter("solution.out"));
		char map[]= new char[26];
		String or="abcdefghijklmnopqrstuvwxyz";
		String cop="yhesocvxduiglbkrztnwjpfmaq";
		for(int j=0; j<or.length(); j++){
			map[(int)or.charAt(j)-'a']=cop.charAt(j);
		}
		
		int cas= in.nextInt();
		in.nextLine();
		for(int i=1; i<=cas; i++){
			String chang = in.nextLine();
			String res = "";
			
			for(int k=0; k<chang.length(); k++){
				if(chang.charAt(k)!=' '){
					res+=map[((int)chang.charAt(k))-'a'];
				}else{
					res+=" ";
				}
			}
			out.println("Case #"+i+": "+res);
		}
		out.close();
		System.exit(0);
	}

}
