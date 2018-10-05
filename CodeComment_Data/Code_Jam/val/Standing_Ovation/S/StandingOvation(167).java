package methodEmbedding.Standing_Ovation.S.LYD1523;


import java.io.*;

public class StandingOvation {
    public static void main(String[] args) throws IOException{
        
     
         BufferedReader kb = new BufferedReader( new FileReader("A-small-attempt0.in") );
        PrintWriter out = new PrintWriter( new File("StanfingOvation.txt") ) ;
        int tt = Integer.parseInt( kb.readLine() ),peopleAdded,totalPeoplePresent,i,k=0;
        String ip[];
        
        while(tt-- > 0){
            k++;
            ip = kb.readLine().split(" ");
            peopleAdded = totalPeoplePresent = 0;
            for(i = 0; i < ip[1].length() && totalPeoplePresent < ip[1].length()-1;i++){
                if(totalPeoplePresent - i < 0){
                    peopleAdded+=(i-totalPeoplePresent);
                    totalPeoplePresent=(i-totalPeoplePresent)+totalPeoplePresent;
                    
                }
                totalPeoplePresent+=Character.getNumericValue(ip[1].charAt(i));
            }
            out.print("Case #"+k+": ");
            out.println(peopleAdded);
        }
        out.close();
        
        
    }
}
