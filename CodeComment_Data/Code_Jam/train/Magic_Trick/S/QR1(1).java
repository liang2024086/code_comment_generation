package methodEmbedding.Magic_Trick.S.LYD1089;


import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class QR1 {
	
	public static void main(String[] args) throws Exception {
		Scanner inputFile=new Scanner(new File("./inputs/y2014/QR/A-small-attempt0.in"));
		PrintWriter outputFile=new PrintWriter(new File("./inputs/y2014/QR/A-small-attempt0.out"));
			
		int t=Integer.parseInt(inputFile.nextLine());	
		for(int i=0;i<t;i++){
			int row = Integer.parseInt(inputFile.nextLine());
			String[] first = null;
			String[] second = null;
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			Integer result = null;
			boolean done = false;
			
			for(int j=0; j<row; j++) {
				first = inputFile.nextLine().split(" ");				
			}
			
			for(int j=4-row; j>0; j--) {
				inputFile.nextLine();				
			}
			
			row = Integer.parseInt(inputFile.nextLine());
			
			for(int j=0; j<row; j++) {
				second = inputFile.nextLine().split(" ");				
			}
			
			for(int j=4-row; j>0; j--) {
				inputFile.nextLine();				
			}			

			for(int j=0; j<4; j++) {
				Integer curr = Integer.parseInt(first[j]);
				map.put(curr, curr);
			}
			
			for(int j=0;j<4; j++) {
				Integer curr = map.get(Integer.parseInt(second[j]));
				if(curr != null) {
					if(result == null)
						result = curr;
					else {
						outputFile.println("Case #"+(i+1)+": Bad magician!");	
						System.out.println("Case #"+(i+1)+": Bad magician!");
						done = true;
						break;
					}
				}
			}
			
			if(!done) {
				if(result == null) {
					outputFile.println("Case #"+(i+1)+": Volunteer cheated!");
					System.out.println("Case #"+(i+1)+": Volunteer cheated!");
				} else {
					outputFile.println("Case #"+(i+1)+": " + result);
					System.out.println("Case #"+(i+1)+": " + result);				
				}				
			}
		}

		inputFile.close();
		outputFile.close();
	}
	
}
