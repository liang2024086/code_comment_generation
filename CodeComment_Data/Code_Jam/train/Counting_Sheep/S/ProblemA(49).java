package methodEmbedding.Counting_Sheep.S.LYD209;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProblemA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num;
		int[] numbers = new int[10];
		boolean done;
		File inputs = new File("src/resources/6254486/small.txt");
		Scanner ioScanner;
		try {
			ioScanner = new Scanner(inputs);
			int T = ioScanner.nextInt();
			for(int testNum = 0; testNum < T; testNum++){
				done = false;
				ioScanner.nextLine();
				int N = ioScanner.nextInt();
//				int N = 2;
//				System.out.println(N);
				for(int x = 0; x < 10; x++){
					numbers[x] = 0;
				}
				for(int i = 0; i < 300; i++){
					num = String.valueOf((1 + i) * N);
					for(String n : num.split("")){
						int y = Integer.parseInt(n);
						numbers[y] = 2;
					}
					for(int x = 0; x < 10; x++){
						if(numbers[x] != 2){
//							System.out.println(x + " n2");
							break;
						}
						if(x == 9){
							done = true;
						}
					}
					if(done){
						System.out.println("Case #" + (testNum + 1) + ": " + (1 + i) * N);
						break;
					}
				}
				if(!done){
					System.out.println("Case #" + (testNum + 1) + ": INSOMNIA");
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
