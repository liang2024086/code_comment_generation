package methodEmbedding.Magic_Trick.S.LYD557;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class magicTrick {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(
				"A-small-attempt1.in"));
		BufferedWriter writer = new BufferedWriter(new FileWriter(
		"out.out"));
		int numberOfTC = new Integer(reader.readLine());

		for (int i = 1; i <= numberOfTC; i++) {
			int firstRow = new Integer(reader.readLine());
			String firstLine ="";
			for (int j = 1; j <= 4; j++) {
				if (j == firstRow) {
					firstLine= reader.readLine();
				} else {
					reader.readLine();
				}
			}
			int secondRow = new Integer(reader.readLine());
			String secondLine ="";
			for (int j = 1; j <= 4; j++) {
				if (j == secondRow) {
					secondLine= reader.readLine();
				} else {
					reader.readLine();
				}
			}
			
			StringTokenizer st = new StringTokenizer(firstLine);
			List<String> list =  new ArrayList<String>();
			int numberOfAppearance = 0;
			String card = "";
			while (st.hasMoreElements()) {
				String object = (String) st.nextElement();
				list.add(object);
			}
			StringTokenizer st2 = new StringTokenizer(secondLine);
			while (st2.hasMoreElements()) {
				String object = (String) st2.nextElement();
				if(list.contains(object)){
					numberOfAppearance++;
					card = object;
				}
			}

			if(numberOfAppearance==1){
				writer.write("Case #"+i+": "+card+"\n");
				writer.flush();
			}
			if(numberOfAppearance>1){
				writer.write("Case #"+i+": Bad magician!\n");
				writer.flush();
			}
			if(numberOfAppearance<1){
				writer.write("Case #"+i+": Volunteer cheated!\n");
				writer.flush();
			}
		}
	}

}
