package methodEmbedding.Magic_Trick.S.LYD786;

import java.util.Scanner;


public class MagicTrick {
	
  public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  int ncases = scan.nextInt();
	  scan.nextLine();
	  for (int c = 1; c <= ncases; c++) {
		  boolean[] numbers1 = new boolean[16];
		  int l1 = scan.nextInt();
		  scan.nextLine();
		  for (int l = 1; l < l1; l++) {
			  scan.nextLine();
		  }
		  for (int j = 0; j < 4; j++) {
			  numbers1[scan.nextInt()-1] = true;
		  }
		  for (int l = l1; l <= 4; l++) {
			  scan.nextLine();
		  }
		  
		  boolean[] numbers = new boolean[16];
		  int l2 = scan.nextInt();
		  scan.nextLine();
		  for (int l = 1; l < l2; l++) {
			  scan.nextLine();
		  }
		  for (int j = 0; j < 4; j++) {
			  int n = scan.nextInt();
			  numbers[n-1] = numbers1[n-1];
		  }
		  for (int l = l2; l <= 4; l++) {
			  scan.nextLine();
		  }
		  
		  System.out.print("Case #"+c+": ");
		  int n = 0;
		  boolean badMagician = false;
		  for (int i = 0; i < 16; i++) {
			  if (numbers[i]) {
				  if (n != 0) {
					  badMagician = true;
					  break;
				  }
				  n = i+1;
			  }
		  }
		  if (badMagician) {
			  System.out.println("Bad magician!");
		  } else if (n == 0) {
			  System.out.println("Volunteer cheated!");
		  } else {
			  System.out.println(n);
		  }
	  }
  }
}
