package methodEmbedding.Cookie_Clicker_Alpha.S.LYD367;



import java.util.*;

public class ProblemB {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		double c;
		double f;
		double x;

		double time = 999999999;
		double prevTime = 0;
		double currentRate = 2;
		boolean b = true;
		int nFarms = 0;
		ArrayList<Double> times = new ArrayList<Double>();

		for (int count = 0; count < t; count++) {

			c = input.nextDouble();
			f = input.nextDouble();
			x = input.nextDouble();

			while (b == true) {
				for (int i = 0; i < nFarms; i++) {
					prevTime += c / currentRate;
					currentRate += f;
				}
				prevTime += x / currentRate;
				if (prevTime > time) {
					b = false;
				} else {
					time = prevTime;
					nFarms++;
					prevTime = 0;
					currentRate = 2;
				}

			}
			times.add(time);
			time = 999999999;
			prevTime = 0;
			nFarms = 0;
			currentRate = 2;
			b = true;
		}
		
		for (int count = 0; count < times.size(); count++){
			System.out.println("Case #"+(count+1)+": "+times.get(count));
		}

	}

}
