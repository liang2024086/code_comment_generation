package methodEmbedding.Speaking_in_Tongues.S.LYD880;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int numCase = 0;
		BufferedReader br = null;
		PrintWriter pr = null;
		
		try {

			br = new BufferedReader(new FileReader(args[0]));
			pr = new PrintWriter(new FileWriter("a.out"));

			numCase = Integer.parseInt(br.readLine());

			String line;

			for (int i = 0 ; i < numCase ; i++){

				line = br.readLine();
				pr.print("Case #"+(i+1)+": ");
				for (int j = 0 ; j < line.length() ; j ++){
					
					char ch = line.charAt(j);
					
					if (ch == ' '){
						pr.print(' '); 
					}
					else if (ch == 'a'){
						pr.print('y');
					}
					else if (ch == 'b'){
						pr.print('h');
					}
					else if (ch == 'c'){
						pr.print('e');
					}
					else if (ch == 'd'){
						pr.print('s');
					}
					else if (ch == 'e'){
						pr.print('o');
					}
					else if (ch == 'f'){
						pr.print('c');
					}
					else if (ch == 'g'){
						pr.print('v');
					}
					else if (ch == 'h'){
						pr.print('x');
					}
					else if (ch == 'i'){
						pr.print('d');
					}
					else if (ch == 'j'){
						pr.print('u');
					}
					else if (ch == 'k'){
						pr.print('i');
					}
					else if (ch == 'l'){
						pr.print('g');
					}
					else if (ch == 'm'){
						pr.print('l');
					}
					else if (ch == 'n'){
						pr.print('b');
					}
					else if (ch == 'o'){
						pr.print('k');
					}
					else if (ch == 'p'){
						pr.print('r');
					}
					else if (ch == 'q'){
						pr.print('z');
					}
					else if (ch == 'r'){
						pr.print('t');
					}
					else if (ch == 's'){
						pr.print('n');
					}
					else if (ch == 't'){
						pr.print('w');
					}
					else if (ch == 'u'){
						pr.print('j');
					}
					else if (ch == 'v'){
						pr.print('p');
					}
					else if (ch == 'w'){
						pr.print('f');
					}
					else if (ch == 'x'){
						pr.print('m');
					}
					else if (ch == 'y'){
						pr.print('a');
					}
					else if (ch == 'z'){
						pr.print('q');
					}
				}
				pr.println();
				
			}
			pr.flush();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
		if (pr != null)
			pr.close();
		}

	}

}

/*
numCase = Integer.parseInt(line);

for (int i = 0 ; i < numCase ; i++){
	int numFlies = 0;
	double tx = 0;
	double ty = 0;
	double tz = 0;

	double tvx = 0;
	double tvy = 0;
	double tvz = 0;

	String[] lineSplit;

	numFlies = Integer.parseInt(br.readLine());

	for (int j = 0 ; j < numFlies ; j++){

		lineSplit = br.readLine().split(" ");

		tx+=Integer.parseInt(lineSplit[0]);
		ty+=Integer.parseInt(lineSplit[1]);
		tz+=Integer.parseInt(lineSplit[2]);

		tvx+=Integer.parseInt(lineSplit[3]);
		tvy+=Integer.parseInt(lineSplit[4]);
		tvz+=Integer.parseInt(lineSplit[5]);

	}

	tx /= numFlies;
	ty /= numFlies;
	tz /= numFlies;

	tvx /= numFlies;
	tvy /= numFlies;
	tvz /= numFlies;

	double dis = Math.sqrt(Math.pow(tx, 2) + Math.pow(ty, 2) + Math.pow(tz, 2));

	tx += tvx;
	ty += tvy;
	tz += tvz;

	double nextDis = Math.sqrt(Math.pow(tx, 2) + Math.pow(ty, 2) + Math.pow(tz, 2));

	while ( dis > nextDis) {

		dis = nextDis;

		tx += tvx;
		ty += tvy;
		tz += tvz;

		nextDis = Math.sqrt(Math.pow(tx, 2) + Math.pow(ty, 2) + Math.pow(tz, 2));
	}

	double t = 1.0;

	while ()

}

 */
