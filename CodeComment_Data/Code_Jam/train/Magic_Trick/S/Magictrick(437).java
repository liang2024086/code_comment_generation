package methodEmbedding.Magic_Trick.S.LYD580;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Magictrick {
	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			int[] a1 = new int[4];
			int[] a2 = new int[4];
			int row = sc.nextInt();
			sc.nextLine();
			for(int j=0; j<4; j++) {
				String line1 = sc.nextLine(); // Read 1st line
				if(j==row-1) {
					String[] numbers1 = line1.split(" "); // Split based on space
					for(int k=0;k<numbers1.length;k++){
					    a1[k] = Integer.parseInt(numbers1[k]);
					}
				}
			}
			
			int row2 = sc.nextInt();
			sc.nextLine();

			for(int j=0; j<4; j++) {
				String line1 = sc.nextLine(); // Read 1st line
				if(j==row2-1) {
					String[] numbers1 = line1.split(" "); // Split based on space
					for(int k=0;k<numbers1.length;k++){
					    a2[k] = Integer.parseInt(numbers1[k]);
					}
				}
			}
			
			List<Integer> dups = new ArrayList<Integer>();
			
			for(int j = 0; j < a1.length; j++)
			{
			    for(int k = 0; k < a2.length; k++)
			    {
			        if(a1[j] == a2[k])
			        {
			            dups.add(a1[j]);
			        }
			    }
			}
			if(dups.size() == 1)
				System.out.println("Case #" + i + ": " + dups.get(0));
			else if(dups.size() > 1)
				System.out.println("Case #" + i + ": Bad magician!");
			else if(dups.isEmpty())
				System.out.println("Case #" + i + ": Volunteer cheated!");
		}
	}
}
