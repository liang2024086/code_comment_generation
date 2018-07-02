package methodEmbedding.Counting_Sheep.S.LYD1166;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        AtomicInteger index = new AtomicInteger(1);
        Files.write(Paths.get("out.txt"),
                Files.readAllLines(Paths.get("in.txt")).stream().filter((s) -> !s.isEmpty()).skip(1)
                        .map((in) -> {
                            int n = Integer.valueOf(in), i = 0;
                            if (n == 0) {
                                return "INSOMNIA";
                            }
                            Set<Integer> chars = new HashSet<>();
                            while (chars.size() < 10) {
                                i++;
                                int N = i * n;
                                String.valueOf(N).chars().boxed().forEachOrdered(chars::add);
                            }
                            return String.valueOf(i * n);
                        })
                        .map((in) -> String.format("Case #%d: %s", index.getAndIncrement(), in))
                        .collect(Collectors.toList()),
                StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }
}
