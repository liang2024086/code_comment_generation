package methodEmbedding.Magic_Trick.S.LYD242;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class magic {

	
	public static void main(String[] args){
		BufferedReader br;
		try {
	    br = new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\A-small-attempt1.in"));
		String answer = "";
       // String line = br.readLine();
        int counter = Integer.parseInt(br.readLine());
        for(int i=0;i<counter;i++){
        	int firstChoice = Integer.parseInt(br.readLine());
        	String firstRow="";
        	for(int j=1;j<5;j++)
        	{
        		if(firstChoice==j)firstRow=br.readLine();
        		else br.readLine();
        	}
        	int secondChoice = Integer.parseInt(br.readLine());
        	String secondRow="";
        	for(int j=1;j<5;j++)
        	{
        		if(secondChoice==j)secondRow=br.readLine();
        		else br.readLine();
        	}
        	
        	String[] firstRowNumbers = firstRow.split(" ");
        	String[] secondRowNumbers = secondRow.split(" ");
        	int choice=0;//0 for normal 2-4 for bad 10 for cheat
        	String picked="";
        	for(int j=0;j<4;j++){
        		for(int kk=0;kk<4;kk++){
        			if(firstRowNumbers[kk].compareTo(secondRowNumbers[j])==0){
        			//	System.out.println(firstRowNumbers[kk]+ "  "+ secondRowNumbers[j]);
        				choice++;
        				firstRowNumbers[kk]="a";
        			picked=secondRowNumbers[j];
        			
        		}

        		}
        		        	}
        	if(choice == 0){
        	answer =answer+"Case #"+(i+1)+": "+"Volunteer cheated!"+"\n";
        	} else if(choice >1){
        	answer =answer+"Case #"+(i+1)+": "+"Bad magician!"+"\n";
        	} else{
        	answer =answer+"Case #"+(i+1)+": "+picked+"\n";
        	}
        }
        FileWriter writer = new FileWriter(new File("C:\\Users\\Administrator\\Desktop\\output.txt")); 
        writer.write(answer); 
        writer.flush();
        writer.close();
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

