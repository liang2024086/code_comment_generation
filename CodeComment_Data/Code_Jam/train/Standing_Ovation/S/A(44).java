package methodEmbedding.Standing_Ovation.S.LYD947;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class A {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new FileReader("A-small.in"));
        PrintWriter out = new PrintWriter(new FileWriter(new File("a.out")));
		int n = sc.nextInt();
		
		for (int T = 1; n-- > 0; T++) {
			int Smax = sc.nextInt();
			String S = sc.next();
			int standing = 0;
			int invite = 0;
			for(int i = 0;i<Smax+1;i++) {
				if(i - standing > 0) {
					invite += (i-standing);
					standing += (i-standing);
				}
				standing += Integer.parseInt(S.charAt(i)+"");
			}
			
            out.println("Case #"+T+": "+invite);
            System.out.println("Case #"+T+": "+invite);
		}
		out.flush();
	}
}
