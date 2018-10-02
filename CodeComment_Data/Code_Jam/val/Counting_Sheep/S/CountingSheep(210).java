package methodEmbedding.Counting_Sheep.S.LYD221;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountingSheep {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File ("C:/Nandan/GoogleCodeJam/2016_Qualification/resources/CountingSheep/A-small.in"));
			int T = sc.nextInt();
			
			for (int t = 1; t <= T; t++) {
				long N = sc.nextInt();
				Set<String> numbers = new HashSet<String>(Arrays.asList("0123456789".split("(?!^)")));// {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
				
				String s = "INSOMNIA";
				
				for(int i=1; N>0 && numbers.size()>0;  i++){
					long temp = i * N;
					
					s = temp+"";
					numbers.removeAll(new HashSet<String>(Arrays.asList(s.split("(?!^)"))));
					
				}
				
				
				System.out.println("Case #"+t+": "+s);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
