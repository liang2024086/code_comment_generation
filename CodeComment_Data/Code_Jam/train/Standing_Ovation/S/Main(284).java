package methodEmbedding.Standing_Ovation.S.LYD161;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        
//        Scanner sc = new Scanner(System.in) ;
//        Scanner sc = new Scanner(new File("input.txt")) ;
        Scanner sc = new Scanner(new File("A-small-attempt1.in")) ;
//        FileOutputStream out = new FileOutputStream("output.txt");
//        PrintWriter out = new PrintWriter("output.txt");
        PrintWriter out = new PrintWriter("output.txt");
        
        
        int TEST_CASE_NUMBER = sc.nextInt();
        
        for (int test_case = 1; test_case <= TEST_CASE_NUMBER; test_case++) 
        {
            int MAX_SHYNESSS = sc.nextInt();
            String str = sc.next();
            
            int answer = 0;
            int sum = 0;
            char shift = '0';
//            System.out.println(str);
            for(int i = 0; i  <= MAX_SHYNESSS; i++) 
            {
                char element = str.charAt(i);
                int elementInt = element - shift;
//                System.out.println(element);
//                boolean flagChecked = false
                if(elementInt > 0) 
                {
                    
                    if(i > sum) {
                        answer += i - sum;
                        sum += i -sum;
//                        System.out.println(answer);
                    }
                    
                    
                }
                sum += elementInt;
//                System.out.println(sum);
            }
            
            out.println("Case #"+test_case+": "+answer);
//            System.out.println("____________________");
        }
        
        out.close();
    }

}
