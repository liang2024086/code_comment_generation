package methodEmbedding.Counting_Sheep.S.LYD310;

import java.io.*;
import java.util.*;

public class CountSheep16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("E:/inp.txt"));
		PrintWriter pr = new PrintWriter(new File("E:/out.txt"));
		Set<Integer> numberSofar = new HashSet<Integer>();
		Set<Character> digitSofar = new HashSet<Character>();
		int t=Integer.parseInt(br.readLine());
		for(int i=1;i<=t;i++){
			int currNum=Integer.parseInt(br.readLine());
			String currNumStr = currNum+"";
			pr.printf("Case #%d: ",i);
			int iterNum = currNum;
			int mul=1;
			while(true){
				numberSofar.add(iterNum);
				String iterNumStr = iterNum+"";
				for(char c: iterNumStr.toCharArray()){
					digitSofar.add(c);
				}
				if(digitSofar.size()==10) {pr.printf("%d",iterNum);break;}
				iterNum=currNum*(++mul);
				if(numberSofar.contains(iterNum)) {pr.printf("INSOMNIA");break;}
			}
			numberSofar.clear();
			digitSofar.clear();
			pr.printf("%n");
		}
		br.close();
		pr.close();
	}

}
