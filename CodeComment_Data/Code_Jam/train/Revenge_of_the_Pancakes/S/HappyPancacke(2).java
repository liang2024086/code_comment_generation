package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1131;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HappyPancacke {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(new File("src/Input.txt"));
		int T = Integer.parseInt(scan.nextLine());
		for (int i = 1; i <= T; i++) {
			String in = scan.nextLine();
			if (in.indexOf('-') == -1)
				System.out.println("Case #"+i+": 0");
			else if (in.indexOf('+') == -1)
				System.out.println("Case #"+i+": 1");
			else {
				long ans = 0;
				while (true) {
					//System.out.println(in);
					int plus = in.indexOf('+');
					int min = in.lastIndexOf('-');
					if (plus == -1) {
						ans++;
						//System.out.println("1");
						break;
					}
						
					if (min == -1) {
						//System.out.println("2");
						break;
					}
					
					if (min < plus) {
						ans++;
						//System.out.println("3");
						break;
					} else {
						if (in.indexOf('-') < plus) {
						    //System.out.println("4");
						    in = in.substring(plus+1);
						    in = in.substring(in.indexOf('-'));
						    ans += 2;
						} else {
							//System.out.println("5");
							in = in.substring(plus+1);
							in = in.substring(in.indexOf('-'));
						    ans ++;
						}
					}
				}
				System.out.println("Case #"+i+": "+ans);
			}
		}
	}
}
