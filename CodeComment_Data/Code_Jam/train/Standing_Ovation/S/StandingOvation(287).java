package methodEmbedding.Standing_Ovation.S.LYD2166;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class StandingOvation {
	
	public static void main(String[] args){
		new StandingOvation();
	}
		
	public StandingOvation(){
		try {
			BufferedReader in = new BufferedReader(new FileReader("./resources/in.txt"));
			BufferedWriter out = new BufferedWriter(new FileWriter("./resources/out.txt"));
			int cases = Integer.parseInt(in.readLine());
			for(int i = 0; i < cases;i++){
				String line = in.readLine();
				String[] lineData = line.split(" ");
				
				int[] shynessData = new int[lineData[1].length()];
				for(int j = 0; j < shynessData.length;j++){
					shynessData[j] = Integer.parseInt(lineData[1].charAt(j) + "");
				}
				int clapping = 0;
				int friends = 0;								
				for(int j = 0; j < shynessData.length;j++){
					if(shynessData[j] != 0){
						if(j <= clapping){
							clapping += shynessData[j];
						}else{
							friends += j - clapping;
							
							clapping += friends;
							clapping += shynessData[j];
						}
					}
				}
								
				out.write("Case #" + (i + 1) + ": " + friends);
				out.newLine();
				System.out.println("Case #" + (i + 1) + ": " + friends);
			}
			in.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
