package com.leetcode.example.array;


import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class _792_NumberOfMatchingSubsequence {
    public static void main(String[] args) {
        if (true) {
            _792_NumberOfMatchingSubsequence c = new _792_NumberOfMatchingSubsequence();

            String[] words = {"a", "bb", "acd", "ace"};
            String S = "abcde";
            System.out.println("Number of subsquences " + c.numMatchingSubseq(S, words)); //3
        }

        if (true) {
            _792_NumberOfMatchingSubsequence c = new _792_NumberOfMatchingSubsequence();

            String[] words = {"ahjpjau", "ja", "ahbwzgqnuk", "tnmlanowax"};
            String S = "dsahjpjauf";
            System.out.println("Number of subsquences " + c.numMatchingSubseq(S, words)); //2
        }

        if (true) {
            _792_NumberOfMatchingSubsequence c = new _792_NumberOfMatchingSubsequence();

            String[] words = {"btovxbku", "to", "zueoxxxjme", "yjkclbkbtl"};
            String S = "btovxbkumc";
            System.out.println("Number of subsquences " + c.numMatchingSubseq(S, words)); //2
        }

        if (true) {
            _792_NumberOfMatchingSubsequence c = new _792_NumberOfMatchingSubsequence();

            String[] words = {"qlhxagxdq", "qlhxagxdq", "lhyiftwtut", "yfzwraahab"};
            String S = "qlhxagxdqh";
            System.out.println("Number of subsquences " + c.numMatchingSubseq(S, words)); //2
        }

        if (true) {
            _792_NumberOfMatchingSubsequence c = new _792_NumberOfMatchingSubsequence();

            String[] words = {"ykbkihjdfxxxwragzcbhngbzgasxysxdtwn", "wxakdcovjeczhqvbevkhlixsrhumxykbkihj", "diht", "covjeczhqvbevkhlixsrhumxykbkihjdfxxxwragzcbhngbz", "ovjeczhqvbevkhlixsrhumxykbkihjdfxxxwragzcbhng", "qhzucvqxalfrtlrdjverseuldzymzbunhugekoyyghmkpkfqmd", "eydmbsorvjnnifqxsyuypsrijzrosukrhtbneprpyyoawbvoki", "uanfzlfmmtvhzzebrazyuslbapsfzwtlvqbhqxsfmqagwxetro", "fffaawedchlcyqvzzxbzczbwyfjkllpsjhoozyresqemmawban", "astrknwzefcmuswdxalooatmiduspjuofthtomoqilgdojwhon"};
            String S = "kguhsugfxvwxakdcovjeczhqvbevkhlixsrhumxykbkihjdfxxxwragzcbhngbzgasxysxdtwntvbpdihtvkffacmxhbxxqniyqm";
            System.out.println("Number of subsquences " + c.numMatchingSubseq(S, words)); //5
        }

        if (true) {
            _792_NumberOfMatchingSubsequence c = new _792_NumberOfMatchingSubsequence();

            String[] words = {"iowuuudrgzmw", "azfcxtvhkruvuturdicnucvndigovkzrq", "ylmmo", "maptilrbfpjxiarmwalhbd", "oqvuahijyefbpqhbejuisksutsowhufsygtwteiqyligsnbqgl", "ytldcdlxqbaszbuxsacqwqnhrewhagldzhr", "zeeab", "cqie", "pvrazfcxtvhkruvuturdicnucvndigovkzrqiya", "zxnvpluwicurrtshyvevkriudayyysepzq", "wyhxltligahroyshfn", "nhrewhagldzhryzdmmrwn", "yqbvokpwovbnplshnzafunqglnpjvwddvdlmjjyzmw", "nhrptuugyfsghluythksqhmxlmggtcbdd", "yligsnbqglqblhpdzzeurtdohdcbjvzgjwylmmoiundjsc", "zdrfdofhudqbfnzxnvpluwicurrtshyvevkriudayyysepzq", "ncygycdpehteiugqbptyqbvokpwovbnplshnzafun", "gdzutwgjofowhryrubnxkahocqjzww", "eppapjoliqlhbrbgh", "qwhgobwyhxltligahroys", "dzutwgjofowhryrubnxkah", "rydhxkdhffyytldcdlxqbaszbuxs", "tyqbvokpwovbnplshnzafunqglnpjvwddvdlmjjyzmwwxzjc", "khvyjyrydhxkdhffyytldcdlxqbasz", "jajekhvyjyrydhxkdhffyytldcdlxqbaszbuxsacqwqn", "ppapjoliqlhbrbghq", "zmwwxzjckmaptilrbfpjxiarm", "nxkahocqjzwwagqidjhwbunvlchoj", "ybfxpvqywqjdlyznmojdhbeomyjqptltp", "udrgzmwnxae", "nqglnpjvwddvdlmjjyzmww", "swlvtlbmkrsurrcsgdzutwgjofowhryrubn", "hudqbfnzxnvpluwicurr", "xaezuqlsfvchjf", "tvibbwxnokzkhndmdhweyeycamjeplec", "olnswlvtlbmkrsurrcsgdzu", "qiyastqpmfmuouycodvsyjajekhvyjyrydhxkdhffyyt", "eiqyligsnbqglqblhpdzzeurtdohdcbjvzgjwyl", "cgiowuuudrgzmwnxaezuqlsfvchjflocz", "rxric", "cygycdpehteiugqbptyqbvokpwovbnplshnzaf", "g", "surrcsgd", "yzenflfnhrptuugyfsghluythksqh", "gdzutwgjofowhryrubnxkahocqjzwwagqid", "ddeoincygycdpeh", "yznmojdhbeomyjqptltpugzceyzenflfnhrptuug", "ejuisks", "teiqyligsnbqglqblhpdzzeurtdohdcbjvzgjwylmmoi", "mrwnxhaqfezeeabuacyswollycgio", "qfskkpfakjretogrokmxemjjbvgmmqrfdxlkfvycwalbdeumav", "wjgjhlrpvhqozvvkifhftnfqcfjmmzhtxsoqbeduqmnpvimagq", "ibxhtobuolmllbasaxlanjgalgmbjuxmqpadllryaobcucdeqc", "ydlddogzvzttizzzjohfsenatvbpngarutztgdqczkzoenbxzv", "rmsakibpprdrttycxglfgtjlifznnnlkgjqseguijfctrcahbb", "pqquuarnoybphojyoyizhuyjfgwdlzcmkdbdqzatgmabhnpuyh", "akposmzwykwrenlcrqwrrvsfqxzohrramdajwzlseguupjfzvd", "vyldyqpvmnoemzeyxslcoysqfpvvotenkmehqvopynllvwhxzr", "ysyskgrbolixwmffygycvgewxqnxvjsfefpmxrtsqsvpowoctw", "oqjgumitldivceezxgoiwjgozfqcnkergctffspdxdbnmvjago", "bpfgqhlkvevfazcmpdqakonkudniuobhqzypqlyocjdngltywn", "ttucplgotbiceepzfxdebvluioeeitzmesmoxliuwqsftfmvlg", "xhkklcwblyjmdyhfscmeffmmerxdioseybombzxjatkkltrvzq", "qkvvbrgbzzfhzizulssaxupyqwniqradvkjivedckjrinrlxgi", "itjudnlqncbspswkbcwldkwujlshwsgziontsobirsvskmjbrq", "nmfgxfeqgqefxqivxtdrxeelsucufkhivijmzgioxioosmdpwx", "ihygxkykuczvyokuveuchermxceexajilpkcxjjnwmdbwnxccl", "etvcfbmadfxlprevjjnojxwonnnwjnamgrfwohgyhievupsdqd", "ngskodiaxeswtqvjaqyulpedaqcchcuktfjlzyvddfeblnczmh", "vnmntdvhaxqltluzwwwwrbpqwahebgtmhivtkadczpzabgcjzx", "yjqqdvoxxxjbrccoaqqspqlsnxcnderaewsaqpkigtiqoqopth", "wdytqvztzbdzffllbxexxughdvetajclynypnzaokqizfxqrjl", "yvvwkphuzosvvntckxkmvuflrubigexkivyzzaimkxvqitpixo", "lkdgtxmbgsenzmrlccmsunaezbausnsszryztfhjtezssttmsr", "idyybesughzyzfdiibylnkkdeatqjjqqjbertrcactapbcarzb", "ujiajnirancrfdvrfardygbcnzkqsvujkhcegdfibtcuxzbpds", "jjtkmalhmrknaasskjnixzwjgvusbozslrribgazdhaylaxobj", "nizuzttgartfxiwcsqchizlxvvnebqdtkmghtcyzjmgyzszwgi", "egtvislckyltpfogtvfbtxbsssuwvjcduxjnjuvnqyiykvmrxl", "ozvzwalcvaobxbicbwjrububyxlmfcokdxcrkvuehbnokkzala", "azhukctuheiwghkalboxfnuofwopsrutamthzyzlzkrlsefwcz", "yhvjjzsxlescylsnvmcxzcrrzgfhbsdsvdfcykwifzjcjjbmmu", "tspdebnuhrgnmhhuplbzvpkkhfpeilbwkkbgfjiuwrdmkftphk", "jvnbeqzaxecwxspuxhrngmvnkvulmgobvsnqyxdplrnnwfhfqq", "bcbkgwpfmmqwmzjgmflichzhrjdjxbcescfijfztpxpxvbzjch", "bdrkibtxygyicjcfnzigghdekmgoybvfwshxqnjlctcdkiunob", "koctqrqvfftflwsvssnokdotgtxalgegscyeotcrvyywmzescq", "boigqjvosgxpsnklxdjaxtrhqlyvanuvnpldmoknmzugnubfoa", "jjtxbxyazxldpnbxzgslgguvgyevyliywihuqottxuyowrwfar", "zqsacrwcysmkfbpzxoaszgqqsvqglnblmxhxtjqmnectaxntvb", "izcakfitdhgujdborjuhtwubqcoppsgkqtqoqyswjfldsbfcct", "rroiqffqzenlerchkvmjsbmoybisjafcdzgeppyhojoggdlpzq", "xwjqfobmmqomhczwufwlesolvmbtvpdxejzslxrvnijhvevxmc", "ccrubahioyaxuwzloyhqyluwoknxnydbedenrccljoydfxwaxy", "jjoeiuncnvixvhhynaxbkmlurwxcpukredieqlilgkupminjaj", "pdbsbjnrqzrbmewmdkqqhcpzielskcazuliiatmvhcaksrusae", "nizbnxpqbzsihakkadsbtgxovyuebgtzvrvbowxllkzevktkuu", "hklskdbopqjwdrefpgoxaoxzevpdaiubejuaxxbrhzbamdznrr", "uccnuegvmkqtagudujuildlwefbyoywypakjrhiibrxdmsspjl", "awinuyoppufjxgqvcddleqdhbkmolxqyvsqprnwcoehpturicf"};
            String S = "ricogwqznwxxcpueelcobbbkuvxxrvgyehsudccpsnuxpcqobtvwkuvsubiidjtccoqvuahijyefbpqhbejuisksutsowhufsygtwteiqyligsnbqglqblhpdzzeurtdohdcbjvzgjwylmmoiundjscnlhbrhookmioxqighkxfugpeekgtdofwzemelpyjsdeeppapjoliqlhbrbghqjezzaxuwyrbczodtrhsvnaxhcjiyiphbglyolnswlvtlbmkrsurrcsgdzutwgjofowhryrubnxkahocqjzwwagqidjhwbunvlchojtbvnzdzqpvrazfcxtvhkruvuturdicnucvndigovkzrqiyastqpmfmuouycodvsyjajekhvyjyrydhxkdhffyytldcdlxqbaszbuxsacqwqnhrewhagldzhryzdmmrwnxhaqfezeeabuacyswollycgiowuuudrgzmwnxaezuqlsfvchjfloczlwbefksxsbanrektvibbwxnokzkhndmdhweyeycamjeplecewpnpbshhidnzwopdjuwbecarkgapyjfgmanuavzrxricbgagblomyseyvoeurekqjyljosvbneofjzxtaizjypbcxnbfeibrfjwyjqrisuybfxpvqywqjdlyznmojdhbeomyjqptltpugzceyzenflfnhrptuugyfsghluythksqhmxlmggtcbdddeoincygycdpehteiugqbptyqbvokpwovbnplshnzafunqglnpjvwddvdlmjjyzmwwxzjckmaptilrbfpjxiarmwalhbdjiwbaknvcqovwcqiekzfskpbhgxpyomekqvzpqyirelpadooxjhsyxjkfqavbaoqqvvknqryhotjritrkvdveyapjfsfzenfpuazdrfdofhudqbfnzxnvpluwicurrtshyvevkriudayyysepzqfgqwhgobwyhxltligahroyshfndydvffd";
            System.out.println("Number of subsquences " + c.numMatchingSubseq(S, words)); //51
        }
    }

    public int numMatchingSubseq(String S, String[] words) {
        int result = 0, count;
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            if(map.get(words[i]) != null){
                map.put(words[i], map.get(words[i]) > 0 ? map.get(words[i]) + 1 : 0);
                continue;
            }

            count = 0;
            int wIterator = 0;
            int dIterator = 0;

            while (wIterator < words[i].length() && dIterator < S.length()) {
                while (dIterator < S.length() - 1
                        && S.charAt(dIterator) != words[i].charAt(wIterator)) {
                    dIterator++;
                }

                if (S.charAt(dIterator) == words[i].charAt(wIterator)) {
                    count++;
                    dIterator++;
                }

                wIterator++;
            }

            if (count > 0 && count == words[i].length()) {
                map.put(words[i], 1);
            }
            else{
                map.put(words[i], 0);
            }
        }


        for(String key: map.keySet()){
            result += map.get(key);
        }

        return result;
    }

    /*public int numMatchingSubseq1(String S, String[] words) {
        Map<Character, Deque<Pair>> map = new HashMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
            map.put(new Character(c), new LinkedList<>());
        }
        for (int i = 0; i < words.length; i++) {
            map.get(words[i].charAt(0)).addFirst(new Pair(i));    //word w is waiting to get 0th index char
        }

        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            Deque<Pair> q = map.get(S.charAt(i));
            int orgSize = q.size();
            while (q != null && orgSize > 0) {
                Pair p = q.removeFirst();
                orgSize--;
                if (p.cidx < words[p.widx].length() - 1) {
                    p.cidx++;
                    map.get(words[p.widx].charAt(p.cidx)).addLast(p);
                } else {
                    count++;
                }
            }
        }
        return count;
    }

    class Pair {
        int widx;
        int cidx;

        public Pair(int widx) {
            this.widx = widx;
        }
    }*/

    /*public int numMatchingSubseq1(String S, String[] words) {
        int result = 0, found;

        int[] alphabets = new int['z' + 1];
        for (int i = 0; i < S.length(); i++) {
            alphabets[S.charAt(i)]++;
        }
        int[] reserved = new int['z' + 1];

        for (int i = 0; i < words.length; i++) {
            found = 0;
            for (int j = 0; j < words[i].length(); j++) {
                if (alphabets[words[i].charAt(j)] > 0) {
                    alphabets[words[i].charAt(j)]--;
                    reserved[words[i].charAt(j)]++;

                    found = 1;
                } else {
                    found = 0;
                    break;
                }
            }

            for (int k = 0; k < reserved.length; k++) {
                if (reserved[k] > 0) {
                    alphabets[k] += reserved[k];
                    reserved[k] = 0;
                }
            }

            result += found;
        }

        return result;
    }*/




}
