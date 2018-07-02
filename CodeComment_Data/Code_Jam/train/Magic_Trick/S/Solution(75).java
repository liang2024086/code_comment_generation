package methodEmbedding.Magic_Trick.S.LYD1977;

import java.util.*;
import java.io.*;

public class Solution{

    public static void main(String[] arg) throws Exception{
	     Scanner sc=new Scanner(new File("smallinput.txt")); 
	     int T=sc.nextInt();
	     
		 for(int i=0;i<T;i++){
		    HashSet<Integer> mySet=new HashSet<Integer>();
			int answer1=sc.nextInt();
			for(int j=1;j<answer1;j++){
			   for(int k=0;k<4;k++){
			      sc.nextInt();
			   }
			}
			for(int j=0;j<4;j++){
			   mySet.add(sc.nextInt());
			}
			for(int j=answer1;j<4;j++){
			   for(int k=0;k<4;k++){
			      sc.nextInt();
			   }
			}
			int answer2=sc.nextInt();
			for(int j=1;j<answer2;j++){
			   for(int k=0;k<4;k++){
			      sc.nextInt();
			   }
			}
			int count=0,value=-1;
			for(int j=0;j<4;j++){
			   int temp=sc.nextInt();
			   if(mySet.contains(temp)){
			      count++;
				  value=temp;
			   }
			}
			for(int j=answer2;j<4;j++){
			   for(int k=0;k<4;k++){
			      sc.nextInt();
			   }
			}
			if(count==0){
			  System.out.println("Case #"+(i+1)+": Volunteer cheated!");
			}else if(count==1){
			  System.out.println("Case #"+(i+1)+": "+value);
			}else{
			  System.out.println("Case #"+(i+1)+": Bad magician!");
			}
		 }
	}


}
