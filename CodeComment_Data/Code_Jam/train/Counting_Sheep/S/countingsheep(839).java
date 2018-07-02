package methodEmbedding.Counting_Sheep.S.LYD1423;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class countingsheep {

	public static void main(String[] args) {

		try {
			String path = System.getProperty("user.dir") + "/src/data/A-small-attempt0.in";
			int caseno = 1;
			BufferedReader ifile = new BufferedReader(new FileReader(new File(path)));
			ifile.readLine();
			String line;

			ArrayList<Integer> ori = new ArrayList<Integer>();
			for (int i = 0; i < 10; i++) {
				ori.add(i);
			}

			while ((line = ifile.readLine()) != null) {
				Set<Integer> ingat = new LinkedHashSet<Integer>();
				int pilih1;

				pilih1 = Integer.parseInt(line);

				boolean flag = true;
				boolean insomnia = false;
				int i = 1;
				int pilih11 = pilih1;
				while (flag) {
					
					String pp = Integer.toString(pilih11);
					char[] pilih2 = pp.toCharArray();
					for (char p : pilih2) {
						ingat.add(Character.getNumericValue(p));
					}

					if (ingat.containsAll(ori)) {
						break;
					}

					i++;
					pilih11 = i * pilih1;
					
					if (pilih11 == pilih1) {
						insomnia = true;
						break;
					}

				}
				if (insomnia == true) {
					System.out.println("Case #" + caseno + ": " + "INSOMNIA");
				} else {
					System.out.println("Case #" + caseno + ": " + pilih11);

				}
				caseno++;
			}

		} catch (Exception ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}

	}

}
