package methodEmbedding.Standing_Ovation.S.LYD856;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class A{
	public static void main(String args[]){
		ArrayList<String> as = new ArrayList<String>();
		String inputFileName = "A-small-attempt2.in";
		String outputFileName = "A-small-attempt2.out";
		try{
			Scanner scan = new Scanner(new FileInputStream(inputFileName));
			PrintWriter printer = new PrintWriter(new FileOutputStream(outputFileName));
			int T = scan.nextInt();
			scan.nextLine();
			for(int t = 0; t < T; t++){
				char[] chars = scan.nextLine().split(" ")[1].toCharArray();
				int[] nums = new int[chars.length];
				nums[0] = chars[0] - '0';
				int ans = 0;
				for(int i = 1; i < nums.length; i++){
					nums[i] = chars[i] - '0';
					if(nums[i]!=0){
						int diff = i - (nums[i-1] + ans);
						ans += Math.max(diff,0);
					}
					nums[i] = nums[i] + nums[i - 1]; 
				}
				printer.println("Case #"+(t+1)+": "+ans);
			}
			printer.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
