package methodEmbedding.Magic_Trick.S.LYD1296;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.*;


public class Magician {
	public static void main(String[] args) {
		
		try{
			BufferedReader br = new BufferedReader(new FileReader(new File ("D:\\eclipse\\workspace\\gcj14\\src\\inp1.txt")));
			List<String> al = new ArrayList<String>();
			String line=null;
			while ((line=br.readLine())!=null){
				al.add(line);
			}
			br.close();
			String[] ar = al.toArray(new String[al.size()]);
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File ("D:\\eclipse\\workspace\\gcj14\\src\\op1.txt")));
			
			int totCntr=1;
			for (int i=1;i<ar.length;i++){
				int firstArg = Integer.parseInt(ar[i]);
				i+=firstArg;
				String firstSt=ar[i];
				i+=(4-firstArg)+1;
				int secondArg = Integer.parseInt(ar[i]);
				i+=secondArg;
				String secondSt=ar[i];
				i+=(4-secondArg);
				
				
				String[] ar1=firstSt.split(" ");
				String[] ar2=secondSt.split(" ");
				List al1=Arrays.asList(ar1);
				boolean f=false;int cntr=0;String no="";
				for(int j=0;j<ar2.length;j++){
					if (al1.contains(ar2[j])){
						f=true;cntr++;no=ar2[j];
						}
				}
					if (f){
						if (cntr==1){
							bw.write("Case #"+totCntr+": "+no+"\n");
						}
						else if (cntr>1){
						    bw.write("Case #"+totCntr+": Bad magician!\n");
						}
					}
					else{
					    bw.write("Case #"+totCntr+": Volunteer cheated!\n");
						 		
					}
					totCntr++;
				}
				
			bw.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
	}

}
