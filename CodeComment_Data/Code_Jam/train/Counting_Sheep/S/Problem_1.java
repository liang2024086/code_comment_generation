package methodEmbedding.Counting_Sheep.S.LYD767;


import java.util.Scanner;

public class Problem_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		int numTestCases = Integer.parseInt(inputString);
		for(int i=0;i<numTestCases;++i){
			inputString = scanner.nextLine();
			int start = Integer.parseInt(inputString);
			int current = start;
			if (start == 0){
				System.out.println("Case #" + i + ": INSOMNIA");
				continue;
			}
			int multiplier = 2;
			int numbers = 0;
			int numbers_verify = 1023;
			while (numbers != numbers_verify){
				if (current <= 9){
					numbers = numbers | 1<<(current);
//					System.out.println(numbers);
				}
				else{
					if (current == 10){
						numbers = numbers | 1<<1;
//						System.out.println(numbers);
						numbers = numbers | 1;
//						System.out.println(numbers);
					}
					else{
						while (current > 10){
							numbers = numbers | 1<<(current%10);
//							System.out.println(numbers);
							current /= 10;
						}
						if (current == 10){
							numbers = numbers | 1<<1;
//							System.out.println(numbers);
							numbers = numbers | 1;
//							System.out.println(numbers);
						}
						else{
							numbers = numbers | 1<<(current);
//							System.out.println(numbers);
						}
					}
				}
				current = start*multiplier;
				++multiplier;
			}
			System.out.println("Case #" + (i+1) + ": " + (current-start));
		}
	}
}
