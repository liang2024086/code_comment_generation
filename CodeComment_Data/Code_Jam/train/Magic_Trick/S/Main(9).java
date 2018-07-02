package methodEmbedding.Magic_Trick.S.LYD1184;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutput;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;




public class Main  {

	
	
	public static void main(String[] args) {
		try {
		Scanner in;
	
			in = new Scanner(new File("A-small-attempt1.in"));
			PrintWriter out=new PrintWriter(new File("A-small-attempt1.out"));
	
		
		int tset=in.nextInt();
		for (int c = 1; c <= tset; c++) {
			
            int firstRow,secoundRow;
            
         	int []first[]=new int [4][4];
            int []second[]=new int [4][4];
         			
         			
            firstRow=in.nextInt();
         
			
			
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j <4; j++) {
					first[i][j]=in.nextInt();
				}
			}
			
			secoundRow=in.nextInt();
			

			firstRow--;
			secoundRow--;
			
			for (int i = 0; i < 4; i++) {
				
				for (int j = 0; j <4; j++) {
					second[i][j]=in.nextInt();
				}
			}
			
			int resulat[]=new int [16];
			
			
			for (int j = 0; j <4; j++) {
				resulat[first[firstRow][j]-1]++;
			}
			
			for (int j = 0; j <4; j++) {
				resulat[second[secoundRow][j]-1]++;
			}
	
			
			int count=0;
			int value=0;
			for (int i = 0; i < resulat.length; i++) {	
				
				if(resulat[i]==2){
					value=i+1;
					count++;
				}
			}
			
			
			out.print("Case #"+c+": ");
			
			if(count==1)
				out.println(value);
			else if(count==0)
				out.println("Volunteer cheated!");
			else
				out.println("Bad magician!");

			
		}

		out.flush();
		out.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
