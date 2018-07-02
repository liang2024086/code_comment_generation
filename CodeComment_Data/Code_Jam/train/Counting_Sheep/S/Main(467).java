package methodEmbedding.Counting_Sheep.S.LYD1171;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) throws IOException{
		
		
		String filename;
		Scanner sc;
		final int T; 
		boolean[][] digitsFoundbyNum;
		boolean exitCondition;
		int lastNum;
		int NumDivDecimal;
		int testCase;
		int digit;
		int multiplier;
		int[] testCases;
		String[] lastNumbers;
		int numTrials=0;
		
		filename="placeholder.txt";
		sc= new Scanner(new FileReader(filename));
		T= sc.nextInt();
		sc.nextLine();
		
		digitsFoundbyNum= new boolean[T][10];
		lastNumbers= new String[T];
		testCases= new int[T];
		
		for(int i = 0; i < T; i++){
			for(int j = 0; j < 10; j++){
				digitsFoundbyNum[i][j]=false;
			}
		}
		
		for(int i = 0; i < T; i++){
			numTrials=0;
			testCase=sc.nextInt();
			testCases[i]=testCase;
			if(i!=T-1)
			sc.nextLine();
			lastNum=testCase;
			multiplier=1;
			do{
				numTrials++;
				multiplier++;
				NumDivDecimal=lastNum;
				exitCondition=true;
				do{

					digit= NumDivDecimal%10;
					digitsFoundbyNum[i][digit]=true;
					NumDivDecimal = NumDivDecimal / 10;
				}while(NumDivDecimal!=0);
				
				
				for(int j = 0; j < 10;j++){
					if(digitsFoundbyNum[i][j]==false){
						exitCondition=false;
					}
				}
				if(!exitCondition){
					lastNum=testCase*multiplier;
				}
			}while(!exitCondition && numTrials < 100);
			lastNumbers[i]=(numTrials == 100)? "INSOMNIA":String.valueOf(lastNum);
		}
		sc.close();
		
		PrintStream ps = new PrintStream(new File("placeholdersaida.txt"));
		
		
		for(int i = 0;i<T;i++){
			ps.printf("%-20s\n", "Case #"+(i+1)+": "+lastNumbers[i],testCases[i] );
		}
		ps.close();
		
		
		
	}
}
