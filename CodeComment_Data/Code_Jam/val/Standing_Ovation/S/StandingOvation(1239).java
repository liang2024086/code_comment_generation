package methodEmbedding.Standing_Ovation.S.LYD1977;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;


public class StandingOvation {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new FileInputStream(args[0]));
		Integer.parseInt(scanner.nextLine());
		int j = 0;
		while(scanner.hasNext()){
			j++;
			String line = scanner.nextLine();
			StringTokenizer tmp = new StringTokenizer(line);
			tmp.nextToken();
			String sShyness = tmp.nextToken();
			long people = 0;
			long friends = 0;
			for (int i = 0; i < sShyness.length(); i++) {
				int audience = Character.getNumericValue(sShyness.charAt(i));
				if(people+friends<i){
					friends+=i-(people+friends);
				}
				people+=audience;
			}
			System.out.println("Case #"+j+": "+friends);
		}
		scanner.close();
	}
}
