package methodEmbedding.Counting_Sheep.S.LYD1686;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountSheep {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("input"));
		try {
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		        System.out.println(line);
		    }
		    String everything = sb.toString();
		} finally {
		    br.close();
		}
		

	}

}
