package methodEmbedding.Counting_Sheep.S.LYD1454;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountingSheep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> data = FileReader.getData("resources/2016/1_small.in");

		for(int i = 0; i < data.size(); i++){
			if(i == 0)
				continue;
			int base = Integer.parseInt(data.get(i));
			
			int mask = 0;
			int flip = ~mask;
			
			int round = 0;
			boolean flag = false;
			Set<Integer> history = new HashSet<Integer>();
			while((flip >> 10) << 10 != flip){
				round++;
				int val = round * base;
				
				if(history.contains(val)){
					System.out.println("CASE #" + i + ": INSOMNIA");
					flag = true;
					break;
				}else
					history.add(val);
				
				String digits = String.valueOf(val);
				for(int idx = 0; idx < digits.length(); idx++){
					char c = digits.charAt(idx);
					
					mask = mask | (1 << (c - '0'));
					flip = ~mask;
				}
			}
			if(!flag)
				System.out.println("CASE #" + i + ": " + round * base);	
		}
		
		return;
	}

}
