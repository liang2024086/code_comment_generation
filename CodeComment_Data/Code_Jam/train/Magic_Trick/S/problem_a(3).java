package methodEmbedding.Magic_Trick.S.LYD36;

import java.util.Scanner;


public class problem_a {
 private static Scanner s;

public static void main(String[] args) {
		s = new Scanner(System.in);
	 int number_of_test_Cases = s.nextInt();
	 int test_case_number = 1;
	 int[] result_testcase = new int[number_of_test_Cases];
	 String[] actual_result_testcase = new String[number_of_test_Cases];
	 
	 for(int l = 0;l<number_of_test_Cases;l++){
		 int answer_case1 = s.nextInt();
		 String[] case1_input = new String[4];
		 s.nextLine();
		 for (int j = 0; j<=3;j++){
		 
		 case1_input[j] = s.nextLine();
		 
	 }
	 String case1_row_selected = case1_input[answer_case1 - 1];
	 String[] case1_elements = case1_row_selected.split(" ");
     
	 
	 int answer_case2 = s.nextInt();
	 s.nextLine();
	 String[] case2_input = new String[4];
	 for (int j = 0; j<=3;j++){
		 
		 case2_input[j] = s.nextLine();
		 
	 }

	 String case2_row_selected = case2_input[answer_case2 - 1];
	 String[] case2_elements = case2_row_selected.split(" ");
	 
	 
	 
	 String[] result = new String[4];
	 int count = 0;
	 for(int m = 0;m<=3;m++){
		 for(int n=0;n<=3;n++){
			 if (case1_elements[m].equals(case2_elements[n])){
				 result[count] = case2_elements[n];
				 count++;
			 }
		 }
		 
	 }
	 result_testcase[test_case_number - 1] = count;
	 actual_result_testcase[test_case_number - 1] = result[0];
	 
	 
	 test_case_number ++; 
	 
	 }
	 test_case_number = 1;
	 for(int l = 0;l<number_of_test_Cases;l++){
		 
		 
		 if (result_testcase[test_case_number -1] == 0){
			 System.out.println("\n Case #"+test_case_number+": Volunteer cheated!");
		 }
		 else if(result_testcase[test_case_number -1] > 1){
			 
			 System.out.println("\n Case #"+test_case_number+": Bad magician!");
		 }
		 else if(result_testcase[test_case_number -1] == 1){
			 System.out.println("\n Case #"+test_case_number+": "+actual_result_testcase[test_case_number - 1]);
		 }
		 test_case_number ++; 
	 }
	 

	}

}
