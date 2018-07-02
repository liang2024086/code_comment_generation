package methodEmbedding.Magic_Trick.S.LYD1131;

import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.io.File;
import java.io.IOException; 
import java.io.FileNotFoundException;

public class MagicTrick2 {

	public static void main(String[] args) throws FileNotFoundException {


		Scanner kb = new Scanner(new File("A-small-attempt8.in"));


		
		int numCase = kb.nextInt();
		//System.out.println(numCase);
		int case_count = 1;	
		//System.out.println(case_count);
		while(case_count<=numCase){
		int ans1=kb.nextInt();
		//System.out.println(ans1);
		//store the 16 values into a grid
		int [] grid = new int [16];
		for(int i = 0; i <=15;i++){
			grid[i] = kb.nextInt();
		}
		
		/*Dis play grid 1
		for (int i= 1;i<=16;i++){
			System.out.print(grid[i-1]+" ");
			if(i % 4==0)
				System.out.println();
		}*/
		// ans2
		int ans2 = kb.nextInt();
		// store the 16 values into the new grid
		//System.out.println(ans2);
		int [] new_grid = new int[16];
		for(int index =0; index <=15 ; index++){
			new_grid[index]=kb.nextInt();
		}
		/*Display grid 2
		for (int i= 1;i<=16;i++){
			System.out.print(new_grid[i-1]+" ");
			if(i % 4==0)
				System.out.println();
		}*/
		
		
		int num1,num2,num3,num4,numb1,numb2,numb3,numb4;
		int pos1=(ans1-1)*4;
		int pos2=pos1+1;
		int pos3=pos2+1;
		int pos4=pos3+1;
		num1=grid[pos1];
		num2=grid[pos2];
		num3=grid[pos3];
		num4=grid[pos4];
		
		int npos1=(ans2-1)*4;
		int npos2=npos1+1;
		int npos3=npos2+1;
		int npos4=npos3+1;
		numb1=new_grid[npos1];
		numb2=new_grid[npos2];
		numb3=new_grid[npos3];
		numb4=new_grid[npos4];
		
		int match_count =0;
		int match_value =0;
		if(num1 == numb1 || num1 == numb2 || num1 == numb3 || num1 == numb4){
			match_count++;
			match_value =num1;
			
			
		}
		if(num2 == numb1 || num2 == numb2 || num2 == numb3 || num2 == numb4){
			match_count++;
			match_value =num2;
			
		}
		if(num3 == numb1 || num3 == numb2 || num3 == numb3 || num3 == numb4){
			match_count++;
			match_value =num3;
			
		}
		if(num4 == numb1 || num4 == numb2 || num4 == numb3 || num4 == numb4){
			match_count++;
			match_value =num4;
			
		}
		
		if (match_count ==1)
			System.out.println("Case #"+case_count+": "+match_value);
		else if (match_count >1)
			System.out.println("Case #"+case_count+": "+"Bad magician! ");
		else if (match_count == 0)
			System.out.println("Case #"+case_count+": "+"Volunteer cheated!");
		case_count++;
		
		//System.out.println("Match: "+ match_count);
		}
		}}
	
	










