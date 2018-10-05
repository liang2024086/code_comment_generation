package methodEmbedding.Cookie_Clicker_Alpha.S.LYD211;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ProblemB {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(new File("ProblemB.txt.in"));
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("ProblemB.txt.out")));
		
		int T = sc.nextInt();
		sc.nextLine();
		DecimalFormat six = new DecimalFormat("#0.0000000");
		
		for(int i=0;i<T;i++) {
		    
		    double c = sc.nextDouble();
		    double f = sc.nextDouble();
		    double x = sc.nextDouble();
		    
		    double rate = 2.0;
		    double duration = 0.0;
		    
		    while ( (x / rate) > (c/rate + x/(rate+f))){
		        duration+= c/rate ;
		        rate +=f;
		    }
		    duration += (x/rate);
		    bw.write("Case #" + (i+1) +": " + six.format(duration) + "\n");
		}
		bw.close();
        sc.close();
        System.out.println("Finished");
	}

}
