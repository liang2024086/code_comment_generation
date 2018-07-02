package methodEmbedding.Counting_Sheep.S.LYD231;

import java.io.*;
import java.util.*;
public class HelloWorld{

 public static void main(String []args)throws IOException{
        ArrayList<Integer> counter = new ArrayList<>();
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();
        if(t>=1 && t<=100){
            int cases[] = new int[t];
            for(int i=0;i<t;i++){
                int n = in.nextInt();
                if(n<0 || n>1000000){
                    System.exit(0);
                }else{
                    cases[i] = n;
                }
            }
            
            
            for(int i=0;i<t;i++){
                int num = cases[i];
                if(num==0)
                    System.out.println("Case #"+(i+1)+": INSOMNIA");
                else{
                    counter.clear();
                    int c =0;
                    int cp;
                    int tcp=0;
                    //System.out.println("Starting with " + num);
                    while(counter.size()!=10){
                            c++;
                           cp = num*c;
                           //System.out.println(cp);
                           tcp = cp;
                           while(cp>0){
                               int dig = cp%10;
                               if(!counter.contains(dig)){
                                   counter.add(dig);
                                   //System.out.println("Added "+dig);
                               }
                               cp = cp/10;
                               
                           }
                           
                           if(c>100){
                               System.out.println("Case #"+(i+1)+": INSOMNIA");
                               counter.clear();
                               break;
                           }
                    }
                    if(counter.size()==10){
                        System.out.println("Case #"+(i+1)+": "+tcp);
                    }
                }
            }
        }
            
    }
 }



