package methodEmbedding.Standing_Ovation.S.LYD1745;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Main{

	public static void main(String [] args)throws IOException{
		
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		try{
			fr = new FileReader("A-small-attempt0.in");
			br = new BufferedReader(fr);
			
			fw = new FileWriter("A-Small-attempt0.out", false);
			bw = new BufferedWriter(fw);
			
			int nTestCase;
			nTestCase = Integer.parseInt(br.readLine());
			int TestResult[] = new int[nTestCase];
			
			for(int i = 0; i < nTestCase; i++){

				int nNeed = 0;
				int nTemp = 0;
				String str = br.readLine();
				String splitstr[] = str.split(" ");
				String str1 = splitstr[0];
				String str2 = splitstr[1];
				int nSmax = Integer.parseInt(str1);
				int nSi[] = new int[nSmax+1];
				int nSum = 0;
				for(int j = 0; j <= nSmax; j++){
					nSi[j] = Integer.parseInt(str2.substring(j,j+1));
				}
				for(int j = 0; j<=nSmax ; j++){
					
					if(nTemp <= nSum){
						nTemp = nSum;
					}
					nSum = 0;
					for(int k = 0; k < j; k++){
						nSum += nSi[k];
					}
					nSum = j-nSum;
					if(nSum > nTemp){
						nNeed = nSum;
					}
				}
//				if(nNeed < 0){
//					nNeed = 0;
//				}
				TestResult[i] = nNeed;
				
			}
			for(int i = 0; i < nTestCase; i++){
				System.out.println("Case #" +(i+1) + ": " + TestResult[i]);
				bw.write("Case #" +(i+1) + ": " + TestResult[i]);
				bw.newLine();
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(br!= null) try{br.close();}catch(IOException e){}
			if(fr!= null) try{fr.close();}catch(IOException e){}
			if(bw!= null) try{bw.close();}catch(IOException e){}
			if(fw!= null) try{fw.close();}catch(IOException e){}
		}
		
	}


}
