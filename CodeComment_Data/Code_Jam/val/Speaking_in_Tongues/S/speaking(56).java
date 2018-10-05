package methodEmbedding.Speaking_in_Tongues.S.LYD1568;

import java.util.Scanner;
import java.util.ArrayList;

public class speaking {
	public static void main(String [] args){
		Scanner Keyboard = new Scanner(System.in);
		int testCases;
		ArrayList input = new ArrayList();
		char [] googlerese = {'y','n','f','i','c','w','l','b','k','u','o','m','x','s','e','v','z','p','d','r','j','g','t','h','a','q'};
		char [] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

		testCases = Keyboard.nextInt();
		Keyboard.nextLine();
		for (int i = 0; i < testCases; i++){
			input.add(Keyboard.nextLine());
		}
		
	}
}
