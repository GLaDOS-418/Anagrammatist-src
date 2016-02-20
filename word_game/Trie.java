package word_game;

public class Trie {
    
    char ch;
    boolean valid;
    int point;
    Trie next[]=new Trie[26]; 
    
    
    public void addWord(String s,Trie t,int[] values){
        char word[]=s.toLowerCase().toCharArray();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(!present(word[i],t)){
                t.next[word[i]-'a']=new Trie();
                t.next[word[i]-'a'].ch=word[i];
            }
            t=t.next[word[i]-'a'];
            count+=values[word[i]-'a'];
        }
        t.valid=true;
        t.point=count;
    }
    
    public Trie findWord(String s,Trie t){
        char word[]=s.toLowerCase().toCharArray();
        
        for(int i=0;i<s.length();i++){
            if(t.next[word[i]-'a']==null)
                return null;
            
            if(!present(word[i],t))
               return null;
            
            t=t.next[word[i]-'a'];
        }
        
        return t;
    }
    
    private boolean present(char l, Trie t) {
        if(t.next[l-'a']==null)
            return false;
        return t.next[l-'a'].ch==l;
    }


    
}
