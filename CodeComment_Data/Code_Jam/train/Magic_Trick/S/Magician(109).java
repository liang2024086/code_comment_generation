package methodEmbedding.Magic_Trick.S.LYD2199;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Magician {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(new File("A-small-attempt0.in"));
			
			int count = Integer.parseInt(sc.nextLine());
			
			PrintWriter pw = new PrintWriter(new File("output.txt"));
			
			int firstRow, rescnt, result = 0;
			int[] cards = new int[4], cards2 = new int[4];
			
						
			for(int i=0; i<count; i++){
				rescnt=0;
				System.out.println(i);
				firstRow = Integer.parseInt(sc.nextLine());
				System.out.println(firstRow);
				for (int j=1;j<firstRow;j++)
					System.out.println("NIB:"+sc.nextLine());
				int k=0;
				for(String s : sc.nextLine().split(" "))
					cards[k++]=Integer.parseInt(s);
				System.out.println("C:"+Arrays.toString(cards));

				for(int j=4;j>firstRow;j--)
					System.out.println("NIA:"+sc.nextLine());
				
				firstRow = Integer.parseInt(sc.nextLine());
				System.out.println(firstRow);

				for (int j=1;j<firstRow;j++)
					System.out.println("NIB:"+sc.nextLine());
				k=0;
				for(String s : sc.nextLine().split(" "))
					cards2[k++]=Integer.parseInt(s);
				//
				System.out.println("C2:"+Arrays.toString(cards2));
				
				for(int j=4;j>firstRow;j--)
					System.out.println("NIA:"+sc.nextLine());
				
				for(int m:cards)
					for(int n:cards2)
						if(m==n) {
							result=n;
							rescnt++;
						};
				
				pw.println("Case #"+(i+1)+": "+
				(rescnt==1?
						result
						:
						(rescnt==0?
								"Volunteer cheated!"
								:
								"Bad magician!"
						)
				)
				);
								
			}
			sc.close();
			pw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
	}

}
