package methodEmbedding.Magic_Trick.S.LYD1043;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class New2 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(new File("ip2.txt"));
		FileWriter f = new FileWriter("op.txt");
		for (int i = 0; i < 100; i++) {
			int fres = scanner.nextInt();
			scanner.nextLine();
			List<List<String>> first = new ArrayList<>();
			for (int j = 0; j < 4; j++) {
				first.add(Arrays.asList(scanner.nextLine().split(" ")));
			}
			int sres = scanner.nextInt();
			scanner.nextLine();
			List<List<String>> sec = new ArrayList<>();
			for (int j = 0; j < 4; j++) {
				sec.add(Arrays.asList(scanner.nextLine().split(" ")));
			}
			
			Set<String> sa = new HashSet<>();
			sa.addAll(first.get(fres-1));
			Set<String> sb = new HashSet<>();
			sb.addAll(sec.get(sres-1));
			
			sa.retainAll(sb);
			int c = i+1;
			if (sa.size() == 0) {
				System.out.println("Case #"+c+": "+"Volunteer cheated!");
			} else if (sa.size() > 1) {     
				System.out.println("Case #"+c+": "+"Bad magician!");
			} else {                        
				System.out.println("Case #"+c+": "+sa.iterator().next());
			}
			
		}
	}
}
