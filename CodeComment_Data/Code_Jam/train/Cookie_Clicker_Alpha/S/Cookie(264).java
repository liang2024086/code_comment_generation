package methodEmbedding.Cookie_Clicker_Alpha.S.LYD28;



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Cookie {
	public static void main(String[] args) throws FileNotFoundException {
		try {
			Scanner sc = new Scanner(new File("B-small-attempt0.in"));
			sc.useLocale(Locale.US);
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File("output")));
			Integer t = sc.nextInt();
			for (int i = 0; i < t; i++) {
				bw.write("Case #"+(i+1)+": ");
					
				double c = sc.nextDouble();
				double f = sc.nextDouble();
				double x = sc.nextDouble();
				double acumulatedTime = 0;
				double time = 0;
				double otherTime = 0;
				double speed = 2;
				do {
					time = x/speed;
					otherTime = c/speed;
					speed += f;
					otherTime += x/speed;
					
					if (otherTime < time) {
						acumulatedTime += c/(speed-f);
					} else {
						acumulatedTime += time;
					}
				} while (otherTime < time);
				bw.write(acumulatedTime + "\r\n");
			}
			
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
