package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1192;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) throws IOException {
		File fin = new File("B-small-attempt0.in");
		Scanner in = new Scanner(fin);
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"B-small.out")));

		int T = in.nextInt();

		for (int i = 0; i < T; i++) {
			// optimal to buy farm as soon as possible.
			// otherwise you just waste time.
			
			MathContext mc = new MathContext(50, RoundingMode.HALF_UP);

			// passive cookie gain
//			double cps = 2.0;
			BigDecimal cps = new BigDecimal(2.0, mc);
			// cookies for a farm
//			double cpf = in.nextDouble();
			BigDecimal cpf = new BigDecimal(in.nextDouble(), mc);
			// farmed cookies per second
//			double fcps = in.nextDouble();
			BigDecimal fcps = new BigDecimal(in.nextDouble(), mc);
			// target
//			double x = in.nextDouble();
			BigDecimal x = new BigDecimal(in.nextDouble(), mc);

			boolean fSolved = false;
//			double flCurTime = 0;
//			double flFinish = x / cps;
			BigDecimal flCurTime = new BigDecimal(0, mc);
			BigDecimal flFinish = x.divide(cps, mc);

			for (int farms = 0; !fSolved; farms++) {
//				double flTimeToNextFarm = cpf / cps;
//				double flTimeToFinish = x / cps;
//				cps = cps + fcps;
//				double flTimeToFinishWithMoreFarm = flTimeToNextFarm + (x / cps);
				BigDecimal flTimeToNextFarm = cpf.divide(cps, mc);
				BigDecimal flTimeToFinish = x.divide(cps, mc);
				cps = cps.add(fcps, mc);
				BigDecimal flTimeToNextFarmWithMoreFarm = flTimeToNextFarm
						.add(x.divide(cps, mc), mc);
				
//				if (flTimeToFinish < flTimeToFinishWithMoreFarm){
//					fSolved = true;
//					flFinish = flCurTime + flTimeToFinish;
//				}
				if (flTimeToFinish.compareTo(flTimeToNextFarmWithMoreFarm) < 0) {
					fSolved = true;
					flFinish = flCurTime.add(flTimeToFinish, mc);
				}
				
//				flCurTime = flCurTime + flTimeToNextFarm;
				flCurTime = flCurTime.add(flTimeToNextFarm, mc);
			}
			
//			out.printf("Case #%d: %.7f%n", i+1, flFinish);
			out.printf("Case #%d: %.7f%n", i+1, flFinish.doubleValue());
		}

		in.close();
		out.close();
	}

}
