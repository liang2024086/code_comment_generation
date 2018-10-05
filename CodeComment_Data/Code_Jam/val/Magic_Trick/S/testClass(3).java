package methodEmbedding.Magic_Trick.S.LYD319;


import java.util.*;
import java.io.*;

public class testClass {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException{
		PrintWriter write = new PrintWriter("outputProblem1", "UTF-8");
		Scanner kb = new Scanner(System.in);
		ArrayList<String> rows = new ArrayList<>();
		ArrayList<String> rows2 = new ArrayList<>();
		
		int cases = Integer.parseInt(kb.nextLine());
		
		for(int i = 0 ; i < (cases); i++){
			rows.clear();
			rows2.clear();
			
			int ans1 = Integer.parseInt(kb.nextLine());
			
			rows.add(kb.nextLine());
			rows.add(kb.nextLine());
			rows.add(kb.nextLine());
			rows.add(kb.nextLine());
			
			int ans2 = Integer.parseInt(kb.nextLine());
			
			rows2.add(kb.nextLine());
			rows2.add(kb.nextLine());
			rows2.add(kb.nextLine());
			rows2.add(kb.nextLine());
			
			int count = 0;
			String currentNum = " ";
			String currentNum2 = " ";
			String chosenNum = " ";
			
			String firstLine = rows.get(ans1-1);
			String secondLine = rows2.get(ans2-1);
			
			Scanner line1 = new Scanner(firstLine);
			Scanner line2 = new Scanner(secondLine);
			
			while(line1.hasNext()){
				currentNum = line1.next();
				line2 = new Scanner(secondLine);
				while(line2.hasNext()){
					currentNum2 = line2.next();
					if(currentNum.equals(currentNum2)){
						chosenNum = currentNum;
						count++;
					}
				}
			}
			
			if(count > 1){
				write.println("Case #" + (i+1) + ": Bad magician!");
			} else if(count < 1){
				write.println("Case #" + (i+1) + ": Volunteer cheated!");
			} else {
				write.println("Case #" + (i+1) + ": " + chosenNum);
			}
		}
		
		write.close();
	}
}
