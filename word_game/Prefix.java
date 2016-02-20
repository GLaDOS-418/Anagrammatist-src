package word_game;

import java.util.Set;
import java.util.TreeSet;

public class Prefix {
    
    Trie temp=new Trie();
    Set set=new TreeSet();
            
    public Set prefix(String s,Trie t){
        temp=t.findWord(s,t);
        if(temp!=null){
            s = s.substring(0, s.length()-1);
            printPre(s,temp,t);
        }
        
          // System.out.println(set);
        return set;
        
    }
    
    private void printPre(String s,Trie temp,Trie t) {
        
        for(int i=0;i<26;i++){
            Trie fw=t.findWord(s+temp.ch,t);
            if(fw!=null&&fw.valid)
                set.add(s+temp.ch);
            
            if(temp.next[i]!=null)
                printPre(s+temp.ch,temp.next[i],t);
            //System.out.println("");
        }
    }
    
    public boolean ifFinal(Set set) {
        return set.size()>=1;
    }
    
}
