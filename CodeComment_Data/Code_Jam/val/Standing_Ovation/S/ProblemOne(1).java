package methodEmbedding.Standing_Ovation.S.LYD1601;


import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ProblemOne {
	public static void main(String[] args) throws Exception {
		File inFile	=	new File("./src/codejam/inputs/inputA.in");
		Scanner scanner = new Scanner(inFile);
		
		File outFile	=	new File("./src/codejam/outputs/A-small-attempt0.out");
		PrintWriter printWriter	=	new PrintWriter(outFile);
		
		String temp	=	scanner.nextLine();
		int t	=	Integer.parseInt(temp);
		
		for(int i=0;i<t;i++){
			temp	=	scanner.nextLine();
			int n	=	Integer.parseInt(temp.split(" ")[0]);
			char[] elements	=	temp.split(" ")[1].toCharArray();
			int sum=0;
			int count	=	0;
			for(int j=0; j<=n; j++){
				if(sum<j){
					count +=	j-sum;
					sum	=	j;
				}
				sum	+=Integer.parseInt(String.valueOf(elements[j]));	
			}
			printWriter.write("Case #"+(i+1)+": "+count+"\n");
		}
		scanner.close();
		printWriter.close();
	}

}
