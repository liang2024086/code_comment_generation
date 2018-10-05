package methodEmbedding.Counting_Sheep.S.LYD1582;


import java.io.BufferedReader;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.google.codejam.utils.FileUtils;

public class CountingSheep {

	public static void main(String[] args) throws Exception {
		BufferedReader buffer = FileUtils.readResource(new File("/home/rmartine/Development/workspace/iot/gcj/resources/2016/countingSheep/small.in"));
		
		Integer cases = Integer.parseInt(buffer.readLine());
		Integer total = cases;
		
		while(cases > 0) {
			Integer number = Integer.parseInt(buffer.readLine());
			
			Set<String> numbers = new HashSet<>();
			int i = 0;
			while(numbers.size() < 10) {
				List<String> line = Arrays.asList(String.valueOf((i+1)*number).split(""));
				
				numbers.addAll(line);
				if(i > 1000) break;
				i++;
			}
			String value = (i > 1000) ? "INSOMNIA" : String.valueOf(i*number);
			System.out.println(String.format("Case #%d: %s", (total - cases)+1, value));
			cases--;
		}
	}

}
