package methodEmbedding.Counting_Sheep.S.LYD150;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class CountingSheep {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(new File("C:/Users/jayaram.theegala/workspace3/GoogleCodeJam/src/CountingSheep/A-small-attempt3.in"))){
			String str = sc.nextLine();
			int noOfCases = Integer.parseInt(str);
			int current, count, rem=1, out=1;
			HashSet<Integer> set = new HashSet<>();
			for(int i = 0; i<noOfCases; i++){
				str = sc.nextLine();
				set = new HashSet<>();
				current = Integer.parseInt(str);
				if(current == 0){
					System.out.println("Case #"+(i+1)+": INSOMNIA");
				}
				else{	
					count = 1;
					out = current;
					while(set.size() <10){
						rem = current*count;
						out = rem;
						while(rem != 0){
							set.add(rem%10);
							rem /= 10;
						}
						count++;
					}
					System.out.println("Case #"+(i+1)+": "+out);
				}
			}
		}
		catch(FileNotFoundException e){
			System.out.println("File Not Found");
		}
	}

}
