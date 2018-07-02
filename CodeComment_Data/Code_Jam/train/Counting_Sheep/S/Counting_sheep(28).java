package methodEmbedding.Counting_Sheep.S.LYD1070;



import java.util.Scanner;

public class Counting_sheep {
     
    
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int test_cases=a.nextInt();
        for(int j=0;j<test_cases;j++){
            int myarray[]=new int[10];
            int count=0;
            int number=a.nextInt();
            int round=1;
            //number eka code eka madadi chage wena nisa,original number eka mokakda kiyala danaganna fix_number eken puluwan
            int result = 0;
            int fix_number=number;
            int fix_number2;
            int non_stop=0;
            while(count!=10){
                round=round+1;
                fix_number2=number;
                if(round>2 && fix_number==number){
                    
                    System.out.println("INSOMNIA");
                    non_stop=1;
                    break;
                }
                while (number > 0) {
                    
                    
                    int digit=( number % 10);
                    if(myarray[digit]==0){
                        myarray[digit]=1;
                        count=count+1;
                    }
                    number = number / 10;
                }

                if(count!=10){// array eke pirila nathi part ekak tiyewa
                    number=fix_number*round;

                }
                else{
                    result=fix_number2;
                }
            }
            if(non_stop!=1)
                System.out.println(result);
        }
    }
}
        
        

