package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1460;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CookieClickerAlpha {

	
	public static void main(String[] args) throws IOException {
		int T=0;
		
		List<double[]> list = new ArrayList<double[]>();
		Scanner scanner = new Scanner(new File("B-small-attempt0.in"));
		T=scanner.nextInt();
		while(scanner.hasNext()){
    		
		for(int i=0;i<T;i++){
			double sets[]=new double[3];
			sets[0]=Double.parseDouble(scanner.next()); //C
			sets[1]=Double.parseDouble(scanner.next()); //F
			sets[2]=Double.parseDouble(scanner.next()); //X
			list.add(sets);
		}
    	}
		scanner.close();
		 File file = new File("output.txt");
		 
			if (!file.exists()) {
				file.createNewFile();
			}

		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		//the main function.
		for(int i=0;i<T;i++){
			int cookieFarm=0;
			double time=0.0;
			double totalTime=0.0;
			while(true){
		       double normal= ((list.get(i))[2]-(list.get(i))[0])/(2+(cookieFarm)*(list.get(i))[1]);
			   double difference= (list.get(i))[2]/(2+(cookieFarm+1)*(list.get(i))[1]);
				  if(difference<normal){
					time=(list.get(i))[0]/(2+cookieFarm*(list.get(i))[1]);
					cookieFarm+=1;  
					totalTime+=time;
					time=0;
				}else{
					time=((list.get(i))[2])/(2+cookieFarm*(list.get(i))[1]);
					totalTime+=time;
					break;
				}
			}
			
		bw.write("Case #"+(i+1)+": "+totalTime);
		bw.newLine();
		}
		bw.close();
	}

}
