package methodEmbedding.Magic_Trick.S.LYD1351;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (new BufferedInputStream(System.in));
		 
		 int caseNum=sc.nextInt(); 
	 
		 
		 int counter=1;
		 while(counter<=caseNum)
		 { 
			 int row1=sc.nextInt();
			 //System.out.println("row1 "+row1);
			 int [] [] cards1=new int [4][4];
			 
			 for(int i=0;i<4*4;i++)
			 {  
				 cards1[i/4][i%4]=sc.nextInt();
//				 System.out.print(cards1[i/4][i%4]+" ");
//				 if(i%4==3)
//					 System.out.println();
			 }
			 
		 
			 
			 int row2=sc.nextInt();
			 //System.out.println("row2 "+row2);
			 int [] [] cards2=new int [4][4];
			 
			 for(int i=0;i<4*4;i++)
			 {  
				 cards2[i/4][i%4]=sc.nextInt();
//				 System.out.print(cards2[i/4][i%4]+" ");
//				 if(i%4==3)
//					 System.out.println();
			 }
			 
			 
			 int sameIntNumInRow=0;
			 //check ??????????
			 int selectedCard=-1;
			 for(int k=0;k<4;k++)
			 {
				 for(int j=0;j<4;j++)
				 {
					 if(cards1[row1-1][k]==cards2[row2-1][j])
						 {
						 	selectedCard=cards1[row1-1][k];
						 	sameIntNumInRow++;
						 	 //System.out.println("selectedCard:	"+selectedCard);
						 	//break;
						 }
				 }
				 
			 }
			 
			 //
			 if( selectedCard==-1)
			 {
				 System.out.println("Case #"+counter+": Volunteer cheated!");
			 }
			 else
			 {  
				  int sameNum=0;
				  for( int row =0;row<4;row++)
				  {
					  for(int col=0;col<4;col++)
					  {
						  if(cards1[row][col]==cards2[row][col])
						  {
							  sameNum++;  
						  }
					  }
				  }
				  if(sameNum==16)
				  {
					  System.out.println("Case #"+counter+": Bad magician!");
					 
				  }
				  else  
				  { 
					  if(sameIntNumInRow>1) //????????????????????
						  System.out.println("Case #"+counter+": Bad magician!");
					  else
					  //?????????? 
					  System.out.println("Case #"+counter+": "+selectedCard); 
				  }
					  
				 
			 }
				
			 
			 counter++;
		 }
		 
		 
		 
	}
 
 
}
