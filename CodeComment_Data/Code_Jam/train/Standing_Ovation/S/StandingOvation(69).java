package methodEmbedding.Standing_Ovation.S.LYD1735;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.InputStreamReader;

public class StandingOvation {
	public static void main (String[] argc)
	{
		//BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
    	String str;
        try {
        	BufferedReader bi = new BufferedReader (new FileReader("//Users//amishaverma//Documents//eclipseInput//A-small-attempt1.in"));
        	File file = new File("//Users//amishaverma//Documents//eclipseInput//output.txt");
        	 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
        	str = bi.readLine();
        	int t = Integer.parseInt(str);  	
        	for (int i=1;i<=t;i++)
        	{
        		str = bi.readLine();
        		String[] tc = str.split(" ");
        		int s = Integer.parseInt(tc[0]);
        		int arr[] = new int [tc[1].length()];
        		for (int j=0;j<arr.length;j++)
        		{
        			arr[j] = Integer.parseInt(tc[1].charAt(j)+"");
        		}
        		int standing = arr[0];
        		int min = 0;
        		for (int j=1;j<arr.length;j++)
        		{
        			if (standing>=j)
        			{
        				standing += arr[j];
        			}
        			else if (arr[j]>0)
        			{
        				min += (j-standing);
        				standing += min;
        				standing += arr[j];
        			}
        		}
        		//System.out.println ("Case #"+i+": "+min);
        		bw.write("Case #"+i+": "+min);
        		bw.write("\n");
        	}
        	bi.close();
    		bw.close();
        } catch (IOException e)
        {
        	e.printStackTrace();
        }
	}
}
