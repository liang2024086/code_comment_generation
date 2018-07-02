package methodEmbedding.Speaking_in_Tongues.S.LYD402;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;


public class SpeakingInTounge {

	/**
	 * @param args
	 */
	public static char[] translator ={'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
	public static void main(String[] args) {
		try{
			// TODO Auto-generated method stub
//			Scanner sc = new Scanner(new File("fff.in"));
			BufferedReader br = new BufferedReader(new FileReader("A-small-attempt1.in"));
			PrintWriter pw = new PrintWriter(new File("fff2.out"));
			int T = Integer.parseInt(br.readLine());
			for (int i = 1; i <= T; i++) {
				String inp = br.readLine();
				StringBuffer sb = new StringBuffer();
				for(int xx=0;xx<inp.length();xx++){
					if(inp.charAt(xx)==' '){
						sb.append(' ');
					}
					else{
						sb.append(translator[inp.charAt(xx)-'a']);
					}
				}
				pw.println("Case #"+ i+ ": "+sb.toString());

			}
			pw.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
