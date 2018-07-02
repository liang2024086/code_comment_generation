package methodEmbedding.Cookie_Clicker_Alpha.S.LYD214;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Cookies {
	public static void main(String[] args) throws IOException {

		try{
			String input_file = "/home/ramk/int/codejam/2.Cookies/B-small-attempt0.in";
			Scanner sc = new Scanner(new File(input_file));
			sc.nextLine();
			int count = 0;

			// write to file
			FileWriter fw = new FileWriter(input_file+".out", true);
			BufferedWriter bw = new BufferedWriter(fw);

			while(sc.hasNextLine()){
				String[] lineSplit = sc.nextLine().split("\\s+");
				double C = Double.parseDouble(lineSplit[0]);
				double F = Double.parseDouble(lineSplit[1]);
				double X = Double.parseDouble(lineSplit[2]);
				//System.out.println(C+","+F+","+X);

				double step = 2;
				double time = 0;
				if(X<C) {
					time = X/step;
					count++;
					System.out.printf("Case #%d: %3.7f\n",count,time);
					bw.write(String.format("Case #%d: %3.7f\n",count,time));
					continue;
				}

				while((X/step) > (C/step) + (X/(step+F))){
					time += C/step;
					step += F;
					//System.out.println(time);
				}

				time += X/step;

				count++;
				System.out.printf("Case #%d: %3.7f\n",count,time);
				bw.write(String.format("Case #%d: %3.7f\n",count,time));

			}
			sc.close();
			bw.close();
			//			System.out.println("done");

		}
		catch (FileNotFoundException  e){
			System.out.println("file not found");
		}
	}

}
