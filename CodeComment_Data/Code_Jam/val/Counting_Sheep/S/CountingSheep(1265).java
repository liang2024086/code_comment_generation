package methodEmbedding.Counting_Sheep.S.LYD714;


import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Scanner;

public class CountingSheep {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("D:/New Eclipse/wokspace/hackerrank/src/codejam/input1"));
		String line = br.readLine();
		int tc = Integer.parseInt(line);
		int count = 0;
		while(tc-- >0){
			int num = Integer.parseInt(br.readLine());
			count++;
			if(num == 0){
				System.out.println("Case #"+count+": INSOMNIA");
				continue;
			}
			HashSet<Integer> hs = new HashSet<Integer>();
			for(int i = 0; i< 10;i++){
				hs.add(i);
			}
			int k = 1;
			int n = num;
			while(!hs.isEmpty()){
				while(n != 0){
					if(hs.contains(n%10)){
						hs.remove(n%10);
					}
					n = n/10;
				}
				k++;
				n = num*k;
			}
			System.out.println("Case #"+count+": "+num*(k-1));
		}
		br.close();
	}
}
