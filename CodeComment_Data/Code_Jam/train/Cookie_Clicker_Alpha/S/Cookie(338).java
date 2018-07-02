package methodEmbedding.Cookie_Clicker_Alpha.S.LYD927;

import java.io.*;
import java.math.BigDecimal;
import java.util.Scanner;

public class Cookie {

    /**
     * @param args
     */
    public static void main(String[] args) throws IOException {
	System.setIn(new FileInputStream("test.in"));
	System.setOut(new PrintStream("file.out"));
	Scanner in = new Scanner(System.in);
	int z = in.nextInt();
	for (int i = 1; i <= z; i++) {
	    BigDecimal cost = in.nextBigDecimal();
	    BigDecimal farmrate = in.nextBigDecimal();
	    BigDecimal win = in.nextBigDecimal();

	    BigDecimal currentRate = new BigDecimal(2);
	    BigDecimal totalTime = new BigDecimal(0);

	    BigDecimal lowest = win.divide(currentRate);
	    while(true){
		BigDecimal secondsToNext = cost.divide(currentRate, 8, BigDecimal.ROUND_HALF_UP);
		totalTime = totalTime.add(secondsToNext);
		currentRate = currentRate.add(farmrate);
		BigDecimal timeToWin = totalTime.add(win.divide(currentRate,8,BigDecimal.ROUND_HALF_UP));
		if(lowest.subtract(timeToWin).signum() == 1)
		    lowest = timeToWin;
		if(totalTime.subtract(lowest).signum() == 1)
		    break;
	    }
	    System.out.println("Case #" + i + ": " + lowest);
	}
    }

}
