package methodEmbedding.Cookie_Clicker_Alpha.S.LYD378;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class timer {

	public static void main(String[] args) throws NumberFormatException, IOException {
		File readin = new File("input.txt");
		FileReader r = new FileReader(readin);
		BufferedReader in = new BufferedReader(r);
		int ntest = Integer.parseInt(in.readLine());
		File send = new File("out.txt");
		FileWriter sent = new FileWriter(send);
		BufferedWriter s = new BufferedWriter(sent);
		for (int i = 1; i <= ntest; i++) {
			String[] keys = in.readLine().split(" ");
			double buyfarm = Double.parseDouble(keys[0]);
			double farmcookies = Double.parseDouble(keys[1]);
			double tc = Double.parseDouble(keys[2]);
			double mycookies = 0;
			double time = 0;
			double increment = 2;
			if (tc < buyfarm) {
				time = tc/increment;
			} else {
				while (mycookies < tc) {
					mycookies = buyfarm;
					time = time + mycookies/increment;
					double newinc = increment+farmcookies;
					double checktime = (tc)/newinc;
					double sametime = (tc-mycookies)/increment;
					if (checktime < sametime) {
						increment = newinc;
						mycookies = 0;
					} else {
						time = time + sametime;
						break;
					}
				}
			}
			String out = "Case #"+i+": "+time;
			s.write(out);
			s.newLine();
		}
		s.close();
	}

}
