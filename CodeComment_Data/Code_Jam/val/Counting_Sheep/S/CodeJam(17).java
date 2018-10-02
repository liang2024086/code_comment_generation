package methodEmbedding.Counting_Sheep.S.LYD1627;


//A
//Counting Sheep
import java.io.*;
import java.util.*;
public class CodeJam {

	public static void main(String[] args) throws NumberFormatException, IOException{
		//BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
		Scanner cin = new Scanner(System.in);
		
		int T = cin.nextInt();
		
		for(int tcase = 1; tcase <= T; tcase++){
			int n = cin.nextInt();
			int y = n;
			if(y==0){
				System.out.println("Case #" + tcase + ": INSOMNIA");
			}
			else{
				boolean digits[] = new boolean[10];
				int digitCount = 0;
				
				for(int mult = 1; mult < 1000; mult++){
					y = n * mult;
					String yString = "" + y;
					//for each digit of y
					for(int i = 0; i < yString.length(); i++){
						int curDigit = yString.charAt(i) - 48;
						if(!digits[curDigit]){
							digitCount++;
							digits[curDigit] = true;
						}
					}
					if(digitCount == 10){
						break;
					}
				}
				if(digitCount < 10){
					System.out.println("Case #" + tcase + ": INSOMNIA");
				}
				else{
					System.out.println("Case #" + tcase + ": " + y);
				}
			}
		}
	}
}
