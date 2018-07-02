package methodEmbedding.Counting_Sheep.S.LYD421;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class SolutionA {
  public static void main(String[] args) throws FileNotFoundException{
	File file = new File("A:/Workspace/CodeJam/small_input.txt");
	
	Scanner sc = new Scanner(file);
	
	int t = sc.nextInt();
	HashSet<Integer> digits = new HashSet<>();
	
	for (int i=0; i < t; i++){
	  int n = sc.nextInt();
	  if (n == 0) {
		  System.out.println("Case #"+(i+1)+": INSOMNIA");
	      continue;
	      }
	  boolean x = true;
	  int p;
	  int inloop = n;
	  int num = 1;
	  while(x){
		  
		  while(inloop > 0){
		    p = inloop % 10;
		    digits.add(p);
		    inloop = inloop / 10;
		  }
		 
		  if(digits.size() == 10){
			  digits.clear();
			  x = false;
		  }else {
			  num++;
			  inloop = num * n;
		  }
	  }
	  System.out.println("Case #"+(i+1)+": "+num*n);
	}
	sc.close();
  }
}
