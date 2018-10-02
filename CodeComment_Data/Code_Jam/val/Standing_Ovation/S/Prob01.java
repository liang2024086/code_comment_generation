package methodEmbedding.Standing_Ovation.S.LYD1850;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Prob01 {
	public static void main(String[]args) throws IOException{
		Scanner sc=  new Scanner(new File("A-small-attempt2.in"));
		BufferedWriter p = new BufferedWriter(new FileWriter(new File("Prob01output.txt")));
		int dataSets = Integer.parseInt(sc.nextLine());
		for (int dset = 1; dset<=dataSets; dset++){
			String[] arr = sc.nextLine().split(" ");
			int numOfSeats = Integer.parseInt(arr[0]);
			String seats = arr[1];
			int tot = 0;
			int add = 0;
			for (int shy = 0; shy<=numOfSeats; shy++){
				int ppl = Integer.parseInt(seats.charAt(shy)+"");
				if (ppl==0){
					continue;}
				else if (shy<=tot){
					tot+=ppl;
				}
				else{
					add+=(shy-tot);
					tot+= (add+ppl);
				}
			}
			p.write("Case #"+dset+": "+add);
			p.newLine();
			
		}p.close();
	}
}
