package methodEmbedding.Magic_Trick.S.LYD1053;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class trick {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int i,j,k,l,x,y;
	boolean bad=false,cheat=false;
	
	int n=scn.nextInt();
	String[] answers=new String[n];
	for(i=1;i<=n;i++){
		int[] arr1=new int[4];
		int[][] arr2=new int[4][2];
		x=scn.nextInt();
		for(j=0;j<4;j++){
			for(k=0;k<4;k++){
				if(j==x-1)arr1[k]=scn.nextInt();
				else scn.nextInt();
				
			}
		}
		y=scn.nextInt();
		int count=0;
		for(j=0;j<4;j++){
			
			  for(k=0;k<4;k++){
				  if(j==y-1) arr2[k][0]=scn.nextInt();
				  else  scn.nextInt();
				}
				 
			}
				
				
	
		for(k=0;k<4;k++){
			for(j=0;j<4;j++){
				if(arr2[k][0]==arr1[j])arr2[k][1]=1;
			}
		
		}

		boolean flag1=false,flag2=false;
		
		for(k=0;k<4;k++){
			if(arr2[k][1]==1){
				if(flag1){
					answers[i-1]="Case #"+i+": Bad magician!";
					flag2=true;
					break;
				}
				else {flag1=true;
				         y=arr2[k][0];
				}
				
				
			}
		  	
		}
		if(!flag1){answers[i-1]="Case #"+i+": Volunteer cheated!";}
		else if(!flag2)answers[i-1]="Case #"+i+": "+y;
		}
	try {
		FileWriter fw= new FileWriter("output.txt");
		BufferedWriter bw=new 	BufferedWriter(fw);
		 for(k=0;k<n;k++){
			 
			bw.append(answers[k]);
			bw.newLine();
			  }
		 bw.close();
	} catch (IOException e) {
		
	}
	
	
	}
	  
   
}
