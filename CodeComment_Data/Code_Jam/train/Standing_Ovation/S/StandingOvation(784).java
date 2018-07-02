package methodEmbedding.Standing_Ovation.S.LYD1280;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StandingOvation {

	private static Scanner in;
	private static PrintWriter pw;

	public static void main(String[] args) throws FileNotFoundException {

		int N;
		File fi = new File("src\\pb1\\A-small.in");
		File fo = new File("src\\pb1\\A-small.out");

		pw = new PrintWriter(fo);
		in = new Scanner(fi);

		N =in.nextInt();
		in.nextLine();

		int i=0,n;
		String s;

		while(i<N){
			n=i+1;
			s=in.nextLine();
			String[] results =  s.split(" ");
			int temp=0,cpt_add=0;



			if(results[1].length()==1){
				if(Integer.parseInt(""+results[1].charAt(0))==0)
					cpt_add=1;
			}
				
			for (int j = 1; j < results[1].length(); j++) {

				temp=0;
				
				if (results[1].charAt(j) == '0')
					continue;
				
				for (int j2 = 0; j2 < j; j2++)
					temp+=Integer.parseInt(""+results[1].charAt(j2));
				
				
				//System.out.println("temp "+temp);
				//System.out.println(cpt_add);
				
				if( (temp+cpt_add) < j)
					cpt_add+=j-(temp+cpt_add);
				//System.out.println(cpt_add);
			}

			pw.println("Case #"+n+": "+cpt_add);
			i++;

		}

		pw.close();
	}




}
