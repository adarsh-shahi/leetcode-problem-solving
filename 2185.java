// https://leetcode.com/problems/counting-words-with-a-given-prefix/

import java.util.*;
class solve {
    public static void main(String[] args) {
        String[] words = {
            "kttxeksggb","vucqwew","lyknscc","mryl","vwarnwkfmd","ivawxbntgs","mylw","namybmfy","uosag","rzernqxyn","puf","hfwjnmvm","jjfyd","xteybd","v","ywntwzn","npsogop","brgvlw","vewhi","brk","hheub","zl","vt","bxjtjivep","p","io","xotulskjmt","mctffonh","pmeuqhoe","ghktrtq","u","ngnvwan","pqmlvvhl","enjf","qomcejb","twgqww","bnilyqy","nc","fttlodnz","fya","g","uoivsr","gtxgcaf","qs","gkfl","sdmacxf","mzy","xjv","yipc","rctqugjjk","myij","xxg","vyup","utqxplpsa","imbteaczlc","qfgdcz","atfn","pxcsg","f","omukbiaudb","uh","uobwgt","hgqipk","zunfzinenk","i","p","pet","fxai","ortqpwkukg","rxgh","ylfh"
        };
        System.out.println(solve(words, "ikwjoty"));
    }

    private static int solve(String words[], String pref){
        boolean flag = false;
        int count =  0;
        for (int i = 0; i < words.length; i++) {
                int k = 0;
                for(; k < pref.length(); k++){
                    if((k < words[i].length()) && pref.charAt(k) == words[i].charAt(k)){
                        flag = true;
                    }
                    else{
                        flag = false;
                        break;
                    }
                }
                if(flag && (k == pref.length())) count++;
        }
        return count;
    }
    
}
