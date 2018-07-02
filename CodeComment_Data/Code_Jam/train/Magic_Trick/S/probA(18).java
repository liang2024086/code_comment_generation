package methodEmbedding.Magic_Trick.S.LYD1247;

import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class probA {

	public static void main(String[] args) throws FileNotFoundException {
		File inputFile = new File("C:\\Users\\elnino\\Downloads\\A-small-attempt0.in");
		Scanner readingInputs= new Scanner(inputFile);
		int N = readingInputs.nextInt();
		for(int i=1; readingInputs.hasNext();i++ ){
			System.out.print("Case #"+i+": ");
			int [] [] a= new int [4][4];
			int [] [] b= new int [4][4];
			int[] r1 =new int [4];
			int[] r2 =new int [4];
			
			int a1= readingInputs.nextInt();
			for (int l=0; l<4; l++){
				for(int m=0; m<4; m++){
					a[l][m]= readingInputs.nextInt();
				}
			}
			
			r1 = a[a1-1];
			int a2= readingInputs.nextInt();
			for (int l=0; l<4; l++){
				for(int m=0; m<4; m++){
					b[l][m]= readingInputs.nextInt();
				}
			}
			r2 = b[a2-1];
			int count=0;
			int temp=0;
			for (int j = 0; j < r2.length; j++) {
				for (int k = 0; k < r2.length; k++) {
					if (r1[j]==r2[k]) {
						count++;
						temp= r1[j];
					}
				}
			}
			
			if (count==0) {
				System.out.println("Volunteer cheated!");
			}
			else if (count==1) {
				System.out.println(temp);				
			}
			else if(count>1) 
				System.out.println("Bad magician!");
		}
		
	}

}
