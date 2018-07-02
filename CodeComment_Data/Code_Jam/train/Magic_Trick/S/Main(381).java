package methodEmbedding.Magic_Trick.S.LYD1978;

import java.io.*;//for file and ioexception
import java.util.Scanner;//for scanner
public class Main {
	public static void main (String[] args){
		int numCases;
		int[][] arrCards=new int[4][4];
		int[] arrPoss1=new int[4];
		int[] arrPoss2=new int[4];
		int row1;
		int row2;
		try{
			Scanner reader=new Scanner(new File("input2.txt"));
			PrintWriter writer=new PrintWriter(new File("output2.txt"));
			numCases=reader.nextInt();
			//System.out.print("Number of Cases:"+numCases);
			for (int i=0; i<numCases;i++){
				row1=reader.nextInt();
				for (int x=0;x<4;x++){
					for (int y=0;y<4;y++){
						arrCards[x][y]=reader.nextInt();
					}
				}
				for (int z=0;z<4;z++){
					arrPoss1[z]=arrCards[row1-1][z];
				}
				row2=reader.nextInt();
				for (int x=0;x<4;x++){
					for (int y=0;y<4;y++){
						arrCards[x][y]=reader.nextInt();
					}
				}
				for (int z=0;z<4;z++){
					arrPoss2[z]=arrCards[row2-1][z];
				}
				//test
				boolean exists=false;
				boolean bad=false;
				int cardNum=0;
				for (int k=0;k<4;k++){
					for (int l=0;l<4;l++){
						if (arrPoss1[k]==arrPoss2[l]){
							if (exists==false){
								exists=true;
								cardNum=arrPoss1[k];
							}
							else if(exists==true){
								bad=true;
							}
						}
					}
				}
				int caseNum=i+1;
				if (exists==false){
					//System.out.print("Case #"+caseNum+": Bad magician!\n");
					writer.println("Case #"+caseNum+": Volunteer cheated!\n");
				}
				else if(bad==true){
					//System.out.print("Case #"+caseNum+": Volunteer cheated!\n");
					writer.println("Case #"+caseNum+": Bad magician!\n");
				}
				else if(exists==true&&bad==false){
					//System.out.print("Case #"+caseNum+": "+cardNum+"\n");
					writer.println("Case #"+caseNum+": "+cardNum+"\n");
				}
			}
			writer.close();
		}
		catch(Exception e){
			System.out.print("Error");
		}
}
}
