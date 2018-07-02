package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1214;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q2 {

	public Q2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int caseCount = s.nextInt();
		int caseNum;
		for (caseNum = 1; caseNum <= caseCount; caseNum++) {
			double C, F, X;
			C = s.nextDouble();
			F = s.nextDouble();
			X = s.nextDouble();
			double sum = 0;
			double v = 2;
			double t = 0;
			boolean flag = false;
			while (sum < X) {
				if (sum < C) {
					double dis = C - sum;
					double disT = dis / v;
					t += disT;
					sum = C;
				}else{
					
				}
				double fDis = X - sum;
				double cost1 = fDis / v;
				double cost2 = (fDis + C) / (v + F);
				if (cost1 > cost2) {
					sum = sum - C;
					v = v + F;
				} else {
					double re = t + cost1;
					DecimalFormat r=new DecimalFormat();  
					r.applyPattern("#0.0000000");
					System.out.println("Case #" + caseNum + ": " + r.format(re));
					flag = true;
					break;
				}
			}
			if(!flag){
				DecimalFormat r=new DecimalFormat();  
				r.applyPattern("#0.0000000");
				System.out.println("Case #" + caseNum + ": " + r.format(t));
			}
		}
		s.close();
	}

}
