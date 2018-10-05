package methodEmbedding.Standing_Ovation.S.LYD1473;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class PbA {

	public static void main(String[] args) {
		try {
			String input = "pbA-small";
			BufferedReader inputStream = new BufferedReader(new FileReader(input+".in"));
			FileWriter f = new FileWriter(input+".out");
			String l = inputStream.readLine();
			int nbCases = Integer.parseInt(l);
			for (int i = 1; i<=nbCases; i++){
				l = inputStream.readLine();
				String[] pos = l.split(" ");
				int Smax = Integer.parseInt(pos[0]);
				if(Smax>0){
					char[] Sis=pos[1].toCharArray();
					int extra=0;
					int partialSum=Character.getNumericValue(Sis[0]);
					for(int Si=1;Si<=Smax;++Si){
						while(partialSum<Si){
							extra++;
							partialSum++;
						}
						partialSum+=Character.getNumericValue(Sis[Si]);
					}	
					f.write("Case #"+i+": " + extra + "\n");	
				}else{
					f.write("Case #"+i+": 0\n");	
				}
			}
			f.close();
		}catch (Exception e){e.printStackTrace();}
	}

}
