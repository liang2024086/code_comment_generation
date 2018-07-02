package methodEmbedding.Cookie_Clicker_Alpha.S.LYD818;

import static java.lang.System.*;
import java.util.*;

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(in);

		int setnum = sc.nextInt();
		for(int seti=1; seti<=setnum; seti++) {
			double c = sc.nextDouble();
			double f = sc.nextDouble();
			double x = sc.nextDouble();

			double speed = 2.0;
			double ans = 0.0;
			while(true) {
				if(x / speed < (c / speed) + (x / (speed+f))) {
					ans += x / speed;
					break;
				}
				ans += c / speed;
				speed += f;
			}
			
			out.println("Case #" + seti + ": " + ans);
		}
	}

}
