package methodEmbedding.Standing_Ovation.S.LYD1459;

public class FirstRound {
    
    public static void main(String []args)
    {
        try{
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Pavilion\\Desktop\\testcase.txt"));
        int N = Integer.parseInt(br.readLine());
        
        for(int i=1; i<=N; i++){
            int count=0;
            String []str = br.readLine().split(" ");
            int S = Integer.parseInt(str[0]);
            int std=0;
            char []ch=str[1].toCharArray();
            for(int j=1; j<=S; j++){
                std += (int)ch[j-1] - 48;
                if(std<j){
                    count += j-std;
                    std=j;
                }
            }
            System.out.println("Case #"+i+": "+count);
        }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
