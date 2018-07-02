package methodEmbedding.Revenge_of_the_Pancakes.S.LYD708;

import java.util.*;

class Sol{
	public static void main(String[] args) {
		String t;
		Scanner in = new Scanner(System.in);
		t=in.nextLine();
		int n = Integer.parseInt(t);
		int i=0;
		String s;
		int j,count;
		for (i=0;i<n;i++) {
			count = 0;
			s = in.nextLine();
			//if(s.charAt(0)=='-')
			if(s.length() == 1){
				if(s.charAt(0) == '-'){
					count++;

				}
			}else{
			for(j=1;j<s.length();j++){
				if(s.charAt(j) == '+' && s.charAt(j-1) == '-' ){
					count = count + 1;
				}
				if(s.charAt(j) == '-' && s.charAt(j-1) == '+' ){
					count = count + 1;
				}
			}
			if(s.charAt(s.length()-1) == '-'){
				count++;
			}
		}
			System.out.println("case #"+(i+1)+": "+count);
		}
	}
}
