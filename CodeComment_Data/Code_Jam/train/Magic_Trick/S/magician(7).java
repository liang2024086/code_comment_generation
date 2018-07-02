package methodEmbedding.Magic_Trick.S.LYD1631;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import javax.swing.JFileChooser;


public class magician {
	public static void main(String[] args){
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.showOpenDialog(null);
		File file = fileChooser.getSelectedFile();
		try{
			Scanner scan = new Scanner(file);
			PrintStream print = new PrintStream(new File("output.out"));
			int cases = scan.nextInt();
			int currentcase = 1;
			for (int i = 0; i < cases; i++){
				int row = scan.nextInt();
				int j = 0;
				while (j < row){
					scan.nextLine();
					j++;
				}
				String line = scan.nextLine();
				String[] numbers = line.split(" ");
				int[] num  = new int[4];
				num[0] = Integer.parseInt(numbers[0]);
				num[1] = Integer.parseInt(numbers[1]);
				num[2] = Integer.parseInt(numbers[2]);
				num[3] = Integer.parseInt(numbers[3]);
				while (j < 4){
					scan.nextLine();
					j++;
				}
				row = scan.nextInt();
				j = 0;
				while (j < row){
					scan.nextLine();
					j++;
				}
				line = scan.nextLine();
				numbers = line.split(" ");
				int[] nextNum = new int[4];
				nextNum[0] = Integer.parseInt(numbers[0]);
				nextNum[1] = Integer.parseInt(numbers[1]);
				nextNum[2] = Integer.parseInt(numbers[2]);
				nextNum[3] = Integer.parseInt(numbers[3]);
				int matching = 0;
				int matchingNumber = 0;
				for (int nums:num){
					for (int nums2:nextNum){
						if (nums == nums2) {
							matching++;
							matchingNumber = nums;
						}
					}
				}
				if (matching == 0) print.append("Case #" + currentcase + ": Volunteer cheated!\n");
				if (matching == 1) print.append("Case #" + currentcase + ": " + matchingNumber + "\n");
				if (matching > 1) print.append("Case #" + currentcase + ": Bad magician!\n");
				currentcase++;
				while (j < 4){
					scan.nextLine();
					j++;
				}
			}
		}
			catch(IOException e){System.out.println(e);}
		}
	}

