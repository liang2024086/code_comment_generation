package methodEmbedding.Revenge_of_the_Pancakes.S.LYD319;


import java.io.BufferedReader;
import java.io.FileReader;

public class B {

	public static void main(String[] args) throws Exception {
			String file = "d:\\temp\\codejam\\B-small-attempt0.in";
			BufferedReader br = new BufferedReader(new FileReader(file));
	        String line = br.readLine();
	        int count = Integer.parseInt(line);
	        for(int i=1; i<=count; i++) {
	        	line = br.readLine();
	        	int changes = 0;
	        	char oldChar = 'x';
	        	for(char curChar: line.toCharArray()) {
	        		if(oldChar != 'x' && oldChar != curChar) {
	        			changes++;
	        		}
	        		oldChar = curChar;
	        	}
	        	if(oldChar == '-') {
	        		changes++;
	        	}
        		System.out.println("Case #" + i + ": " + changes);
	        }
	        br.close();
	}
}
