package methodEmbedding.Counting_Sheep.S.LYD5;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class CountingSheep {

	public static String filename;
	public static FileReader FR;
	public static BufferedReader BR;
	public static int num_of_testcase;

	public static void main(String[] args){
		filename = "A-small-attempt1.in";
		try {
			FR = new FileReader(filename); 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		BR = new BufferedReader(FR);
		try{
			num_of_testcase = Integer.parseInt(BR.readLine());
			for(int i=1; i<=num_of_testcase; i++){
				HashSet<Integer> checks = new HashSet<Integer>();
				for(int a=0; a<10;a++){
					checks.add(a);
				}
				int N = Integer.parseInt(BR.readLine());
				int curr = N;
				int count =1;
				if(N==0){
					System.out.println("Case #"+i+": "+"INSOMNIA");
					checks = new HashSet<Integer>();
				}
				while (!checks.isEmpty()){
					while (N>0){
						int digit = N%10;
						N=N/10;
						checks.remove(digit);
					}
					if (checks.isEmpty()){
						System.out.println("Case #"+i+": "+curr);
						break;
					}else{
						curr/=count;
						count++;
						curr*=count;
						N=curr;
					}
				}
			}
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
