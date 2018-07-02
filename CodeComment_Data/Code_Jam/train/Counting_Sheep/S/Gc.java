package methodEmbedding.Counting_Sheep.S.LYD1560;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Gc {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=num ; i++){
			 HashMap<Long,Boolean> map = new HashMap<>();
			//int count = 0;
			long number = Long.parseLong(br.readLine());
		
			long var = number;
			int k = 1;
			boolean check = false;
			while(map.size()!=10 ){
				number = var *k;
				long value = number;
				k++;
				if(number == var && k!=2){
					System.out.println("case #"+i+": "+"INSOMNIA");
					break;
				}
			while (number > 0) {
			    long digit =  (long)(number % 10);
			    if(!map.containsKey(digit)){
			    //	count =0;
			    	check = true;
			    	map.put(digit, true);
			    	if(map.size()==10){
			    		System.out.println("case #"+i+": "+value);
			    		break;
			    	}
			    }
			    number = number / 10;
		}
		}
		}
		}
}
