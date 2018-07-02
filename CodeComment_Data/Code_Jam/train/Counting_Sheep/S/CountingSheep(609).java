package methodEmbedding.Counting_Sheep.S.LYD548;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.Set;


public class CountingSheep {
	
	public static void main(String[] args) {
		String fileName = "/Users/jye/Desktop/A-small-attempt1.in";
		try {
			FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            File file = new File("/Users/jye/Desktop/A-small-attempt1.out");
    		file.createNewFile();
    		FileWriter writer = new FileWriter(file);  
            
            int N = Integer.parseInt(bufferedReader.readLine());
            for (int i = 1;i <= N ;i++) {
            	writer.write("Case #" + i + ": ");
            	int num = Integer.parseInt(bufferedReader.readLine());
            	if (num == 0) {
            		writer.write("INSOMNIA");
            	} else {
            		Set<Integer> set = new HashSet<Integer>();
            		long cur = 0;
            		while (set.size() < 10 && cur + num < Long.MAX_VALUE) {
            			cur += num;
            			for (char c: Long.toString(cur).toCharArray()) {
            				set.add(c - '0');
            			}
            		}
            		if (set.size() == 10) {
            			writer.write(Long.toString(cur));
            		} else {
            			writer.write("INSOMNIA");
            		}
            	}
            	writer.write("\n");
            }
    	    bufferedReader.close();
    	    writer.flush();
    	    writer.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
