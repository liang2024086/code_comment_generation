package methodEmbedding.Magic_Trick.S.LYD1198;

import java.util.Scanner;


public class problem_a {
 private static Scanner s;

public static void main(String[] args) {
		s = new Scanner(System.in);
	 int notc = s.nextInt();
	 int tcn = 1;
	 int[] rtc= new int[notc];
	 String[] actual_rtc= new String[notc];
	 
	 for(int l = 0;l<notc;l++){
		 int answer_case1 = s.nextInt();
		 String[] c1i = new String[4];
		 s.nextLine();
		 for (int j = 0; j<=3;j++){
		 
		 c1i[j] = s.nextLine();
		 
	 }
	 String c1rs = c1i[answer_case1 - 1];
	 String[] c1e = c1rs.split(" ");
     
	 
	 int answer_case2 = s.nextInt();
	 s.nextLine();
	 String[] case2_input = new String[4];
	 for (int j = 0; j<=3;j++){
		 
		 case2_input[j] = s.nextLine();
		 
	 }

	 String c2rs = case2_input[answer_case2 - 1];
	 String[] c2e = c2rs.split(" ");
	 
	 
	 
	 String[] result = new String[4];
	 int count = 0;
	 for(int m = 0;m<=3;m++){
		 for(int n=0;n<=3;n++){
			 if (c1e[m].equals(c2e[n])){
				 result[count] = c2e[n];
				 count++;
			 }
		 }
		 
	 }
	 rtc[tcn - 1] = count;
	 actual_rtc[tcn - 1] = result[0];
	 
	 
	 tcn ++; 
	 
	 }
	 tcn = 1;
	 for(int l = 0;l<notc;l++){
		 
		 
		 if (rtc[tcn -1] == 0){
			 System.out.println("\n Case #"+tcn+": Volunteer cheated!");
		 }
		 else if(rtc[tcn -1] > 1){
			 
			 System.out.println("\n Case #"+tcn+": Bad magician!");
		 }
		 else if(rtc[tcn -1] == 1){
			 System.out.println("\n Case #"+tcn+": "+actual_rtc[tcn - 1]);
		 }
		 tcn ++; 
	 }
	 

	}

}
