package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1157;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Cookie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader file;
		try {
			file = new FileReader("B-small-attempt0.in");
			BufferedReader reader = new BufferedReader(file);
			String line = "";
			
			FileWriter output = new FileWriter("output.txt");
			BufferedWriter writer = new BufferedWriter(output);
			
			line = reader.readLine();
			int caseNum = Integer.valueOf(line);
			for(int i=0;i<caseNum;i++){
				line = reader.readLine();
				String values[] = line.split(" ");
				double C = Double.valueOf(values[0]);
				double F = Double.valueOf(values[1]);
				double X = Double.valueOf(values[2]);
				
				int counter = 0;
				double current  = Double.MAX_VALUE;
				while (true){
					double time = 0;
					time += X/(2+counter*F);	//last move
					for (int j=0;j<counter;j++){
						time += C/(2+j*F);
					}
					if (time < current){
						current = time;
					}else{
						writer.write("Case #"+(i+1)+": "+String.format("%.7f", current)+"\r\n");
						break;
					}
					counter++;
				}
			}
			reader.close();
			writer.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
