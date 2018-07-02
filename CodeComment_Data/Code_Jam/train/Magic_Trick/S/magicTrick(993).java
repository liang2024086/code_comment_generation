package methodEmbedding.Magic_Trick.S.LYD363;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class magicTrick {
	public static final int ROW =4;
	public static final int COLUMN =4;
	public static void main(String[] args) {


		//input
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> firstAnswer = new ArrayList<Integer>();
		List<Integer> secondAnswer = new ArrayList<Integer>();
		Map<Integer,List<Integer>> firstTable = new HashMap<Integer,List<Integer>>();
		Map<Integer,List<Integer>> secondTable = new HashMap<Integer,List<Integer>>();
		List<Map> firstTableList = new ArrayList<Map>();
		List<Map> secondTableList = new ArrayList<Map>();

		Scanner scanner =null;
		//Path path = Paths.get("C:\\GCJ\\A_small\\sample.txt");
		Path path = Paths.get("C:\\GCJ\\A_small\\A-small-attempt4.in");
		File file = new File(path.toString());

		try{
			scanner = new Scanner(file);
		}catch(FileNotFoundException e){
			System.out.println(e);
		}
		int Y = Integer.parseInt(scanner.next());

		for(int i=0;i<Y;i++){
			//firstTable
			firstAnswer.add(Integer.parseInt(scanner.next()));
			for(int row=1;row<=ROW;row++){
				for(int column=1;column<=COLUMN;column++){
					list.add(Integer.parseInt(scanner.next()));
				}
				firstTable.put(row,list);
				list = new ArrayList<Integer>();
			}
			firstTableList.add(firstTable);
			firstTable = new HashMap<Integer,List<Integer>>();

			//secondTable
			secondAnswer.add(Integer.parseInt(scanner.next()));
			for(int row=1;row<=ROW;row++){
				for(int column=1;column<=COLUMN;column++){
					list.add(Integer.parseInt(scanner.next()));
				}
				secondTable.put(row,list);
				list = new ArrayList<Integer>();
			}
			secondTableList.add(secondTable);
			secondTable = new HashMap<Integer,List<Integer>>();
		}
		//Answer
		for(int i=0;i<Y;i++){
			int rightCount = 0;
			int answerNo = 0;
			for(Integer firstNo : (List<Integer>) firstTableList.get(i).get(firstAnswer.get(i))){
				for(Integer secondNo : (List<Integer>) secondTableList.get(i).get(secondAnswer.get(i))){
					if(firstNo == secondNo){
						rightCount++;
						answerNo = firstNo;
					}
				}
			}
			int y = i+1;

			if(rightCount == 0) System.out.println("Case #" + y +": Volunteer cheated!");
			if(rightCount == 1) System.out.println("Case #" + y +": "+ answerNo);
			if(rightCount >= 2) System.out.println("Case #" + y +": Bad magician!");
		}
	}
}
