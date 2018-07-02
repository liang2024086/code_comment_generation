package methodEmbedding.Cookie_Clicker_Alpha.S.LYD767;

import java.io.*;
import java.util.concurrent.TimeUnit;


public class Cookie {
	static double CPS;
	
	public static void main(String[] args) throws Exception {
		double C = 0;
		double F = 0;
		double X = 0;
		double cookiebank = 0;
		File input = new File("input.in");
		BufferedReader Fin = new BufferedReader(new FileReader(input));
		File output = new File("output.txt");
		PrintWriter Fout = new PrintWriter(new FileWriter(output));
		
		int testcases = Integer.parseInt(Fin.readLine());
		int i = 1;
		
		while (i <= testcases) {
			String in = Fin.readLine();
			String[] parameters = in.split(" ");
			boolean done = false;
			C = Double.parseDouble(parameters[0]);
			F = Double.parseDouble(parameters[1]);
			X = Double.parseDouble(parameters[2]);
			System.out.println("C: " + C);
			System.out.println("F: " + F);
			System.out.println("X: " + X);
			double seconds = 0;
			double dt =  0.5;
			CPS = 2;
			double timestep = C / CPS;
			cookiebank = 0;
			
			if (timestep > (X/CPS)) {
				dt = 0.000001;
				while (done != true) {
					cookiebank = cookiebank + (CPS * dt);
					seconds += dt;
					
					if (cookiebank >= X) {
						done = true;
					}
				}
			} else {
			while (done != true) {
				cookiebank = cookiebank + (CPS * timestep);
				seconds += timestep;
				
				double timewithfarm = (X / (CPS + F));
				double timewithoutfarm = ((X-C) / CPS);
				if (timewithfarm < timewithoutfarm) {
					CPS = CPS + F;
					cookiebank = cookiebank - C;
					timestep = C / CPS;
//					timetofinish = newFinishTime;
				} else {
					dt = 1/CPS;
					while (cookiebank < X-1) {
						cookiebank = cookiebank + (CPS * dt);
						seconds = seconds + dt;
					}
					dt = 0.0000001;
					while (cookiebank < X) {
						cookiebank = cookiebank + (CPS * dt);
						seconds = seconds + dt;
					}
				}
			
				if (cookiebank >= X) {
					done = true;
				}
			}
			}
			
			System.out.println("Case #" + i + ": " + seconds);
			Fout.write("Case #" + i + ": " + seconds);
			Fout.write("\n");
			i++;
		}
		Fout.close();
	}
}
