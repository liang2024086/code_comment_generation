package methodEmbedding.Speaking_in_Tongues.S.LYD1411;



import java.util.Scanner;


public class Googlerese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n=Integer.parseInt(scanner.nextLine());
        String text;
        String[] rcase=new String[n];
        for(int i=0;i<n;i++){
            text=scanner.nextLine();
            char[] charArr = text.toCharArray(); 
            for (int j=0;j<charArr.length;j++){
                switch (charArr[j]) {
                    case 'a': charArr[j]='y';break;
                    case 'b': charArr[j]='h';break;
                    case 'c': charArr[j]='e';break;        
                    case 'd': charArr[j]='s';break;    
                    case 'e': charArr[j]='o';break;    
                    case 'f': charArr[j]='c';break;    
                    case 'g': charArr[j]='v';break;    
                    case 'h': charArr[j]='x';break;    
                    case 'i': charArr[j]='d';break;    
                    case 'j': charArr[j]='u';break;    
                    case 'k': charArr[j]='i';break;    
                    case 'l': charArr[j]='g';break;    
                    case 'm': charArr[j]='l';break; 
                    case 'n': charArr[j]='b';break;
                    case 'o': charArr[j]='k';break;    
                    case 'p': charArr[j]='r';break;    
                    case 'q': charArr[j]='z';break;    
                    case 'r': charArr[j]='t';break;    
                    case 's': charArr[j]='n';break;    
                    case 't': charArr[j]='w';break;    
                    case 'u': charArr[j]='j';break;    
                    case 'v': charArr[j]='p';break;    
                    case 'w': charArr[j]='f';break;    
                    case 'x': charArr[j]='m';break;
                    case 'y': charArr[j]='a';break;    
                    case 'z': charArr[j]='q';break;    
                }
            }
            rcase[i]="";
             for (int j=0;j<charArr.length;j++){
                 rcase[i]=rcase[i]+charArr[j];
             }
            
        }
        for(int i=0;i<n;i++){
            System.out.println("Case #"+(i+1)+": "+rcase[i]);
        }
        
    }
}
