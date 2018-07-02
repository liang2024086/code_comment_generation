package methodEmbedding.Counting_Sheep.S.LYD1149;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Bellatrix {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		//File file = new File(args[0]);
		try{
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		//Scanner in = new Scanner(file);		
		int t = in.nextInt();  
		//System.out.println("output :" + t);
	    for (int test = 1; test <= t; test++) {
		int K = in.nextInt();
		boolean Task = true;
		 //System.out.println("input : " + K);
		 ArrayList<Integer> checklist = new ArrayList<Integer>();
		 ArrayList<Integer> addlist = new ArrayList<Integer>(); 
		 for(int i=0;i<10;i++){
			checklist.add(i);
			}
		while(!(addlist.size() == 10)){
			if(K==0){
				System.out.println("Case #" + test + ": " + "INSOMANIA");
				break;
			}
			else {
				for(int i=1;addlist.size() <= 10 && i > 0 && Task;i=i+1){
					int N = i* K;
					String Checker = Integer.toString(N);
					for(int j = 0 ; j <= Checker.length()-1 && addlist.size() <= 10 ;j++){
					int num = Integer.parseInt(Checker.substring(j,j+1));
					if(!addlist.contains(num) && addlist.size() !=10){
						addlist.add(num);
					}
					if(addlist.size() ==10){
						System.out.println("Case #" + test + ": " + N);
						Task = false;
						break;
						}
					}
				}
			}
		 }
	  }
	}
	catch(Exception e){
			System.out.println(e);
		}	
	}
}
