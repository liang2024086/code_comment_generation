package methodEmbedding.Counting_Sheep.S.LYD1414;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountingSheep {
	public static void main(String args[]) {
		try(BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
			String line = br.readLine();
			int cases = Integer.parseInt(line);
			for (int c = 1; c <= cases; c++) {
				int temp = 0;
				Boolean n[] = new Boolean[10];
				for (int z = 0; z < 10; z++) {
					n[z] = false;
				}
				System.out.print("Case #"+c+": ");
				line = br.readLine();
				int num = Integer.parseInt(line);
				int res = 0;
				res = num;
				int index = 2;
				if (num == 0) {
					System.out.println("INSOMNIA");
				} else {
					while (true) {
						int i = 0;
						for (i = 0; i < 10; i++) {
							if (n[i] == true) {
								continue;
							} else {
								break;
							}
						}
						if (i == 10) {
							//print the number
							System.out.println(temp);
							break;
						} 
						char[] chars = ("" + res).toCharArray();
						for (int j = 0; j < chars.length; j++) {
							n[Integer.parseInt(chars[j]+"")] = true;
						}
						temp = res;
						res = index * num;
						index++;
					}
				}

			}
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
