package methodEmbedding.Standing_Ovation.S.LYD207;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sandaruwan
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        sc.next();
        ArrayList<Integer> arl = new ArrayList<>();
        
        for (int i = 0; i < rows; i++) {
            String st = sc.nextLine();
            //if (!st.equals("")) {
                String[] ar = st.split(" ");
                //    int most = Integer.parseInt(ar[0]);
                String shlist = ar[1];

                int tot = 0;
                int man = 0;
                
                for (int j = 0; j < shlist.length(); j++) {
                //    System.out.println("sh"+shlist +" "+ shlist.charAt(j)+"");
                    int cnt = Integer.parseInt( shlist.charAt(j)+"" );
                //    System.out.println("c "+cnt);
                    
                    if (tot < j && j != 0) {
                        man += 1;
                        tot++;
                    }
                    
                    if(cnt  != 0 ){
                        tot +=cnt;
                    }
                    
                }
                arl.add(man);

           //     System.out.println("man " + man);
            //}

        }
        for (int i = 0; i < arl.size(); i++) {
            Integer num = arl.get(i);
            System.out.println("Case #"+(i+1)+": "+num);
        }

    }

}
