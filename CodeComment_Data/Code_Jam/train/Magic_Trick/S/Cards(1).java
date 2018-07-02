package methodEmbedding.Magic_Trick.S.LYD966;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Cards {
	
	
	public static void main(String[] args) {
		PrintWriter pw;
		Scanner reader;
		try {
			reader = new Scanner(new File("A-small-attempt1.in"));
			pw = new PrintWriter(new File("output.txt"));
			
			int a[] = new int[4];
			int n  = reader.nextInt();
			System.out.println(n);
			reader.nextLine(); 
			for (int i = 0; i < n; i++){
				int row1 = reader.nextInt();
				System.out.println(row1);
				reader.nextLine();
				for (int j = 0; j < 4; j++){
					if ((j + 1) == row1)
						for (int k = 0; k < 4; k++){
							a[k] = reader.nextInt();
							System.out.print(a[k] + " ");
						}
					System.out.println(reader.nextLine());
				}
			int row2 = reader.nextInt();
			System.out.println(row2);
			reader.nextLine();
			
			int count = 0;
			int value = 0;
			for (int j = 0; j < 4; j++){
				if ((j + 1) == row2)
					for (int k = 0; k < 4; k++){
						int read = reader.nextInt();
						for (int p = 0; p < 4; p++)
						if (a[p] == read) {
							count++;
							value = read;
						}
					}
				if (j !=3 || i != n-1)
					System.out.println(reader.nextLine());
			}
				if (count > 1) pw.println("Case #" + (i + 1)+ ": Bad magician!");
				if (count == 1) pw.println("Case #" + (i + 1) + ": " + value);
				if (count < 1) pw.println("Case #" +(i + 1) + ": Volunteer cheated!");
			
			}
				pw.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
