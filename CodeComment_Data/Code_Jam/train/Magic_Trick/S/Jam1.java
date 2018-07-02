package methodEmbedding.Magic_Trick.S.LYD1129;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Jam1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inputs;
		inputs = Integer.parseInt(br.readLine());
		int card_code[] = new int[inputs];
		int common_val[] = new int[inputs];
		for (int i = 1; i <= inputs; i++) {
			String row1 = "", row2 = "";
			for (int j = 1; j <= 2; j++) {
				int row = Integer.parseInt(br.readLine());
				for (int k = 1; k <= 4; k++) {
					String input = br.readLine();
					if (row == k) {
						if (j == 1) {
							row1 = input;
						} else {
							row2 = input;
						}
					}
				}
			}
			String values[][] = new String[2][4];
			values[0] = row1.split(" ");
			values[1] = row2.split(" ");
			int val[][] = new int[2][4];
			for (int i1 = 0; i1 < 2; i1++) {
				for (int i2 = 0; i2 < 4; i2++) {
					val[i1][i2] = Integer.parseInt(values[i1][i2]);
				}
			}
			int common = 0;
			int code = -1;
			for (int l = 0; l < 4; l++) {
				for (int m = 0; m < 4; m++) {
					if (val[0][l] == val[1][m]) {
						if (code == -1) {
							common = val[0][l];
							code = 1;
						} else if (code == 1) {
							code = 2;
						}
					}
				}
			}
			if (code == -1)
				code = 3;
			card_code[i - 1] = code;
			common_val[i - 1] = common;
		}
		for (int i = 0; i < inputs; i++) {
			System.out.print("Case #" + (i + 1) + ": ");
			switch (card_code[i]) {
			case 1:
				System.out.println(common_val[i]);
				break;
			case 2:
				System.out.println("Bad magician!");
				break;
			case 3:
				System.out.println("Volunteer cheated!");
				break;
			}
		}
	}
}
