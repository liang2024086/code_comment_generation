package methodEmbedding.Magic_Trick.S.LYD1384;

import java.io.*; 
import java.util.Stack;
import java.util.*; 
import java.util.Hashtable; 

public class MagicTrick {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int case_nu = 1;
		// TODO Auto-generated method stub
		//System.out.println("gen");
		try {
			FileInputStream fstream = new FileInputStream("in.txt");
			DataInputStream din = new DataInputStream(fstream);
			BufferedReader in = new BufferedReader(new InputStreamReader(din));
			//PrintWriter out = new PrintWriter(new FileWriter("out.txt"));
			//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

			int num_of_tc = Integer.parseInt(in.readLine());

			int first = 0, second = 0;

			int arr1[][] = new int [4][4];
			int arr2[][] = new int [4][4];

			String str1;
			String s1[][]= new String[4][4];
			String s2[][]= new String[4][4];

			while (case_nu <= num_of_tc) {
				String result = "";
				boolean found = false;
				int answer = 0;

				first = Integer.parseInt(in.readLine())-1;
				for (int i = 0; i< 4; i++) {
					str1 = in.readLine();
					s1[i] = str1.split(" ");
				}
				second = Integer.parseInt(in.readLine())-1;
				for (int i = 0; i< 4; i++) {
					str1 = in.readLine();
					s2[i] = str1.split(" ");
				}
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 4; j++) {
						arr1[i][j] = Integer.parseInt(s1[i][j]);  
						arr2[i][j] = Integer.parseInt(s2[i][j]);  
					}
				}
				
				
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j< 4; j++) {
					if (arr1[first][i] == arr2[second][j]) {
						if (found == false) {
							found = true;
							answer = arr1[first][i];
							result = Integer.toString(arr1[first][i]);
						} else if (found == true) {
							result = "Bad magician!";
							found = false;
							break;
						}
					}
					
				}
				if (found == false && result != "") {
					break;
				}
			}
			if (found == false && result == "") {
				result = "Volunteer cheated!";
			}
			if (found == true && answer > 0) {
				System.out.println("Case #"+case_nu+": "+answer);
			} else if (found == false && result != "") {
				System.out.println("Case #"+case_nu+": "+result);
			}

				case_nu++;
			}

			//Close the input stream
			in.close();
			//out.close();
		}
		catch (Exception e) { //Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}



	}
}

