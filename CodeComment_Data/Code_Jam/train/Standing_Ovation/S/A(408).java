package methodEmbedding.Standing_Ovation.S.LYD2180;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class A {

	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(new FileReader("/home/taras/workspace/GoogleCodeJam_Qualification/src/A-small-attempt0.in"));
			
			int t = in.nextInt();
			
			StringBuilder resultBuilder = new StringBuilder();
			
			for(int i = 0; i < t; i++){
				int Smax = in.nextInt();
				
				String line = in.nextLine();
				//remove ' '
				line = line.substring(1, line.length());
				
				int suma = 0;
				int currentRes = 0;
				int currentValue = 0;
				
				for(int j=0; j<line.length(); j++){
					currentValue = (int)(line.charAt(j)-'0');
					
					if(currentValue>0 && j>suma){
						currentRes+=j - suma;
						suma = j;
					}
					
					suma += currentValue;
					
					//System.out.println("line:"+i+" item:"+currentValue);
				}

				resultBuilder.append("Case #"+(i+1)+": "+currentRes);
				if (i < t - 1) resultBuilder.append("\n");
				//System.out.println("line:"+line+" length:"+line.length());
			}
			
			System.out.println(resultBuilder.toString());
			String content = resultBuilder.toString();
			 
			File file = new File("/home/taras/workspace/GoogleCodeJam_Qualification/src/a.out");
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
