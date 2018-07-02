package methodEmbedding.Counting_Sheep.S.LYD755;


//count_sheep
import java.util.*;
import java.io.*;
public class counting_sheep {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int num = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
    
    for (int i = 1 ; i<= num; i++){
    	HashSet<Integer> set = new HashSet<Integer>();
    	int curNum = in.nextInt();
    	if (curNum == 0){
			System.out.println("Case #" + i + ": " + "INSOMNIA");    		
			continue;
    	}
    	int multiply = 1;
    	while(true){
    		int updatedNum = curNum * multiply;
    		boolean sleep = false;
	    	while (updatedNum != 0){
	    		set.add(updatedNum % 10);
	    		updatedNum = updatedNum / 10;
	    		if (set.size() == 10){
	    			System.out.println("Case #" + i + ": " + curNum * multiply);
	    			sleep = true;
	    			break;
	    		}
	    	}
	    	if (sleep){
	    		break;
	    	}
    		multiply = multiply + 1;	    	
    	}
    }
    
  }
}
