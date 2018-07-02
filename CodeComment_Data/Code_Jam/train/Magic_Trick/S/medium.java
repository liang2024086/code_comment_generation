package methodEmbedding.Magic_Trick.S.LYD258;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class medium {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0; 
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 
			String input;
			// number of test cases
			n = Integer.parseInt(br.readLine()); 
			int chose = -1;
			int count = 0; 
			int[] answer = new int[4];
			int[] answer2 = new int[4];
			int temp = -1; 
			int tc =1; 
			while((input=br.readLine())!=null){
				
				String[] splited = input.split(" ");
				int[] output = new int[splited.length];
				
				for (int i = 0; i < splited.length; i++) {
					output[i] = Integer.parseInt(splited[i]);
				}
				if (chose != -1) {
						count++;
				}
				
				if (chose == count) {
					count = 0; 
					if (temp == -1) {
						for (int i = 0; i < 4; i++) {
							answer[i] = output[i];
						}
						temp = -2; 
					} else {
						for (int i = 0; i < 4; i++) {
							answer2[i] = output[i];
						}
						temp = -1; 
						int c = 0; 
						for (int i = 0; i < 4; i++) {
							for (int j = 0; j < 4; j++) {
								if (answer[i] == answer2[j]) {
									c++;
								}
							}
						}
						
						if (c == 1) {
							for (int i = 0; i < 4; i++) {
								for (int j = 0; j < 4; j++) {
									if (answer[i] == answer2[j]) {
										System.out.println("Case #" + tc + ": " + answer[i]);
										tc++;
									}
								}
							}
						} else if (c == 0){
							System.out.println("Case #" + tc + ": Volunteer cheated!");
							tc++;
						} else {
							System.out.println("Case #" + tc + ": Bad magician!");
							tc++;	
						}
					}
					
					chose = -1; 
				}
				
				if (output.length == 1) {
					chose = output[0];
				}
				//System.out.println(input);
			}
	 
		}catch(IOException io){
			io.printStackTrace();
		}	
	}

}
