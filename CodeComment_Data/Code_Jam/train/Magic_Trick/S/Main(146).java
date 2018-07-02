package methodEmbedding.Magic_Trick.S.LYD1099;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		String inFile = "A-small-attempt0.in";
		String outFile = inFile.replace("in", "out");
		Scanner input = new Scanner(new File(inFile));
		PrintWriter writer = new PrintWriter(new File(outFile));
		
		int n = Integer.parseInt(input.nextLine());
		System.out.println(n);
		for(int i=0; i<n; i++){
			int s1 = Integer.parseInt(input.nextLine())-1;
			System.out.println(s1);
			ArrayList<ArrayList<Integer>> rows1 = new ArrayList<ArrayList<Integer>>();
			//input.nextLine();
			for(int j=0; j<4; j++){
				String nums = input.nextLine();
				System.out.println(nums);
				String[] num = nums.split(" ");
				ArrayList<Integer> temp = new ArrayList<Integer>();
				temp.add(Integer.parseInt(num[0]));
				temp.add(Integer.parseInt(num[1]));
				temp.add(Integer.parseInt(num[2]));
				temp.add(Integer.parseInt(num[3]));
				rows1.add(temp);
			}
			
			int s2 = Integer.parseInt(input.nextLine())-1;
			System.out.println(s2);
			ArrayList<ArrayList<Integer>> rows2 = new ArrayList<ArrayList<Integer>>();
			for(int j=0; j<4; j++){
				String nums = input.nextLine();
				System.out.println(nums);
				String[] num = nums.split(" ");
				ArrayList<Integer> temp = new ArrayList<Integer>();
				temp.add(Integer.parseInt(num[0]));
				temp.add(Integer.parseInt(num[1]));
				temp.add(Integer.parseInt(num[2]));
				temp.add(Integer.parseInt(num[3]));
				rows2.add(temp);
			}
			
			int count = 0;
			//int result = 0;
			HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();
			int res = 0;
			
			System.out.println("s1 = " + s1);
			System.out.println("s2 = " + s2);
			for(int k:rows2.get(s2))
				System.out.println(k);
			
			//for(int j=0; j<4; j++){
				for(int k=0; k<4; k++){
					if(rows1.get(s1).contains(rows2.get(s2).get(k))){
						//writer.println(rows2.get(s2).get(k));
						count++;
						if(!result.containsKey(rows2.get(s2).get(k)))
							result.put(rows2.get(s2).get(k), 1);
						else{
							result.put(rows2.get(s2).get(k), result.get(rows2.get(s2).get(k))+1);
						}
					}
				}
			//}
			
			for(int k:result.keySet()){
				if(result.get(k)==1){
					//writer.println("Case #" + (i+1) + ": " + k);
					res = k;
					count++;
				}
			}
			
			//writer.println(count);
			
			if(count==2){
				writer.println("Case #" + (i+1) + ": " + res);
			}else if(count>2){
				writer.println("Case #" + (i+1) + ": Bad magician!");
			}else{
				writer.println("Case #" + (i+1) + ": Volunteer cheated!");
			}
		}
		
		input.close();
		writer.close();
	}

}
