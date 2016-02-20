package word_game;

import java.util.Set;
import java.util.TreeSet;

public class Spellathon {
    
    private final int length;
    private final char central;
    
    
    public Spellathon(int length,char central){
        this.length=length;//min spelling length
        this.central=central;
    }
    public Set findWords(String str,Trie t){
        
        Set set=new TreeSet();
        Set finalset=new TreeSet();
        WordCreate w=new WordCreate(str, t);
        int a[]=new int[str.length()];
        set=w.combo(a, 0, str.length());
        System.out.println("set: "+set+"\ncentral: "+ central);
        for(Object obj: set){
            //System.out.println(((String)obj).length()+length+ifContain((String)obj,central));
            if(((String)obj).length()>=length&&ifContain((String)obj,central))
                finalset.add((String)obj);
        }
        System.out.println(finalset);
        return finalset;
    }
    
    public void print(Set finalset){
        for(Object obj:finalset)
            System.out.println((String)obj);
    }
    
    public boolean ifFinal(Set finalset){
        System.out.println(finalset.size());
        return finalset.size()>=4;
    }

    private boolean ifContain(String string, char central) {
        char[] str=string.toCharArray();
        for(char ch:str){
            if(ch==central)
                return true;
        }
        return false;
    }

}
