package methodEmbedding.Magic_Trick.S.LYD1292;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;


public class MagicTrick {

	public static void main(String[] args) throws IOException {
	
		int testCases, ans1, ans2, flag = 0;
		int arr1[][]= new int[4][4];
		int arr2[][]= new int[4][4];
		int Diff[][]=new int[4][4];
		String out[]=new String[500];
		String str = "";

		//Scanner in=new Scanner(System.in);
		Scanner in = new Scanner(new FileReader("input.txt"));
		
		testCases=in.nextInt();
		
		for(int k=0;k<testCases;k++){	
			
			ans1=in.nextInt();
			
		
			for (int i=0;i<4;i++){
				for (int j=0;j<4;j++){
					arr1[i][j]=in.nextInt();
				}
			}
			
			ans2=in.nextInt();
			
			for (int i=0;i<4;i++){
				for (int j=0;j<4;j++){
					arr2[i][j]=in.nextInt();
				}
			}
			
			for (int i=0;i<4;i++){
				for (int j=0;j<4;j++){
					Diff[i][j]=arr1[(ans1-1)][i]-arr2[(ans2-1)][j];

					//System.out.println(arr1[(ans1-1)][i]+"-"+arr2[(ans2-1)][j]+"= "+Diff[i][j]);
					
					if (Diff[i][j]==0){
						if (flag==0){
						out[k]=String.valueOf(arr1[(ans1-1)][i]);
						}
						else{
						out[k]="Bad magician!";
						}
						
						flag=1;
					}
					
				}
			}
			
			if(flag==0){
				out[k]="Volunteer cheated!";
			}
		
		flag=0;
	}
		for (int k=0;k<testCases;k++){
			str=str+"Case #"+(k+1)+": "+out[k]+String.format("%n").intern();			
		}
		
		Writer output = new BufferedWriter(new FileWriter("output.txt"));
	    try {
	      //FileWriter always assumes default encoding is OK!
	      output.write(str);
	    }
	    finally {
	      output.close();
	    }
		
	    in.close();
	}

}
