package methodEmbedding.Magic_Trick.S.LYD226;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;


public class MagicTrick {
	public static void main(String args[]) throws IOException{
		Scanner input = new Scanner(new File(args[0]));
		PrintWriter output = new PrintWriter(new FileWriter("C:\\Users\\Jessica Tang\\workspace\\GCJ 2014\\output.txt"));
		int caseTotal = input.nextInt();
		
		ArrayList<Integer> rows1 = new ArrayList<Integer>(16);
		ArrayList<Integer> row1 = new ArrayList<Integer>(4);
		
		ArrayList<Integer> rows2 = new ArrayList<Integer>(16);
		ArrayList<Integer> row2 = new ArrayList<Integer>(4);
		
		for(int i=1; i<=caseTotal; i++){
			int chosen1 = input.nextInt();
			rows1.clear();
			row1.clear();
			rows2.clear();
			row2.clear();
			
			
			for(int j=1; j<=16;j++){
				rows1.add(input.nextInt());	
			}
			
			int spot = 0;
			
			if(chosen1 ==1){
				spot = 0;
			}
			else if (chosen1 ==2){
				spot =4;
			}
			else if(chosen1 ==3){
				spot=8;
			}
			else if(chosen1 ==4){
				spot=12;
			}
			
			for(int r1=1;r1<=4;r1++){
				row1.add(rows1.get(spot));
				spot++;
			}
			
			int chosen2 = input.nextInt();
						
			for(int k=1;k<=16;k++){
				rows2.add(input.nextInt());
			}
			
			int spot2 =0;
					
			if(chosen2 ==1){
				spot2 = 0;
			}
			else if (chosen2 ==2){
				spot2 =4;
			}
			else if(chosen2 ==3){
				spot2=8;
			}
			else if(chosen2 ==4){
				spot2=12;
			}
			
			for(int r2=1;r2<=4;r2++){
								
				row2.add(rows2.get(spot2));
				spot2++;
			}
			
			int compare = 0;
			int count = 0;
			int hand = 0;
			
			while(!row1.isEmpty() && compare <=3){
				int card = row1.get(compare);
				row1.remove(compare);
				
				if(row2.contains(card)){
					count++;
					hand = card;
				}
			}
			
			if(count==0){
				String outputString ="Case #"+i+": "+ "Volunteer cheated!";
				System.out.println(outputString);
				output.println(outputString);
			}
			else if(count==1){
				String outputString = "Case #"+i+": "+ hand;
				System.out.println(outputString);
				output.println(outputString);
			}
			else{
				String outputString = "Case #"+i+": "+ "Bad magician!";
				System.out.println(outputString);
				output.println(outputString);
			}	
		}
		output.close();
	}
}
