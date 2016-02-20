
package word_game;

 
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
 
public class Randomize {

    Set set=new TreeSet();
    TreeMap<String, Integer> tm=new TreeMap<>();
    Trie t;
    public Randomize(Trie t){
        this.t=t;
    }
    
    private static final String CHAR_LIST_CONSONANT ="bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ"
            + "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ"
            + "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
    private static final String CHAR_LIST_VOWEL="aeiouAEIOUaeiouAEIOUaeiouAEIOU";
    
    private static final String CHAR_LIST_PRE="qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopASDFGHJKLzxcvbnmQWERTYUIOPasdfghjklZXCVBNM";
    
    private int RANDOM_STRING_LENGTH_V;
    private int RANDOM_STRING_LENGTH_C;
     
    /**
     * This method generates random string
     * @return
     */
    public String generateRandomString(){
         
        StringBuilder randStr = new StringBuilder();
        for(int i=0; i<RANDOM_STRING_LENGTH_C; i++){
            int number = getRandomNumber(CHAR_LIST_CONSONANT.length());
            char ch = CHAR_LIST_CONSONANT.charAt(number);
            randStr.append(ch);
        }
        for(int i=0; i<RANDOM_STRING_LENGTH_V; i++){
            int number = getRandomNumber(CHAR_LIST_VOWEL.length());
            char ch = CHAR_LIST_VOWEL.charAt(number);
            randStr.append(ch);
        }
        return randStr.toString().toLowerCase();
    }
     
    /**
     * This method generates random numbers
     * @return integer
     */
    private int getRandomNumber(int len) {
        int randomInt = 0;
        Random randomGenerator = new Random();
        randomInt = randomGenerator.nextInt(len);
        if (randomInt - 1 == -1) {
            return randomInt;
        } else {
            return randomInt - 1;
        }
    }
    
    public String validWordSpell(){
        String s;
       while (true) {            
            //s=generateRandomString();
           s=generateRandomPrefix();
            //System.out.println(s);
            Spellathon sp=new Spellathon(4, s.charAt(3));
            set=sp.findWords(s,t);
            //System.out.println(sp.ifFinal(set));
            System.out.println(set);
            if(sp.ifFinal(set)){
                return s;
            }
        }
    }
    
    
    public String validWordAna(){
        String s;
       while (true) {            
            //s=generateRandomString();
           // System.out.println(s);
           s=generateRandomPrefix();
            Anagram a=new Anagram();
            set=a.findWords(s,t);
            //System.out.println(sp.ifFinal(set));
           // System.out.println(set);
            if(a.ifFinal(set)){
                System.out.println("word: "+s);
                return s;
            }
        }
    }
    
    public String validWordAnal3(){
        String s;
       while (true) {            
            s=generateRandomString();
           // System.out.println(s);
           //s=generateRandomPrefix();
            Anagram a=new Anagram();
            set=a.findWords(s,t);
            //System.out.println(sp.ifFinal(set));
           // System.out.println(set);
            if(a.ifFinal(set)){
                System.out.println("word: "+s);
                return s;
            }
        }
    }
    
    public String validWordScr(){
        String s;
       while (true) {            
            //s=generateRandomString();
           s=generateRandomPrefix();
           // System.out.println(s);
            Scrabble scr=new Scrabble();
            tm=scr.findWords(s,t);
            //System.out.println(sp.ifFinal(set));
            //System.out.println("valid:  "+tm);
            if(scr.ifFinal(tm)){
                return s;
            }
        }
    }
    
    public String validWordPre(){
        String s;
       while (true) {            
            s=generateRandomPrefix();
            //System.out.println(s);
            Prefix pre=new Prefix();
            set=pre.prefix(s,t);
            //System.out.println(sp.ifFinal(set));
            //System.out.println(set);
            if(pre.ifFinal(set)){
                return s;
            }
        }
    }
    
    public String generateRandomPrefix(){
         
        StringBuilder randStr = new StringBuilder();
        for(int i=0; i<RANDOM_STRING_LENGTH_C+RANDOM_STRING_LENGTH_V; i++){
            int number = getRandomNumber(CHAR_LIST_PRE.length());
            char ch = CHAR_LIST_PRE.charAt(number);
            randStr.append(ch);
        }
        
        return randStr.toString().toLowerCase();
    }
    
    
    public Set getSet(){
        return set;
    }
    
   

    public void number(int i) {
        switch(i){
            case 1://spellathon
                RANDOM_STRING_LENGTH_V=2;
                RANDOM_STRING_LENGTH_C=5;
                break;
            case 2://anagram level 1
                RANDOM_STRING_LENGTH_V=2;
                RANDOM_STRING_LENGTH_C=3;
                break;
            case 3://anagram level 2
                RANDOM_STRING_LENGTH_V=2;
                RANDOM_STRING_LENGTH_C=4;
                break;
            case 4: //anagram level 3
                RANDOM_STRING_LENGTH_V=3;
                RANDOM_STRING_LENGTH_C=5;
                break;
            case 5: //scrabble
                RANDOM_STRING_LENGTH_V=2;
                RANDOM_STRING_LENGTH_C=5;
                break;
            case 6: //prefixer
                RANDOM_STRING_LENGTH_V=1;
                RANDOM_STRING_LENGTH_C=2;
                break;
        }
    }

    public TreeMap<String, Integer> getMap() {
        return tm;
    }
            
}