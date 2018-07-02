package methodEmbedding.Standing_Ovation.S.LYD2051;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;


public class Main {

    public static void main(String[] args) throws Exception {
	String file = "A-small-attempt1.in";
	BufferedReader reader = new BufferedReader(new FileReader(file));
	BufferedWriter writer = new BufferedWriter(new java.io.FileWriter("out.txt"));
	String line = null;
	int T = Integer.parseInt(reader.readLine());
	for (int i = 0; i < T; i++) {
	    line = reader.readLine();
	    String[] split = line.split("[ ]+");
	    int smax = Integer.parseInt(split[0]);
	    char[] charArray = split[1].toCharArray();
	    int ans = 0;
	    int sum = 0;
	    for (int j = 0; j <= smax; j++) {
		sum += charArray[j] - '0';
		if (sum < j + 1) {
		    ans++;
		    sum++;
		}
		
	    }
	    
	    //System.out.println("Case #"+(i+1)+": "+ans);
	    writer.write("Case #"+(i+1)+": "+ans+"\r\n");
	}

	reader.close();
	writer.close();
    }

}
