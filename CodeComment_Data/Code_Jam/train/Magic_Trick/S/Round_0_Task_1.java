package methodEmbedding.Magic_Trick.S.LYD1552;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.gplex.Utils;


public class Round_0_Task_1 {
	private static final Logger logger = LoggerFactory.getLogger(Round_0_Task_1.class);
	private static final String INPUT_FILE =  new File("src/main/resources/2014/world/00-1-S.in").getAbsolutePath();
	private static final String OUTPUT_FILE = Utils.getOutputFileName(INPUT_FILE);

	public static void main(String[] args) throws Throwable{
		
		logger.debug("{}", new Object[]{});
		
		Scanner sc = new Scanner(new FileReader(INPUT_FILE));
	    PrintWriter pw = new PrintWriter(new FileWriter(OUTPUT_FILE));
		
		
		int numberOfTestCases =  sc.nextInt(10);
		//numberOfTestCases = 1;
		
		for(int caseNum=0;caseNum<numberOfTestCases;caseNum++){
			Set<Integer> firstSet = new HashSet<Integer>();
			int firstRow =  sc.nextInt(10) -1;
			int[][] firstArr = new int[4][4];
			for(int y = 0; y< 4; y ++ ){
				for(int x=0; x< 4; x++){
					
					firstArr[y][x] =  sc.nextInt(10);
					if(y == firstRow){
						firstSet.add(firstArr[y][x]);
					}
				}
			}
			logger.debug("{}", new Object[]{firstSet});
			int solutions = 0;
			int res = 0;
			int secondRow =  sc.nextInt(10) -1;
			int[][] secondArr = new int[4][4];
			for(int y = 0; y< 4; y ++ ){
				for(int x=0; x< 4; x++){
					secondArr[y][x] =  sc.nextInt(10);
					if(y == secondRow && firstSet.remove(secondArr[y][x])){
						solutions++;
						res = secondArr[y][x];
						logger.debug("match "+res);
					}
				}
			}
			logger.debug("select row {}", firstRow);
			Utils.printArr(firstArr);
			logger.debug("select row  {}", secondRow);
			Utils.printArr(secondArr);
			logger.debug("total calculations {}", solutions);
			
			String response = "Volunteer cheated!";
			if(solutions == 1){
				response= ""+res;
			}else if(solutions > 1){
				response = "Bad magician!";
			}
			
			String result = String.format("Case #%d: %s", caseNum+1,response);
			pw.println(result);
			logger.debug("{}\n\n", new Object[]{result});
		
		}
		
		pw.flush();
		pw.close();
		sc.close();
		
	}

}
