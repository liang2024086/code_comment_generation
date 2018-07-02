package methodEmbedding.Counting_Sheep.S.LYD844;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Bleatrix {
public static void main(String[] args) throws Exception {
	BufferedReader fir = new BufferedReader(new FileReader(new File("input.txt")));
	int total = Integer.parseInt(fir.readLine());
	for(int i=0;i<total;i++){
		int n = Integer.parseInt(fir.readLine());
		int x = 1;
		int num = 0;
		List<String> ls = new ArrayList<String>();
		while(n*x!=n*(x+1) && ls.size()<10){
			num = n*x;
			char[] res = (""+num).toCharArray();
			for(char c : res) {
				if (!ls.contains(""+c)){
					ls.add(""+c);
				}
			}
			x++;
		}
		if (ls.size()<10){
			System.out.println("Case #"+(i+1)+": INSOMNIA");
		} else {
			System.out.println("Case #"+(i+1)+": " + num);
		}
	}
}
}
