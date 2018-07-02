package methodEmbedding.Standing_Ovation.S.LYD1613;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class AStandingOvation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Path path = Paths.get("input.in");
	    Charset charset = Charset.defaultCharset();
		try {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("output.out")));
			List<String> lines = Files.readAllLines(path, charset);
			//System.out.println(lines.size());
			Integer cases = Integer.parseInt(lines.get(0));
			for (int i=1 ; i<=cases ; i++){
				if (i != 1){
					bufferedWriter.newLine();
				}
				String[] split = lines.get(i).split(" ");
				//System.out.println(split[0]+" "+split[1]);
				//Integer maxS = Integer.parseInt(split[0]);
				int current=0;
				int required = 0;
				for (int j=0 ; j<split[1].length() ; j++){
					int curLevel = Integer.parseInt(split[1].charAt(j)+"");
					if (j>current){
						required+= (j-current);
						current+=(j-current);
					}
					current+=curLevel;
				}
				bufferedWriter.write("Case #"+i+": "+required);
				
			}
			bufferedWriter.flush();
			bufferedWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
