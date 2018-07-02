package methodEmbedding.Magic_Trick.S.LYD213;

import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class Magician{
	
	public static void main(String args[])throws IOException{
		File output1= new File("Output_Small.txt");
		FileWriter fw1 = new FileWriter(output1.getAbsoluteFile());
		BufferedWriter bw1 = new BufferedWriter(fw1);

		try{
			DataInputStream br=new DataInputStream(new BufferedInputStream(new FileInputStream("A-small-attempt0.in")));
			String s=br.readLine().trim();int totcase=Integer.parseInt(s);
			for(int i=0;i<totcase;i++){String[] arra=new String[4];String[] arrb=new String[4];
				String tempa=br.readLine();int a=Integer.parseInt(tempa);
				for(int j=0;j<4;j++){String rowa=br.readLine().trim();if(j==a-1){arra=rowa.split(" ");}else{} }

				String tempb=br.readLine();int b=Integer.parseInt(tempb);
				for(int k=0;k<4;k++){String rowb=br.readLine().trim();if(k==b-1){arrb=rowb.split(" ");}else{}	}

				int common=0;String tempans="";
				for(int l=0;l<4;l++){
					for(int m=0;m<4;m++){
						if(arra[l].trim().equals(arrb[m].trim())){common=common+1;if(common==1){tempans=arrb[m];} }
					}
				}

				String ans="";
				if(common==0){ans="Volunteer cheated!";}
				else if(common==1){ans=tempans;}
				else{ans="Bad magician!";}
				System.out.println("Case #"+(i+1)+": "+ans);
				bw1.write("Case #"+(i+1)+": "+ans);bw1.newLine();bw1.flush();
			}
		}
		catch(IOException e){
			System.out.println("File Not Found!!");
		}
	}
}
