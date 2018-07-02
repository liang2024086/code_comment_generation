package methodEmbedding.Standing_Ovation.S.LYD429;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass {

	public static void main(String[] args) throws IOException {
		
//		String file1 = args[0];
		String file1 = "A-small-attempt5.in";
		BufferedReader fileReader1 = new BufferedReader(new FileReader(file1));
		String reader = "";
		String input = "";
		String output = "";
		while ((reader = fileReader1.readLine()) != null) {
			input += reader+"\n";
		}
		fileReader1.close();
//		System.out.println(input);
		int numberOfInputs = Integer.parseInt(input.split("\n")[0]);
		for (int j = 1; j <= numberOfInputs; j++) {
			
			int smax = Integer.parseInt(input.split("\n")[j].split(" ")[0]);
			String currentAud = input.split("\n")[j].split(" ")[1];
			int[] temp =new int[currentAud.length()];
			for (int i = 0; i < currentAud.length(); i++) {
				temp[i] = Integer.parseInt(currentAud.substring(i, i+1));
			}
			int audienceneeded = 0;
			int currentNoOfAud = 0;
			for (int i = 0; i < temp.length; i++) {
				
				
				
				if (currentNoOfAud < i && temp[i] != 0) {
					audienceneeded += i - currentNoOfAud;
					currentNoOfAud += i - currentNoOfAud;
				}
				currentNoOfAud += temp[i];
			}
			System.out.println("Case #"+j+": "+audienceneeded);
			output += "Case #"+j+": "+audienceneeded+"\n";
		}
		BufferedWriter fileWriter1 = new BufferedWriter(new FileWriter("output.txt"));
//		System.out.println(output);
		fileWriter1.write(output);
		fileWriter1.flush();
		fileWriter1.close();
	}

}
