package methodEmbedding.Standing_Ovation.S.LYD1532;


import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        ADataReader reader = new ADataReader();
        try {
            List<Problem> list = reader.readFile();
            ExecutorService service = Executors.newFixedThreadPool(8);
            for (Problem problem: list) {
                service.submit(problem);
            }
            service.shutdown();
            service.awaitTermination(10L, TimeUnit.MINUTES);
            (new ResultsWriter()).write(list);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
