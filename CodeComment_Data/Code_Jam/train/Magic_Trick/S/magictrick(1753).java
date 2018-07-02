package methodEmbedding.Magic_Trick.S.LYD776;

import java.io.*;
import java.util.*;
public class magictrick{

     public static void main(String []args)throws FileNotFoundException{
        Scanner scan = new Scanner(new File("A-small-attempt0.in"));
        int tests = scan.nextInt();
        // System.out.println(tests);
        PrintWriter alice = new PrintWriter(new File("Magix.txt"));
        scan.nextLine();
	for(int i=1;i<=tests;i++){
		alice.print("Case #"+i+":");  
		String[] answers = new String[8];
		for(int k =0;k<2;k++){
		          int row  = scan.nextInt();
			//System.out.println("row"+row);
			for(int j=0;j<row;j++){
				scan.nextLine();
		          }
	          		String thing =scan.nextLine();
		          String[] tempanswers = thing.split(" ");
          			//System.out.println(Arrays.toString(tempanswers));
			for(int m=0;m<4-row;m++){
				scan.nextLine();
			}
			if(k==0){
				System.arraycopy(tempanswers,0,answers,0,4);
				//System.out.println(Arrays.toString(answers));
			}
			else{
				System.arraycopy(tempanswers, 0, answers, 4, 4);
				//System.out.println(Arrays.toString(answers));
				Arrays.sort(answers);
			}
			
		}
		//System.out.println(Arrays.toString(answers));
		int same =0;
		int place = 0;
		for(int l=1;l<8;l++){
			//is the values the same as the last
			if(answers[l].equals(answers[l-1])){
				same++;
				place=l;
			}
			if(same>1)
				break;
		}
		if(same==0){
			alice.println(" Volunteer cheated!");
		}
		else if(same>1){
			alice.println(" Bad magician!");
		}
		else
			alice.println(" "+answers[place]);

        }
	alice.flush();
     }
}
