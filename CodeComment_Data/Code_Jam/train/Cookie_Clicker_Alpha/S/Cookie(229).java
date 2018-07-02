package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1411;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Cookie {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new FileReader("e:\\input.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter("e:\\output.txt"));
        int cases = sc.nextInt();
        sc.nextLine();
        for (int c = 0; c < cases; c++) {
            System.out.println("Processing test case " + (c + 1));
            pw.print("Case #" + (c + 1) + ": ");
            double C = sc.nextDouble();
        	double F = sc.nextDouble();
        	double X = sc.nextDouble();
        	
        	double min = X/2;
        	double currentProd  = 2;
        	double time  = Double.MAX_VALUE;
        	double buildTime = C/currentProd;

        	while(true){
        		time = buildTime + X/(currentProd+F);
        		if(time >= min){
        			break;
        		}else{
        			min = time;
        			currentProd += F;
        			buildTime += C/currentProd;    			
        		}    		
        	}
        	
        	pw.printf("%.7f\n", min);        	
            
            if(c < cases - 1){
            	sc.nextLine();
            }
        }
        pw.flush();
        pw.close();
        sc.close();
	}
}
