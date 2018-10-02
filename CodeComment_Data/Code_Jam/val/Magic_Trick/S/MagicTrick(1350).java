package methodEmbedding.Magic_Trick.S.LYD1165;

import java.io.*;

public class MagicTrick {

	public static void main(String[] args) throws Exception {
		if (args.length != 1) {
			System.out.println("Wrong Usage.");
			return;
		}

		FileInputStream in = new FileInputStream(args[0]);
		String outStr = args[0].substring(0, args[0].lastIndexOf('.')) + ".out";
		FileOutputStream out = new FileOutputStream(outStr);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));

		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i < T+1; i++) {
			int ans1 = Integer.parseInt(br.readLine());
			String grid1[][] = new String[4][];
			for (int j = 0; j < 4; j++)
				grid1[j] = br.readLine().split(" ");
			
			String possibles1[] = grid1[ans1-1];
			
			int ans2 = Integer.parseInt(br.readLine());
			String grid2[][] = new String[4][];
			for (int j = 0; j < 4; j++)
				grid2[j] = br.readLine().split(" ");
			
			String possibles2[] = grid2[ans2-1];
			String answer = "";
			boolean mult = false;
			for (int j = 0; j < possibles1.length; j++)
				for (int k = 0; k < possibles2.length; k++)
					if (possibles1[j].equals(possibles2[k])) {
						if (answer.isEmpty())
							answer = possibles1[j];
						else
							mult = true;
				}
			bw.write("Case #"+i+": ");
			if (mult)
				bw.write("Bad magician!\n");
			else if (answer.isEmpty())
				bw.write("Volunteer cheated!\n");
			else
				bw.write(answer+"\n");
			
			
		}
		bw.close();
		br.close();
	}

}
