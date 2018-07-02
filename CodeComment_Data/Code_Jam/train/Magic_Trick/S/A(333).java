package methodEmbedding.Magic_Trick.S.LYD99;



import java.util.*;

public class A {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int t = input.nextInt();
		int[] cards = new int[16];
		int[] number = new int[4];
		int[] secondNumber = new int[4];
		int num = 0;
		int x = 0;
		boolean b = true;
		int j = 0;
		for (int count = 0; count < t; count++) {
			int firstAnswer = input.nextInt();
			input.nextLine();
			for (int i = 0; i < 16; i++) {
				cards[i] = input.nextInt();
			}
			for (int i = (firstAnswer * 4) - 1; i > (firstAnswer * 4) - 5; i--) {
				number[j] = cards[i];
				j++;
			}
			j = 0;
			int secondAnswer = input.nextInt();
			for (int i = 0; i < 16; i++) {
				cards[i] = input.nextInt();
			}
			for (int i = (secondAnswer * 4) - 1; i > (secondAnswer * 4) - 5; i--) {
				secondNumber[j] = cards[i];
				j++;
			}

			for (int i = 0; i < 4; i++) {
				for (int z = 0; z < 4; z++) {
					
						if (number[i] == secondNumber[z]) {
							x = number[i];
							num++;
					}
				}
				
			}
			if (num >1){
				System.out.println("Case #"+(count+1)+": "+"Bad Magician!");
			}else if (num == 0){
				System.out.println("Case #"+(count+1)+": "+"Volunteer cheated!");
			}else if (num == 1){
				System.out.println("Case #"+(count+1)+": "+x);
			}
			num = 0;
			j = 0;
			b = true;

		}
		
		
	}

}

