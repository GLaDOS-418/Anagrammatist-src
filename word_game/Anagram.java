package word_game;

import java.util.Set;
import java.util.TreeSet;

public class Anagram {


    public Set findWords(String str,Trie t){
        
        
        Set finalset=new TreeSet<>();
        Set set=new TreeSet();
        WordCreate w=new WordCreate(str, t);
        int a[]=new int[str.length()];
        set=w.combo(a, 0, str.length());
        
        for(Object obj: set){
            if(((String)obj).length()==str.length())
                finalset.add((String)obj);
        }
        
        //print(finalset);
        return finalset;
    }
    
    private void print(Set s){
        for(Object obj:s)
            System.out.println((String)obj);
    }

    boolean ifFinal(Set set) {
        //System.out.println(set.size());
        return set.size()>=1;
    }
}
