package methodEmbedding.Revenge_of_the_Pancakes.S.LYD84;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class B {
    public B() {
        super();
    }

    public static void main(String[] args) throws FileNotFoundException,
                                                  IOException {
        B b = new B();
        BufferedReader br = new BufferedReader(new FileReader("B-small-attempt2.in"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("2.out"));
        int T = Integer.parseInt(br.readLine());
        forloop:    for(int ii=1; ii <= T; ii++){
            String s = br.readLine();
           // s = "+---++----";
            int cnt = 0;
            int cnt2 = 0;
            for(int i=0; i < s.length(); i++){
                if (s.charAt(i) == '+'){
                    cnt++;
                }
                if (s.charAt(i) == '-'){
                    cnt2++;
                }
            }
            int res = 0;
            int res1 = 0;
            if (cnt2 == s.length()){
                bw.write("Case #" + ii + ": " + "1");
                bw.newLine();
                continue forloop;
            }
            if (cnt == s.length()){
                bw.write("Case #" + ii + ": " + "0");
                bw.newLine();
                continue forloop;
            }
            else{
                
                    
                    String s1 = "";
                    String s2 = "";
                    int cnt3 = 0;
                
                    int f =0;
                   // while(true){
                    for (int i=0; i < s.length()-1; i++){
                      cnt3 = 0;
                        char[] st2 = s.toCharArray();
                        for (int j1=0; j1 < st2.length; j1++){
                            if (st2[j1] == '+'){
                                cnt3++;
                            }
                        }
                        if (cnt3 == st2.length){
                            System.out.println("inside1");
                            bw.write("Case #" + ii + ": " + res1);
                            bw.newLine();
                            continue forloop;
                        }
                       // s1 = "";
                       // int f = 0;
                        int cnt4 = 0;
                        if (s.charAt(i) == s.charAt(i+1)){
                           cnt4++;
                          
                        }
                        else{
                            res1++;
                            f = 0;
                            for(int j1=0;j1 <= i+1; j1++){
                                if (s.charAt(0) == '+')
                                    s2 = s2 + "-";
                                else{
                                    
                                    s2 = s2 + "+";
                                }
                            }
                            
                            for(int j1 = i+2; j1 < s.length(); j1++){
                                s2 = s2 +  s.charAt(j1);
                            }
                           // s = "";
                           System.out.println("s2=" + s);
                            s = s2;
                            s2 = "";
                            s1 = "";
                         //   i=0;
                            System.out.println("s=" + s);
                            int cnt1 = 0;
                            int cnt5 = 0;
                          char[] st1 = s.toCharArray();
                            for (int j1=0; j1 < st1.length; j1++){
                                if (st1[j1] == '+'){
                                    cnt1++;
                                }
                                
                                if (st1[j1] == '-'){
                                    cnt5++;
                                }
                            }
                            if (cnt1 == st1.length){
                                System.out.println("inside");
                                bw.write("Case #" + ii + ": " + res1);
                                bw.newLine();
                                continue forloop;
                            }
                            else{
                                if (cnt5 == st1.length){
                                    System.out.println("inside");
                                    bw.write("Case #" + ii + ": " + (res1+1));
                                    bw.newLine();
                                    continue forloop;
                                }
                            }
                        }
                        //else{
                          //  s1 = s1 + '+';
                        //}
                        System.out.println("res1 = " + res1);
                    }
                    
                }
            
                    
                    
            
            
        }
        bw.close();
    }
}
