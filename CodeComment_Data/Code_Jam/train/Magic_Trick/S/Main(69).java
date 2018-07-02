package methodEmbedding.Magic_Trick.S.LYD1483;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

class Main{
	public static void main(String[] args) throws IOException{
		FileReader in = new FileReader("A-small-attempt0.in");
		FileWriter out = new FileWriter("outsmall.txt");
		Scanner input = new Scanner(in);
		int t;
		t=input.nextInt();
		for(int i=0; i<t;i++){
			int a1;
			a1=input.nextInt();
			input.nextLine();
			int ar1[][]=new int[4][4];
			int ar2[][]=new int[4][4];
			
			for(int j=0;j<4;j++){
				for (int k=0; k<4; k++){
					ar1[j][k]=input.nextInt();
					
				}
			}	
			int a2;
			a2=input.nextInt();
			for(int j=0;j<4;j++){
				
				for (int k=0; k<4; k++){
					ar2[j][k]=input.nextInt();	
				}
			}
			int count=0;
			int card=0;
			for(int j=0;j<4;j++){
				for(int k=0;k<4;k++){
					if(ar1[a1-1][j]==ar2[a2-1][k]){ count++;
					card=ar1[a1-1][j];}
					
				}
			}
			out.write("Case #"+ (i+1) +": ");
			if (count==0) out.write("Volunteer cheated!");	
			else if(count>1) out.write("Bad magician!");
			else out.write(card+" ");
			out.write(System.getProperty( "line.separator")); 
			
			
			
			
		
		}
	out.close();
	
	}

}
