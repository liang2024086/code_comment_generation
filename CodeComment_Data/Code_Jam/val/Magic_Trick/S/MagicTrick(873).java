package methodEmbedding.Magic_Trick.S.LYD1342;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MagicTrick {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = Integer.valueOf(in.nextLine());

		for (int cazz = 1; cazz <= T; cazz++) {
			int frstAns = Integer.valueOf(in.nextLine());
			List<String> strs1 = new ArrayList<>();

			String fstLine1 = in.nextLine();
			String sndLine1 = in.nextLine();
			String trdLine1 = in.nextLine();
			String frtLine1 = in.nextLine();
			strs1.add(fstLine1);
			strs1.add(sndLine1);
			strs1.add(trdLine1);
			strs1.add(frtLine1);

			String crt1 = strs1.get(frstAns - 1);

			List<String> strs2 = new ArrayList<>();
			int sndAns = Integer.valueOf(in.nextLine());
			String fstLine2 = in.nextLine();
			String sndLine2 = in.nextLine();
			String trdLine2 = in.nextLine();
			String frtLine2 = in.nextLine();

			strs2.add(fstLine2);
			strs2.add(sndLine2);
			strs2.add(trdLine2);
			strs2.add(frtLine2);

			String crt2 = strs2.get(sndAns - 1);

			String[] frstList = crt1.split(" ");

			String[] sndList = crt2.split(" ");

			int sizeCommun = 0;
			int correctAns = 0;

			for (String str1 : frstList) {
				for (String str2 : sndList) {
					if (str1.equals(str2)) {
						correctAns = Integer.valueOf(str1);
						sizeCommun++;
					}
				}
			}
			if (sizeCommun == 0) {
				System.out.println("Case #" + cazz + ": Volunteer cheated!");
			} else if (sizeCommun == 1) {
				System.out.println("Case #" + cazz + ": " + correctAns);
			} else {
				System.out.println("Case #" + cazz + ": Bad magician!");
			}

		}
		// //////////////////
		// //////////////////
	}
}
