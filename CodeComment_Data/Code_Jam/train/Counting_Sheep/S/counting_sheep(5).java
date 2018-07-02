package methodEmbedding.Counting_Sheep.S.LYD935;

import java.io.*;

public class counting_sheep {	
	public static void main(String[] args)throws FileNotFoundException{
	int T, N;
	String bw_line;
	String line;
	
	try{
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		File file = new File("output.txt");
		 
		if (!file.exists()) {
			file.createNewFile();
		}

		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		
		T = Integer.parseInt(br.readLine());
		
		for(int j = 1; j <= T; j++){
			N = Integer.parseInt(br.readLine());
			boolean[] digits = {false, false, false, false, false, false, false, false, false, false};

			if(N == 0){
				bw_line = "Case #" + j + ": INSOMNIA";					
				bw.write(bw_line);
				bw.newLine();
			}
			else{				
				int count = 1;
				while(true){
					int ene = N * count;

					String values = String.valueOf(ene);
					for(int i = 0; i < values.length(); i++){
						digits[values.charAt(i) - '0'] = true;
					}

					boolean ready = true;
					for(int i=0; i<10; i++){
						if(!digits[i])
							ready = false;
					}
					System.out.println(digits[0]);
					System.out.println(digits[2]);

					if(ready){
						bw_line = "Case #" + j + ": " + ene;
						bw.write(bw_line);
						bw.newLine();
						break;
					}
					count++;					
				}
			}			
		}
		br.close();
		bw.close();
	}catch(Exception ex){}
	finally {		
	}		
}
}
