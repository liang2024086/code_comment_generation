package methodEmbedding.Cookie_Clicker_Alpha.S.LYD515;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) throws IOException {
        //Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(new File("B-small-attempt0.in"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("small.out"));
		
        int T = in.nextInt();
        for (int t = 1; t <= T; t++) {
        	double C = in.nextDouble();
        	double F = in.nextDouble();
        	double X = in.nextDouble();
        	double G = 2.0;
        	
        	double cur = 0;
        	int i = 0;
        	while (true) {
        		double plan1 = X / (G + i * F);
        		double plan2 = C / (G + i * F) + X / (G + (i + 1) * F);
        		if (plan1 < plan2) {
        			cur += plan1;
        			break;
        		}
        		else {
        			cur += C / (G + i * F);
        			i++;
        		}
        	}
        	
        	bw.write("Case #" + t + ": " + cur);
        	bw.newLine();
        }
        
        in.close();
        bw.close();
    }
}
