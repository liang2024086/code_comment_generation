package methodEmbedding.Standing_Ovation.S.LYD259;

import static java.lang.Integer.parseInt;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;


// Library: May use Guava (https://github.com/google/guava)

public class StandingOvation {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("A-small-attempt0.in");
		List<String> lines = Files.readAllLines(path);

		int numCases = parseInt(lines.get(0));

		List<String> ret = new LinkedList<>();
		for (int i = 0; i < numCases; i++) {
			int offset = i * 1;
			List<String> items = Lists.newArrayList(Splitter.on(" ").splitToList(lines.get(1 + offset)));

			int invited = 0, standing = 0;
			int max = parseInt(items.get(0));
			for (int j = 0; j <= max; j++) {
				int num = parseInt(items.get(1).charAt(j) + "");

				if (j > standing) {
					invited++;
					standing++;
				}
				standing += num;
			}

			ret.add(invited + "");
		}

		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < ret.size(); i++) {
			String line = "Case #" + (i + 1) + ": " + ret.get(i);
			stringBuilder.append(line + "\n");
		}
		Files.write(Paths.get("out.txt"), stringBuilder.toString().getBytes(StandardCharsets.UTF_8));
	}

}
