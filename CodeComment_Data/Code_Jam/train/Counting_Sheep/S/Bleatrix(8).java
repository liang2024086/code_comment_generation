package methodEmbedding.Counting_Sheep.S.LYD1298;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Bleatrix {
	public static void main(String[] args) throws NumberFormatException, IOException {
		String output = "";
		ArrayList <String> numbersFound = new ArrayList<>();
		int originalNumber = 0;
		int number = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    Integer cases = Integer.parseInt(br.readLine());
	    int count = 1;
	    for (int i = 0; i < cases; i++) {
	    	originalNumber = Integer.parseInt(br.readLine());
	    	if (originalNumber <=0){
	    		output = "Case #"+(i+1)+": INSOMNIA"+"\n";
	    		continue;
	    	}
	    	number = originalNumber;
	    	String numbers = number +"";
	    	while(!(numbersFound.size()==10)){
	    		numbers = number+"";
	    		for (int j = 0; j < numbers.length(); j++) {
					if(!(numbersFound.contains(numbers.charAt(j)+""))){
						numbersFound.add(numbers.charAt(j)+"");
					}
					if(numbers.length()-1 == j){
						count +=1;
					}
		    	}
		    	if(!(numbersFound.size()==10)){
		    		number = originalNumber*count;
		    	}
	    	}
	    	numbersFound.clear();
	    	count = 0;
	    	output += "Case #"+(i+1)+": " + number +"\n";
		}
	    System.out.println(output+"");
	}

}
