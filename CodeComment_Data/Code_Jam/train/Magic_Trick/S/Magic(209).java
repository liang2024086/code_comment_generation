package methodEmbedding.Magic_Trick.S.LYD2102;



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Magic {
	public static void main(String[] args) throws FileNotFoundException {
		try {
			Scanner sc = new Scanner(new File("A-small-attempt0.in"));
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File("output")));
			Integer t = Integer.parseInt(sc.nextLine());
			for (int i = 0; i < t; i++) {
				bw.write("Case #"+(i+1)+": ");
				
				int firstAnswer = Integer.parseInt(sc.nextLine());
				List <Integer> possibleAnswers = new ArrayList<Integer>();
				for (int j = 0; j < 4; j++) {
					if ((j+1) == firstAnswer) {
						String line = sc.nextLine();
						Scanner sc2 = new Scanner(line);
						for (int k = 0; k < 4; k++) {
							possibleAnswers.add(sc2.nextInt());
						}
					} else {
						sc.nextLine();
					}
				}
				Integer secondAnswer = Integer.parseInt(sc.nextLine());
				List <Integer> userValues = new ArrayList<Integer>();
				for (int j = 0; j < 4; j++) {
					if ((j+1) == secondAnswer) {
						String line = sc.nextLine();
						Scanner sc2 = new Scanner(line);
						for (int k = 0; k < 4; k++) {
							Integer value = new Integer(sc2.nextInt());
							if (possibleAnswers.contains(value)) {
								userValues.add(value);
							}
						}
					} else {
						sc.nextLine();
					}
				}
				if (userValues.size() == 1) {
					bw.write(userValues.get(0)+"\r\n");
				} else if (userValues.size() == 0) {
					bw.write("Volunteer cheated!\r\n");
				} else {
					bw.write("Bad magician!\r\n");
				}
			}
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
