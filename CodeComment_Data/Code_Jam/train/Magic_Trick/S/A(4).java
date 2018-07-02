package methodEmbedding.Magic_Trick.S.LYD612;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;


public class A {

	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner in = new Scanner (new File("A-small-attempt0.in"));
		PrintStream ps = new PrintStream(new File ("A-small-attempt0.out"));
		System.setOut(ps);
		int t= in.nextInt();
		int Case=0;
		while(t--!=0){
			Case++;
			int one=in.nextInt();
			one--;
			int first [][]= new int [4][4];
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					first[i][j]=in.nextInt();
				}
			}
			int two= in.nextInt();
			two--;
			int second [][]= new int [4][4];
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					second[i][j]=in.nextInt();
				}
			}
			int match=0;
			// true
			int num=0;
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					if(first[one][i]==second[two][j]){
						match++;
						num= first[one][i];
					}
				}
			}
			
			if(match==1){
				System.out.println("Case #"+Case+": "+num);
				
			}
			else if(match>1){
				System.out.println("Case #"+Case+": Bad magician!");
			}
			else if(match==0){
				System.out.println("Case #"+Case+": Volunteer cheated!");
			}
			
		}
		
	}
	
}
