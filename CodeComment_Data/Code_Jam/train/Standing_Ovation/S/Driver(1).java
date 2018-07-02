package methodEmbedding.Standing_Ovation.S.LYD1126;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Driver {

	public static void main(String[] args) {
		File file = new File(args[0]);
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			int lineno = 1;
			while ((line = br.readLine()) != null) {
				if (lineno++ == 1)
					continue;
				String inputs[] = line.split(" ");
				int have = 0;
				int listed = 0;
				int people;
				int need = 0;
				char[] s = inputs[1].toCharArray();
				for (int i = 0; i < s.length ; i++) {
					people = Character.getNumericValue(s[i]);
					// if (people > 0) {
					need = (i - (have+listed));
					if (need > 0) {
						// }
						listed += need;
					}
					have += people;
				}
				if (listed < 0)
					listed = 0;
				System.out.printf("Case #%d: %d\n", lineno - 2, listed);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
