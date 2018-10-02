package methodEmbedding.Counting_Sheep.S.LYD1590;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CountingSheep{
	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
		List<Integer> a = new ArrayList<Integer>();
		Integer number = 0;
		int n_lines = in.nextInt();
		in.nextLine();
		for(int i = 1; i<=n_lines; i++){
			String n = in.nextLine();
			Integer count = 1;
			if("0".equals(n)) System.out.println("Case #"+i+": INSOMNIA");
			else{
				while(a.size() < 10){
					number = Integer.valueOf(n) * count;
					char[] array = String.valueOf(number).toCharArray();
					for(char c : array){
						Integer x = Character.getNumericValue(c);
						if(!a.contains(x)) a.add(x);
						if(a.size() == 10) break;
					}
					count++;
				}
				System.out.println("Case #"+i+": "+number);
				a.clear();
			}
		}
	}
}
