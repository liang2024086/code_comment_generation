package methodEmbedding.Magic_Trick.S.LYD883;

import java.util.*;
public class Magician{
	

	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int cases = Integer.parseInt(sc.nextLine());
		
			for(int c = 1; c<= cases; c++){
				int collisions = 0;
				int num = 0;
				HashSet<Integer> row = new HashSet<Integer>(17);
				int ans1 = Integer.parseInt(sc.nextLine());
				//L??s 4 rader
				for(int i = 1; i<=4; i++){
					String line = sc.nextLine();
						if( i == ans1){
							String[] nums = line.split(" ");
							for(String s : nums){
								row.add(Integer.parseInt(s));
							}
						}
				}
			

				//L??s in uppl??gget 4 rader
				int ans2 = Integer.parseInt(sc.nextLine());
				for(int i = 1; i<=4; i++){
					String line = sc.nextLine();
						if( i == ans2){
							String[] nums = line.split(" ");
							for(String s : nums){
								if( row.contains(Integer.parseInt(s)) ){
									collisions++;
									num =Integer.parseInt(s); 	
								}
							}
						}
				}
				if(collisions == 1 ){
					System.out.println("Case #"+c+": " + num);
					continue;
				}
				if(collisions >= 2 ){
					System.out.println("Case #"+c+": Bad magician!");
					continue;				
				}
				System.out.println("Case #"+c+": Volunteer cheated!");
			}	
	}
}
