package methodEmbedding.Counting_Sheep.S.LYD119;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class CountingSheep {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		
		try {
			int numberCases = Integer.parseInt(reader.readLine());
			for (int i = 0; i < numberCases; i++) {
				String number = reader.readLine();
				int num = Integer.parseInt(number);
				if(num!=0){
					ArrayList<Integer> array = new ArrayList<Integer>();
					for (int g = 0; g < 10; g++) {
						array.add(g);
					}
					int j = 1;
					String lastnumber = "";
					while(array.size() > 0){
						String add = (num*j) + "";
						for (int k = 0; k < add.length(); k++) {
							int f = Integer.parseInt(add.charAt(k)+"");
							if (array.contains(f)){
								int y = array.indexOf(f);
								array.remove(y);
							}
						}
						lastnumber = add;
						j++;
					}
					System.out.println("Case #"+(i+1)+": "+lastnumber);
				}else{
					System.out.println("Case #"+(i+1)+": INSOMNIA");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
