package methodEmbedding.Counting_Sheep.S.LYD136;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author sans
 */
public class Gcj {

    public static void main(String[] args) {
        // TODO code application logic here
        String[] num=new String[300];
        Scanner in=new Scanner(System.in);        
        LinkedList numbers=new LinkedList();
        numbers.add('0');
        numbers.add('1');
        numbers.add('2');
        numbers.add('3');
        numbers.add('4');
        numbers.add('5');
        numbers.add('6');
        numbers.add('7');
        numbers.add('8');
        numbers.add('9');
        
        int mul=1,count=0;
        long checkNum = 0;
        int nCases=in.nextInt();
        for(int i=0;i<nCases;i++){
            num[i]=in.next();
        }
        for(int i=0;i<nCases;i++){            int check=Integer.parseInt(num[i]);
            if(check==0){
                numbers.removeAll(numbers);
        numbers.add('0');
        numbers.add('1');
        numbers.add('2');
        numbers.add('3');
        numbers.add('4');
        numbers.add('5');
        numbers.add('6');
        numbers.add('7');
        numbers.add('8');
        numbers.add('9');
                System.out.println("Case #"+(i+1)+": INSOMNIA");
            }
            else{
            while(!(numbers.isEmpty())){
            checkNum=check*mul;
            num[i]=Integer.toString((int) checkNum);
            //System.out.println(num[i]); 
            for(int j=0;j<num[i].length();j++){
                try{
                if(numbers.contains(num[i].charAt(j))){
                    int index=numbers.indexOf(num[i].charAt(j));
                    numbers.remove(index);  
                    //System.out.println(numbers.size());
                }
                }catch(Exception e){}
            }
            mul++;          
                       
            }
            System.out.println("Case #"+(i+1)+": "+ checkNum);
            mul=1;checkNum=0;
        numbers.add('0');
        numbers.add('1');
        numbers.add('2');
        numbers.add('3');
        numbers.add('4');
        numbers.add('5');
        numbers.add('6');
        numbers.add('7');
        numbers.add('8');
        numbers.add('9');
            
        }
        }
   
    }
    
}
