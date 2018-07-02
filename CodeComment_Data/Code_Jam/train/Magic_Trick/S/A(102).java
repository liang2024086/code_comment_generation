package methodEmbedding.Magic_Trick.S.LYD2008;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A {

	public static void main(String[] args) throws FileNotFoundException {
		
		if (args.length > 0) {
			System.setIn(new FileInputStream(args[0] + ".in"));
		}
		
		Scanner s = new Scanner(System.in);
		
		int cases = s.nextInt();
		
		for (int i = 0; i<cases; i++){
			String[] numarr1 = new String[4];
			String[] numarr2 = new String[4];
			
			int row = s.nextInt();
			s.nextLine();
			String[] arr1 = new String[4];
			
			arr1[0] = s.nextLine().trim();
			arr1[1] = s.nextLine().trim();
			arr1[2] = s.nextLine().trim();
			arr1[3] = s.nextLine().trim();
			
			numarr1 = arr1[row-1].split(" ");
			
			int row2 = s.nextInt();
			s.nextLine();
			String[] arr2 = new String[4];
			
			arr2[0] = s.nextLine().trim();
			arr2[1] = s.nextLine().trim();
			arr2[2] = s.nextLine().trim();
			arr2[3] = s.nextLine().trim();
			
			numarr2 = arr2[row2-1].split(" ");
			
			int cunt = 0;
			int card = 0;
			
			for (int j = 0; j<4; j++){
				for (int k = 0; k<4; k++){
					if (Integer.parseInt(numarr1[j]) == Integer.parseInt(numarr2[k])){
						cunt++;
						card = Integer.parseInt(numarr1[j]);
					}
				}
			}
			
			if (cunt == 0){
				System.out.println("Case #" + (i+1) + ": Volunteer cheated!");
			} else if (cunt == 1){
				System.out.println("Case #" + (i+1) + ": " + card);
			} else {
				System.out.println("Case #" + (i+1) + ": Bad magician!");
			}
		}
	}

}
