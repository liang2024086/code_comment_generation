package methodEmbedding.Counting_Sheep.S.LYD1336;


import java.util.Scanner; 
import java.util.HashSet;
import java.io.*;

public class Sheep {
	
	public static void main(String[] args) throws IOException {
		File file = new File("small_output.txt");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);
		InputStream inputStream = new FileInputStream("A-small-attempt0.in");
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(inputStream)));
		
		int T = in.nextInt();
		
		for(int j = 0; j < T; j++){
			int n = in.nextInt();
			HashSet<Character> hset = new HashSet<Character>();
			int idx = 1;
			if(n == 0) {
				writer.write("Case #" + (j + 1) + ": INSOMNIA\n");
			} else {
				while(true){
					int value = idx*n;
					String stringNum = Integer.toString(value);
					for(int k = 0; k < stringNum.length(); k++){
						hset.add(stringNum.charAt(k));
					}
					
					idx++;
					if(hset.size() == 10){
						writer.write("Case #" + (j + 1) + ": " + value +"\n");
						break;
					}
				}
			}
			
			
	}
		writer.flush();
		writer.close();
	}

}
