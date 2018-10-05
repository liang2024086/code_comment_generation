package methodEmbedding.Magic_Trick.S.LYD943;

import java.io.*;
import java.util.*;

public class MagicTrick {
	public static void main(String args[]) throws IOException{
	   	 Scanner scan=new Scanner(new File("A-small-attempt1.in"));
	   	 PrintWriter pw=new PrintWriter(new File("result.txt"));
	   	 int caseNum=Integer.parseInt(scan.nextLine());
	   	 for(int i=1;i<=caseNum;i++){
	   		 String result="";	  
	   		 HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
	   		 int count=0;
	   		 int rowNum1=scan.nextInt();
	   	 	 //System.out.println(rowNum1); 
	   		 int[][] array1=new int[4][4];
	   		 for(int j=0; j<4;j++){
	   			 for(int k=0;k<4;k++){
	   				 array1[j][k]=scan.nextInt();
	   				 //System.out.print(array1[i][j]);
	   				 
	   			 }	  
	   			//System.out.print('\n');
	   		 }
	   		 for(int j=0; j<4;j++){
	   			 hm.put(array1[rowNum1-1][j], array1[rowNum1-1][j]); 	
	   			 //System.out.println(array1[rowNum1-1][j]);
	   		 }
	   		 int rowNum2=scan.nextInt();
	   		 //System.out.println(rowNum2); 
	   		 int[][] array2=new int[4][4];
	   		 for(int j=0; j<4;j++){
	   			 for(int k=0;k<4;k++){
	   				array2[j][k]=scan.nextInt();
	   				//System.out.print(array2[i][j]);	   				 
	   			 }	
	   			//System.out.print('\n');
	   		 }	  
	   		 //System.exit(1);
	   		 for(int j=0;j<4;j++){
	   			 if(hm.containsKey(array2[rowNum2-1][j])) {
	   				 //System.out.println(array2[rowNum2-1][j]+" "+count);
	   				 result=array2[rowNum2-1][j]+"";
	   				 count++;
	   			 }
	   		 }
	   		 if(count==0){
	   			 result="Volunteer cheated!";
	   		 }else if(count>1){
	   			 result="Bad magician!";
	   		 }
	   		 
	   		 pw.println("Case #"+i+": "+result);
	   		 System.out.println("Case #"+i+": "+result);
	   	 }
	   	 pw.flush();
	   	 pw.close();
	    }
		
}
