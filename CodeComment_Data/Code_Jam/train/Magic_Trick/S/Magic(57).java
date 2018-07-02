package methodEmbedding.Magic_Trick.S.LYD11;

import java.util.*;
public class Magic {
  public static void main(String args[]){
	  Scanner input = new Scanner(System.in);
	  int cases = input.nextInt();
	  for(int caseNo = 0; caseNo < cases; caseNo++){
		  int choice1 = input.nextInt();
		  ArrayList<Integer> firstOrder = new ArrayList<Integer>();
		  for(int i = 0; i < 16; i++){
			  firstOrder.add(input.nextInt());
		  }
		  
		  int choice2 = input.nextInt();
		  ArrayList<Integer> secondOrder = new ArrayList<Integer>();
		  for(int i = 0; i < 16; i++){
			  secondOrder.add(input.nextInt());
		  }
		  List<Integer> result = firstOrder.subList(4*(choice1 -1), 4*choice1);
		  result.retainAll((secondOrder).subList(4*(choice2-1),4*choice2));
		  
		  if(result.size() == 1){
			  System.out.println("Case #"+(caseNo+1)+": "+result.get(0));
		  }
		  else if(result.size() == 0){
			  System.out.println("Case #"+(caseNo+1)+": Volunteer cheated!");
		  }
		  else if(result.size() > 1){
			  System.out.println("Case #"+(caseNo+1)+": Bad magician!");
		  }
	  }
  }	
}
