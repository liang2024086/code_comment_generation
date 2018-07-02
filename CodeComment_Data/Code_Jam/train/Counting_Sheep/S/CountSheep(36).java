package methodEmbedding.Counting_Sheep.S.LYD1283;

import java.util.Scanner;

public class CountSheep {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int c=0;
        int n=0;
        try{
            c = Integer.parseInt(leer.nextLine());
        }catch(NumberFormatException e){};

        for(int d=0;d<c;d++){
            try{
                n = Integer.parseInt(leer.nextLine());
            }catch(NumberFormatException e){};
            int[] arr = {0,1,2,3,4,5,6,7,8,9};
            Boolean s = true;
            int res = 0;
            String caso = "Case #"+(d+1)+": ";
            if(n != 0){
                for(int i=1; s ;i++){
                    String r="";
                    r += (n * i);
                    res = (n * i);
                    String[] num = r.split("");
                    for(int j =0;j<num.length; j++){
                        int w = Integer.parseInt(num[j]);
                        arr[w] = -1;
                    }
                    s = false;
                    for(int k=0; k<10;k++){
                        if(arr[k] != -1){
                            s = true;
                            k=12;
                        }
                    }
                }
                caso += res;
            }else{
                caso += "INSOMNIA";
            }
            System.out.println(caso);
        }
    }
}
