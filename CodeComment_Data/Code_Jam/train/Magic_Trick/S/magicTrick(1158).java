package methodEmbedding.Magic_Trick.S.LYD1925;

import java.io.*;

public class magicTrick{
	public static void main(String [] args){
		int winner=0;
		int [] fstRow = new int [4];
		int [] sndRow = new int [4];
		int [][] board= new int [4][4];
		int choice=0;
		int testCases=0;
		int count=0;
		int output=1;
		try{
			BufferedReader br= new BufferedReader(new FileReader(args[0]));
			String line=br.readLine();
			BufferedWriter bw= new BufferedWriter(new FileWriter("output.txt"));
			
			
			String [] tmp = line.split(" ");
			testCases=Integer.parseInt(tmp[0]);
			
			while (testCases>0){
			
				for (int i = 0; i<5; i++){
					line=br.readLine();
					tmp=line.split(" ");
					if (i==0) {
						choice=Integer.parseInt(tmp[0]);
					}
					if (i==choice){
						for (int j = 0; j<4 ; j++){
							fstRow[j]=Integer.parseInt(tmp[j]);
						}
					}
				}
				
				for (int i = 0; i<5; i++){
					line=br.readLine();
					tmp=line.split(" ");
					if (i==0) {
						choice=Integer.parseInt(tmp[0]);
					}
					if (i==choice){
						for (int j = 0; j<4 ; j++){
							sndRow[j]=Integer.parseInt(tmp[j]);
						}
					}
				}
				
				for (int i = 0; i < 4; i++){
					for (int j = 0; j < 4; j++){
						if (fstRow[i]==sndRow[j]){
							count++;
							winner=fstRow[i];
						}
					}
				}
				
					
					
					String caseNum = "Case #";
					bw.write(caseNum);
					
					if (output==100){
						bw.write(49);
						bw.write(48);
						bw.write(48);
					}else if (output>89){
							bw.write(57);
							bw.write((output%10)+48);
					}else if (output>79){
							bw.write(56);
							bw.write((output%10)+48);
					}else if (output>69){
							bw.write(55);
							bw.write((output%10)+48);
					}else if (output>59){
							bw.write(54);
							bw.write((output%10)+48);
					}else if (output>49){
							bw.write(53);
							bw.write((output%10)+48);
					}else if (output>39){
							bw.write(52);
							bw.write((output%10)+48);
					}else if (output>29){
							bw.write(51);
							bw.write((output%10)+48);
					}else if (output>19){
							bw.write(50);
							bw.write((output%10)+48);
					}else if (output>9){
							bw.write(49);
							bw.write((output%10)+48);
					}else bw.write(output+48);
					
					bw.write(": ");
					if (count==0) bw.write("Volunteer cheated!");
					if (count==1){
						if (winner>9){
							bw.write(49);
							bw.write(winner+38);
						}else	bw.write(winner+48);
					}
					if (count>1) bw.write("Bad magician!");
					bw.newLine();
					bw.flush();
					output++;
					count=0;
			}
			
			bw.close();
			
		}catch (Exception e){}
	}
}
