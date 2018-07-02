package methodEmbedding.Magic_Trick.S.LYD2194;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class problem1 {

	public static void main(String[] args) throws FileNotFoundException {
		File source = new File("A-small-attempt2.in");
		if(!source.exists()){
			System.exit(0);
		}
		Scanner in = new Scanner(source);
		File target = new File("mos.txt");
		if(target.exists()){
			System.exit(0);
		}
		PrintWriter out = new PrintWriter(target);
		
		int [][] firstArrangment = new int[4][4];
		int [][] secondArrangment = new int[4][4];
		int [] row = new int[2];
		int testCases,count=0;
		int value=0;
		boolean done=false;
		while(in.hasNext()){
			testCases = in.nextInt();
			if(testCases>=1 && testCases<=100){
				for(int i=1 ; i<=testCases ; i++){
					count=0;
					done=false;
					row[0] = in.nextInt();
					if(row[0]>=1 && row[0]<=4){
						row[0]--;
						for(int j=0 ; j<4 ; j++){
							for(int k =0 ; k<4 ; k++){
								firstArrangment[j][k]=in.nextInt();
							}
						}
						row[1] = in.nextInt();
						if(row[1]>=1 && row[1]<=4){
							row[1]--;
							for(int j=0 ; j<4 ; j++){
								for(int k =0 ; k<4 ; k++){
									secondArrangment[j][k]=in.nextInt();
								}
							}
							for(int j=0 ; j<4 && !done ; j++){
								for(int k=0 ; k<4 ; k++){
									if(firstArrangment[row[0]][j]==secondArrangment[row[1]][k]){
										value=firstArrangment[row[0]][j];
										count++;
										if(count>1){
											done=true;
											break;
										}
									}
								}
							}
							if(count==1)
								out.println("Case #"+i+": "+value);
							else if(count==0)
								out.println("Case #"+i+": "+"Volunteer cheated!");
							else if(count>1)
								out.println("Case #"+i+": "+"Bad magician!");
						}
					}
				}
			}
		}
		
		
		out.close();
		in.close();
	}

}
