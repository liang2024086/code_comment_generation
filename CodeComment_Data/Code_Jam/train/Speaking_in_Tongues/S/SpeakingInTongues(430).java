package methodEmbedding.Speaking_in_Tongues.S.LYD598;


import java.util.*;

public class SpeakingInTongues {

    private static final Map<Character, Character> m = new HashMap<Character, Character>();

    static {
        m.put(' ', ' ');
        m.put('a', 'y');
        m.put('b', 'h');
        m.put('c', 'e');
        m.put('d', 's');
        m.put('e', 'o');
        m.put('f', 'c');
        m.put('g', 'v');
        m.put('h', 'x');
        m.put('i', 'd');
        m.put('j', 'u');
        m.put('k', 'i');
        m.put('l', 'g');
        m.put('m', 'l');
        m.put('n', 'b');
        m.put('o', 'k');
        m.put('p', 'r');
        m.put('r', 't');
        m.put('s', 'n');
        m.put('t', 'w');
        m.put('u', 'j');
        m.put('v', 'p');
        m.put('w', 'f');
        m.put('x', 'm');
        m.put('y', 'a');
        m.put('z', 'q');
        m.put('q', 'z');
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s = new Scanner("30\n" +
                "ejp mysljylc kd kxveddknmc re jsicpdrysi\n" +
                "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd\n" +
                "de kr kd eoya kw aej tysr re ujdr lkgc jv\n" +
                "hello i am the google code jam test data\n" +
                "how are you\n" +
                "aynny iynny aynny iynny aynny iynny aynny iynny aynny iynny aynny iynny aynny iynny aynny ieeeeeeeee\n" +
                "y n f i c w l b k u o m x s e v z p d r j g a t h a q set k oset xa ynfd\n" +
                "schr rkxc tesr aej dksl tkrb xc\n" +
                "set rbyr aej oset leelmcpcdc vmcydc ie ser jdc kr re byfo ksre ejp dadrcxd\n" +
                "tbeeeeeeeeeeeeeeeeeeeyyyyyyyyy k oset f vmjd vmjd\n" +
                "k bygc ncdrci wpjkr dvkoc ysi xees set k dbymm ncdr aej rbc lja\n" +
                "aej ncrrcp fjr rbc vkqqy ks wejp vkcfcd ncfyjdc kx ser bjslpa csejlb re cyr dkh\n" +
                "tba ie vpelpyxxcpd ymtyad xkh jv bymmetccs ysi fbpkdrxyd\n" +
                "ymm aejp nydc ypc ncmesl re cppep rbc dveesa nypi\n" +
                "na rbc vpkfoksl ew xa rbjxnd dexcrbksl tkfoci rbkd tya fexcd\n" +
                "rbkd bcpc kd ljsveticp yfrkgyrci rtcsra dcgcs fymkncp wjmm yjre se okfonyfo sykmrbpetksl xyabcx\n" +
                "ks y tepmi ew ikpctemgcd ysi mkesd dexcrkxcd rbc pypcdr fpcyrjpc kd y wpkcsi\n" +
                "eb seeeee lellymep kd bcyici wep rbc epvbysylc\n" +
                "eb xa lei mcrd xyoc ejr\n" +
                "pklbr k wepler bcpc ks rbc dryrcd aej fymm kr y dyjdylc ks rbc xejrb\n" +
                "rbyso aej njr rbc pcym leelmcpcdc kd ks yserbcp fydrmc\n" +
                "mcr mkvd ie tbyr bysid ie\n" +
                "bet ypc aej bemiksl jv ncfyjdc kx y veryre\n" +
                "dtkwr yd rbc tksi zjkcr yd rbc wepcdr drcyia yd rbc xejsryks\n" +
                "wep rbedc tbe dvcyo ks y resljc ie ser dvcyo re erbcp vcevmc\n" +
                "seneia jsicpdrysid rbcx dksfc rbca ypc dvcyoksl xadrcpkcd ks rbc dvkpkr\n" +
                "xa syxc kd ijl k bygc ujdr xcr aej ysi k meeegc aej\n" +
                "wpkcsid iesr mcr wpkcsid mcr dfkcsrkwkf vpelpcdd le nekso\n" +
                "w ew rte czjymd w ew esc czjymd esc\n" +
                "wep k ncrtccs rbpcc ysi s w ew k czjymd w ew k xksjd esc vmjd w ew k xksjd rte");
        int t = s.nextInt();
        s.nextLine();
        for (int i = 1; i <= t; i++) {
            char[] in = s.nextLine().toCharArray();
            char[] out = new char[in.length];
            for (int j = 0; j < in.length; j++) {
                out[j] = m.get(in[j]);
            }
            System.out.println("Case #" + i + ": " + new String(out));
        }
    }
}
