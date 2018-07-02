package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1543;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int round = sc.nextInt();

		for (int roundi = 0; roundi < round; roundi++) {
			double C = sc.nextDouble();
			double F = sc.nextDouble();
			double X = sc.nextDouble();
			double perSecond = 2;
			double time = 0;
			double origin;
			double add1;
			do {
				origin = X / perSecond;
				add1 = C / perSecond + X / (perSecond + F);
				if (origin > add1) {
					time += C / perSecond;
					perSecond += F;
				}
			} while (origin > add1);
			time += origin;
			System.out.println("Case #"+(roundi+1)+": "+time);

		}

	}

}
