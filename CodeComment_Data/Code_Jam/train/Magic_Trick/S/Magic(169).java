package methodEmbedding.Magic_Trick.S.LYD894;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Magic {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numInputs = in.nextInt();

		List<Integer[]> list16 = new ArrayList<Integer[]>();
		List<Integer> listInputs = new ArrayList<Integer>();

		for (int i = 0; i < numInputs * 2; i++) {
			listInputs.add(in.nextInt());
			Integer[] numArray = new Integer[16];
			for (int j = 0; j < 16; j++) {
				numArray[j] = in.nextInt();
			}
			list16.add(numArray);
		}

		int selectRowOne;
		int selectRowTwo;
		int count = 0;
		int value = 0;
		int Case = 0;
		Integer[] array16 = new Integer[16];
		Integer[] array4One = new Integer[4];
		Integer[] array4Two = new Integer[4];
		for (int i = 0; i < numInputs * 2; i = i + 2) {
			count = 0;
			selectRowOne = listInputs.get(i);
			array16 = list16.get(i);
			for (int j = 0; j < 4; j++) {
				array4One[j] = array16[selectRowOne * 4 - 1 - j];
			}
			selectRowTwo = listInputs.get(i + 1);
			array16 = list16.get(i + 1);
			for (int j = 0; j < 4; j++) {
				array4Two[j] = array16[selectRowTwo * 4 - 1 - j];
			}
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					if (array4One[j] == array4Two[k]) {
						count++;
						value = array4One[j];
					}
				}
			}
				Case = i / 2 -1 + 2;
			if (count == 1) {
				System.out.println("Case #"+Case+": " + value);
			} else if (count == 0) {
				System.out.println("Case #"+Case+": " + "Volunteer cheated!");
			} else if (count > 1) {
				System.out.println("Case #"+Case+": " + "Bad magician!");
			}
		}
	}
}
