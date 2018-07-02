package methodEmbedding.Counting_Sheep.S.LYD1643;

import java.util.Scanner;

public class Sheep {
	public static void main(String args[]) {
		byte T;
		Scanner in = new Scanner(System.in);
		T = in.nextByte();
		short[] N = new short[T];

		for(byte i = 0; i < T; i++) {
			N[i] = in.nextShort();
		}

		short ivar = 0;
		short temp = 0;
		short count = 1;
		short answer = 0;

		ijk:
		for(byte i = 0; i < T; i++) {

			if( N[i] == 0) {
				System.out.println("Case #"+(i+1)+": INSOMNIA");
				continue ijk;
			}
			count = 1;
			boolean[] flag = {false, false, false, false, false, false, false, false, false, false};

			abc:
			while(true) {
				temp = (short)(N[i] * count);
				answer = temp;
				pqr:
				while(true) {
					ivar = (short)(temp % 10);
					temp = (short)(temp / 10);

					switch (ivar) {
						case 0: flag[0] = true;
							break;
						case 1: flag[1] = true;
							break;
						case 2: flag[2] = true;
							break;
						case 3: flag[3] = true;
							break;
						case 4: flag[4] = true;
							break;
						case 5: flag[5] = true;
							break;
						case 6: flag[6] = true;
							break;
						case 7: flag[7] = true;
							break;
						case 8: flag[8] = true;
							break;
						case 9: flag[9] = true;
							break;
					}

					if(flag[0] && flag[1] && flag[2] && flag[3] && flag[4] && flag[5] && flag[6] && flag[7] && flag[8] && flag[9]) {
						System.out.println("Case #"+(i+1)+": "+answer);
						break abc;
					}

					if(temp == 0)
						break pqr;
				}
				count++;
			}
		}	
	}
}
