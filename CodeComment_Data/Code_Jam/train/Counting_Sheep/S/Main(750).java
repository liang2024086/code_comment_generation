package methodEmbedding.Counting_Sheep.S.LYD1057;


public class Main {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String fileinp = "/Users/vund2/A-small-attempt0.in";
        //int[] numbers = readInput.readFile4(args[0]);
        int[] numbers = readInput.readFile4(fileinp);
        int[] max = findMaxCoin.findMax4(numbers,readInput.lines);
        //System.out.println(Calendar.getInstance().get(Calendar.SECOND)+" "+Calendar.getInstance().get(Calendar.MILLISECOND));
        //System.out.println(max);
        exportOutput.export(max, fileinp);
        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("Time:" + estimatedTime + " ms");
    }
}
