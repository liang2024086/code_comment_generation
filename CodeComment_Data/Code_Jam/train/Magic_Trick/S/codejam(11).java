package methodEmbedding.Magic_Trick.S.LYD2200;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class codejam {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		File file = new File("file.txt");
		BufferedReader reader = null;
		String strFirst[]=null;
		String strSecond[]=null;
		try {
		    reader = new BufferedReader(new FileReader(file));
		    String text = null;
		    text = reader.readLine();
		    int T = Integer.parseInt(text.trim());
		    for(int i=0; i < T; i++)
		    {
		    	int nFirst, nSecond;
		    	 text = reader.readLine();
				 nFirst = Integer.parseInt(text.trim());
				 for(int j=0; j < 4; j++)
				 {
					 text = reader.readLine();
					 if(j == nFirst-1)
						 strFirst = text.split(" ");
				 }
				 text = reader.readLine();
				 nSecond = Integer.parseInt(text.trim());
				 for(int j=0; j < 4; j++)
				 {
					 text = reader.readLine();
					 if(j == nSecond-1)
						 strSecond = text.split(" ");
				 }
				 int nNumMatch = 0;
				 int nMatched=0;
				 for(int j=0; j < 4; j++)
				 {
					 for(int k=0; k<4; k++)
					 {
						 if(strFirst[j].contentEquals(strSecond[k]))
						 {	 
							 nNumMatch++;
							 nMatched = Integer.parseInt(strFirst[j]);
						 }
						 
					 }
				 }
				 if(nNumMatch==1)
				 {
					 System.out.println("Case #"+(i+1)+": "+ nMatched);
				 }
				 else if(nNumMatch ==0)
					 System.out.println("Case #"+(i+1)+": Volunteer cheated!");
				 else
					 System.out.println("Case #"+(i+1)+": Bad magician!");
		    }
		   
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		} finally {
		    try {
		        if (reader != null) {
		            reader.close();
		        }
		    } catch (IOException e) {
		    }
		}




	}

}
