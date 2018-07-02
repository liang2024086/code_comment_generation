package methodEmbedding.Magic_Trick.S.LYD2215;

import java.util.*;
import java.io.*;

public class roundA {

	/**
	 * @param args
	 * @throws IOException 
	 */

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int one[][]= new int[4][4];
		int two[][]=new int[4][4];
		int counter=1,row_one,row_two,store=0,res = 0;
		
		Scanner sc;
		try {
			sc = new Scanner(new FileReader("input.txt"));
			PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));
			
			int caseCnt = sc.nextInt();
			
			for (int caseNum = 0; caseNum < caseCnt; caseNum++) {
				pw.print("Case #" + (caseNum + 1) + ": ");
				row_one = sc.nextInt();
				int output[]=new int[caseCnt+5];
			
				
				for(int i=0;i<4;i++){
					for(int j=0;j<4;j++){
						one[i][j]= sc.nextInt();
					}					
				}
				
				row_two=sc.nextInt();
				
				for(int i=0;i<4;i++){
					for(int j=0;j<4;j++){
						two[i][j]= sc.nextInt();
					}
					
				}
				
				for(int i=0;i<4;i++){
					for(int j=0;j<4;j++){
											
						if(one[row_one-1][i]==two[row_two-1][j])
							{
							
							output[store++]= one[row_one-1][i];
							}
						}				
				}
				
			if(store==1)
				pw.println(output[0]);
			else if(store==0)
				pw.println("Volunteer cheated!");
			else pw.println("Bad magician!");
								   
			store=0;
					
				
			}					
				pw.flush();
				pw.close();
				sc.close();

		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
}

	
	
	
	
	

	}
	
	
