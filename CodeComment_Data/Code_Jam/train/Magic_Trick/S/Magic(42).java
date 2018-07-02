package methodEmbedding.Magic_Trick.S.LYD1225;


import java.util.Arrays;
import java.util.Scanner;

public class Magic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int testcasesCount = s.nextInt();
		
		int[][] data = new int[4][4];
		for(int i=0; i<testcasesCount; i++) {
			//Get the first input
			int input1 = s.nextInt() - 1;
			//get the 1st set of data
			for(int j=0; j<4; j++) {
				for(int k=0; k<4; k++) {
				   data[j][k] = s.nextInt();
				}
			}
			int[] existrow = Arrays.copyOf(data[input1], data[input1].length);
			
			int input2 = s.nextInt() - 1 ;
			//get the 1st set of data
			for(int j=0; j<4; j++) {
				for(int k=0; k<4; k++) {
				   data[j][k] = s.nextInt();
				}
			}
			
			int count = 0;
			int num = -1;
			//check exists
			for(int x=0; x<data[input2].length; x++) {
				for(int y=0; y<existrow.length; y++) {
					if(data[input2][x] == existrow[y]) {
						num = data[input2][x];
						count++;
					}
				}
			}
			if(count > 1) {
				System.out.println("Case #"+(i+1)+": Bad magician!");
			} else if(count == 0 && num == -1) {
				System.out.println("Case #"+(i+1)+": Bad volunteer!");
			} else {
				System.out.println("Case #"+(i+1)+": "+num);
			}
			
		}
		s.close();

	}

}
