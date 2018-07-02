package methodEmbedding.Revenge_of_the_Pancakes.S.LYD452;




import java.util.Scanner;

public class Code{
    
    
    
    public static void main(String[] args) {

        Scanner sd = new Scanner(System.in);
        Scanner ss = new Scanner(System.in);
        int n = sd.nextInt();
        int m,c,i;
         String s;
        for (int g = 0; g < n; g++) {
            s = sd.next();
            sd.nextLine();
            m = 0;
            c = 0;
            i = 0;
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(j)=='+')
                    m++;
            }

            if(m==s.length()){
              System.out.println("Case #"+(g+1)+": "+0);
            }
            else{
            while(i<s.length()){
                if(s.charAt(i)=='-'){
                    c++;
                    i++;
                    while(i<s.length()){
                        if(s.charAt(i)=='-'){
                            i++;
                        }else{
                            break;
                        }
                    }
                    if(i<s.length()){
                        i++;
                        while(i<s.length()){
                            if(s.charAt(i)=='-'){
                                c++;
                                break;
                            }else{
                                i++;
                            }
                        }
                    }
                }else{
                    c++;
                    i++;
                    while(i<s.length()){
                        if(s.charAt(i)=='+'){
                            i++;
                        }else{
                            break;
                        }
                    }
                }
            }
        System.out.println("Case #"+(g+1)+": "+c);
        }
        }
    }
    
}
