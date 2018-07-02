package methodEmbedding.Standing_Ovation.S.LYD1146;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		// TODO Auto-generated method stub
		String path="C:\\Users\\cmontenegro\\workspace\\";
		Scanner sc=null; 
		PrintWriter writer = new PrintWriter(path+"output.txt", "UTF-8");
		
		try {
			sc = new Scanner(new File("C:\\Users\\cmontenegro\\Downloads\\A-small-attempt2.in"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int problems=sc.nextInt();
		for(int i=0;i<problems;i++){
			int friends=0;
			int maxShy=sc.nextInt();
			int stoodUp=0;
			String people=sc.next();
			for(int j=0;j<=maxShy;j++){
				int value=Integer.parseInt(people.substring(j, j+1));
				if(value==0 || j<=stoodUp){
					stoodUp+=value;
				}else{
					friends+=j-stoodUp;
					stoodUp+=j-stoodUp+value;
				}
			}
			System.out.println("Case #"+(i+1)+": "+friends);
			writer.println("Case #"+(i+1)+": "+friends);
			
		}
		writer.close();
	}

}
