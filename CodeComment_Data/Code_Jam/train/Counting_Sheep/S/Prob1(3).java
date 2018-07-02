package methodEmbedding.Counting_Sheep.S.LYD778;


import java.util.ArrayList;

import gen.FileTools;

public class Prob1 {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Start");

		String filePath = "C:\\GCJ\\";
		String in = "A-small-attempt0.in";
		String out = "out1.txt";
		
		ArrayList<String> arrS = FileTools.readFile(filePath+in);
		StringBuffer sb = new StringBuffer();
		
		ArrayList<String> arrToBeSeen = new ArrayList<String>();
		
		//ignoring 1st element
		for(int i = 1; i < arrS.size(); i++){
			
					
			sb.append("Case #"+i+": ");
			int num = Integer.parseInt(arrS.get(i));
			
			/*
			if(num < 0 || num > 200){
				System.out.println("Out of Range");
			}
			*/
			if(num == 0){
				sb.append("INSOMNIA");
			}else{
				
				for(int j = 0; j < 10; j++){
					arrToBeSeen.add(""+j);
				}
			
				//System.out.println("#############################"+num);
				
				int counter = 0;
				int tempNum = 0;
				while(arrToBeSeen.size() != 0){
				
					tempNum = ++counter*num; //start from 1
					String s = "" + tempNum;
					String sArr[] = s.split("");
					//System.out.println("***"+tempNum);
					for(int x = 0; x < sArr.length; x++){
						//System.out.println(sArr[x]+"&&&"+arrToBeSeen.size());
						if(arrToBeSeen.contains(sArr[x]))
							arrToBeSeen.remove(sArr[x]);
					}
					
				}
				sb.append(tempNum);
				
			}
			sb.append(System.lineSeparator());
			//System.out.println(i);
		}//for
		
		FileTools.writeFile(sb.toString(), filePath+out);
		sb.setLength(0);
		System.out.println("Done");

	}//main
	
	
	

}//class


/*


Bleatrix Trotter the sheep has devised a strategy that helps her fall asleep faster. First, she picks a number N. Then she starts naming N, 2 ? N, 3 ? N, and so on. Whenever she names a number, she thinks about all of the digits in that number. She keeps track of which digits (0, 1, 2, 3, 4, 5, 6, 7, 8, and 9) she has seen at least once so far as part of any number she has named. Once she has seen each of the ten digits at least once, she will fall asleep.

Bleatrix must start with N and must always name (i + 1) ? N directly after i ? N. For example, suppose that Bleatrix picks N = 1692. She would count as follows:

   N = 1692. Now she has seen the digits 1, 2, 6, and 9.
   2N = 3384. Now she has seen the digits 1, 2, 3, 4, 6, 8, and 9.
   3N = 5076. Now she has seen all ten digits, and falls asleep.

What is the last number that she will name before falling asleep? If she will count forever, print INSOMNIA instead.
Input

The first line of the input gives the number of test cases, T. T test cases follow. Each consists of one line with a single integer N, the number Bleatrix has chosen.
Output

For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) and y is the last number that Bleatrix will name before falling asleep, according to the rules described in the statement.
Limits

1 = T = 100.
Small dataset

0 = N = 200.
Large dataset

0 = N = 106.
Sample

Input
 	
Output


5
0
1
2
11
1692

	

Case #1: INSOMNIA
Case #2: 10
Case #3: 90
Case #4: 110
Case #5: 5076


In Case #1, since 2 ? 0 = 0, 3 ? 0 = 0, and so on, Bleatrix will never see any digit other than 0, and so she will count forever and never fall asleep. Poor sheep!

In Case #2, Bleatrix will name 1, 2, 3, 4, 5, 6, 7, 8, 9, 10. The 0 will be the last digit needed, and so she will fall asleep after 10.

In Case #3, Bleatrix will name 2, 4, 6... and so on. She will not see the digit 9 in any number until 90, at which point she will fall asleep. By that point, she will have already seen the digits 0, 1, 2, 3, 4, 5, 6, 7, and 8, which will have appeared for the first time in the numbers 10, 10, 2, 30, 4, 50, 6, 70, and 8, respectively.

In Case #4, Bleatrix will name 11, 22, 33, 44, 55, 66, 77, 88, 99, 110 and then fall asleep.

Case #5 is the one described in the problem statement. Note that it would only show up in the Large dataset, and not in the Small dataset. 

*/
