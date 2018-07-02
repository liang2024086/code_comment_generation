package methodEmbedding.Standing_Ovation.S.LYD785;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author salaheddine
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(new File("A-small-attempt0.in"));
		PrintWriter output = new PrintWriter("A-small-practice.out");
		int cases_number = Integer.parseInt(input.nextLine());
		for (int uc = 1; uc < cases_number + 1; uc++) {
			int required_person = 0;

			int max_shyness = input.nextInt();
			int audience_shyness[] = new int[max_shyness+1];
			//Read audience shyness
			String audience_information = input.nextLine();
			//System.out.println(user_infi);
			for(int i=0;i<max_shyness+1;i++){
				audience_shyness[i]=Character.getNumericValue(audience_information.charAt(i+1));
				//System.out.print(user_shyness[i]+" ");
			}
			//System.out.println();
			int standing_person =audience_shyness[0];
			for(int i=1;i<max_shyness+1;i++){
				if(standing_person >= i){
					standing_person += audience_shyness[i];
				}else{if(audience_shyness[i]!=0){ 
					required_person += i-standing_person ;
					standing_person = i+audience_shyness[i];
				}
				}
			}
		
			output.write("Case #"+uc+": "+required_person+"\n");	
		}
		
		input.close();
		output.close();
	}

}
