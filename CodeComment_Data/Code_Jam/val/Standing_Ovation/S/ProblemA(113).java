package methodEmbedding.Standing_Ovation.S.LYD757;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.List;

/**
 * @author pdonaire
 *
 */
public class ProblemA {

	public static void main(String[] args) {
		FileInputStream in;
		try {
			in = new FileInputStream("./A-small-attempt1.in");
			//in = new FileInputStream("./input-a.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			File fout = new File("./output-a.txt");
			FileOutputStream fos = new FileOutputStream(fout);
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
			 
			String strLine = null, tmp;
			boolean firstLine = true;
			int numCase = 1;
			while ((tmp = br.readLine()) != null){
				if (firstLine){
					firstLine = false;
				} else{
					int counter = 0;
					int countPerson = 0;
					strLine = tmp;
					String[] problem = strLine.split(" ");
					String[] people = problem[1].split("(?!^)");
					List<String> listPeople = Arrays.asList(people);
					
					for (int i = 0; i < listPeople.size(); i++){
						int numPerson = new Integer(listPeople.get(i));
						if (i != 0){
							if (numPerson != 0 && i > countPerson){
								counter += i - countPerson;
								countPerson += i - countPerson;
							}
						}
						countPerson += numPerson;
					}
					
					
					
					System.out.println("Case #"+numCase+": "+counter);
					bw.write("Case #"+numCase+": "+counter);
					bw.newLine();
					numCase++;
				}
			}
			in.close();
			bw.close();
		} catch (FileNotFoundException e) {
			//File not found
			e.printStackTrace();
		} catch (IOException e) {
			//File empty
			e.printStackTrace();
		}
	}

}
