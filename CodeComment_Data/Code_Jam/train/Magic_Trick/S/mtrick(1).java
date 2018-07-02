package methodEmbedding.Magic_Trick.S.LYD2053;

import java.io.*;
import java.util.*;

public class mtrick{

	public mtrick(){
	
	}
	public static void main(String arg[]){
	
		int loop,i,turn1,turn2,j,k,match,num;
		int matrx1[][]=new int[4][4];
		int matrx2[][]=new int[4][4];
		try{
		
			Scanner s=new Scanner(new File("A-small-attempt0.in"));
			PrintWriter pw=new PrintWriter("A-small-attempt0.out");
			loop=s.nextInt();
			i=0;
			while(i<loop){
			
				turn1=s.nextInt();
				for(j=0;j<4;j++){
				
					for(k=0;k<4;k++){
					
						matrx1[j][k]=s.nextInt();
					}
				}
				turn2=s.nextInt();
				for(j=0;j<4;j++){
				
					for(k=0;k<4;k++){
					
						matrx2[j][k]=s.nextInt();
					}
				}
				match=0;
				num=0;
				pw.print("Case #"+(i+1)+": ");
				for(j=0;j<4;j++){
				
					for(k=0;k<4;k++){
					
						if(matrx1[turn1-1][j]==matrx2[turn2-1][k]){

							num=matrx1[turn1-1][j];
							match++;
						}
					}	
				}
				if(match==1){
				
					pw.println(num);
				}
				if(match>1){
				
					pw.println("Bad magician!");
				}
				if(match==0){
				
					pw.println("Volunteer cheated!");
				}
				pw.flush();
				i++;
			}
			
		}catch(Exception e){
		
			e.printStackTrace();
		}
	}
}
