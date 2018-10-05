package methodEmbedding.Counting_Sheep.S.LYD1024;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashSet;

public class CountingSheep {

	public static void main(String[] args) throws Exception {
		FileReader fileReader = new FileReader("/home/srinivasu/Desktop/A-small-attempt0.in");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		File file = new File("/home/srinivasu/Desktop/filename.txt");
		file.createNewFile();
		FileWriter writer = new FileWriter(file);
		int loop = Integer.parseInt(bufferedReader.readLine());
		for (int i = 1; i <= loop; i++) {
			HashSet<Integer> set = new HashSet<>(10);
			String data = bufferedReader.readLine();
			int number = Integer.parseInt(data);
			if (number == 0) {
				System.out.println("Case #" + i + ": INSOMNIA");
				writer.write("Case #" + i + ": INSOMNIA\n");
			} else {
				for (int j = 1;; j++) {
					int data_int = number * j;
					String s = new Integer(data_int).toString();
					for (int k = 0; k < s.length(); k++) {
						set.add(Integer.parseInt(s.charAt(k) + ""));
					}
					if (set.size() == 10) {
						System.out.println("Case #" + i + ": " + s);
						writer.write("Case #" + i + ": " + s+"\n");
						break;
					}
				}
			}
		}
		
		writer.flush();
		writer.close();

	}

}
