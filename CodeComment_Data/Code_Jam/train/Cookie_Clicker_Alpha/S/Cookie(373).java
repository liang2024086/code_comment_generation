package methodEmbedding.Cookie_Clicker_Alpha.S.LYD101;

import java.io.*;
import java.util.*;

class Cookie {


public static void main(String[] arg) {
try {

	BufferedReader reader = new BufferedReader(new FileReader("input"));
	PrintWriter writer = new PrintWriter("out");		

	int numTest = Integer.parseInt(reader.readLine());

	String out = "";
	for (int i = 1; i <= numTest; i++) {
		String[] line = reader.readLine().split(" ");
		
		double C = Double.parseDouble(line[0]);
		double F = Double.parseDouble(line[1]);
		double X = Double.parseDouble(line[2]);

		double c = 0;
		double speed = 2;
		double sec = 0;
		while (c < X) {
			double diff = 0;
			if ((X  / (speed + F) + C / speed + sec) < (X / speed + sec)) {
				diff = C;
				sec += diff / speed;
				speed += F;	
			} else {
				diff = X - c;
				c = X;
				sec += diff / speed;

			}
//			System.out.println("c: " + c + "; speed: " + speed + "; sec: " + sec);
		}
		out = "Case #" + i + ": " + sec;
//		System.out.println(out);
		writer.println(out);
		
	}

	reader.close();
	writer.flush();
	writer.close();
	

} catch(IOException e) {
	e.printStackTrace();
}
}
}
