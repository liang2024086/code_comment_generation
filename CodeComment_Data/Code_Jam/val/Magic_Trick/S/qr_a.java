package methodEmbedding.Magic_Trick.S.LYD1733;


import java.io.*;

public class qr_a {

	public static void main(String[] args) {		
		try {				
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Adam\\workspace\\codejam2014_1\\A-small-attempt0.in"));
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:/Users/Adam/workspace/codejam2014_1/A-small-attempt0.out"));

			int testCases = Integer.parseInt(reader.readLine());
			
			for(int i = 1; i <= testCases; i+=1) {
			
					int answer1 = Integer.parseInt(reader.readLine());
					int[] cards1 = new int[4];
					
					for(int j = 1; j <= 4; j+=1) {
						if(j == answer1) {
							String[] cs = reader.readLine().split(" ");
							cards1[0] = Integer.parseInt(cs[0]);
							cards1[1] = Integer.parseInt(cs[1]);
							cards1[2] = Integer.parseInt(cs[2]);
							cards1[3] = Integer.parseInt(cs[3]);			
						} else {
							reader.readLine();
						}
					}
					
					int answer2 = Integer.parseInt(reader.readLine());
					int[] cards2 = new int[4];
					
					for(int j = 1; j <= 4; j+=1) {
						if(answer2 == j) {
							String[] cs = reader.readLine().split(" ");
							cards2[0] = Integer.parseInt(cs[0]);
							cards2[1] = Integer.parseInt(cs[1]);
							cards2[2] = Integer.parseInt(cs[2]);
							cards2[3] = Integer.parseInt(cs[3]);	
						} else {
							reader.readLine();
						}
					}	
					
					int result = -1;
					boolean found = false;
					
					for(int j = 0; j < 4; j+=1) { 
						for(int k = 0; k < 4; k+=1) {
							
							if(cards1[j] == cards2[k]) {
								if(!found) {
									result = cards1[j];
								} else {
									result = -2; //bad magician!!!
								}
								found = true;
							}	
						}
					}
					
					writer.write("Case #" + i + ": ");
					
					if(result == -2) {
						writer.write("Bad magician!");
					} else if (!found) { 
						writer.write("Volunteer cheated!");
					} else {
						writer.write("" + result);
					}
					
					if(i != testCases) {
						writer.write("\n");
					}
					
					writer.flush();
				
				
			}
		} catch (Exception e){ 
			throw new RuntimeException(e);
		}
	}
}
