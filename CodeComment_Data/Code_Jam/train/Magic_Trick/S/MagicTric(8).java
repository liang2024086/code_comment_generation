package methodEmbedding.Magic_Trick.S.LYD1746;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MagicTric {
	public static void main(String[] args) throws FileNotFoundException {
		//Get Input files
		Scanner sc = new Scanner(new File("input.txt"));
		int inputFile = sc.nextInt();
		
		//set columns for matrix
		int firstRow = 0;
		int secondRow = 0;
		
		//Selected values
		int[] selectedFirst ;
		int[] selectedSecond;
		
		//Counter
		int counter ;
		
		//answer
		int ans;
		String str;
		Scanner rowScanner;
		boolean hasmatches ;
		
		
		for(int i =0;i<inputFile;i++){
			ans = -1;
			counter = 0;
			hasmatches =false;
			selectedFirst = new int[4];
			selectedSecond = new int[4];
			
			firstRow = sc.nextInt()-1;
			sc.nextLine();
			
			for(int row=0;row<8;row++){ 
				if(counter==4){
					secondRow = sc.nextInt()-1;
					sc.nextLine();
				}
				str = sc.nextLine();
				rowScanner = new Scanner(str).useDelimiter(" ");
				for(int colIndex =0;colIndex<4;colIndex++){
					if(row==firstRow){
						selectedFirst[colIndex] = rowScanner.nextInt();
					}else if((row-4)==secondRow){
						try{
							selectedSecond[colIndex] = rowScanner.nextInt();
						}catch(Exception e){
							e.printStackTrace();
						}
					}
				}
				counter++;
			}
			
			//Chk for results
			for(int val : selectedFirst){
				for(int scVal : selectedSecond){
					if(val==scVal){
						if(ans!=-1){
							hasmatches=true;
						}
						ans = val;
					}
				}
			}
			//Results
			if(hasmatches){
				System.out.println("Case #" + (i+1) + ": Bad magician!");
			}else if(ans==-1){
				System.out.println("Case #" + (i+1) + ": Volunteer cheated!");
			}else {
				System.out.println("Case #" + (i+1) + ": " + ans);
			}	
		}	
	}
}
