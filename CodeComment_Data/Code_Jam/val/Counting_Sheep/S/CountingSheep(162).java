package methodEmbedding.Counting_Sheep.S.LYD393;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;


public class CountingSheep {

	public static void main (String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new FileReader("A-small.in"));
		FileWriter fw = new FileWriter("A-small.out");
		/*BufferedReader in = new BufferedReader(new FileReader("B-large.in"));
		FileWriter fw = new FileWriter("B-large.out");*/
		long testCaseCount = Integer.parseInt(in.readLine());
		for(int i=0;i<testCaseCount;i++){
			String[] values = new String[10];
			long initialNumber = Integer.parseInt(in.readLine());
			long currentNumber = initialNumber;
			if(initialNumber == 0){
				fw.write("Case #" + (i+1) + ": INSOMNIA"+"\n");
			}else{
				boolean slept = false;
				long j = 1;
				while(!slept){
					currentNumber = initialNumber*j;
					
					long modNum = currentNumber;
					while(modNum > 0){
						long digitVal = modNum % 10;
						values[(int)digitVal] = "OK";
						modNum = modNum / 10;
					}
					for(int k = 0;k<values.length;k++){
						String val = values[k];
						if(null == val){
							slept = false;
							break;
						}else{
							slept = true;
						}
					}
					if(slept){
						fw.write("Case #" + (i+1) + ": " +currentNumber+"\n");
					}
					j++;
				}

			}
		}
		fw.close();
		in.close();
	}
}
