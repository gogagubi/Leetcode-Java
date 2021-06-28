package com.leetcode.challenge.array.JuneChallenge2021;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

//2021-06-22
public class NumberOfMatchingSubsequencesV1 {

    @Test
    public void testCase1() {
        NumberOfMatchingSubsequencesV1 c = new NumberOfMatchingSubsequencesV1();
        String s = "abcde";
        String[] words = {"a", "bb", "acd", "ace"};

        assertEquals(3, c.numMatchingSubseq(s, words));
    }

    @Test
    public void testCase2() {
        NumberOfMatchingSubsequencesV1 c = new NumberOfMatchingSubsequencesV1();
        String s = "dsahjpjauf";
        String[] words = {"ahjpjau", "ja", "ahbwzgqnuk", "tnmlanowax"};

        assertEquals(2, c.numMatchingSubseq(s, words));
    }

    @Test
    public void testCase3() {
        NumberOfMatchingSubsequencesV1 c = new NumberOfMatchingSubsequencesV1();
        String[] words = {"btovxbku", "to", "zueoxxxjme", "yjkclbkbtl"};
        String s = "btovxbkumc";

        assertEquals(2, c.numMatchingSubseq(s, words));
    }

    @Test
    public void testCase4() {
        NumberOfMatchingSubsequencesV1 c = new NumberOfMatchingSubsequencesV1();
        String[] words = {"qlhxagxdq", "qlhxagxdq", "lhyiftwtut", "yfzwraahab"};
        String s = "qlhxagxdqh";

        assertEquals(2, c.numMatchingSubseq(s, words));
    }

    @Test
    public void testCase5() {
        NumberOfMatchingSubsequencesV1 c = new NumberOfMatchingSubsequencesV1();
        String[] words = {"ykbkihjdfxxxwragzcbhngbzgasxysxdtwn", "wxakdcovjeczhqvbevkhlixsrhumxykbkihj", "diht", "covjeczhqvbevkhlixsrhumxykbkihjdfxxxwragzcbhngbz", "ovjeczhqvbevkhlixsrhumxykbkihjdfxxxwragzcbhng", "qhzucvqxalfrtlrdjverseuldzymzbunhugekoyyghmkpkfqmd", "eydmbsorvjnnifqxsyuypsrijzrosukrhtbneprpyyoawbvoki", "uanfzlfmmtvhzzebrazyuslbapsfzwtlvqbhqxsfmqagwxetro", "fffaawedchlcyqvzzxbzczbwyfjkllpsjhoozyresqemmawban", "astrknwzefcmuswdxalooatmiduspjuofthtomoqilgdojwhon"};
        String s = "kguhsugfxvwxakdcovjeczhqvbevkhlixsrhumxykbkihjdfxxxwragzcbhngbzgasxysxdtwntvbpdihtvkffacmxhbxxqniyqm";

        assertEquals(5, c.numMatchingSubseq(s, words));
    }

