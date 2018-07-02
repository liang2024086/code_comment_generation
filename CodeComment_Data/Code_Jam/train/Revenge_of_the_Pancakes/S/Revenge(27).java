package methodEmbedding.Revenge_of_the_Pancakes.S.LYD111;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Revenge {

	
	public static void main(String args[]){
		try{
			Scanner in = new Scanner(new FileReader("B-small-attempt0.in"));
			BufferedWriter output = new BufferedWriter(new FileWriter(new File("output.txt")));
			int cases = in.nextInt();
			in.nextLine();
			int q = 0;
			for (int i = 0; i < cases; i++){
				q++;
				char [] elements = in.nextLine().toCharArray();
				int deepestIndex = -1;
				output.write("Case #" + q+": ");
				for(int j = 0; j <elements.length; j++){
					if (elements[j] == '-')
						deepestIndex = j;
				}
				if (deepestIndex == -1)
					output.write("0");
				else{
					int groups = 1;
					int j = 0;
					while (j < deepestIndex){
						if (elements[j] != elements[j+1])
							groups++;
						j++;
					}
					output.write(""+groups);
				}
				output.write("\n");
				
				
				
			}
			in.close();
			output.flush();
			output.close();
			
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}
