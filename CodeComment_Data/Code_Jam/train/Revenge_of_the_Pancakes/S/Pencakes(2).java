package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1132;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pencakes {

	private static Scanner scan;

	public static void main(String[] args) throws FileNotFoundException {
		scan = new Scanner(new File("E:/cj/B-small-attempt0.in"));
		int cases = scan.nextInt();
	
		String s = new String();
		int c=1;
		char sign = 0;
		boolean bflag = true;
		
		for(int i=1; i<=cases; i++){
			s = scan.next();			
			int count = 0;			
			char[] stack = new char[s.length()];
			
			for(int j=0;j<s.length();j++){
				stack[j] = s.charAt(j);
			}			
		
			for(;;count++){
				for(int j=0;j<s.length();j++){
					if(stack[j]=='-'){
						bflag = false;
						break;
					}
				}
				if(bflag==true)
					break;
				
				for(int j=0;j<stack.length;j++){
					if(j==0){
						sign = stack[j];
						continue;
					}
					if(stack[j]==sign){
						c++;
						continue;
					}
					else
						break;
					
				}
				
				for(int j=0; j<c; j++){
					if(stack[j]=='+')
						stack[j]='-';
					else
						stack[j]='+';
				}				
				c = 1;
				bflag = true;
			}
			
			System.out.println("Case #" + i + ": " + count);
			
		}		
	}
}
