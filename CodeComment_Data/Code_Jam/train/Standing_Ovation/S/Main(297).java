package methodEmbedding.Standing_Ovation.S.LYD393;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {

	public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("/home/gaurav/MCS/IVSem/CSL632/Assignments/Assignment1/Workspace/GCJ/src/in.txt");
            FileWriter fileWriter = new FileWriter("/home/gaurav/MCS/IVSem/CSL632/Assignments/Assignment1/Workspace/GCJ/src/out.txt");
            
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line = bufferedReader.readLine();
            int t = Integer.parseInt(line);
            int i=0;
            while(i<t) {
            	line = bufferedReader.readLine();
            	String[] ins = line.split(" ");
            	int smax = Integer.parseInt(ins[0]);
            	String ss = ins[1];
            	int s[] = new int[ss.length()];
            	for(int j=0;j<ss.length();j++){
            		s[j] = ss.charAt(j) - '0';
            	}
            	int standing = s[0];
            	int required = 0;
            	for(int j=1;j<smax+1;j++){
            		if(standing < j && s[j] >0){
            			required += j-standing;
            			standing += required;
            		}
            		standing += s[j];
            		
            	}
            	i++;
                System.out.println("Case #"+(i)+": "+required);
            }    

            
            bufferedReader.close();
            bufferedWriter.close();
        }
        catch(Exception ex){
        	ex.printStackTrace();
        }
	}
}
