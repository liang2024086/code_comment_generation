package methodEmbedding.Magic_Trick.S.LYD1539;


import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MagicTrick {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedWriter out = null;
		Scanner scanner = null;
		try {
			String inputFileName = "A-small-attempt0.in.txt";
			scanner = new Scanner(new FileInputStream("/Users/MSR/TestFiles/"+inputFileName));
			out = new BufferedWriter(new FileWriter("/Users/MSR/TestFiles/"+inputFileName+"_out"));
			int numTests = scanner.nextInt();
			for(int i=1;i<=numTests;i++){
				int choice1 = scanner.nextInt();
				int[] choice1List = new int[4];
				int k=0;
				for(int j=1;j<=16;j++){
					int temp = scanner.nextInt();
					if( j > (choice1-1) * 4 && j <= (choice1) *4){
						choice1List[k++] = temp;
					}
				}
				int choice2 = scanner.nextInt();
				int[] choice2List = new int[4];
				k=0;
				for(int j=1;j<=16;j++){
					int temp = scanner.nextInt();
					if( j > (choice2-1) * 4 && j <= choice2 *4){
						choice2List[k++] = temp;
					}
				}
				int totalMatches = 0;
				int match = 0;
				for(int p=0; p<4;p++){
					for(int q=0;q<4;q++){
						if(choice1List[p] == choice2List[q]){
							totalMatches++;
							match = choice1List[p];
						}
							
					}
				}
				out.write("Case #"+i+": ");
				if(totalMatches == 1)
					out.write(match+"");
				else if(totalMatches == 0)
					out.write("Volunteer cheated!");
				else
					out.write("Bad magician!");
				out.write("\n");
				out.flush();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				scanner.close();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	

}
