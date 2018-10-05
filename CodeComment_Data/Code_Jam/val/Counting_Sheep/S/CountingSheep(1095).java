package methodEmbedding.Counting_Sheep.S.LYD1430;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner; 

/**
 *
 * @author RK
 */
public class CountingSheep {
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		FileOutputStream out = new FileOutputStream("CountingSheep.txt");
		int t,ct = 1;
		t = sc.nextInt();
		while ((t--) > 0) {
                    ArrayList list = new ArrayList();
                    
			int N = sc.nextInt();
                        int count = 1;
                        while(count<1000){
                            String number = String.valueOf((N*count));
                            System.out.println("N:"+number);
                            for(int i = 0; i < number.length(); i++) {
                                int j = Character.digit(number.charAt(i), 10);
                                if(!list.contains(j)){
                                    list.add(j);
                                }
                                System.out.println("J:"+j);
                            }
                            if (list.size()==10){
                                break;
                            }
                            count++;
                        }
                        if (list.size()==10){
				out.write(("Case #" + (ct) + ": "+(N*count) + "\n").getBytes());
                                
                        }else{
                            out.write(("Case #" + (ct) + ": INSOMNIA" + "\n").getBytes());
                               
                        }
			
			ct++;
		}
	}
}
