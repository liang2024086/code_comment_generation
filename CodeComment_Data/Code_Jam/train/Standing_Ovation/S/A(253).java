package methodEmbedding.Standing_Ovation.S.LYD616;


import java.util.Scanner;

public class A {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		for(int i = 0; i < n; i++){
			int result = 0;
			String s = scan.nextLine();
			int levels = Integer.parseInt(s.split(" ")[0]);
			String dist = s.split(" ")[1];
			//System.out.println("dist:"+dist);
			int sum = 0;
			for(int j = 0; j <= levels; j++){
				int num = Character.getNumericValue(dist.charAt(j));
				//System.out.println("sum: "+sum +"result: "+result);
				if(j > sum & num > 0){
					result += j-sum;
					sum+=result;
				}
				sum +=num;
			}
			System.out.println("Case #" + (i+1) + ": " +result);
		}

	}
}
