package methodEmbedding.Magic_Trick.S.LYD1885;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;

public class cardsMagic {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String inputfilename = "A-small-practice.in.txt";
		String output = "output.txt";
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(inputfilename)));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter (new FileOutputStream(output)));
		
		int[][] num1 = new int[4][4];
		int[][] num2 = new int[4][4];
		int lines = Integer.parseInt(br.readLine());	
		String line = "";
		String temp = "";
		for (int i = 0;i<lines;i++){
			int sum = 0;
			int ans = 0;
			line = br.readLine();
			int loc1 = Integer.parseInt(line)-1;
			for (int k = 0;k<4;k++){
				line = br.readLine();
				String[] s = line.split(" ");
				for (int j = 0;j<4;j++){
					num1[k][j] = Integer.parseInt(s[j]);
				}	
			}
			line = br.readLine();
			int loc2 = Integer.parseInt(line)-1;
			for (int k = 0;k<4;k++){
				line = br.readLine();
				String[] s = line.split(" ");
				
				for (int j = 0;j<4;j++){
					num2[k][j] = Integer.parseInt(s[j]);
					if (k == loc2){
						for (int h = 0;h<4;h++){
							if (num2[k][j] == num1[loc1][h]){
								sum++;
								ans = num1[loc1][h];
							}
						}
					}	
				}			
			}
	
			 temp = "Case #"+(i+1)+": ";
		     if (sum == 1){
		    	 temp +=ans;
		     }
		     else if (sum == 0){
		    	 temp+="Volunteer cheated!";
		     }
		     else {
		    	 temp+="Bad magician!";
		     }
			 System.out.println(temp);
			bw.write(temp);
			bw.newLine();
		}	
		bw.close();
	
	}

}
