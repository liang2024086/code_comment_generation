package methodEmbedding.Counting_Sheep.S.LYD1460;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;


public class CountingSheep {

	public static String CASE = "Case #";

	public static void main(String[] args) {
		try {
			File file = new File(args[0]);
			BufferedReader br = new BufferedReader(new FileReader(file));
			int cnt = Integer.parseInt(br.readLine());
			for (int i=0;i<cnt;i++) {
				Map<String, String> stock = new HashMap<String, String>();
				for (int j=0; j < 10; j++) {stock.put(String.valueOf(j), String.valueOf(j));}
				System.out.print(CASE+(i+1)+": ");
				Long N = Long.valueOf(br.readLine());
				if (N.equals(0L)){System.out.println("INSOMNIA");} else {
					Long roopCnt = 0L;
					while(true) {
						Long target = N * (roopCnt+1);
						char tmps[] = target.toString().toCharArray();
						for (char tmp : tmps) {
							if (stock.containsKey(String.valueOf(tmp))) {
								stock.remove(String.valueOf(tmp));
							}
						}
						if (stock.isEmpty()) {
							System.out.println(target);
							break;
						}
						roopCnt++;
					}
				}
			}
		} catch(Exception e) {System.out.print("miss");}
	}
}
