package methodEmbedding.Cookie_Clicker_Alpha.S.LYD176;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author faisal
 *
 */
public class CookieClicker {
	/**
	 * @param args
	 */
    public static void main(String[] args) throws IOException{
	// TODO Auto-generated method stub
	if (args.length == 2){
	    try {
		BufferedReader read = new BufferedReader(new FileReader(args[0]));
		BufferedWriter write = new BufferedWriter(new FileWriter(args[1]));
		int caseno = Integer.valueOf(read.readLine());
		
		for(int i = 0; i < caseno; i++) {
		    double farm, cost, goal, time=0.0, cps =2.0, 
		    		besttime=0.0, totaltime=0.0;
		    
		    String sentence = read.readLine();
		    String[] numbers = sentence.split(" ");
		    cost = Double.parseDouble(numbers [0]);
		    farm = Double.parseDouble(numbers [1]);
		    goal = Double.parseDouble(numbers [2]);
		    
		    do{
		    	totaltime +=time;
		    	besttime = goal /cps;
		    	// try to get better time
		    	time = cost / cps;
		    	cps += farm;
		    	if ((time + goal/cps)< besttime)
		    		besttime = time + (goal/cps);
		    }while((time + goal/cps)<= besttime);
		    totaltime += besttime;
		    write.write("Case #" + (i+1) + ": " + totaltime + "\n");
		    write.flush();
		}

	    } catch (IOException ex) {
		System.out.println(ex.getMessage());
	    }
	}else
	    System.out.println("Please enter two argements\n" +
			       "the first one for read input and other for the output");
    }
}
