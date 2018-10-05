package methodEmbedding.Speaking_in_Tongues.S.LYD1483;


import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		String pack = Main.class.getPackage().getName();
		Input input = new Input(new File("src/" + pack + "/in"));
		input.parse();

		BufferedWriter output = new BufferedWriter(new FileWriter("src/" + pack + "/out"));
		try {
			Solver solver = new Solver();
			for (Case c : input.cases) {
//				if (c.num != 2) continue;
				String sol = solver.solve(c);
				String line = "Case #" + c.num + ": " + sol + "\n";
				output.write(line);
				System.out.print(line);
			}
		} finally {
			output.close();
		}
	}
}
