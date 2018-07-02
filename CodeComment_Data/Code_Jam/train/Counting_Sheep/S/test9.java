package methodEmbedding.Counting_Sheep.S.LYD969;

import java.util.Scanner;
import java.util.HashSet;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream; 

public class test9 {
	public static void main(String[] arg) throws Exception{
		FileInputStream fis=new FileInputStream("A-small-attempt0.in");  
        System.setIn(fis); 
        PrintStream ps=new PrintStream(new FileOutputStream("Output"));  
        System.setOut(ps);
		HashSet<Integer> set = new HashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		int zushu = sc.nextInt();
		int shu[]=new int [zushu];
		for(int i=0;i<zushu;i++){
			shu[i]=sc.nextInt();			
		}
		for(int i=0;i<zushu;i++){
			if(shu[i]==0){
				System.out.println("Case #"+(i+1)+": INSOMNIA");
				continue;
			}
			int shuzi =shu[i];			
			int count = 1;
			while(set.size()<=9){
				int shuzi1=shuzi*count;
				String shuzi2=String.valueOf(shuzi1);
				char [] shuzi3 = shuzi2.toCharArray();
				for(int j=0;j<shuzi3.length;j++){
					int n = Integer.parseInt(shuzi3[j]+"");;
					set.add(n);
				}
				count ++;
			}
//			System.out.print("Case #"+(i+1)+": ");
			System.out.println("Case #"+(i+1)+": "+shuzi*(count-1));
			set.clear();
		}

		
	}

}
