package methodEmbedding.Standing_Ovation.S.LYD1841;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;


public class StandingOvation {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner in = new Scanner (new File("A-small-attempt0.in"));
		PrintStream out = new PrintStream(new FileOutputStream("output1.txt"));
		System.setOut(out);
		int t=in.nextInt();
		in.nextLine();
		for(int i=0;i<t;i++){
			int Smax=in.nextInt();
			String s=in.next();
			in.nextLine();
			int current=0;
			int ans=0;
			for(int j=0;j<=Smax;j++){
				int sj=Integer.parseInt(s.charAt(j)+"");
				if(sj>0){
					if(current<j){
						int invited=j-current;
						current+=invited;
						ans+=invited;
						
					}
					current+=sj;
				}
			}
			System.out.println("Case #"+(i+1)+": "+ans);
		}
	}

}
