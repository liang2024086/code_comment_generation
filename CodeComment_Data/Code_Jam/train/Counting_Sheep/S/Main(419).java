package methodEmbedding.Counting_Sheep.S.LYD1688;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		int num = 0, first = 0, addNum = 0;
		FileInputStream fs = new FileInputStream("A-small-attempt2.in");
		FileWriter fw = new FileWriter("p1out.txt");
		Scanner s = new Scanner(fs);
		num = s.nextInt();
		for(int i = 0; i < num; i++){
			first = s.nextInt();
			addNum = first;
			int mark[] = new int[10];
			int count = 0;
			if(first == 0){
				fw.write("Case #" + (i + 1) +": INSOMNIA\n");
			}else{
				while(true){
					int temp = first, cur = 0;
					boolean flag = false;
					while(temp > 0){
						cur = temp % 10;
						temp = temp / 10;
						if(mark[cur] == 0){
							mark[cur] = 1;
							count ++;
							if(count == 10){
								fw.write("Case #" + (i + 1) +": " + first + "\n");
								flag = true;
								break;
							}
						}
					}
					if(flag){
						break;
					}
					first += addNum;
				}
			}
		}
		fs.close();
		fw.close();
	}
}
