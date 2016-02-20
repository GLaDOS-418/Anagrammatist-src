package word_game;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Scrabble{

    Set set;
    
    public TreeMap<String,Integer> findWords(String s,Trie t){
        TreeMap<String,Integer> tm=new TreeMap<>();
        WordCreate w=new WordCreate(s, t);
        int a[]=new int[s.length()];
        set=w.combo(a, 0, s.length());
       
        for(Object obj:set){
            if(((String)obj).length()>=3){
                Trie fw= t.findWord((String)obj,t);
                if(fw!=null&&fw.valid){
                    tm.put( (String)obj,fw.point);
                }
            }
        }      
       // print(tm);
        return tm;
    }

    private void print(TreeMap<String,Integer> tm) {
        for(Map.Entry<String,Integer> entry : tm.entrySet()) {
               String key = entry.getKey();
               Integer value = entry.getValue();
               System.out.println(key + "    " + value);
        }
    }
    
    public boolean ifFinal(TreeMap<String,Integer> tm){
        return tm.size()>=4;
    }
}


