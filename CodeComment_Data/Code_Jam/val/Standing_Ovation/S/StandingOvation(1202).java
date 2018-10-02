package methodEmbedding.Standing_Ovation.S.LYD800;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StandingOvation {

	public static void main(String args[]){
		try{
			File file = new File("standingovation.in");
			Scanner scanner = new Scanner(file);
			
			int testcase;
			testcase = scanner.nextInt();
			scanner.nextLine();
			
			for(int i=1; i<= testcase; i++){
				System.out.print("Case #".concat(String.valueOf(i)).concat(": "));
				int line = scanner.nextInt();
				String audience = scanner.nextLine();
				audience=audience.trim();
				
				int add = 0,tmp=Integer.parseInt(audience.charAt(0)+"");
				for(int j=1;j<=line;j++){
					int curr = Integer.parseInt(audience.charAt(j)+"");
					if((tmp) < j){
						add += j - tmp; 
						tmp += j - tmp;
					}
					tmp += curr;
				}
				System.out.println(add);
			}
			
		}catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}
	}
}
