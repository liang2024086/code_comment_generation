package methodEmbedding.Counting_Sheep.S.LYD190;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;

public class countSheep {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new FileReader("A-small-attempt0.in"));
		int N=Integer.valueOf(sc.nextLine());
		FileOutputStream fs = new FileOutputStream(new File("115.txt"));
		PrintStream p = new PrintStream(fs);
		HashSet<Character> set=new HashSet<>();
		loop:for(int i=1;i<=N;i++){
			set=new HashSet<>();
			int count=0;
			String str=sc.nextLine();
			int num=Integer.valueOf(str);
			System.out.println(num);
			if(num==0){
				p.println("Case #"+i+": INSOMNIA");
				continue loop;
			}
			for(int j=1;j<=100;j++){
				str=""+(j*num);
				char[] letters=str.toCharArray();
				for(char c:letters){
					set.add(c);
				}
				System.out.println("size:"+set.size());
				if(set.size()==10){
					p.println("Case #"+i+": "+(j*num));
					continue loop;
				}
			}
			
			
		}
	}
}
