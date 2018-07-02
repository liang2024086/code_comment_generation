package methodEmbedding.Standing_Ovation.S.LYD1708;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;

public class clap {
	public static void main(String[] args){
		FileReader inputFile;
		try {
			inputFile = new FileReader("C:/Bandana/jira workspace/NewProject/src/A-small-attempt0.in");
			File fout = new File("C:/Users/I069073/Desktop/out.txt");
			FileOutputStream fos = new FileOutputStream(fout);
		 
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
			
        BufferedReader bufferReader = new BufferedReader(inputFile);
        String line;
        Integer cases = Integer.parseInt(bufferReader.readLine());
       
        for(int i=0;i<cases;i++){
        	String[] values = bufferReader.readLine().split(" ");
        	int maxShyness = Integer.parseInt(values[0]);
        	char[] people = values[1].toCharArray();
        	int totalPeopleStanding = 0;
        	int noOfPeople = 0;
        	int extraPeople = 0;
        	int morePeople = 0;
        	
        	for(int j=0;j<=maxShyness;j++){
        		noOfPeople = people[j] - '0';  
        		if(j > totalPeopleStanding){
        			morePeople = 0;
        			morePeople = j - totalPeopleStanding;
        			extraPeople = extraPeople + morePeople;
        			totalPeopleStanding = totalPeopleStanding + morePeople;
        		}
        		totalPeopleStanding = totalPeopleStanding + noOfPeople;
        		
        	}
        	
        	int caseNo = i + 1;
        	String output = "Case #"+caseNo+": "+extraPeople;
        	System.out.println(output);
    		bw.write(output);
    		bw.newLine();
        }
        
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


