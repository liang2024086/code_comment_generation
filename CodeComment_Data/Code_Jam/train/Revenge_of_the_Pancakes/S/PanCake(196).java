package methodEmbedding.Revenge_of_the_Pancakes.S.LYD539;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class PanCake {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("D:/New Eclipse/wokspace/hackerrank/src/codejam/input1"));
		String line = br.readLine();
		int tc = Integer.parseInt(line);
		int count1 = 0;
		while(tc-- >0){
			String line1 = br.readLine();
			count1++;
			Stack<Character> st = new Stack<Character>();
			for(int i = line1.length()-1; i >=0;i--){
				st.add(line1.charAt(i));
			}
			int count = 0;
			char prevC = st.pop();
			boolean didpop = false;
			if(prevC =='-'){
				didpop = true;
			}
			while(prevC != '+' && !st.isEmpty()){
				prevC = st.pop();
				didpop = true;
			}
			if(didpop){
				count++;
			}
            while(!st.isEmpty()){
				char presC = st.pop();
                if(prevC == '+' && presC =='-'){
						count +=2 ;	
				}
                prevC = presC;
			}
			System.out.println("Case #"+count1+": "+count);
		}
		br.close();

	}

}
