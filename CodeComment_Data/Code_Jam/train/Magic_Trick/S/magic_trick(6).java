package methodEmbedding.Magic_Trick.S.LYD2226;

import java.io.*;


public class magic_trick {
	public static void main(String arg[]){
		FileInputStream fstream;
		DataInputStream in;
		BufferedReader br;
		String strLine;
		
		try{
			//Initial input file
			fstream = new FileInputStream("A-small-attempt0.in");
			in = new DataInputStream(fstream);
			br = new BufferedReader(new InputStreamReader(in));
			
			//read firstLine, get the case number
			int caseNum = Integer.valueOf(br.readLine());
			
			for(int i=1;i<=caseNum;i++){ //loop all cases
				
				//get first question
				int firstAns = Integer.valueOf(br.readLine());
				int[] firstOrder = new int[16];
				for(int j=0;j<4;j++){ //get the first card order
					String[] lineSpilt = br.readLine().split(" ");
					firstOrder[j*4] = Integer.valueOf(lineSpilt[0]);
					firstOrder[j*4+1] = Integer.valueOf(lineSpilt[1]);
					firstOrder[j*4+2] = Integer.valueOf(lineSpilt[2]);
					firstOrder[j*4+3] = Integer.valueOf(lineSpilt[3]);
				}
				
				//get second question
				int secondAns = Integer.valueOf(br.readLine());
				int[] secondOrder = new int[16];
				for(int j=0;j<4;j++){ //get the first card order
					String[] lineSpilt = br.readLine().split(" ");
					secondOrder[j*4] = Integer.valueOf(lineSpilt[0]);
					secondOrder[j*4+1] = Integer.valueOf(lineSpilt[1]);
					secondOrder[j*4+2] = Integer.valueOf(lineSpilt[2]);
					secondOrder[j*4+3] = Integer.valueOf(lineSpilt[3]);
				}
				
				
				int ans = 0;
				int sameCounter = 0;
				
				for(int k=0;k<4;k++){
					int compareNum = firstOrder[(firstAns-1)*4+k];
					for(int l=0;l<4;l++){
						if(compareNum == secondOrder[(secondAns-1)*4+l]){
							sameCounter++;
							ans = compareNum;
							break;
						}
					}
				}
				
				if(sameCounter == 0){
					System.out.println("Case #" + i + ": Volunteer cheated!");
				}else if(sameCounter == 1){
					System.out.println("Case #" + i + ": " + ans);
				}else{
					System.out.println("Case #" + i + ": Bad magician!");
				}
				
				
			}
			
			in.close();
		}catch(Exception e){
			e.printStackTrace();
			return;
		}
		
		
		
	}
}
