package methodEmbedding.Magic_Trick.S.LYD1475;


import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class MagicTrick {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new FileWriter(
				"C:\\Users\\Aniket\\Desktop\\output.txt"));
		int n = Integer.parseInt(br.readLine());
		for (int i = 1; i <= n; i++) {
			ArrayList<Integer> first = new ArrayList<Integer>(4);
			int rowNo = Integer.parseInt(br.readLine());
			for (int j = 0; j < 4; j++) {
				if (rowNo-- == 1) {
					String ip[] = br.readLine().split(" ");
					for (int k = 0; k < ip.length; k++) {
						first.add(Integer.parseInt(ip[k]));
					}
				} else {
					br.readLine();
				}
			}

			ArrayList<Integer> second = new ArrayList<Integer>(4);
			rowNo = Integer.parseInt(br.readLine());
			for (int j = 0; j < 4; j++) {
				if (rowNo-- == 1) {
					String ip[] = br.readLine().split(" ");
					for (int k = 0; k < ip.length; k++) {
						second.add(Integer.parseInt(ip[k]));
					}
				} else {
					br.readLine();
				}
			}
			ArrayList<Integer> result = new ArrayList<Integer>();
			for (int j = 0; j < first.size(); j++) {
				int temp1 = first.get(j);
				for (int k = 0; k < second.size(); k++) {
					int temp2 = second.get(k);
					if (temp1 == temp2) {
						result.add(temp1);
					}
				}
			}

			if (result.size() > 1) {
				System.out.println("Case #" + i + ": " + "Bad magician!");
				out.println("Case #" + i + ": " + "Bad magician!");
			} else if (result.size() == 1) {
				System.out.println("Case #" + i + ": " + result.get(0));
				out.println("Case #" + i + ": " + result.get(0));
			} else {
				System.out.println("Case #" + i + ": " + "Volunteer cheated!");
				out.println("Case #" + i + ": " + "Volunteer cheated!");
			}
		}
		
		out.close();
	}

}
