package methodEmbedding.Standing_Ovation.S.LYD932;

import java.io.*;
import java.util.Scanner;
class Task1{
	public static void main(String[] args){
		int noOfCase    = 0;
		int SMax    = 0;
		int inPut[] = new int[1001];
		int caseNo = 0;
		int currentTot = 0;
		int needMore   = 0;
		String tempIn = new String();
		String tempIn1 = new String();
		String temp[] = new String[2];
		Scanner    inData  = null;
		FileWriter outData = null;
		try{
			inData  = new Scanner(new FileReader("C:\\Users\\Dj\\Desktop\\Task1.txt"));
			outData = new FileWriter("C:\\Users\\Dj\\Desktop\\Task1small.txt");
		}catch(Exception e){
			System.out.println("Error Occured");
		}
		try{
			noOfCase = inData.nextInt();

			tempIn1 = inData.nextLine();
			System.out.println(noOfCase);
		}catch(Exception e){
			System.out.println("Error Occured");
		}
		do{
			caseNo++;
			currentTot = 0;
			needMore = 0;
			int needMoreCur =0;
			try{
				SMax = inData.nextInt();
				tempIn = inData.nextLine();
				tempIn = tempIn.trim();
				for(int i = 0; i <= SMax; i++){
					inPut[i] = Character.getNumericValue(tempIn.charAt(i));
				}
				for(int i = 0;i <= SMax; i++){
					if (currentTot >= i )
						currentTot += inPut[i];
					else if(inPut[i] > 0){
						needMoreCur = (i - currentTot);
						needMore += needMoreCur; 
						currentTot += (needMoreCur + inPut[i]);
					}
				}
				outData.write("Case #" + caseNo + ": " + needMore + "\n" );
			}catch(Exception e){
			System.out.println("Error Occured");
		    }	
			noOfCase--;
		}while(noOfCase > 0);
		try{
			outData.close();
		}catch(Exception e){
			System.out.println("Error Occured");
		}	
						
	}
}	
