package methodEmbedding.Magic_Trick.S.LYD1158;

import java.io.*;

public class Question1 {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		
        String filePath = "./src/question1_input.txt";
        String outputFilePath = "./src/question1_output.txt";
        String line = null;
        int iteration=1;
        int first =0;
        int second=0;
        int[] firstArray =new int[4];
        int[] secondArray=new int[4];

        try {
            File file = new File(filePath);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            File out = new File(outputFilePath);
            
            if(!out.exists()) {
            	out.createNewFile();
            }
            
            FileWriter fw = new FileWriter(out.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			
            int counter =0;
            
            while((line = bufferedReader.readLine()) != null) {
            	if(counter ==1) {
            		first = Integer.parseInt(line.trim());
            	}
            	
            	if(counter -1 == first){
            		String[] words = line.split(" ");
            		for(int i=0; i<words.length; i++) {
            			firstArray[i] = Integer.parseInt(words[i]);
            		}
            	}
            	
            	if(counter==6) {
            		second = Integer.parseInt(line.trim());
            	}
            	
            	if(counter -6 == second){
            		String[] words = line.split(" ");
            		for(int i=0; i<words.length; i++) {
            			secondArray[i] = Integer.parseInt(words[i]);
            		}
            	}
            	
            	if(counter!=0 && counter %10 ==0) {
            		int matched =0;
            		int matchedNumb =0;
            		
            		for(int i=0; i<4;i++) {
            			for(int j=0; j<4; j++) {
            				if (firstArray[i] == secondArray[j]) {
            					matched++;
            					matchedNumb = firstArray[i];
            				} 
            			}
            		}
            		
            		if(matched ==1) {
            			System.out.println("Case #"+iteration+": "+matchedNumb);
            			bw.write("Case #"+iteration+": "+matchedNumb+"\n");
            		} else if(matched >1) {
            			System.out.println("Case #"+iteration+": Bad magician!");
            			bw.write("Case #"+iteration+": Bad magician!"+"\n");
            		} else{
            			System.out.println("Case #"+iteration+": Volunteer cheated!");
            			bw.write("Case #"+iteration+": Volunteer cheated!"+"\n");
            		}
            		
            		counter =0;
            		iteration++;
            	}
            	counter++;
            }
            bw.close();
            fileReader.close();
            bufferedReader.close();			
        }
        catch(FileNotFoundException ex) {
        	ex.printStackTrace();				
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }

	}

}
