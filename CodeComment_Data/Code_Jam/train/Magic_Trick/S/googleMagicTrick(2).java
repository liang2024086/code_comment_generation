package methodEmbedding.Magic_Trick.S.LYD321;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class googleMagicTrick {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("C:/Users/Shahriar/Desktop/Workspace/PR2/A-small-attempt.in"));
		BufferedWriter b = new BufferedWriter( new FileWriter("C:/Users/Shahriar/Desktop/Workspace/PR2/output.txt"));
		int cases=0;
		int caseCheck = sc.nextInt();
		
		while (cases < caseCheck) {
			int firstAnswer = sc.nextInt()-1;
			int [] [] arr = new int [4][4];
			for (int row = 0; row < arr.length; row++) {
				for (int col = 0; col < arr.length; col++) {
					arr[row][col]= sc.nextInt();
				}	
			}
			
			int ans1 [] = new int[4];
			
			for (int col = 0; col < ans1.length; col++) {
				ans1[col]=arr[firstAnswer][col];
			}
			
			int secondAnswer = sc.nextInt()-1;
			
			int [] [] arr2 = new int [4][4];
			for (int row = 0; row < arr2.length; row++) {
				for (int col = 0; col < arr2.length; col++) {
					arr2[row][col]= sc.nextInt();
				}	
			}
			
			int ans2 [] = new int[4];
			
			for (int col = 0; col < ans2.length; col++) {
				ans2[col]=arr2[secondAnswer][col];
			}
			
			int flag = 0;
			int thevalue=0;
			for (int i = 0; i < ans1.length; i++) {
				for (int j = 0; j < ans2.length; j++) {
					if (ans1[i]==ans2[j]){
						thevalue = ans1[i];
						flag++;
					}
				}
			}
			try {
				
					if(flag > 1){
						b.write("Case #"+(cases+1)+": Bad magician!");
						
					}else if (flag==0) {
						b.write("Case #"+(cases+1)+": Volunteer cheated!");
						
					}else if (flag==1) {
						b.write("Case #"+(cases+1)+": "+thevalue);
						
					}
					b.newLine();
					b.flush();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			cases++;
		}
		 b.close();
		
	}

}
