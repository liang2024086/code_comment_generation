package methodEmbedding.Standing_Ovation.S.LYD539;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        int cases = 0;
        int people;
        
        while (a-- > 0) {
            b = sc.nextInt();
            if (b == 0) {
                sc.next();
                System.out.println("Case #"+(cases+1)+": 0");
            }else{
                String x = sc.next();
                int p = x.length();
                people = 0;
                int acumu = 0;
                for (int i = 0; i < p; i++) {
                    char ch = x.charAt(i);
                    if(ch != '0'){
                        if(i == 0){
                            people = Integer.parseInt(ch+"");
                        }else{
                            if(i > people){
                                int res = (i - people);
                                people =  people + res + Integer.parseInt(ch+"");
                                acumu += res;
                            }else{
                                people += Integer.parseInt(ch+"");
                            }
                        }
                    }
                }
                System.out.println("Case #"+(cases+1)+": " + acumu);
            }
            cases++;
        }


    }
}

