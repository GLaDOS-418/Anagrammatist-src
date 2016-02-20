package wordnet_jaws;

import edu.smu.tspell.wordnet.*;

public class GetSets {
    
    WordNetDatabase database;
    
    GetSets(){
        database = WordNetDatabase.getFileInstance();
    }
    
    public String getSynonyms(String s){
        
        String synonyms="";
        Synset[] synsets = database.getSynsets(s);
        int i=1;
        for (Synset synset : synsets)
            synonyms+= i++ + ". " + synset.getType().toString() + " " + synset.getDefinition()+"\n";
        return synonyms;
    }
    
    public String getAnton(String s){
        
        String antonyms="";      
        Synset[] synsets = database.getSynsets(s);
        for(Synset synset : synsets){
            WordSense[] wordsenses = synset.getAntonyms(s);
            for(WordSense wordsense : wordsenses) 
               antonyms+= wordsense.toString() + "\n";
        }            
        return antonyms;
    }
}
