package methodEmbedding.Magic_Trick.S.LYD1593;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;


public class A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Scanner file = new Scanner(new FileReader("C:/Users/owner/Desktop/A-small-attempt1.in"));
			FileWriter fstream = new FileWriter("C:/Users/owner/Desktop/A-small-answers.txt");
			BufferedWriter out = new BufferedWriter(fstream);
			int T = file.nextInt();
			for(int t = 1; t<=T; t++){
				int a;
				int answer1 = file.nextInt();
				int[] grid1 = new int[4];
				for(int i = 1; i<5; i++){
					if(answer1 == i){
						for(int j = 0; j<4; j++)
							grid1[j] = file.nextInt();
					}
					else{
						for(int j = 0; j<4; j++)
							a = file.nextInt();
					}
				}
				int answer2 = file.nextInt();
				int[] grid2 = new int[4];
				for(int i = 1; i<5; i++){
					if(answer2 == i){
						for(int j = 0; j<4; j++)
							grid2[j] = file.nextInt();
					}
					else{
						for(int j = 0; j<4; j++)
							a = file.nextInt();
					}
				}
				int sol = 0;
				boolean liar = false;
				for(int i = 0; i<4; i++){
					for(int j = 0; j<4; j++){
						if(grid1[i] == grid2[j]){
							if(sol == 0)
								sol = grid1[i];
							else{
								liar = true;
								break;
							}
						}
					}
					if(liar)
						break;
				}
				if(liar){
					out.write("Case #"+t+": Bad magician!"+'\n');
					System.out.println("Case #"+t+": Bad magician!");
				}
				else if(sol == 0){
					out.write("Case #"+t+": "+"Volunteer cheated!"+'\n');
					System.out.println("Case #"+t+": "+"Volunteer cheated!");
				}
				else{
					out.write("Case #"+t+": "+sol+'\n');
					System.out.println("Case #"+t+": "+sol);
				}
			}
			out.close();
		}catch(FileNotFoundException e){
			System.out.println("file not found");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
