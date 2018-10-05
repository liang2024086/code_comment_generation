package methodEmbedding.Standing_Ovation.S.LYD2065;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashSet;

public class ProblemA {
    public static void main(String[] args) {
	try {
	    String input = "A-small-attempt1";
	    BufferedReader inputStream = new BufferedReader(new FileReader(input+".in"));
	    FileWriter f = new FileWriter(input+".out");
	    String l = inputStream.readLine();
	    int max = Integer.parseInt(l);
	    for (int i = 1; i<=max; i++)
		{
		    l = inputStream.readLine();
		    String[] strings = l.split(" ");
		    int smax = Integer.parseInt(strings[0]);
		    int sum = 0;
		    int res = 0;
		    for (int j=0; j<=smax; j++){
			int shys_j =Character.getNumericValue(strings[1].charAt(j));
			if(sum<j){
			    res += j-sum;
			    sum += j-sum;
			}					
			sum += shys_j;
		    }
		    f.write("Case #"+i+": "+res+"\n");
		}
	    f.close();
	}
	catch (Exception e){
	    e.printStackTrace();
	}
    }
}
