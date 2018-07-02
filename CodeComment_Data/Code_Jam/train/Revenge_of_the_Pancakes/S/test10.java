package methodEmbedding.Revenge_of_the_Pancakes.S.LYD916;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class test10 {
	public static void main(String[] arg) throws Exception{
		FileInputStream fis=new FileInputStream("B-small-attempt0.in");  
        System.setIn(fis); 
        PrintStream ps=new PrintStream(new FileOutputStream("Output"));  
        System.setOut(ps);
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();		
		for(int i=0;i<N;i++){
			String cakes =sc.next();
			char [] cakes1 = cakes.toCharArray();
			int num = 0;
			int count = 0;
			while(num<cakes1.length-1){
				if(cakes1[num]!=cakes1[num+1]){
					count++;				
				}
				num++;
			}
			if(cakes1[num]=='-'){
				count++;
			}
			System.out.println("Case #"+(i+1)+": "+count);
		}
	}

}
