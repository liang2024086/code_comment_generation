package methodEmbedding.Standing_Ovation.S.LYD634;

import java.util.*; 

public class StandingOvation{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		sc.nextLine();

		for(int i=0;i<num;i++){
			int numOfPersons = sc.nextInt();
			String input = sc.next();
			String[] inputArr = input.split("");
			int counter=0;
			int add=0;
			Iterator iter = Arrays.asList(inputArr).iterator();
			//System.out.println(Arrays.toString(inputArr));
			for(int j=1;j<inputArr.length;j++){
				if(j==1){
					if(Integer.valueOf(inputArr[j])==0){
						add+=1;
						counter+=1;
					}
					else{
						counter+=Integer.valueOf(inputArr[j]);
						//System.out.println("Counter is "+counter);
					}
				}
				else if(Integer.valueOf(inputArr[j])==0){
					continue;
				}
				else{
					int diff=0;
					if(counter<(j-1)){
						diff = j-1-counter;
						add += diff;
						counter += diff;
					//System.out.println("C is " +counter);
					}
					counter += Integer.valueOf(inputArr[j]);
					//System.out.println("C is " +counter);
				}
			}
			System.out.println("Case #" + (i+1) + ": " + add);
		}
	}
}
