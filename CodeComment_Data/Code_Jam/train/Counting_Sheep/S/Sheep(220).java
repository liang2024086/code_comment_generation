package methodEmbedding.Counting_Sheep.S.LYD405;

import java.util.*;

public class Sheep{

	public static void main(String args[]){
		int n;
		int pro, curp;
		ArrayList<Integer> num;

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		for(int i = 0; i < x; i++){
			pro = sc.nextInt();
			
			num = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
			if(pro == 0){
				System.out.println("Case #" + (i+1) + ": INSOMNIA");
			}else {
				for(int j = 1; ; j++){
					int flag = 0; 	
					curp = pro * j;
					for(int k = curp; curp!= 0; curp /= 10){
						Integer g = curp % 10;
						num.remove(g);
						if(num.isEmpty()){
							flag = 1; 
							System.out.println("Case #" + (i+1) + ": " + (pro * j));
							break;
						}
					}
					if(flag == 1){
						break;
					}
				}
			}
		}
	}
}
