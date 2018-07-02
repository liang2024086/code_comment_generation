package methodEmbedding.Counting_Sheep.S.LYD560;


import java.util.Scanner;

public class q1 {
	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		int k = p.nextInt();
		int pp = 0;
		for (int i = 1; i <= k; i++) {
			int N = p.nextInt();
			int cat = 1;
			int kk = N;
			int counter = 0;
			//String kk = Integer.toString(N);
			//System.out.println(kk.contains("1"));
			boolean[] aa = {false, false, false, false, false, false, false, false, false, false };
			//System.out.println(aa[0]);
			while (counter < 10 && N > 0) {
				//System.out.println(counter);
				
				String NN = Integer.toString(N);
				//System.out.println(NN.contains("1"));
				//char[] nn = NN.toCharArray();
				for (int j = 0; j < 10; j++) {
					String po = Integer.toString(j);
					if (NN.contains(po) && !aa[j]) {
						aa[j] = true;
						counter++;
						
					}
					
				}
				pp = N;
				N = (++cat) * kk;
			}
			if (N == 0) {
				System.out.println("Case #" + i + ": INSOMNIA");
			} else {
				System.out.println("Case #" + i + ": " + pp );

			}
		}
	}
}
