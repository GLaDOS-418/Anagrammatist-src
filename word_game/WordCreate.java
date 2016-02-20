package word_game;

import java.util.Set;
import java.util.TreeSet;

public class WordCreate {
    String s;
    Trie t=new Trie();
    Set set=new TreeSet();
//    int a[];

    public WordCreate(String s,Trie t) {
        this.s=s;    
        this.t=t;
        
 //       a=new int[s.length()];
 //       combo(a, 0, s.length());
//        for(Object obj:set){
//            System.out.println((String)obj);
//        }
    }

    WordCreate(Set s, Trie t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    void permute(char[] s2,int i,int n){
     if(i==n-1){
            String word=new String(s2);
            Trie fw=t.findWord(word, t);
            if(fw!=null&&fw.valid)
                set.add(word);
        }

        else{
            for(int j=i;j<n;j++){
                s2=swap(s2,i,j);
                permute(s2,i+1,n);
                s2=swap(s2,i,j);
            }
        }

    }

    void print(int a[], int n)
    {
        String str = null;
        for(int i=0;i<n;i++)
        {
            
            if(a[i]!=0){
                
                if(str==null){
                    str=Character.toString(s.charAt(i));}
                else{
                    str+=Character.toString(s.charAt(i));}              
            }
        }
        if(str!=null)
            permute(str.toCharArray(),0,str.length());
    }
    
    final Set combo(int a[],int k,int n)
    {
        if(k==n-1)
        {
            a[k]=0; print(a,n);
            a[k]=1; print(a,n);
            return set;
        }
        a[k]=0;
        combo(a,k+1,n);
        a[k]=1;
        combo(a,k+1,n);
        
        return set;
    }
    
    private char[] swap(char[] s2, int i, int j) {
        char temp=s2[i];
        s2[i]=s2[j];
        s2[j]=temp;
        return s2;
    }
}
