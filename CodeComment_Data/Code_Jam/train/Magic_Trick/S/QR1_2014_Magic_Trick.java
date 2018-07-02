package methodEmbedding.Magic_Trick.S.LYD1580;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class QR1_2014_Magic_Trick {
	public static void main(String[] arg) throws FileNotFoundException, UnsupportedEncodingException{
		Scanner input = new Scanner(new FileReader("C:\\Users\\sihui\\Desktop\\A-small-attempt0.in"));
		PrintWriter output = new PrintWriter("C:\\Users\\sihui\\Desktop\\A-small-practice.out", "UTF-8");
		//skip the first line
		String inputString = input.nextLine();
		
		int c=0;
		int[] m1=new int[4];
		String[] str_m1=new String[4];
		int[] m2=new int[4];
		String[] str_m2=new String[4];
		int answer_1;
		int answer_2;
		int match=0;
		boolean one_match;
OUTERLOOP:	while(input.hasNextLine()){
					one_match=false;
					c++;
					/**Handle the first matrix**/
					inputString = input.nextLine();
					answer_1 =Integer.parseInt(inputString);
					//read the corresponding row
					for(int i=0;i<answer_1;i++){
						inputString = input.nextLine();
					}
					//map the row to m1
					str_m1=inputString.split(" ");
					for(int i=0;i<4;i++){
						m1[i]=Integer.parseInt(str_m1[i]);
					}
					
					/**Pass the rest of the matrix**/
					for(int i=0;i<4-answer_1;i++){
						inputString = input.nextLine();
					}
					/**Handle the second matrix**/
					inputString = input.nextLine();
					answer_2 =Integer.parseInt(inputString);
					//read the corresponding row
					for(int i=0;i<answer_2;i++){
						inputString = input.nextLine();
					}
					//map the row to m2
					str_m2=inputString.split(" ");
					for(int i=0;i<4;i++){
						m2[i]=Integer.parseInt(str_m2[i]);
					}
					/**Pass the rest of the matrix**/
					for(int i=0;i<4-answer_2;i++){
						inputString = input.nextLine();
					}
					
					for(int i=0;i<4;i++){
						for(int j=0;j<4;j++){
							if(m1[i]==m2[j]){
								if(one_match){
									output.println("Case #"+c+": Bad magician!");	
									continue OUTERLOOP;
								}
								else{
									one_match=true;
									match=m1[i];
									}
							}
						}
					}
					if(one_match){
						output.println("Case #"+c+": "+match);	
						continue OUTERLOOP;
					}
					else{
						output.println("Case #"+c+": Volunteer cheated!");	
						continue OUTERLOOP;
					}
			
			}
			
		input.close();
		output.close();
	}

}
