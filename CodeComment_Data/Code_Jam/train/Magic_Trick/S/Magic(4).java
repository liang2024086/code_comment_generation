package methodEmbedding.Magic_Trick.S.LYD1883;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Magic {

	
	public static void main(String[]args) throws IOException{
		
		int linePicked1;
		int linePicked2;
		int numPlays;
		int array[][] = new int[4][4];
		int array1[][] = new int[4][4];
		int[]arrayTemp = new int[16];
		int[]arrayTemp1 = new int[16];

		ArrayList <String> list = new ArrayList<String>();
		String num="";

		
			FileReader fr = new FileReader("A-small-attempt0.in");
			BufferedReader br = new BufferedReader (fr);
			Scanner scanner= new Scanner (br);		
			numPlays=scanner.nextInt();
			
			for(int plays=1;plays<numPlays+1;plays++){ 			
			
				linePicked1=(scanner.nextInt());
			
			
				for(int x=0; x<16;x++){
				     arrayTemp[x] = scanner.nextInt();
				}
				
				int p=0;
				for(int x=0;x<4;x++){
					for(int y=0;y<4;y++){
						array[x][y]=arrayTemp[p];
						p++;
						//System.out.println(array[x][y]);
					}
				}
				
				
				linePicked2=(scanner.nextInt());
			
			
				for(int x=0; x<16;x++){
				     arrayTemp1[x] = scanner.nextInt();
				}
				
				int q=0;
				for(int x=0;x<4;x++){
					for(int y=0;y<4;y++){
						array1[x][y]=arrayTemp1[q];
						q++;
						//System.out.println(array1[x][y]);
					}
				}
				//comparison here
				for(int x=0;x<4;x++){
//					System.out.println(array[linePicked1-1][x]);					
//					System.out.println(array1[linePicked2-1][x]);
				}
//				System.out.println(linePicked1);
//				System.out.println(linePicked2);

				boolean gotNumber=false;
				int numberTheSame=0;
				int numPicked = 0;
				for(int x=0;x<4;x++){
					//numberTheSame=0;
					for(int y=0;y<4;y++){
						if(array[linePicked1-1][x]==array1[linePicked2-1][y]){
							gotNumber=true;
							numberTheSame++;
							if(numberTheSame>1)gotNumber=false;
							numPicked=array[linePicked1-1][x];
						}
					}
				}
				if(numberTheSame==0){
					System.out.println("Case #"+plays+": Volunteer cheated!");
				}
				else if(gotNumber){
					System.out.println("Case #"+plays+": "+numPicked);
				}
				else{
					System.out.println("Case #"+plays+": Bad magician!");
				}
				
				
				
				
			}
			
			
	}
}
