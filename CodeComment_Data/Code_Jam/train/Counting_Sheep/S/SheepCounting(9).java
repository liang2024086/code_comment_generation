package methodEmbedding.Counting_Sheep.S.LYD1481;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class SheepCounting {
	public static void main(String[] args) throws IOException {
		
	
		File f = new File("A-small-attempt0-ans.in");
		FileOutputStream fos = new FileOutputStream(f);
		Scanner sc = null;
		try {
			sc = new Scanner(new File("A-small-attempt0.in"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			TreeSet<Integer> set = new TreeSet<>();
			
			int number_init = sc.nextInt();
			int number = number_init;
			for (int j = 1; j < 200; j++) {
				number = number_init * j;
				String number_str = number + "";
				
				for (int k = 0; k < number_str.length(); k++) {
					set.add(number_str.charAt(k) - '0');
				}
				
				if( set.size() == 10){
					break;
				}
			}
			
			String ans = number + "";
			if( set.size() != 10 )
				ans = "INSOMNIA";
			String temp = "Case #" + (i+1) + ": "  + ans + "\n";
			System.out.print(temp);
			fos.write(temp.getBytes());
		}
		
		fos.flush();
		fos.close();
	}
}
