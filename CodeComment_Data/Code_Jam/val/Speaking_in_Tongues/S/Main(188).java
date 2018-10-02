package methodEmbedding.Speaking_in_Tongues.S.LYD1577;

import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		int[] trad = {24,7,4,18,14,2,21,23,3,20,8,6,11,1,10,17,25,19,13,22,9,15,5,12,0,16};
		int a = 'a';
		Scanner scan = new Scanner(new File("input"));
		PrintWriter out =  new PrintWriter(new BufferedWriter
				   (new FileWriter("output")));
		int T = scan.nextInt();
		int compteur =1;
		scan.nextLine();
		while (T-->0){
			String s = scan.nextLine();
			out.print("Case #"+compteur+": ");
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)!=' '){
					char c =(char) (a+trad[(int)s.charAt(i)-a]);
					out.print(c);
				}
				else{
					out.print(s.charAt(i));
				}
			}
			out.println();
			compteur++;
		}
		out.close();
	}

}
