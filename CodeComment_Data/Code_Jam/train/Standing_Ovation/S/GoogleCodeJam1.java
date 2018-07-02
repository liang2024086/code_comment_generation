package methodEmbedding.Standing_Ovation.S.LYD816;


import java.util.Scanner;

/**
 *
 * @author bladekp
 */
public class GoogleCodeJam1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        String trash = scanner.nextLine();
        int output;
        for (int i=0; i<T; i++){
            output = 0;
            String S = scanner.nextLine();
            String parts[] = S.split(" ");
            int Smax = Integer.parseInt(parts[0]);
            String s = parts[1];
            int sum = 0;
            for (int j=0; j<Smax; j++){
                sum += (s.charAt(j) - 48);
                if (sum>0) sum --;
                else output++;
            }
            System.out.println("Case #"+(i+1)+": "+ output);
        }
    }
    
}
