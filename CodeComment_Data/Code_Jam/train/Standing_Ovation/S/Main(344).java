package methodEmbedding.Standing_Ovation.S.LYD141;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new FileReader("filename.txt"));
		int numberOfInputs = in.nextInt();
		//System.out.println(numberOfInputs);
		for(int i = 1; i <= numberOfInputs ; i++){
			int maxShyness = in.nextInt();
			//System.out.print(maxShyness + " ");
			ArrayList<Integer> list = new ArrayList<Integer>();
			String temp = in.next();
			for(int j = 0; j <= maxShyness ; j++){
				int tempInt = Integer.valueOf(temp.charAt(j)-48);
				//System.out.print(tempInt+ " ");
				list.add(tempInt);
			}
			//System.out.println();
			ArrayList<Integer> list2 = new ArrayList<Integer>(Collections.nCopies(list.size(), 0));
			
			for(int j = 1; j<list.size() ; j++){
				list2.set(j,(list2.get(j-1) + list.get(j-1)));
				//System.out.println(list2.get(j));
			}
			
			int maxDiff = 0;
			for(int j = 0; j<list2.size() ; j++){
				if(list2.get(j)<=j)
					if(maxDiff < j-list2.get(j))
						maxDiff = j-list2.get(j);
			}
			
			System.out.println("Case #"+i+": "+maxDiff);
			
		}
			
	}

}
