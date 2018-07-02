package methodEmbedding.Counting_Sheep.S.LYD1465;


import java.util.Scanner;

/**
 * Created by hoshank on 9/4/16.
 */

/*

author : Hoshank Ailani
*/



public class CountingSheep {

    public static void main(String[] args) {
        int N,t;

        Scanner in=new Scanner(System.in);
        t=in.nextInt();
        int looper=t;
        int displayer=0;
        while(looper-->0) {
            N = in.nextInt();
            int counter=0;
            int flag=0;
            int peak=0;
            boolean[] arr = new boolean[10];
            for (int i = 0; i < 10; i++) {
                arr[i] = false;
            }
            if(N<10){
                peak=100;
            }
            else peak=N;
            for (int i = 1; i <peak;i++){
                    if(counter<10){
                        int num=i*N;
                        while(num>0){
                            int x=num%10;
                            if(!arr[x]) {
                                arr[x] = true;
                                counter++;
                                if(counter==10){
                                    flag=i;
                                }
                            }
                            num=num/10;

                        }
                    }

            }
            if(counter<10){
                System.out.println("Case:"+displayer+": "+"INSOMNIA");
            }
            else if(counter==10){
                System.out.println("Case:"+displayer+": "+ (flag*N));
            }
            displayer++;
            //System.out.println("counter" + counter);

        }

    }
}

