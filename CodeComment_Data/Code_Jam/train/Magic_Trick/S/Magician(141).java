package methodEmbedding.Magic_Trick.S.LYD2207;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Magician {


	public static void main(String[] args) {

		try{

			String input_file = "/home/ramk/int/codejam/A-small-attempt0.in";
			Scanner sc = new Scanner(new File(input_file));
			int num_test_cases = Integer.parseInt(sc.nextLine());
			//System.out.println(num_test_cases);
			// process block by block of inputs
			int i;
			for(int j = 0; j < num_test_cases; j++){
				int row_id1 = Integer.parseInt(sc.nextLine());
				//System.out.println("row id is: "+row_id1);
				for(i=1; i < row_id1;i++)
					sc.nextLine();

				String[] row_array1 = sc.nextLine().split("\\s+");
				Set<Integer> row1 = new HashSet<Integer>();
				for(String s: row_array1){
					row1.add(Integer.parseInt(s));
					//System.out.println(s);
				}

				for(i=row_id1; i < 4;i++)
					sc.nextLine();

				int row_id2 = Integer.parseInt(sc.nextLine());
				for(i=1; i < row_id2;i++)
					sc.nextLine();

				String[] row_array2 = sc.nextLine().split("\\s+");
				//Set<Integer> row2 = new HashSet<Integer>();
				int num_intersection = 0;
				int val = -1;
				for(String s: row_array2){
					int read_number = Integer.parseInt(s);
					if(row1.contains(read_number)){
						val = read_number;
						num_intersection++;
					}
						
				}
				String out_str = "null case";
				if(num_intersection == 1){
					out_str = String.valueOf(val);
				}
				else if(num_intersection == 0){
					out_str = "Volunteer cheated!";
				}
				else{
					out_str = "Bad magician!";
				}
				System.out.println("Case #"+(j+1)+": "+out_str);
				/*Case #1: 7
				Case #2: Bad magician!
				Case #3: Volunteer cheated!*/

				for(i=row_id2; i < 4;i++)
					sc.nextLine();

			}





			sc.close();
		}
		catch (FileNotFoundException  e){
			System.out.println("file not found");
		}
	}

}

/* sample input:
3
2
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
3
1 2 5 4
3 11 6 15
9 10 7 12
13 14 8 16
2
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
2
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
2
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
3
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16*/
