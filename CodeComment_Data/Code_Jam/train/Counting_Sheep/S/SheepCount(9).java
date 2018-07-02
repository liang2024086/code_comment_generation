package methodEmbedding.Counting_Sheep.S.LYD223;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;

public class SheepCount {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));
		try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
		    int n = Integer.parseInt(br.readLine());
		    String line;
		    for(int i=0;i<n;i++){
		    	HashSet<Integer> digits = new HashSet<>();
		    	int flag=0;
		    	int count=1;
		     int input = Integer.parseInt(br.readLine());
		     int original=input;
		     while(input!=0){
		    	 int source=input,originalSource=input;
		    	 count++;
		    	 while(source!=0){
		    		 digits.add(source%10);
		    		 source=source/10;
		    	 }
		    	 
		    	 if(digits.size()==10){
		    		 //System.out.println("Case #"+(i+1)+": "+originalSource);
		    		 bw.write("Case #"+(i+1)+": "+originalSource+"\n");
		    		 flag=1;
		    		 break;
		    	 }
		    	 input=original*count;
		     }
		     if(flag==0){
		    	 //System.out.println("Case #"+(i+1)+": INSOMNIA");
		    	 bw.write("Case #"+(i+1)+": INSOMNIA"+"\n");
		     }
		    }
		    
		}
		catch(Exception e){
			
		}
		bw.close();
	}

}
