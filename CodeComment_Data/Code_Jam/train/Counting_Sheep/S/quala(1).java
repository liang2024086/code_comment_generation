package methodEmbedding.Counting_Sheep.S.LYD75;

import java.util.Scanner;


public class quala {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int i=0; i<t; i++) {
			int n = s.nextInt();
			if(n==0) {
				System.out.println("Case #" + (i+1) + ": INSOMNIA");
				continue;
			}
			String str = "0000000000";
			String num = "";
			for(int j=1; !(str.equals("1111111111")); j++) {
				num = String.valueOf(j*n);
				for(int k=0; k<num.length(); k++) {
					int index = Integer.parseInt(num.substring(k, k+1));
					str = str.substring(0, index) + '1' + str.substring(index+1);
				}
			}
			System.out.println("Case #"+(i+1)+": "+num);
		}
	}

}
