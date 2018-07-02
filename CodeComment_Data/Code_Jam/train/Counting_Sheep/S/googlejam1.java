package methodEmbedding.Counting_Sheep.S.LYD1128;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class googlejam1 {

	public static void main (String args[]){
	List<String> fichierin = new ArrayList<String>();
	List<String> fichierout = new ArrayList<String>();
	String fileNamein = "A-small-attempt3.in";
try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileNamein);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
            String line;
            while((line = bufferedReader.readLine()) != null) {
                fichierin.add(line);
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileNamein + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileNamein + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
		int nbtest = Integer.parseInt(fichierin.get(0));
		int i, tmpI, k;
		List<Integer> liste = new ArrayList<Integer>();
		for(int m=0; m<nbtest; m++){
			tmpI = Integer.parseInt(fichierin.get(m+1));
			liste = new ArrayList<Integer>();
			for(int j = 0; j<10; j++){
				liste.add(j);
			}
			for(i = 0, k=tmpI; i<100; i++, k=tmpI*i){
				for(int l=k; l!=0;){
					if(liste.contains(l%10)){
						liste.remove(liste.indexOf(l%10));
					}
					l/=10;
				}
				if(liste.isEmpty())break;
			}
			if(i==100){
				//System.out.println("INSOMNIA");
				fichierout.add("INSOMNIA");
			}else{
//				System.out.println(k);
				fichierout.add(""+k);
			}
		}
		String fileName = "temp.txt";

        try {
            // Assume default encoding.
            FileWriter fileWriter =
                new FileWriter("fichierout.in");

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);

            // Note that write() does not automatically
            // append a newline character.
            int x=1;
		for(String tmpS : fichierout){
            bufferedWriter.write("Case #"+x+": " + tmpS);
            bufferedWriter.newLine();
            	x++;
}

            // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
	}
}
