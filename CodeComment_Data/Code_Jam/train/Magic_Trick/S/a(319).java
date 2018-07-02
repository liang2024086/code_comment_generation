package methodEmbedding.Magic_Trick.S.LYD842;

/**
 * Created by oscar on 11-04-14.
 */
import java.util.Scanner;

public class a {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        for(int i = 0; i < cases; i++){
            int row1 = scan.nextInt();
            scan.nextLine();
            String possibles1 = "";
            for(int j = 1; j <= 4; j++){
                String line = scan.nextLine();
                if(row1 == j){
                    possibles1 = line;
                }
            }
            int row2 = Integer.parseInt(scan.nextLine());
            String possibles2 = "";
            for(int j = 1; j <= 4; j++){
                String line = scan.nextLine();
                if(row2 == j){
                    possibles2 = line;
                }
            }

            String[] possiblesNums1 = possibles1.split(" ");
            String[] possiblesNums2 = possibles2.split(" ");
            int found = 0;
            boolean bad = false;
            for(int j = 0; j < 4; j++){
                for(int x = 0; x < 4; x++){
                    if(Integer.parseInt(possiblesNums1[j]) == Integer.parseInt(possiblesNums2[x])){
                        if(found == 0){
                            found = Integer.parseInt(possiblesNums1[j]);
                        } else {
                            bad = true;
                            break;
                        }
                    }
                }
            }
            System.out.print("Case #"+(i+1)+": ");
            if(bad) System.out.println("Bad magician!");
            else
            if(found == 0){
                System.out.println("Volunteer cheated!\n");
            } else
                System.out.println(found);
        }
    }
}