    @Test
    public void testCase6() {
        NumberOfMatchingSubsequencesV1 c = new NumberOfMatchingSubsequencesV1();
        String[] words = {"iowuuudrgzmw", "azfcxtvhkruvuturdicnucvndigovkzrq", "ylmmo", "maptilrbfpjxiarmwalhbd", "oqvuahijyefbpqhbejuisksutsowhufsygtwteiqyligsnbqgl", "ytldcdlxqbaszbuxsacqwqnhrewhagldzhr", "zeeab", "cqie", "pvrazfcxtvhkruvuturdicnucvndigovkzrqiya", "zxnvpluwicurrtshyvevkriudayyysepzq", "wyhxltligahroyshfn", "nhrewhagldzhryzdmmrwn", "yqbvokpwovbnplshnzafunqglnpjvwddvdlmjjyzmw", "nhrptuugyfsghluythksqhmxlmggtcbdd", "yligsnbqglqblhpdzzeurtdohdcbjvzgjwylmmoiundjsc", "zdrfdofhudqbfnzxnvpluwicurrtshyvevkriudayyysepzq", "ncygycdpehteiugqbptyqbvokpwovbnplshnzafun", "gdzutwgjofowhryrubnxkahocqjzww", "eppapjoliqlhbrbgh", "qwhgobwyhxltligahroys", "dzutwgjofowhryrubnxkah", "rydhxkdhffyytldcdlxqbaszbuxs", "tyqbvokpwovbnplshnzafunqglnpjvwddvdlmjjyzmwwxzjc", "khvyjyrydhxkdhffyytldcdlxqbasz", "jajekhvyjyrydhxkdhffyytldcdlxqbaszbuxsacqwqn", "ppapjoliqlhbrbghq", "zmwwxzjckmaptilrbfpjxiarm", "nxkahocqjzwwagqidjhwbunvlchoj", "ybfxpvqywqjdlyznmojdhbeomyjqptltp", "udrgzmwnxae", "nqglnpjvwddvdlmjjyzmww", "swlvtlbmkrsurrcsgdzutwgjofowhryrubn", "hudqbfnzxnvpluwicurr", "xaezuqlsfvchjf", "tvibbwxnokzkhndmdhweyeycamjeplec", "olnswlvtlbmkrsurrcsgdzu", "qiyastqpmfmuouycodvsyjajekhvyjyrydhxkdhffyyt", "eiqyligsnbqglqblhpdzzeurtdohdcbjvzgjwyl", "cgiowuuudrgzmwnxaezuqlsfvchjflocz", "rxric", "cygycdpehteiugqbptyqbvokpwovbnplshnzaf", "g", "surrcsgd", "yzenflfnhrptuugyfsghluythksqh", "gdzutwgjofowhryrubnxkahocqjzwwagqid", "ddeoincygycdpeh", "yznmojdhbeomyjqptltpugzceyzenflfnhrptuug", "ejuisks", "teiqyligsnbqglqblhpdzzeurtdohdcbjvzgjwylmmoi", "mrwnxhaqfezeeabuacyswollycgio", "qfskkpfakjretogrokmxemjjbvgmmqrfdxlkfvycwalbdeumav", "wjgjhlrpvhqozvvkifhftnfqcfjmmzhtxsoqbeduqmnpvimagq", "ibxhtobuolmllbasaxlanjgalgmbjuxmqpadllryaobcucdeqc", "ydlddogzvzttizzzjohfsenatvbpngarutztgdqczkzoenbxzv", "rmsakibpprdrttycxglfgtjlifznnnlkgjqseguijfctrcahbb", "pqquuarnoybphojyoyizhuyjfgwdlzcmkdbdqzatgmabhnpuyh", "akposmzwykwrenlcrqwrrvsfqxzohrramdajwzlseguupjfzvd", "vyldyqpvmnoemzeyxslcoysqfpvvotenkmehqvopynllvwhxzr", "ysyskgrbolixwmffygycvgewxqnxvjsfefpmxrtsqsvpowoctw", "oqjgumitldivceezxgoiwjgozfqcnkergctffspdxdbnmvjago", "bpfgqhlkvevfazcmpdqakonkudniuobhqzypqlyocjdngltywn", "ttucplgotbiceepzfxdebvluioeeitzmesmoxliuwqsftfmvlg", "xhkklcwblyjmdyhfscmeffmmerxdioseybombzxjatkkltrvzq", "qkvvbrgbzzfhzizulssaxupyqwniqradvkjivedckjrinrlxgi", "itjudnlqncbspswkbcwldkwujlshwsgziontsobirsvskmjbrq", "nmfgxfeqgqefxqivxtdrxeelsucufkhivijmzgioxioosmdpwx", "ihygxkykuczvyokuveuchermxceexajilpkcxjjnwmdbwnxccl", "etvcfbmadfxlprevjjnojxwonnnwjnamgrfwohgyhievupsdqd", "ngskodiaxeswtqvjaqyulpedaqcchcuktfjlzyvddfeblnczmh", "vnmntdvhaxqltluzwwwwrbpqwahebgtmhivtkadczpzabgcjzx", "yjqqdvoxxxjbrccoaqqspqlsnxcnderaewsaqpkigtiqoqopth", "wdytqvztzbdzffllbxexxughdvetajclynypnzaokqizfxqrjl", "yvvwkphuzosvvntckxkmvuflrubigexkivyzzaimkxvqitpixo", "lkdgtxmbgsenzmrlccmsunaezbausnsszryztfhjtezssttmsr", "idyybesughzyzfdiibylnkkdeatqjjqqjbertrcactapbcarzb", "ujiajnirancrfdvrfardygbcnzkqsvujkhcegdfibtcuxzbpds", "jjtkmalhmrknaasskjnixzwjgvusbozslrribgazdhaylaxobj", "nizuzttgartfxiwcsqchizlxvvnebqdtkmghtcyzjmgyzszwgi", "egtvislckyltpfogtvfbtxbsssuwvjcduxjnjuvnqyiykvmrxl", "ozvzwalcvaobxbicbwjrububyxlmfcokdxcrkvuehbnokkzala", "azhukctuheiwghkalboxfnuofwopsrutamthzyzlzkrlsefwcz", "yhvjjzsxlescylsnvmcxzcrrzgfhbsdsvdfcykwifzjcjjbmmu", "tspdebnuhrgnmhhuplbzvpkkhfpeilbwkkbgfjiuwrdmkftphk", "jvnbeqzaxecwxspuxhrngmvnkvulmgobvsnqyxdplrnnwfhfqq", "bcbkgwpfmmqwmzjgmflichzhrjdjxbcescfijfztpxpxvbzjch", "bdrkibtxygyicjcfnzigghdekmgoybvfwshxqnjlctcdkiunob", "koctqrqvfftflwsvssnokdotgtxalgegscyeotcrvyywmzescq", "boigqjvosgxpsnklxdjaxtrhqlyvanuvnpldmoknmzugnubfoa", "jjtxbxyazxldpnbxzgslgguvgyevyliywihuqottxuyowrwfar", "zqsacrwcysmkfbpzxoaszgqqsvqglnblmxhxtjqmnectaxntvb", "izcakfitdhgujdborjuhtwubqcoppsgkqtqoqyswjfldsbfcct", "rroiqffqzenlerchkvmjsbmoybisjafcdzgeppyhojoggdlpzq", "xwjqfobmmqomhczwufwlesolvmbtvpdxejzslxrvnijhvevxmc", "ccrubahioyaxuwzloyhqyluwoknxnydbedenrccljoydfxwaxy", "jjoeiuncnvixvhhynaxbkmlurwxcpukredieqlilgkupminjaj", "pdbsbjnrqzrbmewmdkqqhcpzielskcazuliiatmvhcaksrusae", "nizbnxpqbzsihakkadsbtgxovyuebgtzvrvbowxllkzevktkuu", "hklskdbopqjwdrefpgoxaoxzevpdaiubejuaxxbrhzbamdznrr", "uccnuegvmkqtagudujuildlwefbyoywypakjrhiibrxdmsspjl", "awinuyoppufjxgqvcddleqdhbkmolxqyvsqprnwcoehpturicf"};
        String S = "ricogwqznwxxcpueelcobbbkuvxxrvgyehsudccpsnuxpcqobtvwkuvsubiidjtccoqvuahijyefbpqhbejuisksutsowhufsygtwteiqyligsnbqglqblhpdzzeurtdohdcbjvzgjwylmmoiundjscnlhbrhookmioxqighkxfugpeekgtdofwzemelpyjsdeeppapjoliqlhbrbghqjezzaxuwyrbczodtrhsvnaxhcjiyiphbglyolnswlvtlbmkrsurrcsgdzutwgjofowhryrubnxkahocqjzwwagqidjhwbunvlchojtbvnzdzqpvrazfcxtvhkruvuturdicnucvndigovkzrqiyastqpmfmuouycodvsyjajekhvyjyrydhxkdhffyytldcdlxqbaszbuxsacqwqnhrewhagldzhryzdmmrwnxhaqfezeeabuacyswollycgiowuuudrgzmwnxaezuqlsfvchjfloczlwbefksxsbanrektvibbwxnokzkhndmdhweyeycamjeplecewpnpbshhidnzwopdjuwbecarkgapyjfgmanuavzrxricbgagblomyseyvoeurekqjyljosvbneofjzxtaizjypbcxnbfeibrfjwyjqrisuybfxpvqywqjdlyznmojdhbeomyjqptltpugzceyzenflfnhrptuugyfsghluythksqhmxlmggtcbdddeoincygycdpehteiugqbptyqbvokpwovbnplshnzafunqglnpjvwddvdlmjjyzmwwxzjckmaptilrbfpjxiarmwalhbdjiwbaknvcqovwcqiekzfskpbhgxpyomekqvzpqyirelpadooxjhsyxjkfqavbaoqqvvknqryhotjritrkvdveyapjfsfzenfpuazdrfdofhudqbfnzxnvpluwicurrtshyvevkriudayyysepzqfgqwhgobwyhxltligahroyshfndydvffd";

        assertEquals(51, c.numMatchingSubseq(S, words));
    }

    public int numMatchingSubseq(String s, String[] words) {
        Map<String, Integer> memo = new HashMap<>();

        for (String w : words) {
            if (memo.containsKey(w)) {
                memo.put(w, memo.get(w) > 0 ? memo.get(w) + 1 : 0);
                continue;
            }

            if (isSubsequence(s, w)) memo.put(w, 1);
            else memo.put(w, 0);
        }

        int ans = 0;
        for (String k : memo.keySet()) ans += memo.get(k);

        return ans;
    }

    private boolean isSubsequence(String str, String word) {
        int[][] dp = new int[word.length() + 1][str.length() + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[i].length; j++) {
                if (word.charAt(i - 1) == str.charAt(j - 1)) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - 1] + 1);
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return word.length() == dp[word.length()][str.length()];
    }
}
