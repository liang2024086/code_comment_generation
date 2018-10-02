package methodEmbedding.Magic_Trick.S.LYD2093;


import java.io.*;
import java.util.*;

public class MagicTrick{
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("C:\\eclipse\\workspace\\java_test\\src\\MagicTrick\\A-small-attempt0.in"));  
		FileWriter out = new FileWriter("C:\\eclipse\\workspace\\java_test\\src\\MagicTrick\\A-small-attempt0.out");  

		int T = in.nextInt();

		for(int round=1;round<=T;round++){
			int select1 = in.nextInt();
			int[] numAry1=new int[4];
			for(int i=0;i<4;i++){//run 4
				for(int j=0;j<4;j++){//run 4
					if(i+1==select1){
						numAry1[j]=in.nextInt();
					}else{
						in.nextInt();
					}
				}
			}
			int select2 = in.nextInt();
			int[] numAry2=new int[4];
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					if(i+1==select2){
						numAry2[j]=in.nextInt();
					}else{
						in.nextInt();
					}
				}
			}
			
			int sameTimes=0;
			int sameNum=0;
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					if(numAry1[i]==numAry2[j]){
						sameTimes++;
						if(sameTimes==1){
							sameNum=numAry1[i];
						}
					}
				}
				
			}
			
			if(sameTimes==0){
            	out.write("Case #"+round+": Volunteer cheated!\n");
			}else if(sameTimes==1){
				out.write("Case #"+round+": "+ sameNum+"\n");
			}else{
				out.write("Case #"+round+": Bad magician!\n");
			}
		}
		in.close();
        out.flush();
        out.close();
	}
}
