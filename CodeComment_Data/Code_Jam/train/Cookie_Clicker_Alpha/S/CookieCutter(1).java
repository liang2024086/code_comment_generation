package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1222;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CookieCutter {
	private static final String NAME = "B-small-attempt0";
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(new File(NAME + ".in")));
		PrintWriter out = new PrintWriter(new File(NAME + ".out"));
		int numCases = Integer.parseInt(br.readLine());
		for(int CASE = 1; CASE <= numCases; CASE++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			double rate = 2;
			double cost = Double.parseDouble(st.nextToken());
			double extra = Double.parseDouble(st.nextToken());
			double goal = Double.parseDouble(st.nextToken());
			
			double time = 0;
			double timeToFarm = cost / rate;
			double timeToGoal = goal / rate;
			while(timeToGoal > timeToFarm + goal / (rate + extra)) {
				rate += extra;
				time += timeToFarm;
				timeToFarm = cost / rate;
				timeToGoal = goal / rate;
			}
			time += timeToGoal;
			out.println("Case #" + CASE + ": " + time);
		}
		out.close();
		System.exit(0);
	}
}
