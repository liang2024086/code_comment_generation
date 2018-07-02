package methodEmbedding.Revenge_of_the_Pancakes.S.LYD728;

import java.util.*;

class happyface1{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testcases = in.nextInt(); int hash = testcases+1;
		while(testcases>0){
			String s = in.next(); int answer=0;
			Stack stack = new Stack();
			stack.push(s.charAt(0));
			for(int i=1;i<s.length();i++){
				if((Character)stack.peek()!=s.charAt(i)){
					answer+=1;
					stack.pop();stack.push(s.charAt(i));
				}
			}
			if((Character)stack.peek()=='-'){
				answer+=1;
				stack.pop();
			}
			System.out.println("Case #"+(hash-testcases)+":  "+answer);
			testcases--;
		}


	}
}
