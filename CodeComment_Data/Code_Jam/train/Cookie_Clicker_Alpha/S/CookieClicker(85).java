package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1366;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CookieClicker {

	public static void main(String[] args) {
		try{
		String fileName = "C:\\Users\\Beez\\CodeJam2014\\B-small-attempt0.in";
		String outName = "C:\\Users\\Beez\\CodeJam2014\\B-Small-out.txt";
		BufferedReader in = new BufferedReader(new FileReader(fileName));
		int t = Integer.parseInt(in.readLine());
		String answer[] = new String[t];
		for(int i = 0; i < t; i++){
			String line = in.readLine();
			double c = Double.parseDouble(line.split(" ")[0]);
			double f = Double.parseDouble(line.split(" ")[1]);
			double x = Double.parseDouble(line.split(" ")[2]);
			double time = 0;
			double cookiePerSecond = 2;
			while((x - c) / cookiePerSecond > x / (cookiePerSecond + f)){
				time += c / cookiePerSecond;
				cookiePerSecond += f;
			}
			time += x / cookiePerSecond;
			answer[i] = "Case #" + (i + 1) + ": " + time;
		}
		in.close();
		PrintWriter out = new PrintWriter(new FileWriter(outName));
		for(int i = 0; i < t; i++){
			out.println(answer[i]);
		}
		out.close();
		}catch(Exception e){
			System.out.println("Error running program");
			e.printStackTrace();
		}

	}

}
