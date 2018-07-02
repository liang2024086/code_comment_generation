package methodEmbedding.Magic_Trick.S.LYD2062;


import java.io.*;
import java.util.Scanner;

public class magicTrick {

	public static void main (String [] args) throws Exception{
		Scanner fileName = new Scanner(System.in);
		FileReader fileRead = new FileReader(fileName.nextLine());
		PrintWriter fileWrite = new PrintWriter(fileName.nextLine());
		Scanner sc = new Scanner(fileRead);

		int [] startArray = new int[4];
		int [] endArray = new int[4];
		int startRow, endRow, count, cardNum;
		
		int testCase = 0;
		int TC = sc.nextInt();
		while (testCase++ < TC){
			startRow = sc.nextInt();
			cardNum = 0;
			for (int i=1; i<=4; i++){
				if (i == startRow){
					startArray[0] = sc.nextInt();
					startArray[1] = sc.nextInt();
					startArray[2] = sc.nextInt();
					startArray[3] = sc.nextInt();
				} else {
					sc.nextInt();
					sc.nextInt();
					sc.nextInt();
					sc.nextInt();
				}
			}
			endRow = sc.nextInt();
			for (int i=1; i<=4; i++){
				if (i == endRow){
					endArray[0] = sc.nextInt();
					endArray[1] = sc.nextInt();
					endArray[2] = sc.nextInt();
					endArray[3] = sc.nextInt();
				} else {
					sc.nextInt();
					sc.nextInt();
					sc.nextInt();
					sc.nextInt();
				}
			}
			count = 0;
			for (int i=0; i<4; i++){
				for (int j=0; j<4; j++){
					if (startArray[i] == endArray[j]){
						count ++;
						cardNum = startArray[i];
					}
				}	
			}
			if (count == 0){
				fileWrite.println("Case #"+ testCase +": Volunteer cheated!");
			} else if (count > 1){
				fileWrite.println("Case #"+ testCase +": Bad magician!");
			} else {
				fileWrite.println("Case #"+ testCase +": " + cardNum);
			}
		}
		
		fileWrite.close();
		return;
	}
	
}
