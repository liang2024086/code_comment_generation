package methodEmbedding.Cookie_Clicker_Alpha.S.LYD734;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class Solution2 {
	public static void main(String args[]) throws IOException {
		File file = new File("B-small-attempt0.in");
		FileOutputStream fOut = new FileOutputStream(new File("output"));
		Scanner sc = new Scanner(file);
		int T = sc.nextInt();
		for (int i = 1; i <= T; i++) {
			double C = sc.nextDouble();
			double F = sc.nextDouble();
			double X = sc.nextDouble();
			double GT = 0;
			double NF = 2;
			while(true){
				double Time = C/NF;
				double tempGT = X/NF;
				if(tempGT > (Time + X / (NF+F)) ){
					GT = GT + Time;
					//System.out.println(Time + "   :   "+GT);
					NF = NF + F;
				}else{
					GT = GT + tempGT;
					//System.out.println("Answer "+GT);
					break;
				}
			}
			String result = "Case #" + i + ": " +""+GT+"\n";
			fOut.write(result.getBytes());
		}
		fOut.close();
	}
}
