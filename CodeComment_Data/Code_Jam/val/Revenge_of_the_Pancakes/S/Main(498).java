package methodEmbedding.Revenge_of_the_Pancakes.S.LYD216;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        AtomicInteger caseIndex = new AtomicInteger(1);
        long time = System.currentTimeMillis();
        Files.write(Paths.get("out.txt"),
                Files.readAllLines(Paths.get("in.txt")).stream().filter((s) -> !s.isEmpty()).skip(1)
                        .parallel()
                        .map((in) -> {
                            int moves = 0;
                            int index;
                            while ((index = in.lastIndexOf('-')) != -1) {
                                if (index == 0) {
                                    moves++;
                                    return moves;
                                }
                                int plusIndex = -1;
                                StringBuilder builder = new StringBuilder(in.length());
                                while (in.charAt(++plusIndex) == '+') {
                                    builder.append('-');
                                }
                                if (builder.length() > 0) {
                                    moves++;
                                    in = builder.toString() + in.substring(plusIndex, in.length());
                                    builder.setLength(0);
                                }
                                index++;
                                for (int i = 0; i < index; i++) {
                                    builder.append(in.charAt(i) == '+' ? '-' : '+');
                                }
                                moves++;
                                in = builder.reverse().toString() + in.substring(index, in.length());
                            }
                            return moves;
                        }).sequential()
                        .map((in) -> String.format("Case #%d: %d", caseIndex.getAndIncrement(), in))
                        .collect(Collectors.toList()),
                StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        System.out.println(System.currentTimeMillis() - time);
    }
}
