package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1107;

import java.util.*;
public class revenge{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            System.out.print("Case #" + i + ": ");
            String temp = sc.next();
            int count = 0;
            boolean neg = false;
            while(temp.length()!=0){
                //System.out.println("temp = " + temp);
                if(temp.length()==1){
                    if(temp.charAt(0)=='-'){
                        count+=1;
                        temp = "";

                    }
                    else{
                        if(neg==true){
                            count+=2;
                            temp = "";
                        }
                        else{
                            temp = "";
                        }
                    }
                }
                else if(temp.charAt(temp.length()-1)=='-'){
                    if(neg ==false){
                        temp = temp.substring(0, temp.length()-1);
                        neg = true;
                    }
                    else{
                        temp = temp.substring(0, temp.length()-1);
                    }
                }
                else if(temp.charAt(temp.length()-1)=='+'){
                    if(neg==true){
                        count+=2;
                        neg = false;
                        temp = temp.substring(0, temp.length()-1);
                    }
                    else{
                        temp = temp.substring(0, temp.length()-1);
                    }
                }
            }
            System.out.println(count);
        }
    }
}
