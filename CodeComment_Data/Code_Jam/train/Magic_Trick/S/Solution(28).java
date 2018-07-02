package methodEmbedding.Magic_Trick.S.LYD2051;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	static int[][] input1 = new int[4][4];
	static int[][] input2 = new int[4][4];

	public static void main(String[] args) throws IOException {
		String fileName = "/home/govil/A-small-attempt0.in";
		String output = "/home/govil/output.txt";

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(in.readLine());
		for (int i = 0; i < test; i++) {
			int vol1 = Integer.parseInt(in.readLine());
			for (int j = 0; j < 4; j++) {
				String line = in.readLine();
				String[] l = line.split(" ");
				input1[j][0] = Integer.parseInt(l[0]);
				input1[j][1] = Integer.parseInt(l[1]);
				input1[j][2] = Integer.parseInt(l[2]);
				input1[j][3] = Integer.parseInt(l[3]);
			}

			int vol2 = Integer.parseInt(in.readLine());
			for (int j = 0; j < 4; j++) {
				String line = in.readLine();
				String[] l = line.split(" ");
				input2[j][0] = Integer.parseInt(l[0]);
				input2[j][1] = Integer.parseInt(l[1]);
				input2[j][2] = Integer.parseInt(l[2]);
				input2[j][3] = Integer.parseInt(l[3]);
			}
			
			int common = -1;
			int count =0;
			for (int g = 0; g < 4; g++) {
				for (int f = 0; f < 4; f++) {
					if(input1[vol1-1][g] == input2[vol2-1][f]){
						common = input1[vol1-1][g];
						count++;
					}
				}
			}
			if(count ==1){
				System.out.println("Case #"+ (i+1) + ": " + common +"");
			} else if(count ==0){
				System.out.println("Case #"+ (i+1) + ": " + "Volunteer cheated!");
			} else {
				System.out.println("Case #"+ (i+1) + ": " + "Bad magician!");
			}
			
		}
		in.close();
	}

}
