package methodEmbedding.Counting_Sheep.S.LYD1253;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author himanshu
 */
public class Codejam {
    public static void main(String[] args) throws Exception{
       
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            int i =  1;
            while(i!=t){
                String s = br.readLine();
                ArrayList list = new ArrayList();
                if(s.equals("0")) {
                    System.out.println("Case #"+i+": INSOMNIA");
                }
                else{
                    int num = Integer.parseInt(s);
                    int l = num;
                    int k = 1;
                        while(list.size()!=10){
                            s = num+"";
                            for (int j = 0; j < s.length(); j++) {
                                char c = s.charAt(j);
                                if(!list.contains((int)c)){
                                    list.add((int)c);
                                }
                            }
                            k++;
                            num = k*l;
                           }
                        System.out.println("Case #"+i+": "+(num-l));
                }
               i++;
            }
                
        }
}
    


