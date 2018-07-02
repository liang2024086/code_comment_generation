package methodEmbedding.Counting_Sheep.S.LYD572;

/**
 * Created by Vishal on 09-Apr-16.
 */
import  java.util.*;
public class Sheep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 0,i=0,j=1,n=0,temp=0,tempNum=0;
        boolean flag=true;
        int numbers[] = new int[10];
        while(j<=t){
            n = sc.nextInt();
            if(n==0){
                System.out.println("Case #"+j+": "+"INSOMNIA");
            }else if(n==1){
                System.out.println("Case #"+j+": "+"10");
            }else{
                count=0;
                flag = true;
                for(i=0;i<10;i++){
                    numbers[i] = 0;
                }
                tempNum = n;
                i=1;
                while(flag==true){
                    while(n>0){
                        temp = n%10;
                        if(numbers[temp]==0){
                            numbers[temp]++;
                            count++;
                        }
                        if(count>9){
                            System.out.println("Case #"+j+": "+tempNum*i);
                            flag=false;
                            n=0;
                            break;
                        }
                        n = n/10;
                    }
                    i++;

                    //System.out.println("count "+count+"  Number"+tempNum);
                    n = tempNum*i;


                }
            }
            j++;
        }

    }
}
