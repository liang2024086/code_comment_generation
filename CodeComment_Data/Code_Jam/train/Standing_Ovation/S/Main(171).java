package methodEmbedding.Standing_Ovation.S.LYD436;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int n;
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		List<Integer[]> list = new ArrayList<Integer[]>();    
		Scanner fileScanner = new Scanner(new File("C:\\Users\\Haseeb\\GoogleCodeJam\\Problems\\src\\problem1\\input.txt"));
		n = Integer.parseInt(fileScanner.nextLine());
		for(int i=0;i<n;i++){
			String temp[] = fileScanner.nextLine().split(" ");
			int peopleCount = 0;
			int answer = 0;
			int smax = Integer.parseInt(temp[0]);
			String values = temp[1];
			for(int j=0;j<smax+1;j++){
				char c = values.charAt(j);
				
				if(c!='0'){
//					System.out.println(c);
//					System.out.println("       "+ j +" " + peopleCount);
					if(j>peopleCount){
						answer+= j - peopleCount;
						peopleCount+= j - peopleCount;
					}
				}
				peopleCount += Integer.parseInt(c+"");
			}
			System.out.println("Case #"+(i+1)+": "+answer);
			
		}

	}

}
