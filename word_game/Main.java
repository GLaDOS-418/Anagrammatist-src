//3.533 KLOC
package word_game;
import PlayGame.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {
    
    static Scanner in=new Scanner(System.in);
   
    public static void main(String[] args)throws NullPointerException, FileNotFoundException, IOException {
        
        try{
            if(args.length > 0 && args[0]!=null){
                System.setProperty("wordnet.database.dir", args[0]);
            }
            else{
                System.setProperty("wordnet.database.dir","resources\\dict"); //"C:\\Program Files (x86)\\WordNet\\2.1\\dict");
            }
        }catch(Exception e){
            System.err.println("probably incorrect path to dictionary file. For more refer to stacktrace.");
            e.printStackTrace();
        }

        String str;
        final Trie t=new Trie();
        BufferedReader br1=new BufferedReader(new FileReader("resources\\words.txt"));
        BufferedReader br2=new BufferedReader(new FileReader("resources\\words_extended.txt"));
        int values[]={1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};
                    //A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q ,R,S,T,U,V,W,X,Y,Z
        
        while((str=br1.readLine())!=null){
        t.addWord(str, t,values); 
        }
        
        while((str=br2.readLine())!=null){
        t.addWord(str, t,values); 
        }
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            MainWindow mw=new MainWindow(t);
            mw.setVisible(true);
            mw.setResizable(false);
         }
        });

    }
    
}
