package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1065;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class cookies {

	public static void main(String[] args){
		BufferedReader br;
		try {
		br = new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\B-small-attempt0.in"));
		String answer = "";
       // String line = br.readLine();
        int counter = Integer.parseInt(br.readLine());
        for(int i=0;i<counter;i++){
        	String[] l = br.readLine().split(" ");
        	double cost = Double.parseDouble(l[0]);
        	double rate = Double.parseDouble(l[1]);
        	double time=0;
        	double currentRate=2;
        	double target = Double.parseDouble(l[2]);
        	boolean flag = true;
        	while(flag){
        	if((target/currentRate) <=((target/(rate+currentRate))+(cost/currentRate)))
        	{
        		//enough
        		time = time+(target/currentRate);
        		flag = false;
        	} else{
        		//buy house
        		time = time+(cost/currentRate);
        		currentRate+=rate;
        	}
        	}
        	answer =answer+"Case #"+(i+1)+": "+time+"\n";
        	FileWriter writer = new FileWriter(new File("C:\\Users\\Administrator\\Desktop\\output.txt")); 
            writer.write(answer); 
            writer.flush();
            writer.close();
        }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
