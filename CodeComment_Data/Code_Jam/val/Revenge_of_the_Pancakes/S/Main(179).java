package methodEmbedding.Revenge_of_the_Pancakes.S.LYD453;

import java.util.*;
import java.io.*;
public class Main {
  public static void main(String[] args) {
  try{
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());  // Scanner has functions to read ints, longs, strings, chars, etc.
    for (int j = 0; j < n; j++) {
	  String inputLine = in.readLine();
	  // 0 is the top of the stack
      boolean[] stack = new boolean[inputLine.length()];
	  
	  int flips = 0;
	  
	  for(int i = 0; i < stack.length; i++){
		stack[i] = inputLine.charAt(i) == '+';
	  }
	  int bottomPointer = stack.length - 1;
	  while(bottomPointer >= 0){
		if(stack[bottomPointer]){
			bottomPointer--;
		}else{
			if(stack[0]){ // flip top positives to negative
				flips++;
				int lowestPositive = 0;
				while(lowestPositive + 1 < stack.length && stack[lowestPositive + 1]){
					lowestPositive++;
				}
				for(int i = 0; i <= lowestPositive; i++){
					stack[i] = false;
				}
			}
			flips++;
			// flip to bottomPointer
			boolean[] stackCopy = Arrays.copyOf(stack, bottomPointer + 1);
			for(int i = stackCopy.length - 1; i >= 0; i--){
				stack[stackCopy.length - 1 - i] = !stackCopy[i];
			}		
		}
	  }
	  
	  System.out.println("Case #" + (j + 1) + ": " + flips);
	  
	}
  }catch(Exception e){}
  }
}
