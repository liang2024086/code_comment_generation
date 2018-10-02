package methodEmbedding.Cookie_Clicker_Alpha.S.LYD529;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class cook {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(new File("B-small-attempt0.in"));
		int N = scan.nextInt();
		FileWriter fw = new FileWriter( new File("result.txt"));
		for(int k=0;k<N;k++){
			
			double C = scan.nextDouble();
			double F = scan.nextDouble();
			double X = scan.nextDouble();
			//System.out.print(C+" "+F+" "+X+" ");
			double P = 2;
			
			double buing=0;
			int i=0;
			double answer1=2*X/P;
			double answer2=X/P;
			while(answer2<answer1){
				answer1=answer2;
				buing+=C/(P+F*i++);
				answer2=buing+X/(P+i*F);
			}
			//System.out.print(" "+i+" ");
			
			System.out.print("Case #"+(k+1)+": "+answer1+"\n");
			fw.write("Case #"+(k+1)+": "+answer1+"\n");
			fw.flush();
			
		}
	}

}
