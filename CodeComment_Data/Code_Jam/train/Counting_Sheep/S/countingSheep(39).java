package methodEmbedding.Counting_Sheep.S.LYD383;

// @author Ahmad Kamil Almasyhur (@145150200111170)
import java.util.*;

public class countingSheep {

    public static void main(String[] args) {
        int arrayChk[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int cases = 1;
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();
        for (int g = cases; g <= q; g++) {
            int arrayCheck[] = new int[10];
            int n = input.nextInt();
            int j = 0;
            boolean cek = false, checkZero = false;
            for (int i = 1; i <= 100; i++) {
                j = i * n;
                for (int k = 0; k < String.valueOf(j).length(); k++) {
                    switch (String.valueOf(j).charAt(k)) {
                        case '0':
                            checkZero = true;
                            arrayCheck[0] = 0;
                            break;
                        case '1':
                            arrayCheck[1] = 1;
                            break;
                        case '2':
                            arrayCheck[2] = 2;
                            break;
                        case '3':
                            arrayCheck[3] = 3;
                            break;
                        case '4':
                            arrayCheck[4] = 4;
                            break;
                        case '5':
                            arrayCheck[5] = 5;
                            break;
                        case '6':
                            arrayCheck[6] = 6;
                            break;
                        case '7':
                            arrayCheck[7] = 7;
                            break;
                        case '8':
                            arrayCheck[8] = 8;
                            break;
                        case '9':
                            arrayCheck[9] = 9;
                            break;
                    }
                }
                for (int h = 0; h < 10; h++) {
                    if (Arrays.equals(arrayCheck, arrayChk) && checkZero) {
                        cek = true;
                        break;
                    }
                }
                if (cek) {
                    break;
                }
            }
            if (cek) {
                System.out.println("Case #" + g + ": " + j);
            } else {
                System.out.println("Case #" + g + ": INSOMNIA");
            }

        }
    }
}
