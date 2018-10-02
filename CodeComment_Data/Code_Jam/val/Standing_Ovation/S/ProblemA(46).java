package methodEmbedding.Standing_Ovation.S.LYD480;

import java.util.Scanner;

public class ProblemA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.valueOf(scanner.nextLine());
        for(int i=0;i<lines;i++){
            String s = scanner.nextLine();
            String[] split = s.split(" ");
            int len = Integer.parseInt(split[0]);
            int currentStand=0,add=0;
            for(int j=0;j<=len;j++) {
                if(currentStand>=j){
                    currentStand+=Integer.valueOf(Character.toString(split[1].charAt(j)));
                } else {
                    while(currentStand<j){
                        add++;
                        currentStand++;
                    }
                    currentStand+=Integer.valueOf(Character.toString(split[1].charAt(j)));
                }
            }
            System.out.print("Case #"+(i+1)+": "+add);
            System.out.println();
        }
    }

}
