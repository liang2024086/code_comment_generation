package methodEmbedding.Cookie_Clicker_Alpha.S.LYD756;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class codejam1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		File file = new File("file.txt");
		BufferedReader reader = null;
		String strInput[]=null;
		String strSecond[]=null;
		double C, F, X;
		try {
		    reader = new BufferedReader(new FileReader(file));
		    String text = null;
		    text = reader.readLine();
		    int T = Integer.parseInt(text.trim());
		    //System.out.println("Case #"+T);
		    for(int i=0; i < T; i++)
		    {
		    	text = reader.readLine();
		    	strInput = text.split(" ");
				C = Double.parseDouble(strInput[0]);
				F = Double.parseDouble(strInput[1]);
				X = Double.parseDouble(strInput[2]);
				//System.out.println(" " + C + " "+ F +" " + X);
				double speed = 2.0;
				double time=0.0;
				while(X/speed > C/speed+X/(speed + F))
				{
					if( X/speed < 0.0000001)
						break;
					time += C/speed;
					speed = speed + F;
					//System.out.println(" time: " + time+ "X: " + X + "speed: " + speed);
				
					
				}
				time += X/speed;
				
				
				System.out.println("Case #"+(i+1)+": "+ time);
				
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
