package methodEmbedding.Standing_Ovation.S.LYD1688;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandingOvation {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(input.readLine());
        int test = 1;
        String line[];
        int Smax = 0;
        int levels[];
        
        while(test<=T){
            line = input.readLine().split(" ");
            Smax = Integer.parseInt(line[0]);
            levels = new int[Smax+1];
            for(int i=0; i<Smax+1; i++){
                levels[i] = Integer.parseInt(Character.toString(line[1].charAt(i)));
            }
            
            int numStanding = 0;
            int invites = 0;
            
            for(int i=0; i<Smax+1; i++){
                if(numStanding >= i){
                    numStanding += levels[i];
                }
                else if(levels[i]==0){}
                else{
                    invites += (i-numStanding);
                    numStanding += ((i-numStanding) + levels[i]);
                }
            }
            
            System.out.println("Case #"+test+": "+invites);
            
            test++;
        }
    }
    
}
