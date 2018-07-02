package methodEmbedding.Speaking_in_Tongues.S.LYD1057;


import java.util.*;

public class Test {

    public static void main(String[] args) {
        String from = "ejp mysljylc kd kxveddknmc re jsicpdrysi\n" +
                "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd\n" +
                "de kr kd eoya kw aej tysr re ujdr lkgc jv\n";

        String to = "our language is impossible to understand\n" +
                "there are twenty six factorial possibilities\n" +
                "so it is okay if you want to just give up\n";

        Set<Character> fromChars = new TreeSet<Character>();
        Set<Character> toChars = new TreeSet<Character>();
        Map<Character, Character> map = new TreeMap<Character, Character>();


        for (int i = 0; i < from.length(); i++) {
            char f = from.charAt(i);
            char t = to.charAt(i);
            if (f >= 'a' && f <= 'z') {
                fromChars.add(f);
                toChars.add(t);
                map.put(f, t);
            }
        }

        System.out.println(fromChars);
        System.out.println(toChars);

        System.out.println(map);

        String input = "ejp mysljylc kd kxveddknmc re jsicpdrysi\n" +
                "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd\n" +
                "de kr kd eoya kw aej tysr re ujdr lkgc jv\n" +
                "hello i am the google code jam test data\n" +
                "how are you\n" +
                "aynny iynny aynny iynny aynny iynny aynny iynny aynny iynny aynny iynny aynny iynny aynny ieeeeeeeee\n" +
                "y n f i c w l b k u o m x s e v z p d r j g a t h a q set k oset xa ynfd\n" +
                "schr rkxc tesr aej dksl tkrb xc\n" +
                "vscjxesejmrpyxkfpedfevkfdkmkfegemfysefeskedkd\n" +
                "xa syxc kd ijl k bygc ujdr xcr aej ysi k meeegc aej\n" +
                "rpysdmyrksl rchr kd ser leped drpcslrb\n" +
                "drpcslrb kd leped drpcslrb\n" +
                "k bygc ncdrci wpjkr dvkoc ysi xees set k dbymm ncdr aej rbc lja\n" +
                "wpkcsid iesr mcr wpkcsid mcr dfkcsrkwkf vpelpcdd le nekso\n" +
                "set rbyr aej oset leelmcpcdc vmcydc ie ser jdc kr re byfo ksre ejp dadrcxd\n" +
                "w ew rte czjymd w ew esc czjymd esc\n" +
                "wep k ncrtccs rbpcc ysi s w ew k czjymd w ew k xksjd esc vmjd w ew k xksjd rte\n" +
                "aej tysr dcmm rbksld yr xc neksl qeeex\n" +
                "ip qykjd ip qykjd ip qykjd ip qykjd eeeeeeeeeeeeb ip qykjd\n" +
                "bet ypc aej bemiksl jv ncfyjdc kx y veryre\n" +
                "pklbr k wepler bcpc ks rbc dryrcd aej fymm kr y dyjdylc ks rbc xejrb\n" +
                "ys cac wep ys cac ysi y vklces wep y vklces\n" +
                "dtkwr yd rbc tksi zjkcr yd rbc wepcdr drcyia yd rbc xejsryks\n" +
                "wep rbedc tbe dvcyo ks y resljc ie ser dvcyo re erbcp vcevmc\n" +
                "seneia jsicpdrysid rbcx dksfc rbca ypc dvcyoksl xadrcpkcd ks rbc dvkpkr\n" +
                "eb byk kx ks jp fexvjrcp cyrksl aejp fbccqnjplcpd ysi leelmcpcdksl aejp rchrq\n" +
                "tbeeeeeeeeeeeeeeeeeeeyyyyyyyyy k oset f vmjd vmjd\n" +
                "njww rpasiyxcpc ysi yxjxj\n" +
                "aej oset aej tysr re\n" +
                "set kd rbc djxxcp ew ejp myfo ew ikdfesrcsr\n";
        String[] cases = input.split("\n");

        map.put(' ', ' ');
        map.put('z', 'q');
        map.put('q', 'z');

        int c = 1;
        System.out.println("Output");
        for (String aCase : cases) {
            StringBuilder sb = new StringBuilder("Case #");
            sb.append(c);
            sb.append(": ");

            int n = aCase.length() > 100 ? 100 : aCase.length();

            for (int i = 0; i < n; i++) {
                char character = aCase.charAt(i);
                if (map.get(character) == null) {
                    System.err.println(character);
                    return;
                }
                sb.append(map.get(character));
            }

            System.out.println(sb.toString());
            c++;
        }

    }
}
