package methodEmbedding.Standing_Ovation.S.LYD1331;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class g1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner (new InputStreamReader(System.in));
		//System.out.println("Enter NOT:");
		Scanner in = new Scanner(new File("//home//zappykid//Downloads//A-small-attempt2.in"));
		PrintWriter out = new PrintWriter(new FileWriter("//home//zappykid//Downloads//output2.txt"));
		int t = Integer.parseInt(in.next()); int i = 0;
		String[] inputs = new String[t+1];
		while(in.hasNext()){
			//System.out.println("inputs:");
			inputs[i] = in.nextLine();
			i++;
		}
		for(int j=1;j<=t;j++){
			String[] arr = inputs[j].split(" ");
			arr[1] = arr[1].replace(""," ").trim();
			String[] copy = arr[1].split(" ");
			int slev = Integer.parseInt(arr[0]);
			int index = 0; int nop=0; int standing = 0;
			while(index!=copy.length){
				if(index>standing && Integer.parseInt(copy[index])!=0){
					nop = index - standing;
					standing = standing + nop + Integer.parseInt(copy[index]);
				}else{
					standing = standing + Integer.parseInt(copy[index]);
				}
				index++;
				
			}
			//int casenum = (j-1) + 1;
			System.out.println("Case #"+j+":"+" "+nop);
			out.println("Case #"+j+":"+" "+nop);
			out.flush();
		}
		in.close();
		out.close();
		

	}

}
