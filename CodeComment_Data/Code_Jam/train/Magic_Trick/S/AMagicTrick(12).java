package methodEmbedding.Magic_Trick.S.LYD1221;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Google Code Jam 2014 - G I N D 
 * Author: Norb  - luigi.romer@gmail.com
 * 
 * Args[0] contains the filename and output will be produced in a [filename].out file
 */
public class AMagicTrick {

	/**
	 * Filename should be the only parameter provided
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		int T= 0;

		BufferedReader in = null;
		BufferedWriter bw = null;
		File f = (args.length > 0)? new File(args[0]): new File("A-small-attempt0.in.txt");
		File o = new File(f.getParentFile(), f.getName() +".out");

		if (!f.exists()) {
			throw new RuntimeException(String.format("File [%s] not found.",f.getAbsolutePath()));
		}

		try {
			in = new BufferedReader(new FileReader(f));
			bw = new BufferedWriter(new FileWriter(o));
			String line = null;
			while ((line = in.readLine()) != null) {
				T = Integer.parseInt(line);
				// There is no need to fill out the full multidimensional array, 
				// this code would never make it to production ;)
				for (int i=1; i < T+1; i++) {
					int picked = Integer.parseInt(in.readLine());
					int[][] turn1 = new int[4][4];
					for(int j=0;j<4;j++){
						String[] a = in.readLine().split(" ");
						int c=0;
						for(String v:a){
							turn1[j][c]=Integer.parseInt(v);
							c++;
						}
					}
					int picked2 = Integer.parseInt(in.readLine());
					int[][] turn2 = new int[4][4];
					for(int j=0;j<4;j++){
						String[] a = in.readLine().split(" ");
						int c=0;
						for(String v:a){
							turn2[j][c]=Integer.parseInt(v);
							c++;
						}
					}

					System.out.print(String.format("Case #%s: ", i));
					bw.write(String.format("Case #%s: ", i));

					// Let's look over info
					int matched=0;
					int winner=0;
					for(int c=0; c< 4; c++){
						for (int k=0;k<4; k++){
							if (turn2[picked2-1][k]==turn1[picked-1][c]){
								winner=turn2[picked2-1][k];
								matched++;
							}
						}
					}
					// Let's show results
					if (matched>1) {
						System.out.println("Bad Magician!");
						bw.write("Bad Magician!\n");
					} else if (matched==0){
						System.out.println("Volunteer cheated!");
						bw.write("Volunteer cheated!\n");
					} else {
						System.out.println(winner);
						bw.write(String.format("%s\n",winner));
					}

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (in != null) 
				in.close();
			if (bw != null){
				bw.flush();
				bw.close();
			}
		}

	}


}

